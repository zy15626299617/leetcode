package com.tag.stack;

import java.util.PriorityQueue;

/**
 * Created by 周游 on 2020/6/16
 * E-mail:15626299617@163.com
 */
public class KthLargest_703 {
    private PriorityQueue<Integer> queue;
    private int limit;

    public KthLargest_703(int k, int[] nums) {
        limit = k;
        queue = new PriorityQueue<>(k);
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (queue.size() < limit) {
            queue.add(val);
        } else if (val > queue.peek()) {
            queue.poll();
            queue.add(val);
        }

        return queue.peek();
    }
}
