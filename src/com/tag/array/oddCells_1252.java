package com.tag.array;

//只需要找出indices中所有行数和列数为奇数的列，计算奇数列覆盖到点的总数，再减去重合的点（注意重合点数量*2，俩条线的。）
public class oddCells_1252 {
    public static void main(String[] args){
        int n = 0;
        int m = 0;
        int[][] indices = {};

        System.out.println(indices.length);
        int[] row = new int[50], col = new int[50];
        for (int[] i : indices){
            row[i[0]]++;
            col[i[1]]++;
            if (row[i[0]] % 2 != 1) row[i[0]] = 0;
            if (col[i[1]] % 2 != 1) col[i[1]] = 0;
        }

        int row_c = 0,col_c = 0;
        for (int i = 0; i < 50; i++) {
            if (row[i] == 1) row_c++;
            if (col[i] == 1) col_c++;
        }

        //return row_c*m+col_c*n-row_c*col_c*2;
    }
}
