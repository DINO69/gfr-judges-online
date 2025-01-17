package br.com.guifr.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTwoTest {

    @Test
    @DisplayName("Return '7' When call maxProfitBest(int[] prices) Given prices = [7,1,5,3,6,4]")
    void test1maxProfitBest() {
        int[] prices = {7,1,5,3,6,4};
        int result = BestTimeToBuyAndSellStockTwo.maxProfitBest(prices);
        Assertions.assertEquals(7,result);
    }

    @Test
    @DisplayName("Return '4' When call maxProfitBest(int[] prices) Given prices = [1,2,3,4,5]")
    void test2maxProfitBest() {
        int[] prices = {1,2,3,4,5};
        int result = BestTimeToBuyAndSellStockTwo.maxProfitBest(prices);
        Assertions.assertEquals(4,result);
    }

    @Test
    @DisplayName("Return '0' When call maxProfitBest(int[] prices) Given prices = [7,6,4,3,1]")
    void test3maxProfitBest() {
        int[] prices = {7,6,4,3,1};
        int result = BestTimeToBuyAndSellStockTwo.maxProfitBest(prices);
        Assertions.assertEquals(0,result);
    }

    @Test
    @DisplayName("Return '7' When call maxProfit(int[] prices) Given prices = [7,1,5,3,6,4]")
    void test1() {
        int[] prices = {7,1,5,3,6,4};
        int result = BestTimeToBuyAndSellStockTwo.maxProfit(prices);
        Assertions.assertEquals(7,result);
    }

    @Test
    @DisplayName("Return '4' When call maxProfit(int[] prices) Given prices = [1,2,3,4,5]")
    void test2() {
        int[] prices = {1,2,3,4,5};
        int result = BestTimeToBuyAndSellStockTwo.maxProfit(prices);
        Assertions.assertEquals(4,result);
    }

    @Test
    @DisplayName("Return '0' When call maxProfit(int[] prices) Given prices = [7,6,4,3,1]")
    void test3() {
        int[] prices = {7,6,4,3,1};
        int result = BestTimeToBuyAndSellStockTwo.maxProfit(prices);
        Assertions.assertEquals(0,result);
    }
}