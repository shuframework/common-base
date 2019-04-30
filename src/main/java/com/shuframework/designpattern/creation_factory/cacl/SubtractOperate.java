package com.shuframework.designpattern.creation_factory.cacl;

import com.shuframework.commonbase.util.lang.BigDecimalUtil;

import java.math.BigDecimal;

/**
 * 减法
 * @author shuheng
 */
public class SubtractOperate implements OperateApi {
    @Override
    public BigDecimal getResult(String num1, String num2) {
        return BigDecimalUtil.subtract(num1, num2);
    }
}
