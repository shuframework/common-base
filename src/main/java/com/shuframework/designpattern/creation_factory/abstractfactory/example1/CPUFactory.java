package com.shuframework.designpattern.creation_factory.abstractfactory.example1;

import com.shuframework.designpattern.creation_factory.abstractfactory.AMDCPU;
import com.shuframework.designpattern.creation_factory.abstractfactory.CPUApi;
import com.shuframework.designpattern.creation_factory.abstractfactory.IntelCPU;

/**
 * 创建CPU的简单工厂
 */
public class CPUFactory {

    /**
     * 创建CPU接口对象的方法
     *
     * @param type 选择CPU类型的参数
     */
    public static CPUApi createCPUApi(int type) {
        CPUApi cpu = null;
        //根据参数来选择并创建相应的CPU对象
        if (type == 1) {
            cpu = new IntelCPU(1156);
        } else if (type == 2) {
            cpu = new AMDCPU(939);
        }
        return cpu;
    }
}
