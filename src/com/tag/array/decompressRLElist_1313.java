package com.tag.array;

import java.util.Arrays;

public class decompressRLElist_1313 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int length = 0;
        for (int i = 0; i < nums.length; i+=2) {
            length += nums[i];
        }
        int[] arr = new int[length];
        int index = 0;
        for (int i = 0; i < nums.length; i+=2) {
            for (int j = 1; j <= nums[i]; j++) {
                arr[index++] = nums[i+1];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
