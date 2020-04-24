package com.tag.array;

//leetcode:35

//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
//你可以假设数组中无重复元素。

//输入: [1,3,5,6], 5
//输出: 2
//输入: [1,3,5,6], 2
//输出: 1

public class search_Insert_35 {
    public static void main(String[] a){
        int[] nums = new int[]{1,3,5,6};
        int val = 7;
        int left = 0;
        int right = nums.length-1;

        if (nums.length == 0) {
            System.out.println(0);
        }else if (nums[nums.length-1] < val) {
            System.out.println(nums.length);
        }else{
            while(left < right){
                int mid = (left + right)/2;
                if (nums[mid] > val) {
                    right = mid;
                }else{
                    left = mid + 1;
                }
            }
            System.out.println(left);
        }
    }
}
