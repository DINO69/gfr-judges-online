package br.com.guifr.hackerrank.preparationkit.threemonth.weeknine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class StockMaximizeTest {

    @Test
    @DisplayName("Return 1 When find the best gain Given [1,2]")
    void test1() {
        long result = StockMaximize.with(Arrays.asList(1,2));
        Assertions.assertEquals(1L,result);
    }

    @Test
    @DisplayName("Return 0 When find the best gain Given [2,1]")
    void test2() {
        long result = StockMaximize.with(Arrays.asList(2,1));
        Assertions.assertEquals(0L,result);
    }

    @Test
    @DisplayName("Return 0 When find the best gain Given [5,3,2]")
    void test3() {
        long result = StockMaximize.with(Arrays.asList(5,3,2));
        Assertions.assertEquals(0L,result);
    }

    @Test
    @DisplayName("Return 197 When find the best gain Given [1,2,100]")
    void test4() {
        long result = StockMaximize.with(Arrays.asList(1,2,100));
        Assertions.assertEquals(197L,result);
    }

    @Test
    @DisplayName("Return 0 When find the best gain Given [1]")
    void test5() {
        long result = StockMaximize.with(Arrays.asList(1));
        Assertions.assertEquals(0L,result);
    }

}