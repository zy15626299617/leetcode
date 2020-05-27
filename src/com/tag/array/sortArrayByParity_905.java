package com.tag.array;

import java.util.Arrays;

public class sortArrayByParity_905 {
    public static void main(String[] args){
        int[] A = {1,4,2,5,125,6,4,2,3};
        int start = 0,end = A.length-1;
        while(start < end){
            if (A[start] % 2 == 0 ){
                start++;
            }else {
                int a = A[end];
                A[end] = A[start];
                A[start] = a;
                end --;
            }
        }
        System.out.println(Arrays.toString(A));
    }
}
