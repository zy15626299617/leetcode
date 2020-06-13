package com.tag.array;

/**
 * Created by 周游 on 2020/6/11
 * E-mail:15626299617@163.com
 */
public class merge_10_01 {
    public static void main(String[] args){
        int[] A = {};
        int m = 0;
        int[] B = {};
        int n = 0;

        while (m > 0 || n > 0){
            if (m>0 && n>0) A[m + n - 1] = A[m - 1] > B[n - 1] ? A[--m] : B[--n];
            else if (m == 0) A[n - 1] = B[--n];
            else A[m - 1] = A[--m];
        }

    }
}
