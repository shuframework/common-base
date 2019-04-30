package com.shuframework.designpattern.creation_factory.cacl;

import com.shuframework.commonbase.util.lang.BigDecimalUtil;

import java.math.BigDecimal;

/**
 * 实现简单的计算器（没用设计模式的实现）
 *
 * @author shuheng
 */
public class CalculatorDemo {

    public static void main(String[] args) {
        String num1 = "2";
        String num2 = "3";
        String op = "+";
        BigDecimal resultNum = CalculatorDemo.getResult(op, num1, num2);
        System.out.println(resultNum);
    }

    //这样处理的缺点： 扩展性不好，因为添加一个运算时 之前的算法被暴露容易被修改
    private static BigDecimal getResult(String op, String num1, String num2) {
        BigDecimal resultNum = BigDecimal.ZERO;
        if ("+".equals(op)) {
            resultNum = BigDecimalUtil.add(num1, num2);
        }
        if ("-".equals(op)) {
            resultNum = BigDecimalUtil.subtract(num1, num2);
        }
        if ("*".equals(op)) {
            resultNum = BigDecimalUtil.multiply(num1, num2);
        }
        if ("/".equals(op)) {
            resultNum = BigDecimalUtil.divide(num1, num2, 2);
        }
        return resultNum;
    }


}
