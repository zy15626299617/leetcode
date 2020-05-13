package com.tag.array;

public class moveZeroes_283 {
    public static void main(String[] a){
        int left = 0;
        int right = 1;
        while(left < nums.length){
            if(nums[left] != 0){
                nums[left] = nums[right];
                left++;
                nums[left] = 0;
            }else{

            }
        }
    }
}
