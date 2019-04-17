package com.shuframework.jdkdemo.oop.testextends;

import org.junit.Test;

import java.util.Arrays;

/**
 * 静态绑定：调用的都是当前的申明类信息
 *  实例变量、静态变量、静态方法、private方法 都是静态绑定
 *
 * 动态绑定：实际执行调用的是子类实现
 *  可@Override的方法（普通方法）都是动态绑定
 *
 * @author shuheng
 */
public class ExtendsTest {

    public static void main(String[] args) {

        MyChild c = new MyChild();
        MyBase b = c;//与下面的效果一样，这是多态的体现
//        MyBase b = new MyChild();

        System.out.println(b.s);
        System.out.println(b.m);
        b.staticTest();
        b.test();
        b.protectedTest();

        System.out.println("==========");
        System.out.println(c.s);
        System.out.println(c.m);
        c.staticTest();
        c.test();
        c.protectedTest();

    }

    @Test
    public void test1(){
        MyChild c = new MyChild();
        int[] nums = {1,2,3};
        c.addAll(nums);
        System.out.println(c.getSum());
        System.out.println(Arrays.toString(c.getList()));
    }

}
