package com.tag.array;

public class fib_509 {
    public int fib(int N) {
        if (N < 1) System.out.println("0");
        int[] memo = new int[N + 1];
        return memoize(memo,N);
    }

    public int memoize(int[] memo,int N){
        if (N == 1 || N ==2) return 1;
        if (memo[N] !=0 ) return memo[N];
        memo[N] = memoize(memo,N-1) + memoize(memo, N-2);
        return memo[N];
    }

    public static void main(String[] a){
        System.out.println(new fib_509().fib(10));
    }
}
