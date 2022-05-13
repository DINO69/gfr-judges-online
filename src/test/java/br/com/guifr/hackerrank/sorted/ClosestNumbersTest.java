package br.com.guifr.hackerrank.sorted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ClosestNumbersTest {

    @Test
    @DisplayName("Return [1 2 2 3 3 4 4 5] When sorted and return number with lesser distance With [ 5 2 3 4 1]")
    public void test1() {
        List<Integer> actual = ClosestNumbers.with(Arrays.asList(5, 2, 3, 4, 1));
        Assertions.assertTrue(Arrays.asList(1, 2, 2, 3, 3, 4, 4, 5).equals(actual), "Arrays is corret [1 2 2 3 3 4 4 5]");
    }

    @Test
    @DisplayName("Return [-20 30] When sorted and return number with lesser distance With list number 1")
    public void test2() {
        List<Integer> actual = ClosestNumbers.with(getListOne());
        Assertions.assertTrue(Arrays.asList(-20, 30).equals(actual), "Arrays is corret");
    }

    @Test
    @DisplayName("Return [-520 -470 -20 30] When sorted and return number with lesser distance With list number 2")
    public void test3() {
        List<Integer> actual = ClosestNumbers.with(getListTwo());
        Assertions.assertTrue(Arrays.asList(-520, -470, -20, 30).equals(actual), "Arrays is corret");
    }

    @Test
    @DisplayName("Return [1 2 3 4 5] When sorted and return number with lesser distance With [5 2 3 4 1]")
    public void testSort1() {
        List<Integer> actual = Arrays.asList(5, 2, 3, 4, 1);
        ClosestNumbers.quickSort(actual);
        Assertions.assertTrue(Arrays.asList(1, 2, 3, 4, 5).equals(actual), "Sorted is corret [1 2 3 4 5]");
    }

    private List<Integer> getListOne() {
        return Arrays.asList(-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854);
    }

    private List<Integer> getListTwo() {
        return Arrays.asList(-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854, -520, -470);
    }
}