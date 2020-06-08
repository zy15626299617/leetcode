package com.tag.array;

public class smallerNumbersThanCurrent_1365 {
    public static void main(String[] args){
        int[] nums = {8,1,2,2,3};

        int[] keg = new int[101];
        for (int i : nums) keg[i]++;
        int pre = 0,next = 0;
        for (int i = 0; i < 101; i++) {
            int val = keg[i];
            if (keg[i] > 0) keg[i] = pre;
            pre += val;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = keg[nums[i]];
        }
    }
}
