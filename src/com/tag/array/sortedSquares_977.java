package com.tag.array;

public class sortedSquares_977 {
    public static void main(String[] args){
        int[] A = {};

        //if (A.length == 1) return new int[]{A[0] * A[0]};
        int[] ans = new int[A.length];
        int start = 0,end = A.length-1,index = A.length-1;

        while (start <= end){
            int a = Math.abs(A[start]),b = Math.abs(A[end]);
            if (a <= b){
                ans[index] = b * b;
                end--;
            }else {
                ans[index] = a * a;
                start++;
            }
            index--;
        }

        //return ans;
    }
}
