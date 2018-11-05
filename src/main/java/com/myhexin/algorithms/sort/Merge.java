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
        /** 记录左数组的起始下标i和右数组的起始下标j */
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            /** 将数组复制到辅助数组 */
            aux[k] = a[k];
        }
        //下面的for循环表示了合并两个数组时候的四种情况
        //i、j分别表示了左、右数组的当前元素
        for (int k = lo; k <= hi; k++) {
            //如果左半边用尽，取右半边起始元素
            if (i > mid) {
                a[k] = aux[j++];
                //如果右半边用尽，则取左边元素
            } else if (j > hi) {
                a[k] = aux[i++];
                //如果右边元素比左边小，则取右边元素
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
                //如果左边元素比右边小，则取左边元素
            } else {
                a[k] = aux[i++];
            }
        }
    }

}
