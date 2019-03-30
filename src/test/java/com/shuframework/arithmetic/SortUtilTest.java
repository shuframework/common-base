package com.shuframework.arithmetic;

import org.junit.Test;

import java.util.Arrays;

public class SortUtilTest {

    @Test
    public void bubbleSort() {
//        int[] intArr = {3, 2, 1, 6, 4, 5, 7};
        int[] intArr = {7, 6, 5, 4, 3, 2, 1};
        SortUtil.bubbleSort(intArr);
        System.out.println(Arrays.toString(intArr));
    }

    @Test
    public void selectionSort() {
//        int[] intArr = {3, 2, 1, 6, 4, 5, 7};
        int[] intArr = {7, 6, 5, 4, 3, 2, 1};
        SortUtil.selectionSort(intArr);
        System.out.println(Arrays.toString(intArr));
    }

    @Test
    public void insertSort() {
        int[] intArr = {3, 2, 1, 6, 4, 5, 7};
//        int[] intArr = {7, 6, 5, 4, 3, 2, 1};
        SortUtil.insertSort(intArr);
        System.out.println(Arrays.toString(intArr));
    }
}