package com.shuframework.designpattern.factory.simplefactory.example_cacl;

import com.shuframework.commonbase.util.lang.BigDecimalUtil;

import java.math.BigDecimal;

/**
 * 减法
 * @author shuheng
 */
public class SubtractOperate implements Operate {
    @Override
    public BigDecimal getResult(String num1, String num2) {
        return BigDecimalUtil.subtract(num1, num2);
    }
}
