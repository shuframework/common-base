package com.shuframework.arithmetic.sorts;

import java.util.Arrays;

/**
 * 插入排序： 将未排序的新元素，跟已经排序的元素进行比较，如果新元素小于已排序的元素右移，插入新元素
 *
 * @author shuheng
 */
public class InsertSort {

    public static void sort(int[] intArr) {
        //从第2位到最后一位
        for (int i = 1; i < intArr.length; i++) {
            System.out.println("第" + i + "趟");
            int compareCount = 0;
            for (int j = i; j > 0; j--) {
                //前面的数大于后面的数则交换
                if (intArr[j - 1] > intArr[j]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[j - 1];
                    intArr[j - 1] = temp;
                }
                System.out.println("交换次数：" + (++compareCount) + ", 结果：" + Arrays.toString(intArr));
            }
        }
    }
}
