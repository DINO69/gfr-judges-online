package br.com.guifr.hackerrank.preparationkit.threemonth.weeksix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RecursiveDigitSumTest {


    @Test
    @DisplayName("Return 2 When called super_digit With '9875'")
    public void test1() {
        int actual = RecursiveDigitSum.superDigit("9875", 1);
        Assertions.assertEquals(2,actual);
    }

    @Test
    @DisplayName("Return 8 When called super_digit With '9875987598759875'")
    public void test2() {
        int actual = RecursiveDigitSum.superDigit("9875987598759875", 1);
        Assertions.assertEquals(8,actual);
    }

    @Test
    @DisplayName("Return 8 When called super_digit With '9875' and k=4 times")
    public void test3() {
        int actual = RecursiveDigitSum.superDigit("9875",4);
        Assertions.assertEquals(8,actual);
    }

    @Test
    @DisplayName("Return 8 When called super_digit With '9875987598759875' and k=1 times")
    public void test4() {
        int actual = RecursiveDigitSum.superDigit("9875987598759875",1);
        Assertions.assertEquals(8,actual);
    }

    @Test
    @DisplayName("Return 9 When called super_digit With '123' and k=3 times")
    public void test5() {
        int actual = RecursiveDigitSum.superDigit("123",3);
        Assertions.assertEquals(9,actual);
    }

    @Test
    @DisplayName("Return 6 When called super_digit With '3' and k=5 times")
    public void test6() {
        int actual = RecursiveDigitSum.superDigit("3",5);
        Assertions.assertEquals(6,actual);
    }

}