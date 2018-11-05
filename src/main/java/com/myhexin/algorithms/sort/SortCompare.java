package com.myhexin.algorithms.sort;

import org.apache.commons.lang3.time.StopWatch;

/**
 * @author zhangzhidong
 * @create: 2018-08-19 20:13
 */
public class SortCompare {

    public static double time(String alg, Comparable[] a) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        switch (alg) {
            case "Insertion":
                Insertion.sort(a);
                break;
            case "Selection":
                Selection.sort(a);
                break;
            default:
                System.out.println("No such algorithms!");
                break;
        }
        stopWatch.stop();
        return stopWatch.getTime();
    }

    public static double timeRandomInput(String alg, int N, int T) {
        double total = 0.0;
        Double[] a = new Double[N];
        for (int t = 0; t < T; t++) {
            for (int i = 0; i < N; i++) {
                a[i] = Math.random() * 100;
            }
            total += time(alg, a);
        }
        return total;
    }

    public static void main(String[] args) {
        String alg1 = "Insertion";
        String alg2 = "Selection";
        int N = 50000;
        int T = 1;
        double t1 = timeRandomInput(alg1, N, T);
        double t2 = timeRandomInput(alg2, N, T);
        System.out.println(String.format("使用算法%s对%d个长度为%d的数组排序，时间：%.2f\n" +
                "使用算法%s对%d个长度为%d的数组排序，时间：%.2f\n" +
                "算法%s的速度是算法%s的%.1f倍", alg1, T, N, t1, alg2, T, N, t2, alg1, alg2, t1 / t2));
    }
}
