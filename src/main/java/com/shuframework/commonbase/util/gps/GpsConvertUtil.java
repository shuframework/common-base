package com.shuframework.commonbase.util.gps;


/**
 * 三种类型的地图坐标系：
 *	1.WGS－84原始坐标系，一般用国际GPS纪录仪记录下来的经纬度，通过GPS定位拿到的原始经纬度，Google和高德地图定位的的经纬度（国外）都是基于WGS－84坐标系的；
 * 		但是在国内是不允许直接用WGS84坐标系标注的，必须经过加密后才能使用；
 * 	2.GCJ－02坐标系，又名“火星坐标系”，是我国国测局独创的坐标体系，由WGS－84加密而成，在国内，必须至少使用GCJ－02坐标系，高德、Google、腾讯、阿里在国内都是使用GCJ－02坐标系，
 * 		可以说，GCJ－02是国内最广泛使用的坐标系；
 * 	3.百度坐标系:bd-09，百度坐标系是在GCJ－02坐标系的基础上再次加密偏移后形成的坐标系，只适用于百度地图。
 * 		(目前百度API提供了从其它坐标系转换为百度坐标系的API，但却没有从百度坐标系转为其他坐标系的API)
 * 
 * @author shuheng
 *
 */
public class GpsConvertUtil {
	 public static double pi = 3.1415926535897932384626;
//	public static double pi = 3.14159265358979324;//与上面的pi值结果

	public static double x_pi = 3.14159265358979324 * 3000.0 / 180.0;
	public static double a = 6378245.0;
	public static double ee = 0.00669342162296594323;


	/**
	 * WGS－84 to 火星坐标系 (GCJ-02)
	 * 
	 * @param lat	纬度
	 * @param lon	经度
	 * @return 返回的数组 第一个是纬度, 第二个是经度
	 */
	public static double[] gps84ToGcj02(double lat, double lon) {
		if (outOfChina(lat, lon)) {
			return new double[] { lat, lon };
		}
		double dLat = transformLat(lon - 105.0, lat - 35.0);
		double dLon = transformLon(lon - 105.0, lat - 35.0);
		double radLat = lat / 180.0 * pi;
		double magic = Math.sin(radLat);
		magic = 1 - ee * magic * magic;
		double sqrtMagic = Math.sqrt(magic);
		dLat = (dLat * 180.0) / ((a * (1 - ee)) / (magic * sqrtMagic) * pi);
		dLon = (dLon * 180.0) / (a / sqrtMagic * Math.cos(radLat) * pi);
		double mgLat = lat + dLat;
		double mgLon = lon + dLon;
		return new double[] { mgLat, mgLon };
	}

	/**
	 * 火星坐标系 (GCJ-02) to 84 
	 * 
	 * @param lat	纬度
	 * @param lon	经度
	 * @return 返回的数组 第一个是纬度, 第二个是经度
	 */
	public static double[] gcj02ToGps84(double lat, double lon) {
		double[] gps = gps84ToGcj02(lat, lon);
		double lontitude = lon * 2 - gps[1];
		double latitude = lat * 2 - gps[0];
		return new double[] { latitude, lontitude };
	}

	/**
	 * 将火星坐标系 (GCJ-02) 转换成 百度坐标系 (BD-09)
	 * 
	 * @param lat	纬度
	 * @param lon	经度
	 * @return 返回的数组 第一个是纬度, 第二个是经度
	 */
	public static double[] gcj02ToBd09(double lat, double lon) {
		double x = lon, y = lat;
		double z = Math.sqrt(x * x + y * y) + 0.00002 * Math.sin(y * x_pi);
		double theta = Math.atan2(y, x) + 0.000003 * Math.cos(x * x_pi);
		double tempLon = z * Math.cos(theta) + 0.0065;
		double tempLat = z * Math.sin(theta) + 0.006;
		double[] gps = { tempLat, tempLon };
		return gps;
	}

	/**
	 * 将 百度坐标系 (BD-09) 转换成 火星坐标系 (GCJ-02)
	 * 
	 * @param lat	纬度
	 * @param lon	经度
	 * @return 返回的数组 第一个是纬度, 第二个是经度
	 */
	public static double[] bd09ToGcj02(double lat, double lon) {
		double x = lon - 0.0065, y = lat - 0.006;
		double z = Math.sqrt(x * x + y * y) - 0.00002 * Math.sin(y * x_pi);
		double theta = Math.atan2(y, x) - 0.000003 * Math.cos(x * x_pi);
		double tempLon = z * Math.cos(theta);
		double tempLat = z * Math.sin(theta);
		double[] gps = { tempLat, tempLon };
		return gps;
	}

	/**
	 * 将gps84转为百度坐标系 (BD-09)
	 * 
	 * @param lat	纬度
	 * @param lon	经度
	 * @return 返回的数组 第一个是纬度, 第二个是经度
	 */
	public static double[] gps84Tobd09(double lat, double lon) {
		double[] gcj02 = gps84ToGcj02(lat, lon);
		double[] bd09 = gcj02ToBd09(gcj02[0], gcj02[1]);
		return bd09;
	}

	/**
	 * 将百度坐标系 (BD-09)转为gps84
	 * 
	 * @param lat	纬度
	 * @param lon	经度
	 * @return 返回的数组 第一个是纬度, 第二个是经度
	 */
	public static double[] bd09Togps84(double lat, double lon) {
		double[] gcj02 = bd09ToGcj02(lat, lon);
		double[] gps84 = gcj02ToGps84(gcj02[0], gcj02[1]);
		// 保留小数点后六位
		gps84[0] = retain6(gps84[0]);
		gps84[1] = retain6(gps84[1]);
		return gps84;
	}

	/**
	 * 保留小数点后六位
	 * 
	 * @param num
	 * @return
	 */
	private static double retain6(double num) {
		String result = String.format("%.6f", num);
		return Double.valueOf(result);
	}
	
	/**
	 * 转换为纬度
	 * 
	 * @param x	处理后的经度
	 * @param y	处理后的纬度
	 * @return
	 */
	public static double transformLat(double x, double y) {
		double ret = -100.0 + 2.0 * x + 3.0 * y + 0.2 * y * y + 0.1 * x * y + 0.2 * Math.sqrt(Math.abs(x));
		ret += (20.0 * Math.sin(6.0 * x * pi) + 20.0 * Math.sin(2.0 * x * pi)) * 2.0 / 3.0;
		ret += (20.0 * Math.sin(y * pi) + 40.0 * Math.sin(y / 3.0 * pi)) * 2.0 / 3.0;
		ret += (160.0 * Math.sin(y / 12.0 * pi) + 320 * Math.sin(y * pi / 30.0)) * 2.0 / 3.0;
		return ret;
	}

	/**
	 * 转换为经度
	 * 
	 * @param x	处理后的经度
	 * @param y	处理后的纬度
	 * @return
	 */
	public static double transformLon(double x, double y) {
		double ret = 300.0 + x + 2.0 * y + 0.1 * x * x + 0.1 * x * y + 0.1 * Math.sqrt(Math.abs(x));
		ret += (20.0 * Math.sin(6.0 * x * pi) + 20.0 * Math.sin(2.0 * x * pi)) * 2.0 / 3.0;
		ret += (20.0 * Math.sin(x * pi) + 40.0 * Math.sin(x / 3.0 * pi)) * 2.0 / 3.0;
		ret += (150.0 * Math.sin(x / 12.0 * pi) + 300.0 * Math.sin(x / 30.0 * pi)) * 2.0 / 3.0;
		return ret;
	}

	/**
	 * 是否不在中国坐标范围内, 不在返回true
	 * 
	 * @param lat	纬度
	 * @param lon	经度
	 * @return
	 */
	public static boolean outOfChina(double lat, double lon) {
		if (lon < 72.004 || lon > 137.8347)
			return true;
		if (lat < 0.8293 || lat > 55.8271)
			return true;
		return false;
	}

}
