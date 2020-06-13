package com.tag.stack;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by 周游 on 2020/6/13
 * E-mail:15626299617@163.com
 */
public class nextGreaterElement_496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for (int i : nums2){
            while(!stack.isEmpty() && i > stack.peek())
                hashmap.put(stack.pop(),i);
            stack.push(i);
        }
        int[] ans = new int[nums1.length];
        for (int i = 0;i < nums1.length;i++){
            if(hashmap.containsKey(nums1[i])) ans[i] = hashmap.get(nums1[i]);
            else ans[i] = -1;
        }
        return ans;
    }
}
