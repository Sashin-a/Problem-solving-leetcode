package com.leetcode.arrays;

public class BuyAndStockSell {
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;

        for(int i=0; i<prices.length; i++)
        {
            max = Math.max(max, prices[i]-min);
            min = Math.min(min, prices[i]);
        }
        return max;
    }
}
