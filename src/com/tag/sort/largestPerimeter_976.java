package com.tag.sort;

import java.util.Arrays;

/**
 * Created by 周游 on 2020/6/22
 * E-mail:15626299617@163.com
 */
public class largestPerimeter_976 {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        int index = A.length - 1;
        while (index > 1){
            if(A[index - 1] + A[index - 2] > A[index]) return A[index - 1] + A[index - 2] + A[index];
            else index--;
        }
        return 0;
    }
}
