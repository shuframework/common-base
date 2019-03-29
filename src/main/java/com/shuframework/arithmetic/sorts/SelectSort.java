package com.shuframework.arithmetic.sorts;

import java.util.Arrays;

/**
 * 选择排序：第一个元素和后面的所有元素进行比较，最小值出现在前面
 * 优化方案是 从2头选择元素进行比较，先比较小 然后比较大，总趟数是 length/2 (如 5/2=2)
 *
 * @author shuheng
 */
public class SelectSort {

    //2边同时进行排序
    public static void sort(int[] intArr) {
        //一趟走完 left++, right-- 后，总趟数是 length/2 (如5/2=2)
        for (int left = 0, right = intArr.length - 1; left < right; left++, right--) {
            System.out.println("第" + (left + 1) + "趟");
            int minValue = intArr[left];
            int maxValue = intArr[right];
            //兼容最右和最左的值刚刚是反的情况
            if (minValue > maxValue) {
                intArr[left] = maxValue;
                intArr[right] = minValue;
                //修改最小值
                int temp = minValue;
                minValue = maxValue;
                maxValue = temp;
            }
            //避免循环内不停的创建于回收变量
            int temp = 0;
            for (int j = left + 1; j <= right; j++) {

                if (minValue > intArr[j]) {
                    temp = intArr[j];
                    intArr[j] = intArr[left];
                    intArr[left] = temp;
                }
                if (maxValue < intArr[j]) {
                    temp = intArr[j];
                    intArr[j] = intArr[right];
                    intArr[right] = temp;
                }
                System.out.println("交换次数：" + j + ", 结果：" + Arrays.toString(intArr));
            }
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
