package com.tag.array;

public class transpose_867 {
    public static void main(String[] args){
        int[][] A = new int[][]{{1,2,3},{4,5,6}};
        int row = A.length,col = A[0].length;
        int[][] b = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                    b[j][i] = A[i][j];
            }
        }
    }
}
