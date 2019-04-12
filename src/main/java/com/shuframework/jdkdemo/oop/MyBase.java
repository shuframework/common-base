package com.shuframework.jdkdemo.oop;

/**
 * @author shuheng
 */
public class MyBase {

    public static String s = "static_base";
    public String m = "base";

    public static void staticTest() {
        System.out.println("base staticTest:" + s);
    }

    public void test() {
        System.out.println("base test:" + s);
    }

    protected void protectedTest() {
        System.out.println("base protectedTest:" + s);
    }
}
