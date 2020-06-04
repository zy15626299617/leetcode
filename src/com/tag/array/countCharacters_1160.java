package com.tag.array;

import java.util.HashMap;
import java.util.Map;

public class countCharacters_1160 {
    public static void main(String[] args){
        String[] words = {"hello","world","leetcode"};
        String chars = "welldonehoneyr";

        int length = 0;
        HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
        for (char c : chars.toCharArray()){
            if (hashMap.containsKey(c)) hashMap.put(c,hashMap.get(c)+1);
            else hashMap.put(c,1);
        }

        for (String s : words){
            System.out.println(s);
            boolean is_true = true;
            int count = 0;
            HashMap<Character,Integer> hashMap1 = new HashMap<Character,Integer>();
            for (char c : s.toCharArray()){
                if (hashMap1.containsKey(c)) hashMap1.put(c,hashMap1.get(c)+1);
                else hashMap1.put(c,1);
            }
            for (Map.Entry<Character,Integer> e : hashMap1.entrySet()){
                if (hashMap.containsKey(e.getKey())){
                    if (e.getValue() > hashMap.get(e.getKey())) is_true = false;
                    else count += e.getValue();
                }else {
                    is_true = false;
                }
            }
            if (is_true) length += count;
        }

        System.out.println(length);
    }
}
