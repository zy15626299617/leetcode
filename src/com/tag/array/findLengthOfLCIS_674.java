package com.tag.array;

public class findLengthOfLCIS_674 {
    public static void main(String[] args){
        int[] nums = new int[]{1,3,5,4,7};
        //if (nums.length == 0) return 0;
        int max = 0;
        int pre_max = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i-1]){
                max = Math.max(max,pre_max);
                pre_max = 0;
            }

            if (nums[i] > nums[i-1]) pre_max++;
        }

        max = Math.max(max,pre_max);
        //return max+1;
    }
}
