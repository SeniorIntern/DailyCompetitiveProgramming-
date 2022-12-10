// 121_Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
/*
 * You are given an array prices where prices[i] is the price of a given stock on the ith day. You
 * want to maximize your profit by choosing a single day to buy one stock and choosing a different
 * day in the future to sell that stock. Return the maximum profit you can achieve from this
 * transaction. If you cannot achieve any profit, return 0.
 */
public class BestTime_to_Buy_and_SellStock {
    public int maxProfit(int[] prices) {
        // O(n) O(1)
        int buy = prices[0];
        int profit = 0;
        for (int i : prices) {
            if (i < buy) {
                buy = i;
            }
            if (i - buy > profit)
                profit = i - buy;
        }
        return profit;
    }
}
