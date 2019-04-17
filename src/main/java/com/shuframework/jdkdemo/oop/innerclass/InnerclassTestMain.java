package com.shuframework.jdkdemo.oop.innerclass;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author shuheng
 */
public class InnerclassTestMain {

    @Test
    public void staticInner_test() {
        OuterOfStaticInner outer = new OuterOfStaticInner();
        outer.test2();
        // 方式二 调用静态内部类的方法
        OuterOfStaticInner.StaticInner.staticInnerMethod();
        // 调用静态内部类的变量
        System.out.println(OuterOfStaticInner.StaticInner.staticInnerStr1);
    }

    // 外部调用 静态内部类
    @Test
    public void staticInner_test2() {
        OuterOfStaticInner.StaticInner inner = new OuterOfStaticInner.StaticInner();
        inner.innerMethod();

        // 使用内部类的对象 调用静态内部类的变量
        System.out.println(inner.innerStr);
        System.out.println(inner.staticInnerStr1);
        //私有的staticInnerStr2 不允许被调用
    }


    @Test
    public void memberInner_test() {
        OuterOfMemberInner outer = new OuterOfMemberInner();
        outer.test();
    }

    // 外部调用 成员内部类
    @Test
    public void memberInner_test2() {
        OuterOfMemberInner outer = new OuterOfMemberInner();
        // 这里的内部类调用方式 有点奇怪
        OuterOfMemberInner.MemberInner inner = outer.new MemberInner();
        inner.innerMethod();

        // 使用内部类的对象 调用内部类的变量
        System.out.println(inner.innerStr);
    }


    // 方法内部类
    @Test
    public void methodInner_test() {
        OuterOfMethodInner outer = new OuterOfMethodInner();
        outer.test();
    }


    // 匿名内部类： 实现回调接口的一种简单方式
    @Test
    public void anonymousInner_test() {
        List<Integer> list = new ArrayList<>();
//        list.add(3);
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println("排序前："+list);
//        //这样是正序
//        Collections.sort(list);
        //通过匿名内部类实现倒序
        Collections.sort(list, (o1, o2) -> {
            // 比较返回越大越靠前
            if(o1.compareTo(o2) > 0){
                return -1;
            }
            return 1;
        });
        System.out.println("排序后："+list);
    }

}
