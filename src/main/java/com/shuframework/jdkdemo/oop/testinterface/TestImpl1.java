package com.shuframework.jdkdemo.oop.testinterface;

/**
 * @author shuheng
 */
public class TestImpl1 implements Myinterface1 {

    @Override
    public void test1() {
        System.out.println("接口public abstract void test1()方法实现");
    }

    @Override
    public void test2() {
        System.out.println("接口public void test2()方法实现");
    }

    @Override
    public void test3() {
        System.out.println("接口void test3()方法");
    }

    //如果没有特别的 子类可以不用实现默认方法
//    @Override
//    public void test12() {
//        System.out.println("接口default void test12()方法");
//    }
}
