package com.tag.array;

import java.util.HashSet;
import java.util.Set;

public class fairCandySwap_888 {
    public static void main(String[] args){
        int[] A = {1,1}, B = {2,2};
        int suma = 0,sumb = 0;
        Set<Integer> set = new HashSet<Integer>();

        for (int a : A) {
            suma += a;
            set.add(a);
        }
        for (int b : B) sumb += b;

        for (int i = 0; i < B.length; i++) {
            if (set.contains((suma-sumb)/2+B[i])){
                //return new int[]{(suma-sumb)/2+B[i],B[i]};
            }
        }

        throw  null;
    }
}
