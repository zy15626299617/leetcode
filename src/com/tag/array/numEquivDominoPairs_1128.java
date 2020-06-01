package com.tag.array;

import java.util.Arrays;

public class numEquivDominoPairs_1128 {
    public static void main(String[] args){
//使用桶思想
        int[][] dominoes = {};

        int count = 0;
        int[] keg = new int[100];
        for (int[] i : dominoes){
            Arrays.sort(i);
            keg[i[0]*10+i[1]]++;
        }

        for (int i : keg) count+= i*(i-1)/2;

        //优化版
        //int count = 0;
        //int[] keg = new int[100];
        //for (int[] i : dominoes){
        //    Arrays.sort(i);
        //    count+=keg[i[0]*10+i[1]]++;
        //}
    }
}
