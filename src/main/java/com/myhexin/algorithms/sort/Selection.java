package com.myhexin.algorithms.sort;

/**
 * 选择排序
 *
 * @author zhangzhidong
 * @create: 2018-08-13 22:40
 */
public class Selection extends Example {

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }

}
