package com.tag.array;

public class sortArrayByParityII_922 {
    public static void main(String[] args){
        int[] A = {};
        int start = 0,end = A.length-1,mid = 1;

        while (start < end && mid <= end){
            if (A[mid] % 2 != 0){
                mid += 2;
            }else{
                if (A[start] % 2 == 0){
                    start += 2;
                }else {
                    int c = A[start];
                    A[start] = A[mid];
                    A[mid] = c;
                    mid += 2;
                    start += 2;
                }
            }
        }
    }
}
