package com.shuframework.arithmetic.sorts;

import java.util.Arrays;

/**
 * 插入排序： 将未排序的新元素，跟已经排序的元素进行比较，如果新元素小于已排序的元素右移，插入新元素
 *
 * @author shuheng
 */
public class InsertSort {

    public static void sort(int[] intArr) {
        int max = intArr.length - 1;
        for (int i = 0; i < max; i++) {
            System.out.println("第" + (i + 1) + "趟");
            int insertVal = intArr[i];
            int insertIndex = i;
//            int compareCount = 0;
            for (int j = insertIndex; j > 0 ; j--) {
                //新元素小于已排序元素
                if (insertVal < intArr[j]){
                    intArr[j+1] = intArr[j];
                    insertIndex--;
                }
//                System.out.println("交换次数：" + (++compareCount) + ", 结果：" + Arrays.toString(intArr));
            }
            intArr[insertIndex] = insertVal;
            System.out.println("结果：" + Arrays.toString(intArr));
        }
    }
}
