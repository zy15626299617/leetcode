package com.tag.array;

public class heightChecker_1051 {
    public static void main(String[] args){
        int[] heights = {};

        //数字范围再1-100，加上0共101个桶
        int[] keg = new int[101];
        //将相同数组放入同一桶中
        for (int i : heights) keg[i]++;

        //记录排序错误数
        int count = 0;
        //从第一个桶开始
        for (int i = 1,j = 0; i < keg.length; i++) {
            while (keg[i]-- > 0){
                if (i != heights[j++]) count++;
            }
        }
        //return count;
    }
}
