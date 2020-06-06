package com.tag.array;
//当直线L的斜率不存在时，斜截式y=kx+b 当k=0时 y=b
//当直线L的斜率存在时，点斜式y2—y1=k(X2—X1），
//当直线L在两坐标轴上存在非零截距时，有截距式X/a+y/b=1
//对于任意函数上任意一点，其斜率等于其切线与x轴正方向的夹角，即tanα
//斜率计算：ax+by+c=0中，k=－a/b.
//直线斜率公式:k=(y2-y1)/(x2-x1)
//两条垂直相交直线的斜率相乘积为-1：k1*k2=-1.
public class checkStraightLine_1232 {
    public static void main(String[] args){
        int[][] coordinates = {{1,1}, {2,2},{3,4},{4,5},{5,6},{7,7}};

        int x1 =coordinates[1][0]-coordinates[0][0];
        int y1 =coordinates[1][1]-coordinates[0][1];
        for (int i = 2; i < coordinates.length; i++) {
            int x2 =coordinates[i][0]-coordinates[0][0];
            int y2 =coordinates[i][1]-coordinates[0][1];
            if (x1 * y2 != x2 * y1) {
                //return false;
            }
        }
        //return true;

    }
}
