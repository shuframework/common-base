package com.shuframework.arithmetic.sorts;

/**
 * @author shuheng
 */
public class TempSort {

    public static void sort(int[] intArr) {
        int max = intArr.length - 1;
        for (int i = 0; i < max; i++) {
            System.out.println("第" + (i + 1) + "趟");
        }
    }
}
