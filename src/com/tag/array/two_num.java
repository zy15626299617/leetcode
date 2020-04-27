package com.tag.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//leetcode:01

//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

//给定 nums = [2, 7, 11, 15], target = 9
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]

//主要解题思路为将数组元素放进哈希表，利用哈希表的特性来查询指定元素，。

public class two_num {
    public static void main(String[] a) {
        int[] num = new int[]{1, 2, 3, 4};
        int target = 4;

        class mf {
            //暴力破解
            public int[] f1(int[] nums, int target) {
                for(int i = 0; i < nums.length; ++i) {
                    for(int j = i + 1; j < nums.length; ++j) {
                        if (nums[j] == target - nums[i]) {
                            return new int[]{i, j};
                        }
                    }
                }

                throw new IllegalArgumentException("No two sum solution");
            }

            //俩遍哈希表
            public int[] f2(int[] nums, int target) {
                Map<Integer, Integer> hm = new HashMap();

                int i;
                for(i = 0; i < nums.length; ++i) {
                    hm.put(nums[i], i);
                }

                for(i = 0; i < nums.length; ++i) {
                    int target_ = target - nums[i];
                    //hm.get(target_) != i 会使得但target是俩个相同数之和时，即使相同的值的key被覆盖了，但因为下标不同，第二次遍历时将取得相同得值。
                    if (hm.containsKey(target_) && hm.get(target_) != i) {
                        return new int[]{target_, nums[i]};
                        //return new int[] { i, map.get(complement) };
                    }
                }

                throw new IllegalArgumentException("No two sum solution");
            }

            //一遍哈希表
            //添进哈希表的同时遍历，得到结果后直接结束，当结果靠前时可省去大量时间。
            public int[] f3(int[] nums, int target) {
                Map<Integer, Integer> hm = new HashMap();

                for(int i = 0; i < nums.length; ++i) {
                    int target_ = target - nums[i];
                    if (hm.containsKey(target_) && (Integer)hm.get(target_) != i) {
                        return new int[]{target_, nums[i]};
                    }
                    hm.put(nums[i], i);
                }

                throw new IllegalArgumentException("NO two sum solution");
            }
        }

        long start_time = System.nanoTime();
        int[] targat_array = new mf().f1(num, target);
        long end_time = System.nanoTime();
        System.out.println(end_time - start_time);
        System.out.println(Arrays.toString(targat_array));
    }

}

