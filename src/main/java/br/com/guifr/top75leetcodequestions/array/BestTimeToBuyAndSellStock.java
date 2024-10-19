package br.com.guifr.top75leetcodequestions.array;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        int profit = 0;
        int buy = prices[0];

        for(int i = 1; i < prices.length; i++){
            if(buy > prices[i]){
                buy = prices[i];
            }

            profit = Math.max(profit, prices[i] - buy);
        }

        return profit;

    }


}
