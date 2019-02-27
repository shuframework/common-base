package com.shuframework.arithmetic.maths;

import org.junit.Test;

/**
 * @author shuheng
 */
public class NumberCalcTest {

    @Test
    public void test(){
//        NumberCalc.arrangement(5, 0);// 1
//        NumberCalc.arrangement(5, 4);
//        NumberCalc.arrangement(5, 5);
//        NumberCalc.factorial(5);
//        System.out.println("----------");
//        NumberCalc.arrangement(5, 2);
//        int r1 = NumberCalc.combination(7, 3);
//        System.out.println("r1:" + r1);
//        System.out.println("----------");
//        int r2 = NumberCalc.combination(7, 4);
//        System.out.println("r2:" + r2);

        int r1 = NumberCalc.combination(7, 0);
        System.out.println("r1:" + r1);
        System.out.println("----------");
        int r2 = NumberCalc.combination(7, 7);
        System.out.println("r2:" + r2);
    }

}