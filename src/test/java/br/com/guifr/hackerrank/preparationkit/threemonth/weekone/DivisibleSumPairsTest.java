package br.com.guifr.hackerrank.preparationkit.threemonth.weekone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class DivisibleSumPairsTest {

    @Test
    @DisplayName("Return 3 When find all pair sum eq 5 and i < j With [1,2,3,4,5,6]")
    public void test1() {
        int actual = DivisibleSumPairs.with(5, Arrays.asList(1,2,3,4,5,6));
        Assertions.assertEquals(3,actual);
    }

    @Test
    @DisplayName("Return 5 When find all pair sum eq 3 and i < j With [1,3,2,6,1,2]")
    public void test2() {
        int actual = DivisibleSumPairs.with(3, Arrays.asList(1,3,2,6,1,2));
        Assertions.assertEquals(5,actual);
    }

}