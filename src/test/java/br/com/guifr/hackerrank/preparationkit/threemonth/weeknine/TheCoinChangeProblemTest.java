package br.com.guifr.hackerrank.preparationkit.threemonth.weeknine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


class TheCoinChangeProblemTest {

    @Test
    @DisplayName("Return 3 When find all possible change coins Given n=3 [8,3,1,2] change=3")
    void test1() {
        long result = TheCoinChangeProblem.ofCoins(Arrays.asList(8L,3L,1L,2L)).change(3);
        Assertions.assertEquals(3L,result);
    }

    @Test
    @DisplayName("Return 5 When find all possible change coins Given n=10 [2,5,3,6] change=10")
    void test2() {
        long result = TheCoinChangeProblem.ofCoins(Arrays.asList(2L,5L,3L,6L)).change(10);
        Assertions.assertEquals(5L,result);
    }

    @Test
    @DisplayName("Return 4 When find all possible change coins Given n=4 [1,2,3] change=4")
    void test3() {
        long result = TheCoinChangeProblem.ofCoins(Arrays.asList(1L,2L,3L)).change(4);
        Assertions.assertEquals(4L,result);
    }

    @Test
    @DisplayName("Return 10 When find all possible change coins Given n=4 [2,1,4,8,10] change=8")
    void test4() {
        long result = TheCoinChangeProblem.ofCoins(Arrays.asList(2L,1L,4L,8L,10L)).change(8);
        Assertions.assertEquals(10L,result);
    }

    @Test
    @DisplayName("Return 10 When find all possible change coins Given n=4 [2,1,4,8,10] change=8 recursivity=true")
    void test5() {
        long result = TheCoinChangeProblem.ofCoins(Arrays.asList(2L,1L,4L,8L,10L),true).change(8);
        Assertions.assertEquals(10L,result);
    }

}