package com.tag.array;

import java.util.Arrays;

public class sumEvenAfterQueries_985_think {
    public static void main(String[] args){
        int[] A = {1,2,3,4};
        int[][] queries = {{1,0},{-3,1},{-4,0},{2,3}};

        int[] ans = new int[A.length];
        int sum = 0;
        for (int i : A) if (i % 2 == 0) sum+=i;
        for (int i = 0; i < queries.length; i++) {
            int a0 = queries[i][0],a1 = queries[i][1];
            if (A[a1] % 2 == 0){
                if (a0 % 2 == 0){
                    sum += a0;
                }else {
                    sum -= A[a1];
                }
            }else {
                if (a0 % 2 != 0){
                    sum += a0+A[a1];
                }
            }
            ans[i] = sum;
            A[a1] = a0+A[a1];

            //for循环判断段优化版
            //if (A[a1] % 2 == 0) sum -= A[a1];
            //A[a1] += a0;
            //if (A[a1] % 2 == 0) sum += A[a1];
            //ans[i] = sum;
        }

        System.out.println(Arrays.toString(ans));

        //return ans;
    }
}
