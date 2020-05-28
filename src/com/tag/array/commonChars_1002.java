package com.tag.array;

import java.util.ArrayList;

public class commonChars_1002 {
    public static void main(String[] args){
        String[] A = {};

        int[] B = new int[26];
        for (int i = 0; i < B.length; i++) B[i] = Integer.MAX_VALUE;
        for (String str : A){
            int[] tmp = new int[26];
            for (char i : str.toCharArray()){
                tmp[i-'a']++;
            }
            for (int i = 0; i < B.length; i++) {
                B[i] = Math.min(B[i],tmp[i]);
            }
        }

        ArrayList<String> ans = new ArrayList<String>();
        for (int i = 0; i < B.length; i++) {
            while (B[i] > 0){
                ans.add(String.valueOf((char)('a'+i)));
                B[i]--;
            }
        }
        //return ans;
    }
}
