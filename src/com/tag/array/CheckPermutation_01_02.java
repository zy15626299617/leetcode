package com.tag.array;

/**
 * Created by 周游 on 2020/6/11
 * E-mail:15626299617@163.com
 */
public class CheckPermutation_01_02 {
    public static void main(String[] args){
        String s1 = "";
        String s2 = "";

        //HashMap<Character,Integer> hashMap = new HashMap<>();
        //for (char c : s1.toCharArray()){
        //    if (hashMap.containsKey(c)) hashMap.put(c,hashMap.get(c)+1);
        //    else hashMap.put(c,1);
        //}
        //
        //for (char c : s2.toCharArray()){
        //    if (hashMap.containsKey(c)) hashMap.put(c,hashMap.get(c)+1);
        //    else return false;
        //}
        //
        //for (Map.Entry<Character,Integer> entry : hashMap.entrySet()){
        //    if (entry.getValue() % 2 != 0) return false;
        //}

        //return true;

        int[] keg = new int[123];
        for (char c : s1.toCharArray()) keg[c]++;
        for (char c : s2.toCharArray()){
            //if (keg[c] == 0) return false;
            keg[c]--;
        }

        for (int i : keg){
            //if (i != 0) return false;
        }

        //return true;
    }
}
