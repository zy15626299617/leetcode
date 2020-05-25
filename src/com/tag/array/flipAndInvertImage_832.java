package com.tag.array;

import java.util.Arrays;

public class flipAndInvertImage_832 {
    public static void main(String[] args){
        int[][] A = new int[][]{{1,1,0},{1,0,1},{0,0,0}};

        int col = A[0].length - 1;
        for (int[] a : A){
            for (int i = 0; i < (a.length + 1)/2; i++) {
                if (a[i] == a[col-i] && i != col - i){
                    a[i] = a[i] ^ 1;
                    a[col-i] = a[col-i] ^ 1;
                }else if(i == col - i){
                    a[i] = a[i] ^ 1;
                }
            }
        }

        for (int[] a : A) {
            System.out.println(Arrays.toString(a));
        }
    }
}
