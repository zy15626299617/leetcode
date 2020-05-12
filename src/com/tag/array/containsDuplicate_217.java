package com.tag.array;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicate_217 {
    public static void main(String[] a){
        int[] input = new int[]{1,2,3,1};
        Set<Integer> map = new HashSet(input.length);
        for (int x : input) {
            if (map.contains(x)) System.out.println("True");
            map.add(x);
        }
        System.out.println("FALSE");
    }
}
