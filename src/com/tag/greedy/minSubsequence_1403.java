package com.tag.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 周游 on 2020/6/18
 * E-mail:15626299617@163.com
 */
public class minSubsequence_1403 {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int Sum = 0,sum = 0;
        for(int i : nums) Sum += i;
        for(int i = nums.length - 1;i >=0;i--) {
            sum += nums[i];
            list.add(nums[i]);
            if(2 * sum > Sum) break;
        }
        return list;
    }
}
