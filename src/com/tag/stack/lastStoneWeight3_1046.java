package com.tag.stack;

import java.util.PriorityQueue;

/**
 * Created by 周游 on 2020/6/17
 * E-mail:15626299617@163.com
 */
public class lastStoneWeight3_1046 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((i1, i2) -> i2 - i1);
        for (int x: stones) {
            pq.offer(x);
        }
        while (pq.size() > 1) {
            int remaining = pq.poll() - pq.poll();
            if (remaining != 0) {
                pq.offer(remaining);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();

        //方法二
        //        int length = stones.length;
        //        if (length == 1) return stones[0];
        //        for(int i : stones){
        //            Arrays.sort(stones);
        //            stones[length-1] -= stones[length-2];
        //            stones[length-2]  = 0;
        //        }
        //        return stones[length-1];

    }
}
