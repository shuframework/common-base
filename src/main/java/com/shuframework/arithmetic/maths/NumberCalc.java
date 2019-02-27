package com.shuframework.arithmetic.maths;

/**
 * 数字计算：实现排列、组合的概念
 * @author shuheng
 */
public class NumberCalc {

    /**
     * n!  阶乘factorial 其实排列的 A(n, n)或A(n, n-1)
     *
     * @param n
     * @return
     */
    public static int factorial(int n) {
//        int num = 1;
//        for (int i = n; i > 1; i--){
//            num *= i;
//        }
//        System.out.println(num);
//        return num;
        return arrangement(n, n - 1);
    }

    /**
     * n>m  排列permutation 或arrangement
     *
     * @param n
     * @param m
     * @return
     */
    public static int arrangement(int n, int m) {
        int num = 1;
        for (int i = n; i > (n - m); i--) {
            num *= i;
            System.out.print(i + " ");
        }
        System.out.println("=" + num);
        return num;
    }

    /**
     * n>m  组合combination
     * 算法：C(n, m) = A(n, m)/A(m, m-1)
     * 如：C(6, 3) = A(6, 3)/ A(3, 2)
     *
     * @param n
     * @param m
     * @return
     */
    public static int combination(int n, int m) {
        //特殊情况
        if (m == 0 || n == m) {
            return 1;
        }
        // 大于中间数时，选择小的数进行遍历 C(5,2)与C(5,3)的结果一样
        if (m > n / 2) {
            m = n - m;
        }
        return arrangement(n, m) / arrangement(m, m - 1);
    }
    //这个是原理算法，上面是简化版
//    public static int c2(int n, int m) {
//        int num1 = 1;//被除数
//        int num2 = 1;//除数
//        for (int i = n; i > (n - m); i--) {
//            num1 *= i;
//            System.out.print(i + " ");
//        }
//        System.out.println("=" + num1);
//        for (int i = m; i > 1; i--) {
//            num2 *= i;
//            System.out.print(i + " ");
//        }
//        System.out.println("=" + num2);
//        return num1 / num2;
//    }

}
