package com.shuframework.designpattern.creation_factory.abstractfactory.example2;

import com.shuframework.designpattern.creation_factory.abstractfactory.AMDCPU;
import com.shuframework.designpattern.creation_factory.abstractfactory.CPUApi;
import com.shuframework.designpattern.creation_factory.abstractfactory.GAMainboard;
import com.shuframework.designpattern.creation_factory.abstractfactory.IntelCPU;
import com.shuframework.designpattern.creation_factory.abstractfactory.MSIMainboard;
import com.shuframework.designpattern.creation_factory.abstractfactory.MainboardApi;

/**
 * 电脑2：AMD CPU + MSI Mainboard
 *
 * @author shuheng
 */
public class ComputerB implements AbstractFactory {

    @Override
    public CPUApi createCPUApi() {
        return new AMDCPU(939);
    }

    @Override
    public MainboardApi createMainboardApi() {
        return new MSIMainboard(939);
    }
}
