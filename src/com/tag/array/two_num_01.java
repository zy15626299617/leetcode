package com.tag.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class two_num_01 {
    public static void main(String[] a) {
        int[] num = new int[]{1, 2, 3, 4};
        int target = 4;
        mf myfunction = new mf();
        long start_time = System.nanoTime();
        int[] targat_array = myfunction.f1(num, target);
        long end_time = System.nanoTime();
        System.out.println(end_time - start_time);
        System.out.println(Arrays.toString(targat_array));
    }
}

class mf {
    mf() {
    }

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

    public int[] f2(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap();

        int i;
        for(i = 0; i < nums.length; ++i) {
            hm.put(nums[i], i);
        }

        for(i = 0; i < nums.length; ++i) {
            int target_ = target - nums[i];
            if (hm.containsKey(target_) && hm.get(target_) != i) {
                return new int[]{target_, nums[i]};
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }

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
