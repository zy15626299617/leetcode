package com.tag.array;

import java.util.HashSet;

//解题思路
//当k<0时，不存在返回0；
//当k=0时，计算重复元素的个数（hash遍历 set）
//当K>0时，寻找元素中是否存在当前元素+k或-k，且需剔除多组组合相同的元素，只取一组。
//查询可使用hash进行查询，因为不需要重复组合可将所有重复元素剔除只取一个元素（set集合）
public class findPairs_532 {
    public static void main(String[] a){
        int[] nums = new int[]{1,3,1,5,4};
        int k = 0;

        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> result = new HashSet<Integer>();

        //if (k < 0) return 0;
        if (k < 0) System.out.println(0);

        for (int i = 0; i < nums.length; i++) {
            if (k == 0) {
                if (set.contains(nums[i])){
                    result.add(nums[i]);
                }
                set.add(nums[i]);
            }else {
                set.add(nums[i]);
            }
        }

        if (k > 0) {
            for (int x : set) {
                int target1 = x + k;
                int target2 = x - k;
                if (set.contains(target1)) {
                    result.add(Math.min(x, target1));
                }

                if (set.contains(target2)) {
                    result.add(Math.min(x, target2));
                }
            }
        }

        System.out.println(result.size());
    }
}
