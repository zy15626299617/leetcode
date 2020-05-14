package com.tag.array;

import java.util.TreeSet;

public class thirdMax_411 {
    public static void main(String[] a){
        int[] input = new int[]{3, 2, -1, 4};

        //TreeSet
        TreeSet<Integer> set = new TreeSet<Integer>();

        for (int i = 0; i < input.length; i++) {
            set.add(input[i]);
            if (set.size() > 3) set.remove(set.first());
        }

        //System.out.println(set.size()<3?set.last():set.first());


        //
        int min = Integer.MIN_VALUE;
        int mid = Integer.MIN_VALUE;
        int max = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] > min) {
                if (input[i] > mid){
                    if (input[i] > max){
                        min = mid;
                        mid = max;
                        max = input[i];
                    } else {
                        min = mid;
                        mid = input[i];
                    }
                } else {
                    min = input[i];
                }
            }
            System.out.println("MAX:"+max+",MID:"+mid+",MIN:"+min);
        }

        System.out.println(min == Integer.MIN_VALUE ? max : min);
    }
}
