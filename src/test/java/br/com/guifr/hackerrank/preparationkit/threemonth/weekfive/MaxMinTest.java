package br.com.guifr.hackerrank.preparationkit.threemonth.weekfive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MaxMinTest {

    @Test
    @DisplayName("Return 1 When unfairness is minimized in k=2 With [1 4 7 2]")
    public void test1() {
        int k = 2;
        int actual = MaxMin.unfairnessIn(k,Arrays.asList(1,4,7,2));
        Assertions.assertEquals(1,actual);
    }

    @Test
    @DisplayName("Return 3 When unfairness is minimized in k=4 With [1 2 3 4 10 20 30 40 100 200]")
    public void test2() {
        int k = 4;
        int actual = MaxMin.unfairnessIn(k,Arrays.asList(1,2,3,4,10,20,30,40,100,200));
        Assertions.assertEquals(3,actual);
    }

    @Test
    @DisplayName("Return 6 When unfairness is minimized in k=4 With [1 4 7 2]")
    public void test3() {
        int k = 4;
        int actual = MaxMin.unfairnessIn(k,Arrays.asList(1,4,7,2));
        Assertions.assertEquals(6,actual);
    }

}