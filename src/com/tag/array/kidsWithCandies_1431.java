package com.tag.array;

import java.util.ArrayList;

public class kidsWithCandies_1431 {
    public static void main(String[] args){
        int[] candies = {};
        int extraCandies = 0;

        ArrayList<Boolean> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i : candies) max = Math.max(max, i);
        for (int i = 0; i < candies.length; i++) {
            list.add(candies[i]+extraCandies >= max ? true : false);
        }

        //return list;
    }
}
