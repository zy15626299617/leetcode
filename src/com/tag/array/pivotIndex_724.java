package com.tag.array;

public class pivotIndex_724 {
    public static void main(String[] args){
        int[] nums = new int[]{1, 7, 3, 6, 5, 6};
        //if (nums.length < 3) return -1;
        
        int sum = 0,left_sum = 0;
        for (int i : nums) sum += i;
        for (int i = 0; i < nums.length; i++) {
            if (sum - nums[i] - left_sum == left_sum){
                //return i;
            }else {
                left_sum += nums[i];
            }
        }
        //return -1;
    }
}
