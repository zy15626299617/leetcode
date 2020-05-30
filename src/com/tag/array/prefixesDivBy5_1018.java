package com.tag.array;

import java.util.ArrayList;

public class prefixesDivBy5_1018 {
    public static void main(String[] args){
        int[] A = {1,1,0,0,0,1,0,0,1};

//解题思路：a+b%p = （a%p + b%p）%p
//所以所以每一次进位余数的变化来源于进的第一位与原来的最后一位
//第一位是0或1，有数组元素决定，最后一位进一位，即*2，所以最后一位的余数*2，所以每进位一次的余数为前一次的
        int cur = 0;
        ArrayList<Boolean> arrayList = new ArrayList<Boolean>();
        for (int i = 0; i < A.length; i++) {
            cur = cur*2 + A[i];
            if (cur % 5 == 0) arrayList.add(true);
            else arrayList.add(false);
            cur %= 5;
        }

        for (boolean i : arrayList) System.out.println(i);
    }
}
