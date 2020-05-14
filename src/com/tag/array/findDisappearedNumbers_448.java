package com.tag.array;


import java.util.ArrayList;
import java.util.Arrays;

public class findDisappearedNumbers_448 {
    public static void main(String[] a){
        int[] input = new int[]{4,3,2,7,8,2,3,1};

        for (int i = 0; i < input.length; i++){
            if (input[i] < 0 && input[-input[i] - 1] > 0){
                input[-input[i] - 1] = -input[-input[i] - 1];
            }
            if (input[i] > 0 && input[input[i] - 1] > 0){
                input[input[i] - 1] = -input[input[i] - 1];
            }
        }

        ArrayList<Integer> res = new ArrayList<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i] > 0 ? i+1 : "");
        }

        System.out.println(Arrays.toString(input));
    }
}
