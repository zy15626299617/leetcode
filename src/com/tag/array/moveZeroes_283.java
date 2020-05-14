package com.tag.array;

import java.util.Arrays;

public class moveZeroes_283 {
    public static void main(String[] a){
        //两次遍历
        int[] input = new int[]{0,1,0,3,12};

        int left=0,right=0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] != 0){
                input[left] = input[i];
                left++;
            }
            //System.out.println(Arrays.toString(input));
        }

        for (int i = left; i < input.length; i++) {
            input[i] = 0;
            //System.out.println(Arrays.toString(input));
        }

        //System.out.println(Arrays.toString(input));

        //一次遍历
        input = new int[]{0,1,0,3,12};
        left = -1;
        for (int i = 0; i < input.length; i++) {
            if (input[i] != 0 && left != -1){
                input[left] = input[i];
                input[i] = 0;
                left++;
            }
            //将遇到的第一个元素定义为转换点
            if (input[i] == 0 && left == -1){
                left = i;
            }
            System.out.println(Arrays.toString(input));
        }

        //一次遍历，他写
        input = new int[]{0,1,0,3,12};
        left = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] != 0){
                int tmp = input[i];
                input[i] = input[left];
                input[left++] = tmp;
            }
            System.out.println(Arrays.toString(input));
        }
    }
}
