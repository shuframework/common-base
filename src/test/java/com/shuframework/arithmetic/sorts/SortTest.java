package com.shuframework.arithmetic.sorts;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void selectSort_test3() {
        int[] intArr = {6, 5, 4, 3, 2, 1};
        SelectSort.sort(intArr);
    }

    @Test
    public void selectSort_test2() {
        int[] intArr = {1, 2, 3, 4, 5, 6};
        SelectSort.sort(intArr);
    }

    @Test
    public void selectSort_test() {
        int[] intArr = {3,2,4,1,6,5};
//        SelectSort.sortByMin(intArr);
        SelectSort.sort(intArr);
    }
}