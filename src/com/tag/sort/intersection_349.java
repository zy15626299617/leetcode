package com.tag.sort;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by 周游 on 2020/6/18
 * E-mail:15626299617@163.com
 */
public class intersection_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i : nums1) set1.add(i);
        for(int i : nums2) {
            if(set1.contains(i)){
                set2.add(i);
            }
        }

        int index = 0;
        int[] ans = new int[set2.size()];
        for (int i : set2) ans[index++] = i;
        return ans;
    }



    //使用API
    //  public int[] intersection(int[] nums1, int[] nums2) {
    //    HashSet<Integer> set1 = new HashSet<Integer>();
    //    for (Integer n : nums1) set1.add(n);
    //    HashSet<Integer> set2 = new HashSet<Integer>();
    //    for (Integer n : nums2) set2.add(n);
    //
    //    set1.retainAll(set2);
    //
    //    int [] output = new int[set1.size()];
    //    int idx = 0;
    //    for (int s : set1) output[idx++] = s;
    //    return output;
    //  }
}
