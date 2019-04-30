package com.shuframework.designpattern.creation_factory.cacl;

import com.shuframework.commonbase.util.lang.BigDecimalUtil;

import java.math.BigDecimal;

/**
 * 加法
 * @author shuheng
 */
public class AddOperate implements OperateApi {
    @Override
    public BigDecimal getResult(String num1, String num2) {
        return BigDecimalUtil.add(num1, num2);
    }
}
