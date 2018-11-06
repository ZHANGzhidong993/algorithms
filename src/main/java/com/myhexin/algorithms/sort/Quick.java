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
        if (hi <= lo) {
            return;
        }
        int j = partition(a, lo, hi);//对数组进行切分，并返回基准元素的下标
        sort(a, lo, j - 1);//对基准元素左侧的数组进行排序
        sort(a, j + 1, hi);//对基准元素右侧的数组进行排序
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi + 1;//定义了左游标i，右游标j
        Comparable v = a[lo];//选择数组第一个元素作为了基准元素
        while (true) {
            while (less(a[++i], v)) {//当左游标的元素小于基准元素的时候就一直++
                if (i == hi) {//左游标到头的时候跳出循环
                    break;
                }
            }
            while (less(v, a[--j])) {//当基准元素小于右游标的元素的时候就一直--
                if (j == lo) {//右游标到头的时候跳出循环
                    break;
                }
            }
            if (i >= j) {
                break;//左右游标相遇则跳出循环
            }
            exch(a, i, j);//交换i和j元素位置
        }
        exch(a, lo, j);//调整基准元素到正确的位置
        return j;//返回基准元素的坐标
    }

}
