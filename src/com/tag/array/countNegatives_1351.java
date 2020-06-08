package com.tag.array;

public class countNegatives_1351 {
    int ans(int l_row,int r_row,int l_col,int r_col,int[][] grid){
        if (l_row > r_row) return 0;
        int mid = (l_row+r_row) >> 1,pos = -1;
        for (int i = l_col; i <= r_col; i++) {
            //System.out.println("ROW:"+mid+",COL:"+i);
            if (grid[mid][i] < 0){
                System.out.println("ROW:"+mid+",COL:"+i);
                pos = i;
                break;
            }
        }
        int ans = 0;
        if (pos >= 0){
            System.out.println("pos:"+pos);
            ans += grid[0].length - pos;
            ans += ans(l_row,mid-1,pos,r_col,grid);
            ans += ans(mid+1,r_row,l_col,pos,grid);
        }else {
            ans += ans(mid+1,r_row,l_col,r_col,grid);
        }
        return ans;
    }
    public static void main(String[] args) {
        //思路一：暴力遍历
        //思路二：对每一行进行二分查询
        //思路三：分治法，对列进行二分查询，利用前一行的第一个负数的位置必然大于等于下一行第一个负数的位置的性质。
        //方法二其实只利用了一部分的性质，即每一行是非递增的，但其实整个矩阵是每行每列均非递增，这说明了一个更重要的性质：
        //每一行从前往后第一个负数的位置是不断递减的，即我们设第i行的第一个负数的位置为 pos_i
        // ，不失一般性，我们把一行全是正数的 pos 设为 m，则
        //pos_0>=pos_1>=pos_2>=...>=pos_n-1
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(new countNegatives_1351().ans(0,grid.length-1,0,grid[0].length-1,grid));
        //思路四：遍历列，再遍历行，只需找到每列第一个负数。
        //思路五：倒序遍历从右向左遍历，找出第一个负数的位置pos，那么下一行第一个负数的的范围就是[0,pos],起始变量会持续递减。
    }
}
