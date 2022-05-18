package br.com.guifr.hackerrank.preparationkit.threemonth.weekthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class PermutingTwoArraysTest {

    @Test
    @DisplayName("Return 'YES' When calculating PermutingTwoArrays k = 1 With A[0,1] B[0,2]")
    public void test1() {
        int k = 1;
        List<Integer> a = Arrays.asList(0, 1);
        List<Integer> b = Arrays.asList(0, 2);
        String actual = PermutingTwoArrays.when(k).with(a, b);
        Assertions.assertEquals("YES", actual);
    }

    @Test
    @DisplayName("Return 'YES' When calculating PermutingTwoArrays k = 10 With A[2, 1, 3] B[7, 8, 9]")
    public void test2() {
        int k = 10;
        List<Integer> a = Arrays.asList(2, 1, 3);
        List<Integer> b = Arrays.asList(7, 8, 9);
        String actual = PermutingTwoArrays.when(k).with(a, b);
        Assertions.assertEquals("YES", actual);
    }

    @Test
    @DisplayName("Return 'NO' When calculating PermutingTwoArrays k = 5 With A[1, 2, 2, 1] B[3, 3, 3, 4]")
    public void test3() {
        int k = 5;
        List<Integer> a = Arrays.asList(1, 2, 2, 1);
        List<Integer> b = Arrays.asList(3, 3, 3, 4);
        String actual = PermutingTwoArrays.when(k).with(a, b);
        Assertions.assertEquals("NO", actual);
    }

    @Test
    @DisplayName("Return [1, 1, 2, 2] When sort list With [1, 2, 2, 1]")
    public void testSort3() {
        List<Integer> actual = Arrays.asList(1, 2, 2, 1);
        PermutingTwoArrays.sortAscInsertingSort(actual);
        Assertions.assertTrue(Arrays.asList(1, 1, 2, 2).equals(actual),"Sorting works with inserting sort");
    }

    @Test
    @DisplayName("Return [1, 2, 3, 4] When sort list With [4, 3, 1, 2]")
    public void testSort2() {
        List<Integer> actual = Arrays.asList(4, 3, 1, 2);
        PermutingTwoArrays.sortAscInsertingSort(actual);
        Assertions.assertTrue(Arrays.asList(1, 2, 3, 4).equals(actual),"Sorting works with inserting sort");
    }

    @Test
    @DisplayName("Return [4, 3, 2, 1] When sort desc list With [3, 4, 1, 2]")
    public void testSortDesc2() {
        List<Integer> actual = Arrays.asList(3, 4, 1, 2);
        PermutingTwoArrays.sortDescQuickSort(actual);
        Assertions.assertTrue(Arrays.asList(4, 3, 2, 1).equals(actual),"Sorting desc with quicksort");
    }

    @Test
    @DisplayName("Return [5, 4, 3, 2, 1] When sort desc list With [3, 4, 1, 5, 2]")
    public void testSortDesc1() {
        List<Integer> actual = Arrays.asList(3, 4, 1, 5, 2);
        PermutingTwoArrays.sortDescQuickSort(actual);
        Assertions.assertTrue(Arrays.asList(5, 4, 3, 2, 1).equals(actual),"Sorting desc with quicksort");
    }


}