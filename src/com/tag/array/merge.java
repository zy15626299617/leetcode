package com.tag.array;

//leedcode:88

//给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
//初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
//你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。

//nums1 = [1,2,3,0,0,0], m = 3
//nums2 = [2,5,6],       n = 3
//输出: [1,2,2,3,5,6]

import java.util.Arrays;

public class merge {
    public static void main(String[] a){
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        int num1 = 3,num2 = 3;
        int n = num1 - 1,m = num2 - 1;
        int p = nums1.length - 1;

        //当某个数组完成遍历退出
        while (n >= 0 && m >= 0){
            nums1[p--] = (nums1[n] > nums2[m]) ? nums1[n--] : nums2[m--];
        }

        //如果nums2数组没有遍历完，则将剩余元素复制到num1的0-p项
        if (m >= 0) System.arraycopy(nums2,0,nums1,0,p+1);

        System.out.println(Arrays.toString(nums1));
    }
}
