package org.sawaklaudia.dynamicprogramming;

import java.util.Arrays;

public class Fibonacci {

    // 0, 1, 1, 2
    public static int calFibonacciRec(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return calFibonacciRec(n - 1) + calFibonacciRec(n - 2);
    }

    public static int calFibonacciMemo(int n, int[] memo) {
        if (n <= 0) {
            memo[0] = 0;
            return 0;
        }

        if (n == 1) {
            memo[1] = 1;
            return 1;
        }

        int prev;
        if (memo[n - 1] == -1) {
            prev = calFibonacciMemo(n - 1, memo);
        } else {
            prev = memo[n - 1];
        }

        int prev2;
        if (memo[n - 2] == -1) {
            prev2 = calFibonacciMemo(n - 2, memo);
        } else {
            prev2 = memo[n - 2];
        }

        memo[n] = prev + prev2;
        return memo[n];
    }

    public static int calcFibonacciTab(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(calFibonacciRec(n));
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        System.out.println(calFibonacciMemo(n, memo));
        System.out.println(calcFibonacciTab(n));
    }
}
