package com.tag.array;

public class missingNumber_268 {
    public static void main(String[] a){
        int[] input = new int[]{9,6,4,2,3,5,7,0,1};

        int sum = input.length*(input.length+1)/2;
        for (int x : input) sum -= x;

        System.out.println(sum);
    }
}
