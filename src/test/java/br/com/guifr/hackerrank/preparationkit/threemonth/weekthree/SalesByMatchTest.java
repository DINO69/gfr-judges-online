package br.com.guifr.hackerrank.preparationkit.threemonth.weekthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SalesByMatchTest {

    @Test
    @DisplayName("Return 2 When socks colors match With [1 2 1 2 1 3 2]")
    public void test1() {
        List<Integer> arr = Arrays.asList(1,2,1,2,1,3,2);
        int actual = SalesByMatch.in(arr);
        Assertions.assertEquals(2,actual);
    }

    @Test
    @DisplayName("Return 3 When socks colors match With [1 2 1 2 1 3 2 3]")
    public void test2() {
        List<Integer> arr = Arrays.asList(1,2,1,2,1,3,2,3);
        int actual = SalesByMatch.in(arr);
        Assertions.assertEquals(3,actual);
    }

    @Test
    @DisplayName("Return 3 When socks colors match With [10 20 20 10 10 30 50 10 20]")
    public void test3() {
        List<Integer> arr = Arrays.asList(10,20,20,10,10,30,50,10,20);
        int actual = SalesByMatch.in(arr);
        Assertions.assertEquals(3,actual);
    }

}