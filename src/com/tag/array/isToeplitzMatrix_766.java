package com.tag.array;

public class isToeplitzMatrix_766 {
    public static void main(String[] args){
        int[][] matrix = new int[][]{{1,2,3,4},{5,1,2,3},{9,5,1,2}};

        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                //if (matrix[i][j] != matrix[i-1][j-1]) return false;
            }
        }

        //return true;
    }
}
