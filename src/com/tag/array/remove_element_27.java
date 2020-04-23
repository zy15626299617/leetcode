package com.tag.array;

//leetcode:27

//给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
//不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
//元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
//链接：https://leetcode-cn.com/problems/remove-element

//给定 nums = [0,1,2,2,3,0,4,2], val = 2,
//函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
//注意这五个元素可为任意顺序。
//你不需要考虑数组中超出新长度后面的元素。

import java.util.Arrays;

public class remove_element_27 {
    public static void main(String[] a){
        //当需要移除的元素很多时：
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        //return i

        //当移除的元素很少时
        int[] nums_ = new int[]{4,1,2,3,4,5};
        int val_ = 4;
        int length = nums_.length;
        int i_ = 0;
        while( i_ < length ){
            if (nums[i_] == val_){
                nums[i_] = nums[length];
                length--;
            }else{
                i_++;
            }
        }
        System.out.println(Arrays.toString(nums_));
        //return i
    }
}
