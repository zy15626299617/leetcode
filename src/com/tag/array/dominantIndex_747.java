package com.tag.array;

public class dominantIndex_747 {
    public static void main(String[] args){
        int[] nums = new int[]{0,0,2,3};
        System.out.println("123");
        int max = Integer.MIN_VALUE,sec_max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                sec_max = max;
                max = nums[i];
                index = i;
            }else if (nums[i] > sec_max){
                sec_max = nums[i];
            }
            System.out.println("max:"+max+",sec_max:"+sec_max);
        }

        //if (sec_max * 2 <= max) return index;
        //return -1;
    }
}
