package com.tag.array;
//对于平面上的两个点 x = (x0, x1) 和 y = (y0, y1)，设它们横坐标距离之差为 dx = |x0 - y0|，纵坐标距离之差为 dy = |x1 - y1|，对于以下三种情况，我们可以分别计算出从 x 移动到 y 的最少次数：
//
//dx < dy：沿对角线移动 dx 次，再竖直移动 dy - dx 次，总计 dx + (dy - dx) = dy 次；
//
//dx == dy：沿对角线移动 dx 次；
//
//dx > dy：沿对角线移动 dy 次，再水平移动 dx - dy 次，总计 dy + (dx - dy) = dx 次。
//
//可以发现，对于任意一种情况，从 x 移动到 y 的最少次数为 dx 和 dy 中的较大值 max(dx, dy)，这也被称作 x 和 y 之间的 切比雪夫距离。

public class minTimeToVisitAllPoints_1266 {
    public static void main(String[] args){
        int[][] points = {};
        int distance = 0,dx = 0,dy = 0;
        for (int i = 0; i < points.length - 1; i++) {
            dx = Math.abs(points[i][0]-points[i+1][0]);
            dy = Math.abs(points[i][1]-points[i+1][1]);
            distance += dx < dy ? dy : dx;
        }
        //return distance;
    }
}
