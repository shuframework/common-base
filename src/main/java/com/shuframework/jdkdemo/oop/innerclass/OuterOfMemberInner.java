package com.shuframework.jdkdemo.oop.innerclass;

/**
 * 成员内部类 示例
 * @author shuheng
 */
public class OuterOfMemberInner {

    private static int shared = 10;

    // 成员内部类 与静态内部类的区别是 类没有用static修饰,
    public class MemberInner {
        public String innerStr = "innerStr";

        public void innerMethod(){
            System.out.println("innerMethod:"+shared);
        }

    }

    //调用内部类的方法
    public void test() {
        MemberInner inner = new MemberInner();
        inner.innerMethod();
    }
    //调用内部类的方法
//    public void test2() {
//        MemberInner.staticInnerMethod(); // 这样编译不通过，因为不是静态方法
//    }
}
