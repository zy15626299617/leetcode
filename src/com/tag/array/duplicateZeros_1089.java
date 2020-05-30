package com.tag.array;

import java.util.Arrays;

public class duplicateZeros_1089 {
    public static void main(String[] args){
        int[] arr = {1,5,2,0,6,8,0,6,0};

        //截取有效数组
        //stop记录有效数组的最大下标，tmp记录当然最后一个元素为0时，是否越界，如越界，后续处理中这个0不重写。
        int stop = -1,tmp = -1;
        for (int i = 0; i < arr.length; i++) {
            //有效数组长度小于原数组长度时继续截取
            if (stop < arr.length -1){
                if (arr[i] == 0) stop += 2;
                else stop++;
            }else {     //否则判断最后一个元素是为为零且是否越界，取得有效数组长度。
                if (arr[i-1]==0 && stop == arr.length) tmp = 0;
                stop = i - 1;
                break;
            }
        }

        //右指针指向未处理的元素下标
        int right = arr.length - 1;
        for (int i = stop; i > 0; i--) {
            //如果为零，若是最后一个元素且越界，不重写，否则重写0
            if (arr[i] == 0){
                if (i == stop && tmp == 0){
                    arr[right--] = 0;
                }else {
                    arr[right--] = 0;
                    arr[right--] = 0;
                }
            }else {  //不为零则移动
                arr[right--] = arr[i];
            }

            //若第一个元素为零，重写
            if (right == 1 && arr[0] == 0){
                arr[1] = 0;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
