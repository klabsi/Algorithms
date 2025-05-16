package org.sawaklaudia.dynamicprogramming;

import java.util.Arrays;

public class ClimbingStairs {

    public static int climbStairsRecursive(int n) {
        if(n == 0) {
            return 1;
        }

        if(n == 1) {
            return 1;
        }

        int stepBy1 = climbStairsRecursive(n - 1);
        int stepBy2 = climbStairsRecursive(n - 2);
        return stepBy1 + stepBy2;
    }

    private static int climbingStairsMemoHelper(int n, int[] memo) {
        if(n == 0) {
            return 1;
        }

        if(n == 1) {
            return 1;
        }

        int stepBy1;
        if(memo[n] != -1) {
            stepBy1 = memo[n];
        } else {
            stepBy1 = climbStairsRecursive(n - 1);
        }

        int stepBy2;
        if(memo[n] != -1) {
            stepBy2 = memo[n];
        } else {
            stepBy2 = climbStairsRecursive(n - 2);
        }

        return stepBy1 + stepBy2;
    }

    public static int climbingStairsMemo(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return climbingStairsMemoHelper(n, memo);
    }

    public static int climbingStairsTab(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairsRecursive(4));
        System.out.println(climbingStairsMemo(4));
        System.out.println(climbingStairsTab(4));
    }
}
