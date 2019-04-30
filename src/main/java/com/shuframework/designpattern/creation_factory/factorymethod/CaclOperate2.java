package com.shuframework.designpattern.creation_factory.factorymethod;

import com.shuframework.designpattern.creation_factory.cacl.AddOperate;
import com.shuframework.designpattern.creation_factory.cacl.DivideOperate;
import com.shuframework.designpattern.creation_factory.cacl.MultiplyOperate;
import com.shuframework.designpattern.creation_factory.cacl.OperateApi;
import com.shuframework.designpattern.creation_factory.cacl.OperateEnum;
import com.shuframework.designpattern.creation_factory.cacl.SubtractOperate;

import java.math.BigDecimal;

/**
 * 既要约束子类的行为，又要为子类提供公共的功能
 * 方式二 不是抽象类，提供默认实现，子类扩展时再去修改
 * 这样处理时，简单工厂可以看成工厂方法的简化实现
 *
 * @author shuheng
 */
public class CaclOperate2 {

    public BigDecimal getResult(String num1, String num2, OperateEnum op) {
        OperateApi operateApi = getOperate(op);
        return operateApi.getResult(num1, num2);
    }

    /**
     * 工厂方法，创建导出的文件对象的接口对象
     * 与 OperateFactory.getOperate(OperateEnum op) 一样（一个是静态方法一个是普通方法）
     * 但是扩展时的处理方法不一样
     * 如果只有3种，第4种算法需要在子类去加（重写改方法）
     *
     * @param op
     */
    protected OperateApi getOperate(OperateEnum op) {
        OperateApi operate = null;
        if (OperateEnum.ADD.equals(op)) {
            operate = new AddOperate();
        }
        if (OperateEnum.SUBTRACT.equals(op)) {
            operate = new SubtractOperate();
        }
        if (OperateEnum.MULTIPLY.equals(op)) {
            operate = new MultiplyOperate();
        }
//        if (OperateEnum.DIVIDE.equals(op)) {
//            operate = new DivideOperate();
//        }
        return operate;
    }

}
