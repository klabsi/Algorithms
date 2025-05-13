package org.sawaklaudia.dynamicprogramming;

import java.util.Arrays;

public class NinjaWorkout {

    public static int workoutRec(int[][] tab, int i, int forbidden) {
        if (i >= tab.length) {
            return 0;
        }

        int max = 0;
        for (int j = 0; j < tab[0].length; j++) {
            if (j != forbidden) {
                int activity = tab[i][j] + workoutRec(tab, i + 1, j);
                max = Math.max(activity, max);
            }
        }
        return max;
    }

    public static int workoutStartRec(int[][] tab) {
        return workoutRec(tab, 0, -1);
    }

    public static int workoutMemo(int[][] tab, int i, int forbidden, int[][] memo) {
        if (i < 0) {
            return 0;
        }

        if (memo[i][forbidden] != -1) {
            return memo[i][forbidden];
        }

        if (i == 0) {
            int max = 0;
            for (int j = 0; j < tab[0].length; j++) {
                if (j != forbidden) {
                    max = Math.max(max, tab[0][j]);
                }
            }
            memo[i][forbidden] = max;
            return max;
        }

        int max = 0;
        for (int j = 0; j < tab[0].length; j++) {
            if (j != forbidden) {
                int activity = tab[i][j] + workoutMemo(tab, i - 1, j, memo);
                max = Math.max(activity, max);
            }
        }

        memo[i][forbidden] = max;
        return max;
    }

    public static int workoutStartMemo(int[][] tab) {
        int[][] memo = new int[tab.length][tab[0].length + 1];
        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], -1);
        }

        int max = workoutMemo(tab, tab.length - 1, tab[0].length, memo);
        return max;
    }

    public static int workoutStartTab(int[][] tab) {
        int[][] dp = new int[tab.length][tab[0].length + 1];
        // jeśli nie mogę wziąć '2' to biorę max z innych: dp[0][0] = 3; dp[0][1] = 3; dp[0][2] = 2; dp[0][3] = 3;

        for (int forbidden = 0; forbidden <= tab[0].length; forbidden++) {
            int max = 0;
            for (int task = 0; task < tab[0].length; task++) {
                if (task != forbidden) {
                    max = Math.max(max, tab[0][task]);
                }
            }
            dp[0][forbidden] = max;
        }

        for(int i = 1; i < tab.length; i++) {
            for(int forbidden = 0; forbidden < dp[0].length; forbidden++) {
                int max = 0;
                for(int task = 0; task < tab[0].length; task++) {
                    if(task != forbidden) {
                        int activity = tab[i][task] + dp[i - 1][task];
                        max = Math.max(max, activity);
                    }
                }
                dp[i][forbidden] = max;
            }
        }

        for (int row = 0; row < dp.length; row++) {
            for(int col = 0; col < dp[0].length; col++) {
                System.out.print(dp[row][col] + " ");
            }
            System.out.println();
        }

        return dp[dp.length - 1][dp[0].length - 1];
    }

    public static void main(String[] args) {
        int[][] work = new int[][]{
                {2, 1, 3},
                {3, 4, 6},
                {10, 1, 6},
                {8, 3, 7}
        };

        System.out.println(workoutStartRec(work));
        System.out.println(workoutStartMemo(work));
        System.out.println(workoutStartTab(work));
    }
}
