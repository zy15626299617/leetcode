package com.tag.array;

import java.util.HashMap;
import java.util.Map;

public class findLucky_1394 {
    public static void main(String[] args){
        int[] arr = {};

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i : arr){
            if (hashMap.containsKey(i)) hashMap.put(i,hashMap.get(i)+1);
            else hashMap.put(i,1);
        }

        int max = -1;
        for (Map.Entry<Integer,Integer> entry : hashMap.entrySet()){
            if (entry.getKey() == entry.getValue()) max = Math.max(max,entry.getValue());
        }

        //int[] ans = new int[501];
        //for (int i : arr) ans[i]++;
        //int max = -1;
        //for (int i = 1; i < ans.length; i++) {
        //    if (i == ans[i]) max = Math.max(max,i);
        //}
        //return max;
    }
}
