package br.com.guifr.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class BestTimeToBuyAndSellStockThreeTest {

    @Test
    @DisplayName("Return '6' When call maxProfit(int[] prices) Given prices = [3,3,5,0,0,3,1,4]")
    void test1() {
        int[] prices = {3,3,5,0,0,3,1,4};
        int result = BestTimeToBuyAndSellStockThree.maxProfit(prices);
        Assertions.assertEquals(6,result);
    }

    @Test
    @DisplayName("Return '4' When call maxProfit(int[] prices) Given prices = [1,2,3,4,5]")
    void test2() {
        int[] prices = {1,2,3,4,5};
        int result = BestTimeToBuyAndSellStockThree.maxProfit(prices);
        Assertions.assertEquals(4,result);
    }

    @Test
    @DisplayName("Return '0' When call maxProfit(int[] prices) Given prices = [7,6,4,3,1]")
    void test3() {
        int[] prices = {7,6,4,3,1};
        int result = BestTimeToBuyAndSellStockThree.maxProfit(prices);
        Assertions.assertEquals(0,result);
    }

    @Test
    @DisplayName("Return '18' When call maxProfit(int[] prices) Given prices = [0,9,0,9,0,9,0,9]")
    void test4() {
        int[] prices = {0,9,0,9,0,9,0,9};
        int result = BestTimeToBuyAndSellStockThree.maxProfit(prices);
        Assertions.assertEquals(18,result);
    }

    @Test
    @DisplayName("Return '18' When call maxProfit(int[] prices) Given prices = [0,1,0,1,0,9,0,9]")
    void test5() {
        int[] prices = {0,1,0,1,0,9,0,9};
        int result = BestTimeToBuyAndSellStockThree.maxProfit(prices);
        Assertions.assertEquals(18,result);
    }

}