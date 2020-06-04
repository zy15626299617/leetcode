package com.tag.array;

//注意数组存储得是筹码得位置
//1）把全部的奇数移动一个位为偶数，此处不考虑怎么移动，因为移动为偶数后全部移动到一个地方的步数肯定是偶数，那么不计算代价。
//2）把全部的偶数移动一个位为奇数，此处不考虑怎么移动，因为移动为奇数后全部移动到一个地方的步数肯定是偶数，那么不计算代价。
public class minCostToMoveChips_1217 {
    public static void main(String[] args){
        int[] chips = {};
        int a = 0, b = 0;
        for (int i : chips){
            if (i % 2 == 0) a++;
            else b++;
        }
        //return Math.min(a,b);
    }
}
