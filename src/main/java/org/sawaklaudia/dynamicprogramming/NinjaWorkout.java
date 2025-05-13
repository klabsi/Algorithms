package org.sawaklaudia.dynamicprogramming;

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

    public static void main(String[] args) {
        int[][] work = new int[][]{
                {2, 1, 3},
                {3, 4, 6},
                {10, 1, 6},
                {8, 3, 7}
        };

        System.out.println(workoutStartRec(work));
    }
}
