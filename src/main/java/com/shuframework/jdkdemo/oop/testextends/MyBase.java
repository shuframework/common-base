package com.shuframework.jdkdemo.oop.testextends;

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

    private final int MAX_COUNT = 10;
    private int[] intArr = new int[MAX_COUNT];
    private int count;

    public void add(int num) {
        if (count < MAX_COUNT) {
            intArr[count++] = num;
        }
    }

    public void addAll(int[] nums) {
        for (int i = 0, max = nums.length; i < max; i++) {
            add(nums[i]);
        }
    }

    public int[] getList() {
        return intArr;
    }

}
