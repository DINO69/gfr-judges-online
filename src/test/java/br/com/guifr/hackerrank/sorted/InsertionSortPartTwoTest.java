package br.com.guifr.hackerrank.sorted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class InsertionSortPartTwoTest {

    @Test
    @DisplayName("Return all steps until sorted array When insert sort left - right With [1 4 3 5 6 2]")
    public void test1() {


        String actual = InsertionSortPartTwo.with(Arrays.asList(1,4,3,5,6,2));
        Assertions.assertEquals("1 4 3 5 6 2\n" +
                "1 3 4 5 6 2\n" +
                "1 3 4 5 6 2\n" +
                "1 3 4 5 6 2\n" +
                "1 2 3 4 5 6",actual);
    }
}