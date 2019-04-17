package com.shuframework.jdkdemo.oop.testinterface;

/**
 * @author shuheng
 */
public interface Myinterface1 {

    // test1 test2 test3 这样的申明是等价的，jvm都会解析为抽象方法
    public abstract void test1();

    public void test2();

    void test3();

    //jdk8+ 新增
    public static void test11() {
        // 该方法不能被重写，跟着类创建一起加载
        System.out.println("接口静态方法");
    }

    // test12 test13 2种默认方法 效果是一样的
    default void test12() {
        System.out.println("接口default void test12()默认方法");
    }

    public default void test13() {
        System.out.println("接口public default void test13()默认方法");
    }

}
