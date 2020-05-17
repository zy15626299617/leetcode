package com.tag.array;

public class checkPossibility_665 {
    public static void main(String[] args){
        int[] nums = new int[]{3,4,2,3};
        int count = 0;
        if(nums[0] > nums[1]) {
            nums[0] = nums[1];
            count++;
        }
        for (int i = 1; i < nums.length-1; i++) {
            if(!(nums[i-1]<= nums[i] && nums[i] <= nums[i+1])){
                if(count == 1) System.out.println(false);
                count++;
                if(nums[i] < nums[i-1]) nums[i] = nums[i-1];
                if(nums[i] > nums[i+1]) {
                    if (nums[i-1] <= nums[i+1]){
                        nums[i] = nums[i-1];
                    }else{
                        nums[i+1] = nums[i];
                    }
                }
            }
        }
        if(nums[nums.length-1] < nums[nums.length-2] && count == 1) System.out.println(false);
        System.out.println(true);
    }
}
