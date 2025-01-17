package br.com.guifr.leetcode;

import java.util.HashMap;

public class BestTimeToBuyAndSellStockTwo {

    public static int maxProfitBest(int[] prices) {
        int last = Integer.MAX_VALUE;
        int profit  = 0;
        for(int i = 0; i <prices.length; i++){
            int curr = prices[i];
            if(curr > last){
                profit+=curr-last;
                last = curr;
            }
            else last = curr;
        }
        return profit;

    }

    public static int maxProfit(int[] prices) {
//        if ( prices[0] == 1) return 4;

        int result = findMaxProfitStarting(0,prices,new HashMap<>());

        return result;
    }

    private static int findMaxProfitStarting(int start, int[] prices, HashMap<Integer, Integer> visited) {

        if(visited.get(start) != null)
            return visited.get(start);

        int buy = prices[start];
        int profit = 0;

        for(int i = start + 1; i < prices.length;i++){

            if(buy >= prices[i]){
                buy = prices[i];
            }else{
                profit = Math.max(profit, (prices[i] - buy) + findMaxProfitStarting(i, prices, visited));
            }

        }

        visited.put(start,profit);

        return profit;
    }
}
