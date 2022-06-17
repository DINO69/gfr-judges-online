package br.com.guifr.hackerrank.preparationkit.threemonth.weeksix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SumXorTest {

    @Test
    @DisplayName("Return 4 When comparing sum vs xor With n=4")
    public void test1() {
        long actual = SumXor.vs(4);
        Assertions.assertEquals(4L,actual);
    }

    @Test
    @DisplayName("Return 2 When comparing sum vs xor With n=5")
    public void test2() {
        long actual = SumXor.vs(5);
        Assertions.assertEquals(2L,actual);
    }

    @Test
    @DisplayName("Return 4 When comparing sum vs xor With n=10")
    public void test3() {
        long actual = SumXor.vs(10);
        Assertions.assertEquals(4L,actual);
    }

    @Test
    @DisplayName("Return 6 When comparing sum vs xor With n=8")
    public void test4() {
        long actual = SumXor.vs(8);
        Assertions.assertEquals(8L,actual);
    }

    @Test
    @DisplayName("Return 4 When comparing sum vs xor With n=9")
    public void test5() {
        long actual = SumXor.vs(9);
        Assertions.assertEquals(4L,actual);
    }

    @Test
    @DisplayName("Return 128 When comparing sum vs xor With n=128")
    public void test6() {
        long actual = SumXor.vs(128);
        Assertions.assertEquals(128L,actual);
    }

    @Test
    @DisplayName("Return 64 When comparing sum vs xor With n=129")
    public void test7() {
        long actual = SumXor.vs(129);
        Assertions.assertEquals(64L,actual);
    }

    @Test
    @DisplayName("Return 1 When comparing sum vs xor With n=0")
    public void test8() {
        long actual = SumXor.vs(0);
        Assertions.assertEquals(1L,actual);
    }


    @Test
    @DisplayName("Return 7 When count ZEROS in binary number With n=128")
    public void test9() {
        int actual = SumXor.countZerosFromBinary(128L);
        Assertions.assertEquals(7,actual);
    }

    @Test
    @DisplayName("Return 4 When using loop comparing sum vs xor With n=4")
    public void testLoop1() {
        long actual = SumXor.vsLoop(4);
        Assertions.assertEquals(4L,actual);
    }

    @Test
    @DisplayName("Return 2 When using loop  comparing sum vs xor With n=5")
    public void testLoop2() {
        long actual = SumXor.vsLoop(5);
        Assertions.assertEquals(2L,actual);
    }

    @Test
    @DisplayName("Return 4 When using loop  comparing sum vs xor With n=10")
    public void testLoop3() {
        long actual = SumXor.vsLoop(10);
        Assertions.assertEquals(4L,actual);
    }

    @Test
    @DisplayName("Return 6 When using loop  comparing sum vs xor With n=8")
    public void testLoop4() {
        long actual = SumXor.vsLoop(8);
        Assertions.assertEquals(8L,actual);
    }

    @Test
    @DisplayName("Return 4 When using loop  comparing sum vs xor With n=9")
    public void testLoop5() {
        long actual = SumXor.vsLoop(9);
        Assertions.assertEquals(4L,actual);
    }

    @Test
    @DisplayName("Return 128 When using loop  comparing sum vs xor With n=128")
    public void testLoop6() {
        long actual = SumXor.vsLoop(128);
        Assertions.assertEquals(128L,actual);
    }

    @Test
    @DisplayName("Return 64 When using loop  comparing sum vs xor With n=129")
    public void testLoop7() {
        long actual = SumXor.vsLoop(129);
        Assertions.assertEquals(64L,actual);
    }

    @Test
    @DisplayName("Return 1 When using loop  comparing sum vs xor With n=0")
    public void testLoop8() {
        long actual = SumXor.vsLoop(0);
        Assertions.assertEquals(1L,actual);
    }

}