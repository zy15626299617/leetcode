package com.tag.sort;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 周游 on 2020/6/22
 * E-mail:15626299617@163.com
 */
public class intersect_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map1 = new HashMap<Integer,Integer>();
        for(int i : nums1) map1.put(i,map1.containsKey(i) ? map1.get(i)+1 : 1);
        Map<Integer,Integer> map2 = new HashMap<Integer,Integer>();
        for(int i : nums2) map2.put(i,map2.containsKey(i) ? map2.get(i)+1 : 1);

        int size = 0;
        for(Map.Entry<Integer,Integer> entry: map1.entrySet()){
            if(map2.containsKey(entry.getKey())) {
                int count = Math.min(map1.get(entry.getKey()),map2.get(entry.getKey()));
                size += count;
                map1.put(entry.getKey(),-1 * count);
            }
        }


        int index = 0;
        int[] ans = new int[size];
        for(Map.Entry<Integer,Integer> entry: map1.entrySet()){
            if(entry.getValue() < 0){
                int i = entry.getValue();
                while (i < 0) {
                    i++;
                    ans[index++] = entry.getKey();
                }
            }
        }

        return ans;
    }


    //方法二：排序后使用双指针
    //    Arrays.sort(nums1);
    //    Arrays.sort(nums2);
    //    int i = 0, j = 0, k = 0;
    //    while (i < nums1.length && j < nums2.length) {
    //        if (nums1[i] < nums2[j]) {
    //            ++i;
    //        } else if (nums1[i] > nums2[j]) {
    //            ++j;
    //        } else {
    //            nums1[k++] = nums1[i++];
    //            ++j;
    //        }
    //    }
    //    return Arrays.copyOfRange(nums1, 0, k);
}
