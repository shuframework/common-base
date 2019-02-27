package com.shuframework.commonbase.util.lang;

import java.text.DecimalFormat;

/**
 * double的保留小数 工具类 <br/>
 * 返回的都是String, 且不影响参数原本的值。
 * 如果需要double 用 Double.valueOf(str)转换下,
 * 如果是BigDecimal建议用 BigDecimalUtil.round(str, 2)
 *
 * @author shuheng
 */
public class DecimalFormatUtil {
//    https://www.cnblogs.com/hq233/p/6539107.html

    /**
     * 小数格式化, 默认是四舍五入
     *
     * @param num     数字
     * @param pattern 格式
     */
    public static String format(double num, String pattern) {
        DecimalFormat df = new DecimalFormat(pattern);
        String str = df.format(num);
        return str;
    }

    /**
     * 保留2位小数, 默认是四舍五入
     *
     * @param num 数字
     */
    public static String roundFormat(double num) {
        return format(num, "0.00");
    }

    /**
     * 格式化为2位小数的百分比，注意默认是五舍六入
     * 即 0.12345格式化后的值是12.34%;  0.12346格式化后的值是12.35%;
     *
     * @param num
     */
    public static String percentFormat(double num) {
        return format(num, "0.00%");
    }

}
