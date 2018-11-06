package com.myhexin.algorithms.sort;

import com.alibaba.fastjson.JSON;

/**
 * 希尔排序
 *
 * @author zhangzhidong
 * @create: 2018-08-19 22:52
 */
public class Shell extends Example {

    public static void sort(Comparable a[]) {
        int N = a.length;
        // 步长
        int h = 1;
        // 初始化步长
        System.out.println("h=1");
        while (h < N / 3) {
            h = 3 * h + 1;
            System.out.println("调整h: " + h);
        }
        int count = 0;
        System.out.println("init: " + JSON.toJSONString(a));
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j - h);
                    count++;
                    System.out.println("第" + count + "次交换，h=" + h + " : " + JSON.toJSONString(a));
                }
            }
            h = h / 3;
        }
    }

}
