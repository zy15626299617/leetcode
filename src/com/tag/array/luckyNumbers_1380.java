package com.tag.array;

import java.util.ArrayList;
import java.util.Arrays;

public class luckyNumbers_1380 {
    public static void main(String[] args){
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        int r = matrix.length, c = matrix[0].length;
        int[] row = new int[r],col = new int[c];

        int index = -1;
        for (int[] i : matrix){
            int min = Integer.MAX_VALUE;
            for (int i1 : i) min = i1 < min ? i1 : min;
            row[++index] = min;
        }
        System.out.println(Arrays.toString(row));

        for (int i = 0; i < c; i++) {
            int max =Integer.MIN_VALUE;
            for (int j = 0; j < r; j++) {
                System.out.println(matrix[j][i]);
                max = matrix[j][i] > max ? matrix[j][i] : max;
            }
            col[i] = max;
        }
        System.out.println(Arrays.toString(col));

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == row[i] && matrix[i][j] == col[j]) list.add(matrix[i][j]);
            }
        }

        System.out.println(Arrays.toString(list.toArray()));
    }
}
