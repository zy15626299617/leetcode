package com.tag.array;

import java.util.HashMap;

public class hasGroupsSizeX_914 {
    public static void main(String[] args){
        int[] deck  = {1,2,3,4,4,3,2,1};
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for (int i = 0; i < deck.length; i++) {
            if (map.containsKey(deck[i])){
                map.put(deck[i],map.get(deck[i])+1);
            }else {
                map.put(deck[i],1);
            }
            System.out.println("-----------"+deck[i]+"----");
            for (int key : map.keySet()){
                System.out.println("key= "+ key + " and value= " + map.get(key));
            }
        }

        //for (int key : map.keySet()){
        //    System.out.println("key= "+ key + " and value= " + map.get(key));
        //}

        int gcd = -1;
        for (int val : map.values()){
            if (gcd < 0){
                gcd = val;
            }else {
                gcd = new hasGroupsSizeX_914().gcd(gcd,val);
            }
            System.out.println("val:"+val+",gcd:"+gcd);
        }

        System.out.println(gcd >= 2);
    }

    public int gcd(int x,int y){
        return x == 0 ? y : gcd(y % x, x);
    }
}







    //
    //
    //public boolean hasGroupsSizeX(int[] deck) {
    //    int[] count = new int[10000];
    //    for (int c: deck)
    //        count[c]++;
    //
    //    int g = -1;
    //    for (int i = 0; i < 10000; ++i)
    //        if (count[i] > 0) {
    //            if (g == -1)
    //                g = count[i];
    //            else
    //                g = gcd(g, count[i]);
    //        }
    //
    //    return g >= 2;
    //}
    //
    //public int gcd(int x, int y) {
    //    return x == 0 ? y : gcd(y%x, x);
    //}
