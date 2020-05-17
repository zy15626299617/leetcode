package com.tag.array;

//解题思路
//取得所有子数组的累加，取最大值
public class findMaxAverage_643 {
    public static void main(String[] a){
        int[] nums = new int[]{0,4,0,3,2};
        int k = 1;
        
        double res = 0;
        for (int i = 0; i < k; i++) {
            res += nums[i];
        }

        for (int i = k; i < nums.length; i++) {
            System.out.println("res:"+res+",nums[i]:"+nums[i]+",nums[i-k]:"+nums[i-k]);
            res = Math.max(res,res+nums[i]-nums[i-k]);
            System.out.println(res);
        }

        //return res / k;
    }
}
