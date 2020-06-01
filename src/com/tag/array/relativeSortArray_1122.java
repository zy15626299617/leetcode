package com.tag.array;

public class relativeSortArray_1122 {
    public static void main(String[] args){
//使用桶思想
        int[] arr1 = {},arr2 = {};

        int[] keg = new int[1001];
        for (int i : arr1) keg[i]++;

        int index = 0;
        for (int i : arr2) {
            while (keg[i]-- > 0){
                arr1[index++] = i;
            }
        }

        for (int i = 0; i < 1001; i++) {
            while (keg[i]-- > 0){
                arr1[index++] = i;
            }
        }

    }
}
