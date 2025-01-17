package br.com.guifr.leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/description/
public class BestTimeToBuyAndSellStockThree {


    public int maxProfitBest(int[] prices) {
        int firstBuy = Integer.MAX_VALUE;
        int firstSell = 0;
        int secondBuy = Integer.MAX_VALUE;
        int secondSell = 0;
        for (int price : prices) {
            firstBuy = Math.min(firstBuy, price);
            firstSell = Math.max(firstSell, price - firstBuy);
            secondBuy = Math.min(secondBuy, price - firstSell);
            secondSell = Math.max(secondSell, price - secondBuy);
        }
        return secondSell;
    }



    public static int maxProfit(int[] prices) {

        int buy = prices[0];
        int profit = 0;

        HashMap<Integer, Integer> visited = new HashMap<>();

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] > buy) {
                int result = (prices[i] - buy) + maxProfitStarting(i,prices,visited);
                profit = Math.max(profit, result);
            } else {
                buy = prices[i];
            }

        }
        return profit;

    }

    private static int maxProfitStarting(int start, int[] prices, HashMap<Integer, Integer> visited) {

        if(visited.get(start) != null)
            return visited.get(start);

        int buy = prices[start];
        int profit = 0;

        for (int i = start + 1; i < prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            }
            profit = Math.max(profit, (prices[i] - buy));
        }
        visited.put(start,profit);
        return profit;

    }
}
