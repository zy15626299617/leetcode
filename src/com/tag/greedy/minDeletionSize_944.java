package com.tag.greedy;

/**
 * Created by 周游 on 2020/6/18
 * E-mail:15626299617@163.com
 */
public class minDeletionSize_944 {
    public int minDeletionSize(String[] A) {
        int ans = 0;
        for(int col = 0; col < A[0].length(); col++){
            for(int row = 1; row < A.length; row++){
                if(A[row].charAt(col) < A[row-1].charAt(col)){
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}
