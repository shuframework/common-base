package com.shuframework.jdkdemo.oop.testinterface;

import org.junit.Test;

/**
 * @author shuheng
 */
public class TestInterfaceMain {

    @Test
    public void test() {

        Myinterface1 my = new TestImpl1();
        my.test1();
        my.test2();
        my.test3();
        my.test12();
        my.test13();
    }
}
