package com.tag.array;

import java.util.Arrays;

//解题思路
//首先判断行数和列数是否合理
//若不合理返回原数组，合理新建规定数组
//列数与原列数的差别，如果新列数大于原列数，说明需要将下方元素移动到上方，否则需要将上方元素移动到下方
//遍历原数组，再原数组中设置断点，每经过一个断点换行插入
public class matrixReshape_566 {
    public static void main(String[] arg){
        int[][] nums = new int[][]{{1,2}, {3,4}};
        int r = 4,br = nums.length;
        int c = 0,bc = nums[0].length;
        if(r ==1 ) c = br*bc;
        if(r == br*bc) c = 1;
        System.out.println("br:"+br+",bc:"+bc);
        int[][] result = new int[r][c];

        if (r*c == br*bc){
            int a = 0,b = 0;
            for (int i = 0; i < br; i++) {
                for (int j = 0; j < bc; j++) {
                        if (b+1 > c){
                            a++;
                            b=0;
                        }
                        System.out.println("a:"+a+",b:"+b);
                        result[a][b++] = nums[i][j];
                }
            }
        }else {
            //return nums;
        }

        System.out.println(Arrays.toString(result));
    }
}
