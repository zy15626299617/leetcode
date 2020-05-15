package com.tag.array;

public class findUnsortedSubarray_581 {
    public static void main(String[] a){
        int[] nums = new int[]{1,2,3,3,3};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }

        int left = 0,right = nums.length;
        int final_left = 0,final_right = 0;

        if(nums[0] != min) final_left = -1;
        if(nums[right-1] != max) final_right = -1;

        for (int i = 0; i < nums.length/2; i++) {
            if (nums[left] <= nums[left+1] && final_left == 0){
                left++;
            }else{
                final_left = -1;
            }
            if (nums[right-1] >= nums[right-2] && final_right == 0){
                right--;
            }else{
                final_right = -1;
            }

            //TODO:解决中间出现于min，max的情况
            //if (nums[left] == max || nums[left] == min){
            //    left = 0;
            //    final_left = -1;
            //}
            //
            //if (nums[right-1] == max || nums[right-1] == min){
            //    right = nums.length;
            //    final_right = -1;
            //}

            if (right - left == 1) return 0;
            System.out.println("left:"+left+",right:"+right);
        }

        System.out.println("left:"+left+",right:"+right);
    }
}
