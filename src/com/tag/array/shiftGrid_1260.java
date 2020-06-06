package com.tag.array;

import java.util.ArrayList;

public class shiftGrid_1260 {
    public static void main(String[] args){
        int[][] grid = {{1},{2},{3},{4},{7},{6},{5}};
        int k = 23;
        int numCols = grid[0].length;
        int numRows = grid.length;

        // Setup the 2d list.
        ArrayList<ArrayList<Integer>> newGrid = new ArrayList<>();
        for (int row = 0; row < numRows; row++) {
            ArrayList<Integer> newRow = new ArrayList<>();
            newGrid.add(newRow);
            for (int col = 0; col < numCols; col++) {
                newRow.add(0);
            }
        }

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                int newCol = (col + k) % numCols;
                int wrapAroundCount = (col + k) / numCols;
                int newRow = (row + wrapAroundCount) % numRows;
                newGrid.get(newRow).set(newCol, grid[row][col]);
            }
        }

        //return newGrid;








//------------------------------------------------------------------------
        //int row = grid.length,col = grid[0].length;
        //k = k % (row*col) == 0 ? row * row : k % (row*col);
        //System.out.println(k);
        //int b_row = k % row == 0 ? row - k / row : row - 1 - k / row;
        //int b_col = k % col == 0 ? 0 : (col - k % col),flag = 0;
        ////System.out.println("row="+ b_row + ",col="+b_col);
        //ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //ArrayList<Integer> list_ = new ArrayList<>();
        //if (row == 1 && col == 1){
        //    list_.add(grid[0][0]);
        //    list.add(list_);
        //    //return list;
        //}
        //while (flag < row*col){
        //    list_.add(grid[b_row][b_col]);
        //    if (++flag % col == 0){
        //        list.add((ArrayList<Integer>) list_.clone());
        //        list_.clear();
        //    }
        //    if (b_row == row - 1 && b_col == col - 1) {
        //        b_row = 0;
        //        b_col = -1;
        //    }
        //    if (b_col == col - 1) {
        //        b_row++;
        //        b_col = -1;
        //    }
        //    b_col++;
        //}
        //System.out.println(Arrays.toString(list.toArray()));
    }
}
