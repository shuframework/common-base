package com.shuframework.designpattern.creation_factory.factorymethod;

import com.shuframework.designpattern.creation_factory.cacl.AddOperate;
import com.shuframework.designpattern.creation_factory.cacl.DivideOperate;
import com.shuframework.designpattern.creation_factory.cacl.OperateApi;
import com.shuframework.designpattern.creation_factory.cacl.SubtractOperate;

/**
 * @author shuheng
 */
public class DivideOperateFactory extends AbstractCaclOperate {

    @Override
    protected OperateApi getOperate() {
        return new DivideOperate();
    }
}
