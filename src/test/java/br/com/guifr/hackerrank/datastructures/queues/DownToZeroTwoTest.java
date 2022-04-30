package br.com.guifr.hackerrank.datastructures.queues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DownToZeroTwoTest {

    @Test
    @DisplayName("Return 3 When down to zero With 3")
    public void test1() {

        int actual = DownToZeroTwo.downToZero(3);
        Assertions.assertEquals(3,actual);
    }

    @Test
    @DisplayName("Return 3 When down to zero With 4")
    public void test2() {

        int actual = DownToZeroTwo.downToZero(4);
        Assertions.assertEquals(3,actual);
    }

    @Test
    @DisplayName("Return 8 When down to zero With 966514")
    public void test3() {

        int actual = DownToZeroTwo.downToZero(966514);
        Assertions.assertEquals(8,actual);
    }

    @Test
    @DisplayName("Return 10 When down to zero With 812849")
    public void test4() {

        int actual = DownToZeroTwo.downToZero(812849);
        Assertions.assertEquals(10,actual);
    }

    @Test
    @DisplayName("Return 11 When down to zero With 360422")
    public void test5() {

        int actual = DownToZeroTwo.downToZero(360422);
        Assertions.assertEquals(11,actual);
    }

    @Test
    @DisplayName("Return 4 When down to zero With 6")
    public void test6() {

        int actual = DownToZeroTwo.downToZero(6);
        Assertions.assertEquals(4,actual);
    }

}