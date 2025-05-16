package org.sawaklaudia.dynamicprogramming;

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

    public static void main(String[] args) {
        System.out.println(climbStairsRecursive(4));
    }
}
