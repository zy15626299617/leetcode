package com.tag.array;

//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

//输入: [-2,1,-3,4,-1,2,1,-5,4],
//输出: 6
//解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。

public class maxSubArray {
    public static void main(String[] a){
        int[] nums = new int[]{-2,1,-3,5,-1,2,1,-5,4};

        //动态规划法 写法一
        int ans = nums[0];  //结果
        int sum = 0;  //最大连续子序列和
        //遍历数组
        for (int num : nums) {
            //如果前一个连续子序列和小于等于零，那么对于取最大值无益，抛弃结果然后重新取下一个元素
            if (sum <= 0) {
                sum = num;
            } else {  //如果前一个连续子序列和大于零，那么对于取最大值是有益的，保留并于下一元素累加
                sum += num;
            }
            //取得所有连续子序列和中的最大值
            ans = Math.max(ans, sum);
        }
        System.out.println(ans);

        //动态规划法 写法二
        int sums_ = nums[0];
        for (int i = 0; i < nums.length; i++) {
            //如果前一个连续子序列和大于零，那么对于取最大值是有益的，与下一元素累加并赋值到下一个元素
            if (nums[i] > 0) nums[i+1] += nums[i];
            //当前最大值与历史最大值相比较，取得所有连续子序列和中的最大值
            sums_ = Math.max(nums[i+1],sums_);
        }
        System.out.println(sums_);

        //贪心算法(每一次选择都是最佳方案，那么执行到最后就是全局的最佳方案)
        //current为当前位置的最佳方案，maxsum为历史的最佳方案
        int current = 0,maxsum = nums[0];
        for (int num:nums ) {
            current = Math.max(num,current+num);
            maxsum = Math.max(maxsum,current);
        }

        //分治算法
        //若 n==1，返回此元素。
        //left_sum 为最大子数组前 n/2 个元素，在索引为 (left + right) / 2 的元素属于左子数组。
        //right_sum 为最大子数组的右子数组，为最后 n/2 的元素。
        //cross_sum 是包含左右子数组且含索引 (left + right) / 2 的最大值。
        //最大序列和如果不在左侧数组，也不在右侧数组，那就在跨中心的数组中
        int left_sum = nums.length/2,right_sum = nums.length-left_sum;
        class Solution{
            public int get_cross_sum(int[] nums,int left,int right){

                return 0;
            }
        }
    }
}














class Solution {
    public int crossSum(int[] nums, int left, int right, int p) {
        if (left == right) return nums[left];

        int leftSubsum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = p; i > left - 1; --i) {
            currSum += nums[i];
            leftSubsum = Math.max(leftSubsum, currSum);
        }

        int rightSubsum = Integer.MIN_VALUE;
        currSum = 0;
        for(int i = p + 1; i < right + 1; ++i) {
            currSum += nums[i];
            rightSubsum = Math.max(rightSubsum, currSum);
        }

        return leftSubsum + rightSubsum;
    }

    public int helper(int[] nums, int left, int right) {
        if (left == right) return nums[left];

        int p = (left + right) / 2;

        int leftSum = helper(nums, left, p);
        int rightSum = helper(nums, p + 1, right);
        int crossSum = crossSum(nums, left, right, p);

        return Math.max(Math.max(leftSum, rightSum), crossSum);
    }

    public int maxSubArray(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }
}
