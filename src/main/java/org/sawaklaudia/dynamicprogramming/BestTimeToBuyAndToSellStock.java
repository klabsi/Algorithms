package org.sawaklaudia.dynamicprogramming;

public class BestTimeToBuyAndToSellStock {

    // dp        [0,0,4,4,5,5]
    //  prices = [7,1,5,3,6,4]
    public static int maxProfit(int[] prices) {
        int[] dp = new int[prices.length];
        int min = prices[0];
        dp[0] = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                dp[i] = dp[i - 1];
            } else {
                dp[i] = Math.max(dp[i - 1], prices[i] - min);
            }
        }
        return dp[dp.length - 1];
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}
