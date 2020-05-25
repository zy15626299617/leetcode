package com.tag.array;

import java.util.ArrayList;

public class largeGroupPositions_830 {
    public static void main(String[] args){
        String S = "abbxxxxzyy";
        int start = 0;

        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < S.length(); i++) {
            if (i == S.length()-1 || S.charAt(i+1) != S.charAt(i)){
                if(i-start >= 2){
                    System.out.println("start:"+start+",end:"+i);
                    ArrayList<Integer> b = new ArrayList<Integer>();
                    b.add(start);
                    b.add(i);
                    a.add(b);
                }
                start = i+1;
            }
        }

        //for (ArrayList<Integer> b : a){
        //    for (int c : b){
        //        System.out.println(c);
        //    }
        //}
    }
}
