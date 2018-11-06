package com.myhexin.algorithms.sort;

/**
 * 冒泡排序
 *
 * @author zhangzhidong
 * @since 2018/11/6
 */
public class Bubble extends Example {

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = N - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (less(a[j + 1], a[j])) {
                    exch(a, j + 1, j);
                }
            }
        }
    }
}
