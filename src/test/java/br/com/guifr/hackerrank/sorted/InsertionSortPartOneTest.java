package br.com.guifr.hackerrank.sorted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class InsertionSortPartOneTest {


    @Test
    @DisplayName("Return '1 2 4 5 5\n1 2 4 4 5\n1 2 3 4 5' When insert sort part 1 With [ 1 2 4 5 3]")
    public void test1() {
        Integer[] ar = {1,2,4,5,3};
        String actual = InsertionSortPartOne.with(ar);
        Assertions.assertEquals("1 2 4 5 5\n1 2 4 4 5\n1 2 3 4 5",actual);
    }

    @Test
    @DisplayName("Return '1 2 4 5 5\n1 2 4 4 5\n1 2 3 4 5' When insert sort part 1 With [2 4 6 8 3]")
    public void test2() {
        Integer[] ar = {2,4,6,8,3};
        String actual = InsertionSortPartOne.with(ar);
        Assertions.assertEquals("2 4 6 8 8\n" +
                "2 4 6 6 8\n" +
                "2 4 4 6 8\n" +
                "2 3 4 6 8",actual);
    }

    @Test
    @DisplayName("Return '1 2 4 5 5\n1 2 4 4 5\n1 2 3 4 5' When insert sort part 1 With [ 1 2 4 5 3]")
    public void testList1() {
        List<Integer> ar = Arrays.asList(1,2,4,5,3);
        String actual = InsertionSortPartOne.with(ar);
        Assertions.assertEquals("1 2 4 5 5\n1 2 4 4 5\n1 2 3 4 5",actual);
    }

    @Test
    @DisplayName("Return '1 2 4 5 5\n1 2 4 4 5\n1 2 3 4 5' When insert sort part 1 With [2 4 6 8 3]")
    public void testList2() {
        List<Integer> ar = Arrays.asList(2,4,6,8,3);
        String actual = InsertionSortPartOne.with(ar);
        Assertions.assertEquals("2 4 6 8 8\n" +
                "2 4 6 6 8\n" +
                "2 4 4 6 8\n" +
                "2 3 4 6 8",actual);
    }


    @Test
    @DisplayName("Return '1 2 4 5 5' When insert sort part 1 With [1 2 4 5 5]")
    public void testPrint1() {
        Integer[] ar = {1,2,4,5,5};
        String actual = InsertionSortPartOne.formatString(ar);
        Assertions.assertEquals("1 2 4 5 5",actual);
    }

    @Test
    @DisplayName("Return '1 2 4 4 5' When insert sort part 1 With [1 2 4 4 5]")
    public void testPrint2() {
        Integer[] ar = {1,2,4,4,5};
        String actual = InsertionSortPartOne.formatString(ar);
        Assertions.assertEquals("1 2 4 4 5",actual);
    }


}