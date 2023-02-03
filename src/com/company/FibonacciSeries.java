package com.company;

public class FibonacciSeries {
    // Running Time Complexity --> O(2^n)
    int memo[] = new int[1000];
    // ORDER OF --> O(n)
    public int fib(int n) {
        if(n == 1) return 0;
        else if(n == 2) return 1;
        else if(memo[n] != 0) return memo[n];
        // if(n < 1 && n > 0) return n;
        else {
            memo[n] = fib(n-1) + fib(n-2);
            return memo[n];
        }
    }

    // ORDER OF --> O(2^n)
    public int non_dp_fib(int n) {
        if(n == 1) return 0;
        if(n == 2) return 1;
        return non_dp_fib(n-1) + non_dp_fib(n-2);
    }

    public static void main(String[] args) {
        FibonacciSeries fSeries = new FibonacciSeries();
        System.out.println(fSeries.fib(15));                              // 34
    }
}
