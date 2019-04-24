package com.shuframework.jdkdemo.datastructure.genericity;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型
 * @author shuheng
 */
public class GenericityDemo {

    @Test
    public void test() {
//        // 基本类型不能用于泛型的参数类型，使用包装类
//        List<int> list = new ArrayList<>(); //不通过
//        List<Integer> list = new ArrayList<>(); //通过

        // 获得class类型
//        List<Integer>.class //不通过
        // interface java.util.List
//        System.out.println(List.class);//通过

        List<Integer> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
//        System.out.println(list1.getClass());
//        System.out.println(list2.getClass());
        // 返回true 值是class java.util.ArrayList,
        // 因为类型擦除, 所以进行方法重载时, 需要注意这点
        System.out.println(list1.getClass() == list2.getClass());
    }

}
