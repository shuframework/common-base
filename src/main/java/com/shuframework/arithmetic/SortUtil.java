package com.shuframework.arithmetic;

public class SortUtil {

    /**
     * 冒泡排序：比较相邻的2位数，每趟将最大值放到最后
     *
     * @param intArr
     */
    public static void bubbleSort(int[] intArr) {
        int max = intArr.length - 1; //外层循环次数
        int compareCounts = max;//内层循环次数
        int temp = 0;
        for (int i = 0; i < max; i++) {
            //假设每次有序
            boolean flag = true;
            //上次最后发生交换的位置索引
            int lastChangeIndex = 0;
            for (int j = 0; j < compareCounts; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    temp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = temp;
                    flag = false;
                    lastChangeIndex = j;
                }
            }
            if (flag) {
                break;
            }
            //有过交换则改变内层循环次数
            compareCounts = lastChangeIndex;
        }
    }

    /**
     * 双向选择排序：第一个数与最后一位依次比较，每趟找出左边为最小，右边为最大值，下次下标依次移到
     *
     * @param intArr
     */
    public static void selectionSort(int[] intArr) {
        int temp = 0; //int temp; 这样也可以因为在使用前已经赋值了
        for (int left = 0, right = intArr.length - 1; left < right; left++, right--) {
            //第一个数与最后一位依次比较，每趟找出左边为最小，右边为最大值，下次下标依次移到
            for (int j = left; j < right; j++) {
                temp = intArr[j];
                if (intArr[j] < intArr[left]) {
                    intArr[j] = intArr[left];
                    intArr[left] = temp;
                }
                if (intArr[j] > intArr[right]) {
                    intArr[j] = intArr[right];
                    intArr[right] = temp;
                }
            }
        }
    }

    /**
     * 插入排序：放入的元素是有序，即从第三位开始先比较第二位，然后比较第一位，这样倒序比较
     * @param intArr
     */
    public static void insertSort(int[] intArr) {
        int temp = 0;
        //从第2位到最后一位
        for (int i = 1; i < intArr.length; i++) {
            for (int j = i; j > 0; j--) {
                //前面的数大于后面的数则交换
                if (intArr[j - 1] > intArr[j]) {
                    temp = intArr[j];
                    intArr[j] = intArr[j - 1];
                    intArr[j - 1] = temp;
                }
            }
        }
    }

}
