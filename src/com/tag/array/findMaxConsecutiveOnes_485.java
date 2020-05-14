package com.tag.array;

public class findMaxConsecutiveOnes_485 {
    public static void main(String[] a){
        int[] input = new int[]{1,1,0,1,1,1};

        int max = Integer.MIN_VALUE;
        int premax = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] == 0) {
                max = Math.max(max,premax);
                premax = 0;
            }else {
                premax++;
            }
        }

        max = Math.max(max,premax);
        System.out.println(max);
    }
}
