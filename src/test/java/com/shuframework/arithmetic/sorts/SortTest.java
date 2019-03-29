package com.shuframework.arithmetic.sorts;

import org.junit.Test;

import java.util.Arrays;

public class SortTest {

    @Test
    public void test1() {
//        int[] intArr1 = {3, 4, 2, 8, 6};
//        int[] intArr1 = {3, 4, 2, 8, 6, 5};
//        int[] intArr1 = {3, 4, 2, 8, 6, 1, 5};
//        int[] intArr1 = {3, 4, 2, 8, 6, 1, 7, 5};
        //局部有序时 冒泡排序快，极端情况（本身已排序）则只会是一次
//        int[] intArr1 = {3, 2, 1, 6, 4, 5, 7, 8};
        int[] intArr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] intArr2 = Arrays.copyOf(intArr1, intArr1.length);
        int[] intArr3 = Arrays.copyOf(intArr1, intArr1.length);

        System.out.println("======冒泡排序=======");
        BubbleSort.sort(intArr1);
        System.out.println("======选择排序=======");
        SelectSort.sort(intArr2);
    }

    @Test
    public void bubbleSort_test1() {
        int[] intArr1 = {3, 2, 1, 6, 4, 5, 7, 8};
        BubbleSort.sort(intArr1);
//        System.out.println("结果:"+ Arrays.toString(intArr));
        System.out.println("=============");

        int[] intArr2 = {3, 2, 1, 6, 4, 5, 7, 8};
        BubbleSort.sortHasFlag(intArr2);
        System.out.println("===============");

        int[] intArr3 = {3, 2, 1, 6, 4, 5, 7, 8};
        BubbleSort.sortClassic(intArr3);
    }


    @Test
    public void selectSort_test2() {
        int[] intArr1 = {3, 2, 1, 6, 4, 5, 7, 8};
        SelectSort.sortByMin(intArr1);
        System.out.println("===============");

        int[] intArr2 = {3, 2, 1, 6, 4, 5, 7, 8};
        SelectSort.sort(intArr2);
    }

    @Test
    public void selectSort_test() {
//        int[] intArr = {2, 5, 4, 3, 1};
//        int[] intArr = {1, 2, 3, 4, 5, 6, 7};
//        int[] intArr = {7, 6, 5, 4, 3, 2, 1};
        int[] intArr = {7, 6, 5, 4, 1, 2, 3};
//        int[] intArr = {3, 2, 1, 6, 4, 5, 7, 8};
        SelectSort.sort(intArr);
    }

    @Test
    public void insertSort_test() {
//        int[] intArr = {2, 5, 4, 3, 1};
//        int[] intArr = {1, 2, 3, 4, 5, 6, 7};
//        int[] intArr = {7, 6, 5, 4, 3, 2, 1};
        int[] intArr = {7, 6, 5, 4, 1, 2, 3};
//        int[] intArr = {3, 2, 1, 6, 4, 5, 7, 8};
        InsertSort.sort(intArr);
    }
}