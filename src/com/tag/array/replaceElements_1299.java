package com.tag.array;

import java.util.Arrays;

public class replaceElements_1299 {
    public static void main(String[] args){
        int[] arr = {17,18,5,4,6,1};

        int[] ans = new int[arr.length];
        int max = arr[arr.length-1];
        ans[arr.length-1] = -1;
        for (int i = ans.length - 2; i >= 0 ; i--) {
            ans[i] = max;
            if (arr[i] > max) max = arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
