package com.shuframework.jdkdemo.oop;

/**
 * @author shuheng
 */
public class MyChild extends MyBase {

    public static String s = "static_child";
    public String m = "child";

    public static void staticTest() {
        System.out.println("child staticTest:" + s);
    }

    @Override
    public void test() {
        System.out.println("child test:" + s);
    }

    @Override
    protected void protectedTest() {
        System.out.println("child protectedTest:" + s);
    }
}
