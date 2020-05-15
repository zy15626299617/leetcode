package com.tag.array;

import java.util.Arrays;

//解题思路
//排序数组，数组越紧凑，损失越少，取值更大

public class arrayPairSum_561 {
    public static void main(String[] a){
        int[] nums = new int[]{1,4,3,2};
            int result = 0;

            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i+=2) {
                result += nums[i];
            }
    }
}
