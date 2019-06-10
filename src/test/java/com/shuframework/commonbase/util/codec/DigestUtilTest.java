package com.shuframework.commonbase.util.codec;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class DigestUtilTest {

	@Test
	public void encodeBase64_test() {
		String str = "test";
		String base64Str = Base64Util.encodeBase64(str);
		//dGVzdA==
		System.out.println(base64Str);
	}
	
	@Test
	public void decodeBase64_test() {
		String str = "1yTs7oA53sZ4lJakx9Ecjg==";
		String base64Str = Base64Util.decodeBase64(str);
		//test
		System.out.println(base64Str);
	}
	
	@Test
	public void md5_test() {
		String str = "111111";
		String md5Str = DigestUtil.md5Hex(str);
		//32位,96e79218965eb72c92a549dd5a330112
		System.out.println(md5Str);
	}
	@Test
	public void md5_test2() {
		String str = "test";
		String md5Str = DigestUtil.md5Hex(str);
		//32位,098f6bcd4621d373cade4e832627b4f6
		System.out.println(md5Str);
	}
	
	@Test
	public void sha1_test() {
		String str = "test";
		String sha1Str = DigestUtil.sha1(str);
		//40位,a94a8fe5ccb19ba61c4c0873d391e987982fbbd3
		System.out.println(sha1Str);
	}
	
	@Test
	public void sha256_test() {
		String str = "test";
		String sha256Str = DigestUtil.sha256(str);
		//64位,9f86d081884c7d659a2feaa0c55ad015a3bf4f1b2b0b822cd15d6c15b0f00a08
		System.out.println(sha256Str);
	}

//	@Test
//	public void hmacMd5_test() {
//		String str = "test";
//		String key = "hmacMd5";
//		String macStr = DigestUtil.hmacMd5(str, key);
//		//32位：aa9fd9bd3d865f463629672553d6a892
//		System.out.println(macStr);
//	}
//
//	@Test
//	public void hmacSha1_test() {
//		String str = "test";
//		String key = "HmacSHA1";
//		String macStr = DigestUtil.hmacSha1(str, key);
//		//40位：b53bb5aebc0187b61c2f23ff2e6f5cb76f8dce05
//		System.out.println(macStr);
//		System.out.println(macStr.length());
//	}
//
//	@Test
//	public void hmacSha256_test() {
//		String str = "test";
//		String key = "HmacSHA256";
//		String macStr = DigestUtil.hmacSha256(str, key);
//		//64位：04dcd82017f772ccba6405c543bf75b3ff7dba4a1fe9a7a3b515f03ef15e1b5a
//		System.out.println(macStr);
//		System.out.println(macStr.length());
//	}
	
	
	/**
	 * 这个实现与DigestUtil.sha1(str); 效果一样
	 * @param data
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	private String sha1(byte[] data) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-1");
        digest.update(data);
        byte messageDigest[] = digest.digest();
        // Create Hex String
        StringBuilder hexString = new StringBuilder();
        // 字节数组转换为 十六进制 数
        for (int i = 0; i < messageDigest.length; i++) {
            String shaHex = Integer.toHexString(messageDigest[i] & 0xFF);
            if (shaHex.length() < 2) {
                hexString.append(0);
            }
            hexString.append(shaHex);
        }
        return hexString.toString();
    }
	
	@Test
	public void DigestUtil_sha1_test() {
		 Map<String, Object> data = new HashMap<>();
	     data.put("shops", "[{\"addr\":\"拱墅区环城北路318号\",\"city_code\":\"330100\",\"external_shopid\":\"88888888\",\"lat\":30.2728160400,\"lng\":120.1555971300,\"mobile\":\"13113113189\",\"shop_title\":\"测试站点1\"}]");

		String appSecret = "e817bd288517bf4440412390151281d3";
		String dataParams = (String) data.get("shops");
		String str = appSecret + "shops"+dataParams + appSecret;
		String sha1Str = DigestUtil.sha1(str);
		//A9E0208BDE72DD749519EBFF7F865A817F8AFA8E
		//AC169AC6FAAD59FFFA907F01A4DBBF0E98664A6C
		System.out.println(sha1Str.toUpperCase());
	}
	
	@Test
	public void MessageDigest_sha1_test() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		Map<String, Object> data = new HashMap<>();
		data.put("shops", "[{\"addr\":\"拱墅区环城北路318号\",\"city_code\":\"330100\",\"external_shopid\":\"88888888\",\"lat\":30.2728160400,\"lng\":120.1555971300,\"mobile\":\"13113113189\",\"shop_title\":\"测试站点1\"}]");
		
		String appSecret = "e817bd288517bf4440412390151281d3";
		String dataParams = (String) data.get("shops");
		String str = appSecret + "shops"+dataParams + appSecret;
//		String sha1Str = DigestUtil.sha1(str);
		String sha1Str = sha1(str.getBytes("utf-8")).toUpperCase();
		//A9E0208BDE72DD749519EBFF7F865A817F8AFA8E
		//AC169AC6FAAD59FFFA907F01A4DBBF0E98664A6C
		System.out.println(sha1Str);
	}
	
}
