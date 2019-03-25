package com.shuframework.designpattern.creation_singleton;

import org.junit.Test;

public class SingletonClient {

    @Test
    public void lazy_test1(){
        LazySingleton s1 = LazySingleton.getInstance();
        LazySingleton s2 = LazySingleton.getInstance();
        //true 表示是同一个对象
        System.out.println(s1 == s2);
    }
    @Test
    public void lazy_test2(){
        LazySingleton s1 = LazySingleton.getInstanceOfDoubleCheck();
        LazySingleton s2 = LazySingleton.getInstanceOfDoubleCheck();
        //true 表示是同一个对象
        System.out.println(s1 == s2);
    }

    @Test
    public void hunger_test1(){
        HungerSingleton s1 = HungerSingleton.getInstance();
        HungerSingleton s2 = HungerSingleton.getInstance();
        //true 表示是同一个对象
        System.out.println(s1 == s2);
    }

    @Test
    public void hungerHasLazy_test1(){
        HungerHasLazySingleton s1 = HungerHasLazySingleton.getInstance();
        HungerHasLazySingleton s2 = HungerHasLazySingleton.getInstance();
        //true 表示是同一个对象
        System.out.println(s1 == s2);
    }

    @Test
    public void thread_test(){

        for (int i = 0; i < 10; i++) {

        }
        LazySingleton s1 = LazySingleton.getInstance();
        LazySingleton s2 = LazySingleton.getInstance();
        //true 表示是同一个对象
        System.out.println(s1 == s2);
    }

}
