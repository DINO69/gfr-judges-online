package br.com.guifr.hackerrank.algorithms.warmup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolveMeFirstTest {



    @Test
    @DisplayName("Return 10 When sum two integers With a=7 b=3")
    public void test1() {


        int a = 7;
        int b = 3;

        int actual = SolveMeFirst.sum(a,b);
        Assertions.assertEquals(10,actual);
    }

    @Test
    @DisplayName("Return 5 When sum two integers With a=2 b=3")
    public void test2() {

        int a = 2;
        int b = 3;

        int actual = SolveMeFirst.sum(a,b);
        Assertions.assertEquals(5,actual);
    }
}