package com.tag.array;

/**
 * Created by 周游 on 2020/6/11
 * E-mail:15626299617@163.com
 */
public class findMagicIndex_08_03 {
    public static void main(String[] args){
        int[] nums = {};

        int flag = 0;
        while (flag < nums.length) {

            if (nums[flag] == flag) {
                //return flag;
            } else if (nums[flag] > flag) {  //重点 , 过滤掉不需要比较的元素
                flag = nums[flag];
            }else{
                flag++;
            }
        }

        //return -1;
    }
}
