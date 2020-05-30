package com.tag.array;

public class numPairsDivisibleBy60_1010 {
    public static void main(String[] args){
        int[] time = {};

//解题思路，桶的思想，将所有时间的余数的次数放入余数对于的桶中，记录所有余数的数量，
//用余数相加是否等于60来判断，其中0与30都只能与自身相匹配，相当于等差为1的数列求和。
        int count = 0;
        int[] keg = new int[60];
        for (int i : time)  keg[i%60]++;
        count += keg[0]*(keg[0]-1)/2 + keg[30]*(keg[30]-1)/2;
        for (int i = 1; i < 30; i++) {
            count += keg[i]*keg[60-i];
        }
        //return count;
    }
}
