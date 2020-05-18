package com.tag.array;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class findShortestSubArray_697 {
    public static void main(String[] args){
        int[] nums = new int[]{1,2,2,3,1};

        Map<Integer,Integer> right = new HashMap(),
                left = new HashMap(),count = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (left.get(x) == null) left.put(x,i);
            right.put(x,i);
            count.put(x, count.getOrDefault(x,0)+1);
        }

        int degree = Collections.max(count.values());
        int min = 0;
        for (int x : count.keySet()){
            if (count.get(x) == degree){
                min = Math.min(min,right.get(x) - left.get(x) + 1);
                System.out.println("x:"+x+",r:"+right.get(x)+",l:"+left.get(x));
            }
        }

        //return min;
    }
}
