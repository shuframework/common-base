package com.shuframework.designpattern.creation_factory.simplefactory;

import com.shuframework.designpattern.creation_factory.cacl.OperateApi;
import com.shuframework.designpattern.creation_factory.cacl.OperateEnum;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author shuheng
 */
public class OperateClientOfSimple {

    @Test
    public void test() {
        String op = "*";
        String num1 = "2";
        String num2 = "3";
        OperateApi operate = OperateFactory.getOperate(op);
        BigDecimal result = operate.getResult(num1, num2);
        System.out.println(result);
    }

    @Test
    public void test2() {
        OperateEnum op = OperateEnum.ADD;
        String num1 = "2";
        String num2 = "3";
        OperateApi operate = OperateFactory.getOperate(op);
        BigDecimal result = operate.getResult(num1, num2);
        System.out.println(result);
    }


}
