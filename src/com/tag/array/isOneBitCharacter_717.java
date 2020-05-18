package com.tag.array;

//解题思路
//遇到1进前进俩位，遇到0前进一位
//如果末尾是二字节将i将指向末尾后一位，一字节将指向末尾；
public class isOneBitCharacter_717 {
    public static void main(String[] args){
        int[] bits = new int[]{1, 1, 1, 0};

        int i = 0;
        while (i < bits.length - 1){
            i += bits[i] + 1;
        }

        //return i == bits.length-1;
    }
}
