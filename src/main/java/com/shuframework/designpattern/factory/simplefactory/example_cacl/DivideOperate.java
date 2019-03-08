package com.shuframework.designpattern.factory.simplefactory.example_cacl;

import com.shuframework.commonbase.util.lang.BigDecimalUtil;

import java.math.BigDecimal;

/**
 * 加法
 * @author shuheng
 */
public class DivideOperate implements Operate {
    @Override
    public BigDecimal getResult(String num1, String num2) {
        return BigDecimalUtil.divide(num1, num2, 2);
    }
}
