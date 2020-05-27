package com.tag.array;

public class isMonotonic_896 {
    public static void main(String[] args){
        int[] A = {};
        int pre = 0;

        for (int i = 0; i < A.length - 1; i++) {
            int c = Integer.compare(A[i],A[i+1]);
            if (c != 0){
                //if (c != pre && pre != 0) return false;
                pre = c;
            }
        }

        //return true;
    }
}
