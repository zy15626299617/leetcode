package com.tag.array;

import java.util.Arrays;

public class rotate_189 {
    public  static void main(String[] a){
        int[] input = new int[]{1,2,3,4,5,6,7};
        int target = 3;

        //easy
        for (int i = 0; i < target; i++) {
            int start = input[input.length - 1];
            for (int j = input.length-1; j > 0; j--) {
                input[j] = input[j-1];
            }
            input[0] = start;
        }

        System.out.println(Arrays.toString(input));

        //反转
        input = new int[]{1,2,3,4,5,6,7};
        class mf{
            public void reverse(int[] input,int start,int end){
                while (start < end){
                    int aa = input[start];
                    input[start] = input[end];
                    input[end] = aa;
                    start++;
                    end--;
                }
            }
        }

        new mf().reverse(input,0,input.length-1);
        new mf().reverse(input,0,target-1);
        new mf().reverse(input,target,input.length-1);

        System.out.println(Arrays.toString(input));
    }

}
