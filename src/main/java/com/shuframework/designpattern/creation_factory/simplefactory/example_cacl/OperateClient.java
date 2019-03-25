package com.shuframework.designpattern.creation_factory.simplefactory.example_cacl;

import java.math.BigDecimal;

/**
 * @author shuheng
 */
public class OperateClient {

    public static void main(String[] args) {
        String op = "*";
        String num1 = "2";
        String num2 = "3";
        Operate operate = OperateFactory.getOperate(op);
        BigDecimal result = operate.getResult(num1, num2);
        System.out.println(result);
    }
}
