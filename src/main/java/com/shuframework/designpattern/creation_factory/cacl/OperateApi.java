package com.shuframework.designpattern.creation_factory.cacl;

import java.math.BigDecimal;

/**
 * 操作接口
 * @author shuheng
 */
public interface OperateApi {

    /**
     * 2个数字的运算结果
     * @param num1
     * @param num2
     * @return
     */
    BigDecimal getResult(String num1, String num2);

}
