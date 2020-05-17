package com.tag.array;

public class imageSmoother_661 {
    public static void main(String[] args){
        int[][] nums = new int[][]{{1,1,1},{1,0,1},{1,1,1}};
        int r = nums.length,c = nums[0].length;
        int[][] nums_ = new int[r][c];
        int value = 0,count = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                for (int ni = i - 1; ni < i + 2; ni++) {
                    for (int nj = j - 1; nj < j + 2; nj++) {
                        if (ni >= 0 && ni < r && nj >= 0 && nj < c){
                            value += nums[ni][nj];
                            count++;
                        }
                    }
                }
                nums_[i][j] = value / count;
                value = 0;
                count = 0;
            }
        }
    }
}
