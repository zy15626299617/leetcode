package com.tag.greedy;

import java.util.Arrays;

/**
 * Created by 周游 on 2020/6/18
 * E-mail:15626299617@163.com
 */
public class largestSumAfterKNegations_1005 {
    public int largestSumAfterKNegations(int[] A, int K) {
        int ans = 0;
        Arrays.sort(A);
        for (int i = 0;i < A.length;i++){
            if(K > 0){
                if(A[i] >= 0 && (i == 0 || A[i] <= A[i - 1])){
                    A[i] *= K % 2 == 0 ? 1 : -1;
                    K = 0;
                }else if (A[i] >= 0 && A[i] > A[i - 1]){
                    ans += K % 2 == 0 ? 0 : -(2 * A[i - 1]);
                    K = 0;
                }else if (A[i] < 0){
                    A[i] = -A[i];
                    K--;
                }
            }
            ans += A[i];
        }
        return ans;
    }

}
