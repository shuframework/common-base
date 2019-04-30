package com.shuframework.designpattern.creation_factory.factorymethod;

import com.shuframework.designpattern.creation_factory.cacl.OperateApi;
import com.shuframework.designpattern.creation_factory.cacl.OperateEnum;
import com.shuframework.designpattern.creation_factory.simplefactory.OperateFactory;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author shuheng
 */
public class OperateClientOfMethod {

    @Test
    public void test1() {
        String num1 = "2";
        String num2 = "3";
        AbstractCaclOperate operate = new AddOperateFactory();
        BigDecimal result1 = operate.getResult(num1, num2);
        System.out.println(result1);
        AbstractCaclOperate divideOperate = new DivideOperateFactory();
        BigDecimal result2 = divideOperate.getResult(num1, num2);
        System.out.println(result2);
    }

    @Test
    public void test2() {
        String num1 = "2";
        String num2 = "3";
        CaclOperate2 operate = new CaclOperate2();
        BigDecimal result1 = operate.getResult(num1, num2, OperateEnum.ADD);
        System.out.println(result1);
        CaclOperate2 divideOperate = new DivideOperate2();
        BigDecimal result2 = divideOperate.getResult(num1, num2, OperateEnum.DIVIDE);
        System.out.println(result2);
    }

}
