package com.tag.array;

import java.util.HashSet;
import java.util.Set;

public class containsNearbyDuplicate_219 {
    public static void main(String[] a){
        int[] input = new int[]{1,2,3,1};
        int target = 3;

        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < input.length; i++) {
            if (set.contains(input[i])){
                System.out.println("True");
                i = input.length;
            }

            set.add(input[i]);

            if (set.size() > target) set.remove(input[i-target]);
        }

        System.out.println("False");
    }
}
