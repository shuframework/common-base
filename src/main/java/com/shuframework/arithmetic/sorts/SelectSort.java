package com.shuframework.arithmetic.sorts;

import java.util.Arrays;

/**
 * 选择排序：第一个元素和后面的所有元素进行比较，最小值出现在前面
 * 优化方案是 从2头选择元素进行比较，先比较小 然后比较大，总趟数是 length/2 (如 5/2=2)
 *
 * @author shuheng
 */
public class SelectSort {

    //2边同时进行排序，保证每次第一位是最小值，最后一位是最大值
    public static void sort(int[] intArr) {
        //避免循环内不停的创建于回收变量
        int temp = 0;
        int minValue = 0;
        int maxValue = 0;
        //一趟走完 left++, right-- 后，总趟数是 length/2 (如5/2=2)
        for (int left = 0, right = intArr.length - 1; left < right; left++, right--) {
            System.out.println("第" + (left + 1) + "趟");
            int compareCount = 0;
            //第一个数与最后一位依次比较，每趟找出左边为最小，右边为最大值，下次下标依次移到
            for (int j = left; j < right; j++) {
                //放在内层循环是因为，可能每次有交换，需要保证其是最新值,因为变量用不上所以不用定义
//                minValue = intArr[left];
//                maxValue = intArr[right];
                temp = intArr[j];
                if (intArr[left] > intArr[j]) {
                    intArr[j] = intArr[left];
                    intArr[left] = temp;
                }
                if (intArr[right] < intArr[j]) {
                    intArr[j] = intArr[right];
                    intArr[right] = temp;
                }
                System.out.println("交换次数：" + (++compareCount) + ", 结果：" + Arrays.toString(intArr));
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
