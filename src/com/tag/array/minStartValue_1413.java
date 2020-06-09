package com.tag.array;

public class minStartValue_1413 {
    public static void main(String[] args){
        int[] nums = {};

        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i : nums){
            sum += i;
            min = Math.min(min,sum);
        }

        //return min <= 0 ? 1-min : 1;
    }
}
