package com.tag.array;

public class maxDistToClosest_849 {
    public static void main(String[] args){
        int[] seats = new int[]{1,0,0,0,1,0,1};

        int ans = 0,k=0;
        //处于俩人之间
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1){
                k = 0;
            }else{
                k++;
                ans = Math.max(ans, (k + 1)/2);
            }
        }

        //左侧
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1){
                ans = Math.max(ans,i);
                break;
            }
        }

        //右侧
        for (int i = seats.length - 1; i >= 0; i--) {
            if (seats[i] == 1) {
                ans = Math.max(ans, seats.length-1-i);
                break;
            }
        }

        //return seats;
    }
}

