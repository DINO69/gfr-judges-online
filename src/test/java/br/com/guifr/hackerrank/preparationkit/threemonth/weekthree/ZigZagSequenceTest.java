package br.com.guifr.hackerrank.preparationkit.threemonth.weekthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ZigZagSequenceTest {

    @Test
    @DisplayName("Return [1,4,5,3,2] When find zig zap sequence With [2,3,5,1,4]")
    public void test1() {

        int[] actual = {2,3,5,1,4};
        ZigZagSequence.findZigZagSequence(actual,5);
        Assertions.assertEquals(1,actual[0]);
        Assertions.assertEquals(2,actual[1]);
        Assertions.assertEquals(5,actual[2]);
        Assertions.assertEquals(4,actual[3]);
        Assertions.assertEquals(3,actual[4]);
    }

    @Test
    @DisplayName("Return [1,2,3,7,6,5,4] When find zig zap sequence With [1 2 3 4 5 6 7]")
    public void test2() {

        int[] actual = {1,2,3,4,5,6,7};
        ZigZagSequence.findZigZagSequence(actual,7);
        Assertions.assertEquals(1,actual[0]);
        Assertions.assertEquals(2,actual[1]);
        Assertions.assertEquals(3,actual[2]);
        Assertions.assertEquals(7,actual[3]);
        Assertions.assertEquals(6,actual[4]);
        Assertions.assertEquals(5,actual[5]);
        Assertions.assertEquals(4,actual[6]);
    }
}