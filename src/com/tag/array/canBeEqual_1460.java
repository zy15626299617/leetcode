package com.tag.array;

import java.util.Arrays;

public class canBeEqual_1460 {
    public static void main(String[] args){
        int[] target = {};
        int[] arr = {};

        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < target.length; i++) {
            //if (target[i] != arr[1]) return false;
        }
        //return true;

        //桶排序
        //int[] target_keg = new int[1001];
        //int[] arr_keg = new int[1001];
        //for (int i = 0; i < target.length; i++) {
        //    target_keg[target[i]]++;
        //    arr_keg[arr[i]]++;
        //}
        //for(int i = 1;i < 1001;i++){
        //    if (arr_keg[i] != target_keg[i]) return false;
        //}
        //return true;
    }
}
