package com.tag.stack;

import java.util.PriorityQueue;

/**
 * Created by 周游 on 2020/6/17
 * E-mail:15626299617@163.com
 */
public class getLeastNumbers_40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0) return new int[0];
        PriorityQueue<Integer> queue =  new PriorityQueue<>(k);
        for (int i : arr) queue.add(i);
        int[] ans = new int[k];
        for(int i = 0;i < k; i++) ans[i] = queue.poll();
        return ans;
    }
}
