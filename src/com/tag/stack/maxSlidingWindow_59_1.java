package com.tag.stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by 周游 on 2020/6/16
 * E-mail:15626299617@163.com
 */
public class maxSlidingWindow_59_1 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0) return new int[0];
        Deque<Integer> deque = new LinkedList<>();
        int[] ans = new int[nums.length - k + 1];
        for(int i = 1-k,j = 0; j < nums.length; i++, j++){
            if(i > 0 && nums[i-1] == deque.peekFirst()) deque.removeFirst();
            while (!deque.isEmpty() && nums[j] > deque.peekLast()) deque.removeLast();
            deque.addLast(nums[j]);
            if(i >= 0) ans[i] = deque.peekFirst();
        }
        return ans;
    }
}
