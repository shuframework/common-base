package com.shuframework.designpattern.creation_singleton;

/**
 * 饿汉 单例
 * 问题是初始化时耗内存（但一般工具类也是这样处理）
 */
public class HungerSingleton {
    //私有构造
    private HungerSingleton() {
    }

    //提供唯一一个实例
    private static HungerSingleton instance = new HungerSingleton();

    public static HungerSingleton getInstance() {
        return instance;
    }

}
