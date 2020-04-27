package com.tag.array;

//leetcode:118 杨辉三角

//给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。

//输入: 5
//输出:
//[
//     [1],
//    [1,1],
//   [1,2,1],
//  [1,3,3,1],
// [1,4,6,4,1]
//]

import java.util.ArrayList;

public class List {
    public static void main(String[] a){
        int row = 5;

        //初始化列表
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        list.add(new ArrayList<Integer>());
        list.get(0).add(1);

        for (int i = 1; i < row; i++){
            list.add(new ArrayList<Integer>());
            list.get(i).add(1);

            for (int j = 1; j < i; j++) {
                list.get(i).add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }

            list.get(i).add(1);
        }

        for (ArrayList array : list){
            System.out.println(array.toString());
        }

        //错位思想
        //1,3,3,1,0
        //    +
        //0,1,3,3,1
        //    |
        //1,4,6,4,1
    }
}