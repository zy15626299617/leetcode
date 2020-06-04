package com.tag.array;

public class distanceBetweenBusStops_1184 {
    public static void main(String[] args){
        int[] distance = {};
        int start = 0;
        int destination = 0;

        int distance_all = 0;
        for (int x : distance) distance_all += x;

        int distance_r = 0;
        while (start != destination){
            distance_r += distance[start++];
            if (start == distance.length) start = 0;
        }

        //return Math.min(distance_r,distance_all-distance_r);
    }
}
