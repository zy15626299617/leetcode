package com.tag.array;

import java.util.Arrays;

public class findTheDistanceValue_1385 {
    int search(int l,int r,int t,int[] arr){
        while(l < r){
            int mid = (l + r) >> 1;
            if (t > arr[mid]) l = mid + 1;
            else if(t < arr[mid]) r = mid;
            else return mid;
        }
        return l;
    }
    public static void main(String[] args){
        int[] arr1 = {4,5,8};
        int[] arr2 = {10,9,1,8};
        int d = 2;
        //思路一：暴力查询
        //思路二：排序arr2，遍历arr1，利用二分查询在arr2中找到最接近arr1的元素，判断距离条件是否成立
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        int count = 0;
        for (int i : arr1){
            System.out.println("count:"+count);
            int index = new findTheDistanceValue_1385().search(0,arr2.length-1,i,arr2);
            if (index == 0) count += Math.abs(i - arr2[0]) > d ? 1 : 0;
            else count += (Math.abs(i - arr2[index-1]) > d) && (Math.abs(i - arr2[index]) > d)  ? 1 : 0;
            System.out.println("index:"+index+",count:"+count);
        }
        System.out.println(count);
    }
}
