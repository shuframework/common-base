package com.shuframework.jdkdemo.oop.innerclass;

/**
 * 静态内部类 示例
 * 如果内部类 不想外部其他类调用 可以将权限修饰符改为private 即只是在内部使用。
 * 单例模式里面有这样使用，ArrayList里的实现也有用
 *
 * @author shuheng
 */
public class OuterOfStaticInner {

    private static int shared = 10;

    // 静态内部类 使用时与普通的类没啥区别,
    public static class StaticInner {
        public String innerStr = "innerStr";
        public static String staticInnerStr1 = "public staticInner";
        // 修饰符是private 那么外部类不能进行访问，在外部类内部可以使用，即在private的使用范围内
        private static String staticInnerStr2 = "private staticInner";

        public void innerMethod(){
            System.out.println("innerMethod:"+shared);
        }

        public static void staticInnerMethod(){
            System.out.println("staticInnerMethod:"+shared);
        }
    }

    //调用内部类的方法
    public void test() {
        StaticInner inner = new StaticInner();
        inner.innerMethod();
    }
    //调用内部类的方法
    public void test2() {
        //这是外部直接访问
//        OuterOfStaticInner.MemberInner.staticInnerMethod();
        StaticInner.staticInnerMethod();
    }
}
