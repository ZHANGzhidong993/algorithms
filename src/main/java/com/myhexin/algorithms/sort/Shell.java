package com.myhexin.algorithms.sort;

/**
 * 希尔排序
 *
 * @author zhangzhidong
 * @create: 2018-08-19 22:52
 */
public class Shell extends Example {

    public static void sort(Comparable a[]) {

        int N = a.length;

        /** 初始化步长 */
        int h = 1;
        while (h < N / 3) {
            h = h * 3 + 1;
        }

        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }

}
