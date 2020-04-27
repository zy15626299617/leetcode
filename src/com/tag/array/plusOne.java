package com.tag.array;

//leedcode:66

//给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
//最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
//你可以假设除了整数 0 之外，这个整数不会以零开头。

//输入: [1,2,3]
//输出: [1,2,4]
//解释: 输入数组表示数字 123。

import java.util.Arrays;

public class plusOne {
    public static void main(String[] a) {
        int[] nums = new int[]{9,9,9,9};

        class solution {
            public int[] get(int[] nums) {
                for (int i = nums.length - 1; i > -1; i--) {
                    //数组最后一位数加一
                    nums[i]++;
                    //如果递增后除于十余数不为零，结束循环
                    if (nums[i] % 10 != 0) return nums;
                    //如果递增后除于十余数为零，该元素为9，更新为零，继续循环
                    nums[i] = 0;
                }
                //若for循环执行完毕，说明数字为99，999这类数字，则手工处理
                nums = new int[nums.length+1];
                nums[0] = 1;
                return nums;
            }
        }

        System.out.println(Arrays.toString(new solution().get(nums)));
    }
}
