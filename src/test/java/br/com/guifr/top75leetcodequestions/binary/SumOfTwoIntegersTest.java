package br.com.guifr.top75leetcodequestions.binary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoIntegersTest {

    @Test
    @DisplayName("Return '21' When call getSum Given a = '10' b = '11")
    void test1() {
        Assertions.assertEquals(21,SumOfTwoIntegers.getSum(10,11));
    }

    @Test
    @DisplayName("Return '5' When call getSum Given a = '2' b = '3")
    void test5() {
        Assertions.assertEquals(5,SumOfTwoIntegers.getSum(2,3));
    }

    @Test
    @DisplayName("Return '0' When call getSum Given a = '-1' b = '1")
    void test2() {
        Assertions.assertEquals(0,SumOfTwoIntegers.getSum(-1,1));
    }

    @Test
    @DisplayName("Return '0' When call getSum Given a = '-5' b = '5")
    void test3() {
        Assertions.assertEquals(0,SumOfTwoIntegers.getSum(-5,5));
    }
    @Test
    @DisplayName("Return '-10' When call getSum Given a = '-5' b = '-5")
    void test4() {
        Assertions.assertEquals(-10,SumOfTwoIntegers.getSum(-5,-5));
    }
}