package com.shuframework.designpattern.factory.simplefactory.example_cacl;

import com.shuframework.commonbase.util.lang.BigDecimalUtil;

import java.math.BigDecimal;

/**
 * 乘法
 * @author shuheng
 */
public class MultiplyOperate implements Operate {
    @Override
    public BigDecimal getResult(String num1, String num2) {
        return BigDecimalUtil.multiply(num1, num2);
    }
}
