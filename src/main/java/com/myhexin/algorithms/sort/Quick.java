package com.myhexin.algorithms.sort;


/**
 * 快速排序
 *
 * @author zhangzhidong
 * @create: 2018-08-26 20:49
 */
public class Quick extends Example {

    public static void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int j = partition(a, lo, hi);
        sort(a, lo, j);
        sort(a, j + 1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {

        int l = lo, r = hi + 1;

        Comparable pivot = a[lo];

        while (true) {
            while (less(a[++l], pivot)) {
                if (l == hi) {
                    break;
                }
            }
            while (less(pivot, a[--r])) {
                if (r == lo) {
                    break;
                }
            }
            if (l >= r) {
                break;
            }
            exch(a, l, r);
        }

        exch(a, lo, r);
        return r;
    }

}
