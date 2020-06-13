package com.tag.array;

/**
 * Created by 周游 on 2020/6/11
 * E-mail:15626299617@163.com
 */
public class shuffle_1470 {
    public static void main(String[] args){
        int[] nums = {};
        int n = 0;
        int[] ans = new int[2*n];
        for(int i = 0;i < n;i++){
            ans[2*i] = nums[i];
            ans[2*i+1] = nums[i+n];
        }
        //return ans;
    }
}
