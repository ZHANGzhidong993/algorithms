package com.myhexin.algorithms.sort;

/**
 * 插入排序
 *
 * @author zhangzhidong
 * @create: 2018-08-13 22:59
 */
public class Insertion extends Example {

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }
}
