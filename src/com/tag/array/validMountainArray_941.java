package com.tag.array;

public class validMountainArray_941 {
    public static void main(String[] args){
        int[] A = {0,3,2,1};
        int left = -1,right = A.length;

        //if (right <= 1) return false;

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] >= A[i+1]) {
                left = i - 1;
                break;
            }
        }

        for (int i = A.length - 1; i > 0; i--) {
            if (A[i-1] <= A[i]) {
                right = i + 1;
                break;
            }
        }

        //return left+1==right-1;
    }
}
