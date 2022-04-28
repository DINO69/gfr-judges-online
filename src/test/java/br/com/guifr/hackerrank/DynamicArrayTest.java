package br.com.guifr.hackerrank;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DynamicArrayTest {

    @Test
    @DisplayName("Return [7 3] When operation all queries With n=2")
    public void test1() {

        List<List<Integer>> queries = Arrays.asList(
                Arrays.asList(1, 0, 5),
                Arrays.asList(1, 1, 7),
                Arrays.asList(1, 0, 3),
                Arrays.asList(2, 1, 0),
                Arrays.asList(2, 1, 1)
        );

        List<Integer> actual = DynamicArray.with(2, queries);
        assertTrue(actual.equals(Arrays.asList(7, 3)));
    }

    @Test
    @DisplayName("Return [7 5] When operation all queries With n=2")
    public void test2() {

        List<List<Integer>> queries = Arrays.asList(
                Arrays.asList(1, 0, 5),
                Arrays.asList(1, 1, 7),
                Arrays.asList(1, 0, 3),
                Arrays.asList(2, 1, 0),
                Arrays.asList(2, 1, 2)
        );

        List<Integer> actual = DynamicArray.with(2, queries);
        assertTrue(actual.equals(Arrays.asList(7, 5)));
    }

}