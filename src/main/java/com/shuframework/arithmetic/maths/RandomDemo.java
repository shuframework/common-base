package com.shuframework.arithmetic.maths;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

/**
 * @author shuheng
 */
public class RandomDemo {
    // 工具类 可以见 com.shuframework.commonbase.util.random.RandomUtil

    // 随机打乱
    public void shuffle(int[] arr) {
        Random random = new Random();
        for (int i = arr.length; i > 1; i--) {
            // 从尾部开始 与前面的元素随机交换，因为随机数的范围是[0, max)
            swap(arr, (i-1), random.nextInt(i));
        }
    }

    /**
     * 将 i 与 j 互换
     * @param arr
     * @param i
     * @param j
     */
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    @Test
    public void test() {
        int[] arr = {1,3,4,5,6};
        shuffle(arr);
        System.out.println(Arrays.toString(arr));
    }

}
