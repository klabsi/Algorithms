package org.sawaklaudia.dynamicprogramming;

public class HouseRobber {

    // rekurencja
    public int rob(int[] houses, int index) {
        if (index < 0) {
            return 0;
        }

        if (index == 0) {
            return houses[0];
        }

        int take = houses[index] + rob(houses, index - 2);
        int notTake = rob(houses, index - 1);

        return Math.max(take, notTake);
    }

    // zoptymalizowana rekurencja z memonizacją
    public int robMemo(int[] houses, int index, int[] memo) {
        if (index < 0) {
            return 0;
        }

        if (index == 0) {
            return houses[0];
        }

        int prev2places;
        if (index - 2 >= 0 && memo[index - 2] != -1) {
            prev2places = memo[index - 2];
        } else {
            prev2places = robMemo(houses, index - 2, memo);
        }

        int take = houses[index] + prev2places;

        int prev1places;
        if (index - 1 >= 0 && memo[index - 1] != -1) {
            prev1places = memo[index - 1];
        } else {
            prev1places = robMemo(houses, index - 1, memo);
        }

        int notTake = prev1places;

        memo[index] = Math.max(take, notTake);
        return Math.max(take, notTake);
    }

    // tabularyzacja
    public int robTab(int[] houses) {
        int len = houses.length;
        if (len == 0) {
            return 0;
        }

        if (len == 1) {
            return houses[0];
        }

        int[] tab = new int[len];
        tab[0] = houses[0];
        tab[1] = Math.max(houses[0], houses[1]);

        for (int i = 2; i < houses.length; i++) {
            int take = tab[i - 2] + houses[i];
            int notTake = tab[i - 1];
            tab[i] = Math.max(take, notTake);
        }

        return  tab[len - 1];
    }
}
