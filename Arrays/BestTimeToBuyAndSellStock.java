/*
Problem: Best Time to Buy and Sell Stock
LeetCode: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
Difficulty: Easy
Approach: Greedy (Single Pass)
Time Complexity: O(n)
Space Complexity: O(1)
*/

//Code
class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0 ; i < prices.length ; i++) {
            if(prices[i]< smallest) {
                smallest = prices[i];
            }
            else {
                max_profit = Math.max(max_profit, prices[i]-smallest);
            }
        }

        return max_profit;
    }
}