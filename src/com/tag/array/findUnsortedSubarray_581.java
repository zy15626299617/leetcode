package com.tag.array;

import java.util.Arrays;

//解题思路
//将数组排序后与原数组左右逐个比对，返回第一个不相同的位置

public class findUnsortedSubarray_581 {
    public static void main(String[] a){
        int[] nums = new int[]{1,2,3,3,3};
        int[] nums_=  nums;
        Arrays.sort(nums_);

        int left = nums.length,right = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums_[i]){
                left = Math.min(left,i);
                right = Math.max(right,i);
            }
        }

        System.out.println(right - left >= 0 ? right - left + 1 : 0);

        //other
        int start = 0,end = -1;
        int max = nums[0],min = nums[nums.length-1];
        for (int i = 0; i < nums.length; i++) {
            //取左边界，从数组右侧向左遍历，如果左侧大于右侧，说明右侧不正确，记录。否则左侧小于等于右侧，合理，将当前左侧转为为下一个循环的右侧
            if (nums[nums.length-1-i] > min){
                start = nums.length-1-i;
            }else {
                min = nums[nums.length-1-i];
            }

            //取右边界，从数组左侧向右遍历，如果左侧大于右侧，说明右侧不正确，记录。否则左侧小于等于右侧，合理，将当前的右侧转为下一个循环的左侧
            //白话：从左向右向右遍历数组，如果前一个元素>当前元素，说明当前元素不正确，因为是升序数组，将当前位置记为右边界。若前一个元素<=当前
            //元素，合理，将当前元素记为当前最大元素，继续遍历与下一个元素比较。比如若数组长度为8，最后三个元素组成的子数组是有序的，则遍历到这
            //三个元素时，右边界将不会改变，右边界将止步于地五个元素。若数组最后的一个元素并不是最大值，因为遍历时一直取最大值，所以最后一个元素
            //将与最大值相比较，自然不合理从而右边界取到末尾。取左边界同理。
            if (max > nums[i]){
                end = i;
            }else {
                max = nums[i];
            }
        }

        System.out.println(end-start+1);
    }
}
