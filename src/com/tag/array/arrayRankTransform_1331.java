package com.tag.array;

import java.util.Arrays;

public class arrayRankTransform_1331 {
    public static void main(String[] args) {
        //思路1：去重排序，遍历原数组元素，在新数组中用二分法查询元素的下标
        //思路2：桶排序

        int[] arr = {40,10,20,30};
        //遍历数组查询数组的最大值和最小值，相减得到可能包含的元素的最大数量
        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
        for (int i : arr){
            if (max < i) max = i;
            if (min > i) min = i;
        }

        //包括最小值最多有max-min+个元素,元素下标为元素与最小的的差,记录每个元素的个数
        int[] abs = new int[max - min + 1];
        for (int i : arr)abs[i - min]++;

        //遍历差值数组，对元素进行排序赋值
        int[] index = new int[abs.length];
        for (int i = 0,count = 0; i < index.length; i++) if (abs[i] != 0) index[i] = ++count;

        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) ans[i] = index[arr[i]-min];
        System.out.println(Arrays.toString(ans));
    }
}
