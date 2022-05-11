package br.com.guifr.hackerrank.preparationkit.threemonth.weekone;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MiniMaxSumTest {

    @Test
    @DisplayName("Return '16 24' When find the minimum and maximum sum 4 of 5 number in list With [1,3,5,7,9]")
    public void test1() {
        String actual = MiniMaxSum.of(Arrays.asList(1,3,5,7,9));
        assertEquals("16 24",actual);
    }

    @Test
    @DisplayName("Return '17 25' When find the minimum and maximum sum 4 of 5 number in list With [1,5,4,7,9]")
    public void test2() {
        String actual = MiniMaxSum.of(Arrays.asList(1,5,4,7,9));
        assertEquals("17 25",actual);
    }

}