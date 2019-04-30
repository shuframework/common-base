package com.shuframework.designpattern.creation_factory.factorymethod;

import com.shuframework.designpattern.creation_factory.cacl.AddOperate;
import com.shuframework.designpattern.creation_factory.cacl.OperateApi;

/**
 * @author shuheng
 */
public class AddOperateFactory extends AbstractCaclOperate {

    @Override
    protected OperateApi getOperate() {
        return new AddOperate();
    }
}
