package com.myhexin.algorithms.sort;

/**
 * 归并排序
 *
 * @author zhangzhidong
 * @create: 2018-08-20 21:45
 */
public class Merge extends Example {

    /**
     * 归并所需的辅助数组
     */
    private static Comparable[] aux;

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    private static void merge(Comparable[] a, int lo, int mid, int hi) {

        int l = lo, r = mid + 1;

        for (int i = lo; i <= hi; i++) {
            aux[i] = a[i];
        }

        for (int i = lo; i <= hi; i++) {

            if (l > mid) {
                a[i] = aux[r++];
            } else if (r > hi) {
                a[i] = aux[l++];
            } else if (less(aux[r], aux[l])) {
                a[i] = aux[r++];
            } else {
                a[i] = aux[l++];
            }

        }
    }

}
