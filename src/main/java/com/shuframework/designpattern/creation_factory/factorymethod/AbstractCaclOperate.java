package com.shuframework.designpattern.creation_factory.factorymethod;

import com.shuframework.designpattern.creation_factory.cacl.OperateApi;

import java.math.BigDecimal;

/**
 * 既要约束子类的行为，又要为子类提供公共的功能
 *
 * @author shuheng
 */
public abstract class AbstractCaclOperate {


    public BigDecimal getResult(String num1, String num2) {
        OperateApi operateApi = getOperate();
        return operateApi.getResult(num1, num2);
    }

    /** 工厂方法，创建导出的文件对象的接口对象  */
    protected abstract OperateApi getOperate();

}
