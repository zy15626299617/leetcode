package com.tag.array;

import java.util.ArrayList;
import java.util.Arrays;

public class minimumAbsDifference_1200 {
    public static void main(String[] args){
        int[] arr = {};

        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            int abs = Math.abs(arr[i] - arr[i+1]);
            if (abs < min){
                min = abs;
                list.clear();
            }

            if (abs == min){
                ArrayList<Integer> list_ = new ArrayList<Integer>();
                list_.add(arr[i]);
                list_.add(arr[i+1]);
                list.add(list_);
            }
        }

    }
}
