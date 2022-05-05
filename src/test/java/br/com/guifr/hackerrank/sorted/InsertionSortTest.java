package br.com.guifr.hackerrank.sorted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class InsertionSortTest {


    @Test
    @DisplayName("Return [1 3 4 5 6] When sort inPlace With [3 4 1 5 6]")
    public void testInPlace1() {
        int[] actual = {3, 4, 1, 5, 6};
        InsertionSort.inPlace(actual);
        Assertions.assertTrue(Arrays.equals(new int[]{1, 3, 4, 5, 6}, actual));
    }

    @Test
    @DisplayName("Return [1,2, 3, 4, 5, 6] When sort inPlace With [3, 4, 1, 5, 6,2]")
    public void testInPlace2() {
        int[] actual = {3, 4, 1, 5, 6, 2};
        InsertionSort.inPlace(actual);
        Assertions.assertTrue(Arrays.equals(new int[]{1, 2, 3, 4, 5, 6}, actual));
    }

    @Test
    @DisplayName("Return [1 3 4 5 6] When sort newArray With [3 4 1 5 6]")
    public void test2() {
        int[] actual = {3, 4, 1, 5, 6};
        int[] sorted = InsertionSort.newArray(actual);
        Assertions.assertTrue(Arrays.equals(new int[]{1, 3, 4, 5, 6}, sorted), "Array was sorted");
        Assertions.assertTrue(Arrays.equals(new int[]{3, 4, 1, 5, 6}, actual), "Original Array wasn't sort");
    }

    @Test
    @DisplayName("Return [1 3 4 5 6] When sort startedAtTheEnd With [3 4 1 5 6]")
    public void test3() {
        int[] actual = {3, 4, 1, 5, 6};
        InsertionSort.startedAtTheEnd(actual);
        Assertions.assertTrue(Arrays.equals(new int[]{1, 3, 4, 5, 6}, actual));
    }

    @Test
    @DisplayName("Return [1, 2, 3, 4, 5, 6] When sort startedAtTheEnd With [3, 4, 1, 5, 6, 2]")
    public void test4() {
        int[] actual = {3, 4, 1, 5, 6, 2};
        InsertionSort.startedAtTheEnd(actual);
        Assertions.assertTrue(Arrays.equals(new int[]{1, 2, 3, 4, 5, 6}, actual));
    }

    @Test
    @DisplayName("Return [1, 2, 3, 4, 5, 6, 7, 8, 9] When sort startedAtTheEnd With [3, 4, 1, 5, 6, 2, 9, 7, 8]")
    public void test5() {
        int[] actual = {3, 4, 1, 5, 6, 2, 9, 7, 8};
        InsertionSort.startedAtTheEnd(actual);
        Assertions.assertTrue(Arrays.equals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, actual));
    }

}