package com.shuframework.designpattern.creation_factory.factorymethod;

import com.shuframework.designpattern.creation_factory.cacl.DivideOperate;
import com.shuframework.designpattern.creation_factory.cacl.OperateApi;
import com.shuframework.designpattern.creation_factory.cacl.OperateEnum;
import com.shuframework.designpattern.creation_factory.cacl.SubtractOperate;

/**
 * @author shuheng
 */
public class DivideOperate2 extends CaclOperate2 {

    @Override
    protected OperateApi getOperate(OperateEnum op) {
        OperateApi operate = null;
        if (OperateEnum.DIVIDE.equals(op)) {
            operate = new DivideOperate();
        }else {
            operate = super.getOperate(op);
        }
        return operate;
    }
}
