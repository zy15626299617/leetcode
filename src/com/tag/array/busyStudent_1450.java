package com.tag.array;

public class busyStudent_1450 {
    public static void main(String[] args){
        int[] startTime = {};
        int[] endTime = {};
        int queryTime = 0;

        int[] keg = new int[1001];
        for (int i = 0; i < startTime.length; i++) {
            for (int j = startTime[i];j <= endTime[i]; j++) keg[j]++;
        }

        //return keg[queryTime];
    }
}
