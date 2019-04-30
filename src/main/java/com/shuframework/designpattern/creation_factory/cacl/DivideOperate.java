package com.shuframework.designpattern.creation_factory.cacl;

import com.shuframework.commonbase.util.lang.BigDecimalUtil;

import java.math.BigDecimal;

/**
 * 加法
 * @author shuheng
 */
public class DivideOperate implements OperateApi {
    @Override
    public BigDecimal getResult(String num1, String num2) {
        return BigDecimalUtil.divide(num1, num2, 2);
    }
}
