package com.shuframework.designpattern.singleton;

/**
 * 懒汉式（懒加载） 单例
 */
public class LazySingleton {
    //私有构造
    private LazySingleton (){}

    //提供唯一一个实例
    private static LazySingleton instance = null;
    //双重检查时的唯一一个实例
    private static volatile LazySingleton doubleCheckInstance = null;

    //这样处理时会有并发问题
    // 简单处理见 getInstanceOfSync()  正常处理见
    public static LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

    //简单的并发处理
    public static synchronized LazySingleton getInstanceOfSync(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

    //双重检查的并发处理
    public static LazySingleton getInstanceOfDoubleCheck(){
        if (doubleCheckInstance == null){
            synchronized (LazySingleton.class){
                if (doubleCheckInstance == null){
                    doubleCheckInstance = new LazySingleton();
                }
            }
        }
        return doubleCheckInstance;
    }

}
