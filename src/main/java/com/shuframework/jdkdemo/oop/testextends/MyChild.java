package com.shuframework.jdkdemo.oop.testextends;

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


    private int sum;

    @Override
    public void add(int num) {
        super.add(num);
        sum += num;
    }

    @Override
    public void addAll(int[] nums) {
        super.addAll(nums);
        // 会调用add(int num) 已经累加过了
//        // 不调用super.addAll(nums); 如下修改，但其实这样的实现就是上面的实现
//        for (int i = 0, max = nums.length; i < max; i++) {
//            super.add(nums[i]);
//            sum += nums[i];
//        }
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
