package com.shuframework.jdkdemo.oop.innerclass;

import java.util.HashMap;
import java.util.Map;

/**
 * 方法内部类 示例
 * 这个不推荐使用 可读性不太友好，一般都是在内中抽象构建一个私有方法封装
 *
 * @author shuheng
 */
public class OuterOfMethodInner {

    private static int shared = 10;

    public void test() {
        String str = "methodStr";

        Map<String, Object> myMap = new HashMap<>();
        myMap.put("key", str); // {key=methodStr}

        //方法内部类
        class MethodInner {
            String innerStr = "innerStr";
//            // 外部类的变量是不允许再改变的, 即变量都是常量, 所以如果要使用外部类的变量则直接申明为常量(用final)
//            str = "innerStr";
            // 因为实现原理是 外部的变量会带进内部类当做 成员变量
            // 如果确实需要改变，则可以用引用对象，如自定义类，数组，map
            public void innerMethod(){
//                Map<String, Object> myMap = new HashMap<>();
                myMap.put("key", innerStr); // {key=innerStr}
                System.out.println("out param:"+shared);
                System.out.println("method-local param:"+str);
                System.out.println("inner param:"+innerStr);
//                System.out.println("inner myMap:"+myMap);
            }
        }
        //调用内部类
        MethodInner inner = new MethodInner();
        inner.innerMethod();
    }

}
