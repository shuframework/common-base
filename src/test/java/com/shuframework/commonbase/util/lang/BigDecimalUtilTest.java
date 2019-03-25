package com.shuframework.commonbase.util.lang;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @author shuheng
 */
public class BigDecimalUtilTest {

    @Test
    public void up_test() {
        BigDecimal num1 = new BigDecimal("0.4");
        up(num1);
        System.out.println("============");
        BigDecimal num2 = new BigDecimal("0.5");
        up(num2);
        System.out.println("============");
        BigDecimal num3 = new BigDecimal("0.6");
        up(num3);

        System.out.println("============");
        BigDecimal num11 = new BigDecimal("-0.4");
        up(num11);
        System.out.println("============");
        BigDecimal num12 = new BigDecimal("-0.5");
        up(num12);
        System.out.println("============");
        BigDecimal num13 = new BigDecimal("-0.6");
        up(num13);
    }

    private void up(BigDecimal num) {
        BigDecimal r1 = num.divide(BigDecimal.ONE, 0, BigDecimal.ROUND_CEILING);
        System.out.println(num+" ,ceil:"+r1);
        BigDecimal r2 = num.divide(BigDecimal.ONE, 0, BigDecimal.ROUND_UP);
        System.out.println(num+" ,up:"+r2);
//        BigDecimal r3 = num.divide(BigDecimal.ONE, 0, BigDecimal.ROUND_HALF_UP);
//        System.out.println(num+" ,half_up:"+r3);
    }

    private void down(BigDecimal num) {
        BigDecimal r1 = num.divide(BigDecimal.ONE, 0, BigDecimal.ROUND_FLOOR);
        System.out.println(num+" ,floor:"+r1);
        BigDecimal r2 = num.divide(BigDecimal.ONE, 0, BigDecimal.ROUND_DOWN);
        System.out.println(num+" ,down:"+r2);
        BigDecimal r3 = num.divide(BigDecimal.ONE, 0, BigDecimal.ROUND_HALF_DOWN);
        System.out.println(num+" ,half_down:"+r3);
    }


    @Test
    public void floor_test1() {
        BigDecimal num1 = BigDecimalUtil.ceil(new BigDecimal("0.4"));
        System.out.println(num1);
    }

    @Test
    public void floor_test2() {
        BigDecimal num1 = new BigDecimal("0.4");
        down(num1);
        System.out.println("============");
        BigDecimal num2 = new BigDecimal("0.5");
        down(num2);
        System.out.println("============");
        BigDecimal num3 = new BigDecimal("0.6");
        down(num3);

        System.out.println("============");
        BigDecimal num11 = new BigDecimal("-0.4");
        down(num11);
        System.out.println("============");
        BigDecimal num12 = new BigDecimal("-0.5");
        down(num12);
        System.out.println("============");
        BigDecimal num13 = new BigDecimal("-0.6");
        down(num13);
    }

}