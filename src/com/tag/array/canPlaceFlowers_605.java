package com.tag.array;

public class canPlaceFlowers_605 {
    public static void main(String[] a){
        int[] flowerbed = new int[]{1,0,0,0,1};
        int n = 1;

        //if (flowerbed.length == 0) return false;
        int count = 0;
        for (int i = 0;i < flowerbed.length;i++){
            if (flowerbed[i] == 0){
                if (i == 0){
                    if (flowerbed.length == 1 || flowerbed[1] == 0){
                        flowerbed[i] = 1;
                        count++;
                    }
                }else if(i == flowerbed.length - 1){
                    if (flowerbed[flowerbed.length -2] == 0){
                        flowerbed[i] = 1;
                        count++;
                    }
                }else{
                    if (flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
                        flowerbed[i] = 1;
                        count++;
                    }
                }
            }
        }

        //if (n > count){
        //    return false;
        //}else{
        //    return true;
        //}
    }
}
