package com.tag.array;

import java.util.Arrays;

public class sumZero_1304 {
    public static void main(String[] args) {
        int n = 5;

        int count = n % 2 == 0 ? 0 : 1;
        int pre = count == 0 ? 0 : 1;
        int[] arr = new int[n];
        if (count == 1) arr[0] = 0;
        for (int i = 1; i <= n/2; i++) {
            arr[pre++] = i;
            arr[pre++] = -i;
        }
//        return arr;
        System.out.println(Arrays.toString(arr));
    }
}
