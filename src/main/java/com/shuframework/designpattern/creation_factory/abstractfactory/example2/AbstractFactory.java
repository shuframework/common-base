package com.shuframework.designpattern.creation_factory.abstractfactory.example2;

import com.shuframework.designpattern.creation_factory.abstractfactory.CPUApi;
import com.shuframework.designpattern.creation_factory.abstractfactory.MainboardApi;

/**
 * 这里其实使用了 工厂方法模式，因为子类产品是选择实现的
 *
 * @author shuheng
 */
public interface AbstractFactory {

    /** 创建CPU接口 */
    CPUApi createCPUApi();

    /** 创建主板接口 */
    MainboardApi createMainboardApi();

    // 如果添加一个创建内存的方法，扩展比较麻烦，需要修改所有子类。
    // 但是jdk8+ 接口新增了默认实现，这种情况可以改善了
}
