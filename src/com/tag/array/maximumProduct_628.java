package com.tag.array;

public class maximumProduct_628 {
    public static void main(String[] a){
        //考虑四种情况
        //1.全部为正数，直接取最大的三个数相乘
        //2.有一个负数，直接取最大的三个数相乘
        //3.有俩个负数，取这个俩个负数与最大数 和 三个最大数相比较
        //4.有三个或以上的负数，取最小的俩个负数和最大数 和 三个最大数比较

        //所以最后结果可以概括为 Math.max（俩个最小数和最大数相乘，三个最大数相乘）;
    }
}
