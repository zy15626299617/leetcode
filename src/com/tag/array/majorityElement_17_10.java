package com.tag.array;

/**
 * Created by 周游 on 2020/6/11
 * E-mail:15626299617@163.com
 */
public class majorityElement_17_10 {
    public static void main(String[] args){
        int[] nums = {1,2,5,9,5,9,5,5,5};

        int ans = nums[0],count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == ans) count++;
            else count--;

            if (count == 0){
                ans = nums[i];
                count = 1;
            }
        }

        count = 0;
        for (int i : nums) if (i == ans) count++;
        //return count > nums.length ? ans : -1;

        System.out.println(ans);
    }
}
