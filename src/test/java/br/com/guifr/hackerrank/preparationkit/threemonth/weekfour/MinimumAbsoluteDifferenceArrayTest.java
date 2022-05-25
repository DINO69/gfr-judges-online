package br.com.guifr.hackerrank.preparationkit.threemonth.weekfour;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MinimumAbsoluteDifferenceArrayTest {
    @Test
    @DisplayName("Return 2 When find the minimum absolute With [-2,2,4]")
    public void test1() {
        Assertions.assertEquals(2,MinimumAbsoluteDifferenceArray.in(Arrays.asList(-2,2,4)));
    }

    @Test
    @DisplayName("Return 3 When find the minimum absolute With [3 -7 0]")
    public void test2() {
        Assertions.assertEquals(3,MinimumAbsoluteDifferenceArray.in(Arrays.asList(3,-7,0)));
    }

    @Test
    @DisplayName("Return 3 When find the minimum absolute With [1 -3 71 68 17]")
    public void test3() {
        Assertions.assertEquals(3,MinimumAbsoluteDifferenceArray.in(Arrays.asList(1,-3,71,68,17)));
    }

}