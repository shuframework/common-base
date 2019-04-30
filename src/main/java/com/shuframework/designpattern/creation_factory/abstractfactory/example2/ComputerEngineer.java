package com.shuframework.designpattern.creation_factory.abstractfactory.example2;

import com.shuframework.designpattern.creation_factory.abstractfactory.CPUApi;
import com.shuframework.designpattern.creation_factory.abstractfactory.MainboardApi;
import com.shuframework.designpattern.creation_factory.abstractfactory.example1.CPUFactory;
import com.shuframework.designpattern.creation_factory.abstractfactory.example1.MainboardFactory;

/**
 * 装机工程师的类
 */
public class ComputerEngineer {
    /**
     * 定义组装机器需要的CPU
     */
    private CPUApi cpu = null;
    /**
     * 定义组装机器需要的主板
     */
    private MainboardApi mainboard = null;

    /**
     * 装机过程
     *
     * @param computer 客户选择的装机方案
     */
    public void makeComputer(AbstractFactory computer) {
        //1：首先准备好装机所需要的配件
        prepareHardwares(computer);
        //2：组装机器

        //3：测试机器

        //4：交付客户
    }

    /**
     * 准备装机所需要的配件
     *
     * @param computer 客户选择的装机方案
     */
    private void prepareHardwares(AbstractFactory computer) {
        //这里要去准备CPU和主板的具体实现，为了示例简单，这里只准备这两个
        //可是，装机工程师并不知道如何去创建，怎么办呢？

        //直接找相应的工厂获取
        this.cpu = computer.createCPUApi();
        this.mainboard = computer.createMainboardApi();

        //测试一下配件是否好用
        this.cpu.calculate();
        this.mainboard.installCPU();
    }
}