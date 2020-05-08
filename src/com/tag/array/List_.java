package com.tag.array;

//119. 杨辉三角 II

//给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。

//输入: 3
//输出: [1,3,3,1]

import java.util.ArrayList;

public class List_ {
    public static void main(String[] a){
        int input = 5;

        ArrayList<Integer> output = new ArrayList<Integer>();
        output.add(1);
        output.add(0);

        for (int i = 2;i <= input;i++){
            output.add(i - 1 ,output.get(i-1)+output.get(i-2));
            for (int j = i-2; j > 0; j--) {
                output.set(j,output.get(j)+output.get(j-1));
            }
        }

        output.remove((Integer)0);
        System.out.println(output.toString());
    }
}
