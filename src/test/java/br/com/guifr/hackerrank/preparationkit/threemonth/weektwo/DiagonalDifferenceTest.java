package br.com.guifr.hackerrank.preparationkit.threemonth.weektwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class DiagonalDifferenceTest {

    @Test
    @DisplayName("Return 2 When calculate diff between diagonal With [[1 2 3][4 5 6][9 8 9]]")
    public void test1() {
        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(9,8,9)
        );
        int actual = DiagonalDifference.with(arr);
        Assertions.assertEquals(2,actual);
    }

    @Test
    @DisplayName("Return 15 When calculate diff between diagonal With [[11 2 4][4 5 6][10 8 -12]]")
    public void test2() {
        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(11,2,4),
                Arrays.asList(4,5,6),
                Arrays.asList(10,8,-12)
        );
        int actual = DiagonalDifference.with(arr);
        Assertions.assertEquals(15,actual);
    }

}