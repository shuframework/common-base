package com.shuframework.designpattern.creation_factory.abstractfactory.example2;

import com.shuframework.designpattern.creation_factory.abstractfactory.CPUApi;
import com.shuframework.designpattern.creation_factory.abstractfactory.GAMainboard;
import com.shuframework.designpattern.creation_factory.abstractfactory.IntelCPU;
import com.shuframework.designpattern.creation_factory.abstractfactory.MainboardApi;

/**
 * 电脑1：Intel CPU + GA Mainboard
 *
 * @author shuheng
 */
public class ComputerA implements AbstractFactory {

    @Override
    public CPUApi createCPUApi() {
        return new IntelCPU(1156);
    }

    @Override
    public MainboardApi createMainboardApi() {
        return new GAMainboard(1156);
    }
}
