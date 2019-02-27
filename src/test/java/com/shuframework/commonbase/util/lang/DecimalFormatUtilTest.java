package com.shuframework.commonbase.util.lang;

import org.junit.Test;

import java.text.NumberFormat;

import static org.junit.Assert.*;

/**
 * @author shuheng
 */
public class DecimalFormatUtilTest {

    double num = 4534.326;
    double num2 = 4534.523;
    double num_percent1 = 0.50236;
    double num_percent2 = 0.50235;
    double num_percent3 = 0.50234;


    //与percentFormat_test 测试结果一样
    @Test
    public void numberFormat_test() {
        NumberFormat nf = NumberFormat.getPercentInstance();// 含%
        nf.setMinimumFractionDigits(2);//这个表示百分数小数位
        System.out.println(nf.format(num_percent1));
        System.out.println(nf.format(num_percent2));
        System.out.println(nf.format(num_percent3));
    }

    @Test
    public void percentFormat_test() {
        String pattern = "0.00%";
        // 0.50236 -> 50.24%
        System.out.println(DecimalFormatUtil.format(num_percent1, pattern));
        // 0.50235 -> 50.23%
        System.out.println(DecimalFormatUtil.format(num_percent2, pattern));
        // 0.50234 -> 50.23%
        System.out.println(DecimalFormatUtil.format(num_percent3, pattern));
        System.out.println("===================");
        //测试结果是一样的
        String pattern2 = "##.##%";
        // 0.50236 -> 50.24%
        System.out.println(DecimalFormatUtil.format(num_percent1, pattern2));
        // 0.50235 -> 50.23%
        System.out.println(DecimalFormatUtil.format(num_percent2, pattern2));
        // 0.50234 -> 50.23%
        System.out.println(DecimalFormatUtil.format(num_percent3, pattern2));
    }

    @Test
    public void format_test2() {
        // 保留2位小数 会四舍五入
        String pattern = "0.00";
        String format = DecimalFormatUtil.format(num, pattern);
        System.out.println(format);
    }

    @Test
    public void format_test1() {
        // 取整数位 会四舍五入
        String pattern = "#"; // 4534
//        String pattern = "0"; // 4534
        String format = DecimalFormatUtil.format(num2, pattern);
        System.out.println(format);
    }

}