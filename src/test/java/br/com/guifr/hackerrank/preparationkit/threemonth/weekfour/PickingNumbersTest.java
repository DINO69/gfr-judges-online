package br.com.guifr.hackerrank.preparationkit.threemonth.weekfour;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class PickingNumbersTest {

    @Test
    @DisplayName("Return 5 When find longest subarray With [1,1,2,2,4,4,5,5,5]")
    public void test1() {
        int actual = PickingNumbers.with(Arrays.asList(1,1,2,2,4,4,5,5,5));
        Assertions.assertEquals(5,actual);
    }

    @Test
    @DisplayName("Return 5 When find longest subarray With [1,1,2,2,4,4,3,5,5,5]")
    public void test2() {
        int actual = PickingNumbers.with(Arrays.asList(1,1,2,2,4,4,3,5,5,5));
        Assertions.assertEquals(5,actual);
    }

    @Test
    @DisplayName("Return 6 When find longest subarray With [1,1,2,2,4,4,4,5,5,5]")
    public void test3() {
        int actual = PickingNumbers.with(Arrays.asList(1,1,2,2,4,4,4,5,5,5));
        Assertions.assertEquals(6,actual);
    }

    @Test
    @DisplayName("Return 3 When find longest subarray With [4 6 5 3 3 1]")
    public void test4() {
        int actual = PickingNumbers.with(Arrays.asList(4,6,5,3,3,1));
        Assertions.assertEquals(3,actual);
    }

}