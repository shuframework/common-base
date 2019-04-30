package com.shuframework.designpattern.creation_singleton;

/**
 * 静态内部类实现 单例
 * 线程安全，调用效率高，并且实现了延时加载！
 */
public class HungerHasLazySingleton {
    //私有构造
    private HungerHasLazySingleton() {
    }

    //通过静态内部类提供唯一一个实例,只有在第一次被使用时才会被装载
    private static class InnerSingletonClass {
        private static final HungerHasLazySingleton instance = new HungerHasLazySingleton();
    }

    public static HungerHasLazySingleton getInstance() {
        return InnerSingletonClass.instance;
    }

}
