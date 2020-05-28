package com.tag.array;

import java.util.ArrayList;
import java.util.Collections;

public class addToArrayForm_989 {
    public static void main(String[] args){
        int[] A = {};
        int K = 0;

        int end = A.length,cur = K;
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (--end >= 0 || cur != 0){
            if (end >= 0){
                cur = A[end] + cur;
            }
            list.add(cur % 10);
            cur = cur / 10;
        }

        Collections.reverse(list);
        //return list;
    }
}
