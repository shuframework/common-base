package com.shuframework.arithmetic.sorts;

import java.util.Arrays;

/**
 * 选择排序：第一个元素和后面的所有元素进行比较，最小值出现在前面
 *
 * @author shuheng
 */
public class SelectSort {

    //2边同时进行排序
    public static void sort(int[] intArr) {
//        int max = intArr.length - 1;
        int left = 0;
        int right = intArr.length - 1;
        for (int i = left; i < right; i++) {
//            int minIndex = i;
            int minValue = intArr[left];
//            int maxIndex = right;
            int maxValue = intArr[right];
            System.out.println("第" + (i + 1) + "趟");
            for (int j = i + 1; j <= right; j++) {
                if (minValue > intArr[j]) {
                    //交换
//                    minIndex = j;
                    int temp = intArr[j];
                    intArr[j] = minValue;
                    intArr[left] = temp;
                }
                if (maxValue < intArr[j]) {
                    //交换
                    int temp = intArr[j];
                    intArr[j] = maxValue;
                    intArr[right] = temp;
                }
                System.out.println("交换次数：" + j + ", 结果：" + Arrays.toString(intArr));
            }
            left++;
            right--;
        }
    }


    public static void sortByMin(int[] intArr) {
        int max = intArr.length - 1;
        for (int i = 0; i < max; i++) {
//            int minValue = intArr[i];
            System.out.println("第" + (i + 1) + "趟");
            for (int j = i + 1; j <= max; j++) {
                if (intArr[i] > intArr[j]) {
                    //交换
                    int temp = intArr[j];
                    intArr[j] = intArr[i];
                    intArr[i] = temp;
                }
                System.out.println("交换次数：" + j + ", 结果：" + Arrays.toString(intArr));
            }
        }
    }

    // 这个效果是倒序，因为最大值是第一个
    public static void sortByMax(int[] intArr) {
        int max = intArr.length - 1;
        for (int i = 0; i < max; i++) {
//            int maxValue = intArr[i];
            System.out.println("第" + (i + 1) + "趟");
            for (int j = i + 1; j <= max; j++) {
                if (intArr[i] < intArr[j]) {
                    //交换
                    int temp = intArr[j];
                    intArr[j] = intArr[i];
                    intArr[i] = temp;
                }
                System.out.println("交换次数：" + j + ", 结果：" + Arrays.toString(intArr));
            }
        }
    }

}
