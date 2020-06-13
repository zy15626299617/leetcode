package com.tag.array;

/**
 * Created by 周游 on 2020/6/11
 * E-mail:15626299617@163.com
 */
public class missingNumber_17_04 {
    public static void main(String[] args){
        //利用异或的特性，res = res ^ x ^ x。对同一个值异或两次，那么结果等于它本身，所以我们对res从0-nums.length进行异或，
        // 同时对nums数组中的值进行异或，出现重复的会消失，所以最后res的值是只出现一次的数字，也就是nums数组中缺失的那个数字。
        //

        int[] nums = {};
        int res = 0;
        for (int i = 0; i < nums.length; ++i) {
            res ^= i;
            res ^= nums[i];
        }
        res ^= nums.length;

        //return res;
    }
}
