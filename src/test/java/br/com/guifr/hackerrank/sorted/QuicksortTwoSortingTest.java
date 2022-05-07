package br.com.guifr.hackerrank.sorted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class QuicksortTwoSortingTest {

    @Test
    @DisplayName("Return [3 4 5 7 8] When do QuicksortTwoSorting With [5 7 4 3 8]")
    public void test1() {
        List<Integer> actual = QuicksortTwoSorting.with(Arrays.asList(5,7,4,3,8));
        Assertions.assertEquals(3,actual.get(0),"First is 3");
        Assertions.assertEquals(4,actual.get(1),"Second is 4");
        Assertions.assertEquals(5,actual.get(2),"Third is 5");
        Assertions.assertEquals(7,actual.get(3),"Fourth is 7");
        Assertions.assertEquals(8,actual.get(4),"Fiveth is 8");
        Assertions.assertTrue(Arrays.asList(3,4,5,7,8).equals(actual),"The list sorted");
    }

    @Test
    @DisplayName("Return [2,3,4,5,7] When do the first part quicksort With [4 5 3 7 2]")
    public void test2() {
        List<Integer> actual = QuicksortTwoSorting.with(Arrays.asList(4,5,3,7,2));
        Assertions.assertTrue(Arrays.asList(2,3,4,5,7).equals(actual),"The list sorted");
    }

    @Test
    @DisplayName("Return [1 2 3 5 7 8 9] When do the first part quicksort With [5 8 1 3 7 9 2]")
    public void test3() {
        List<Integer> actual = QuicksortTwoSorting.with(Arrays.asList(5,8,1,3,7,9,2));
        Assertions.assertTrue(Arrays.asList(1,2,3,5,7,8,9).equals(actual),"The list sorted");
    }

    @Test
    @DisplayName("Return [1 2 3 3 5 7 7 8 9] When do the first part quicksort With [5 8 1 3 7 9 2 3 7]")
    public void test4() {
        List<Integer> actual = QuicksortTwoSorting.with(Arrays.asList(5,8,1,3,7,9,2,3,7));
        Assertions.assertTrue(Arrays.asList(1,2,3,3,5,7,7,8,9).equals(actual),"The list sorted");
    }

    @Test
    @DisplayName("Return '1 2 3' When print the list With [1 2 3]")
    public void testPrint1() {
        QuicksortTwoSorting.Print p = new QuicksortTwoSorting.Print();
        p.add(Arrays.asList(1,2,3));
        String actual = p.formatPrint();
        Assertions.assertEquals("1 2 3", actual);
    }

    @Test
    @DisplayName("Return '7 8 9' When print the list With [7 8 9]")
    public void testPrint2() {
        QuicksortTwoSorting.Print p = new QuicksortTwoSorting.Print();
        p.add(Arrays.asList(7,8,9));
        String actual = p.formatPrint();
        Assertions.assertEquals("7 8 9", actual);
    }

    @Test
    @DisplayName("Return '1 2 3 5 7 8 9' When print the list With [1 2 3 5 7 8 9]")
    public void testPrint3() {
        QuicksortTwoSorting.Print p = new QuicksortTwoSorting.Print();
        p.add(Arrays.asList(1,2,3,5,7,8,9));
        String actual = p.formatPrint();
        Assertions.assertEquals("1 2 3 5 7 8 9", actual);
    }

    @Test
    @DisplayName("Return '1 2 3\n7 8 9\n1 2 3 5 7 8 9' When print all lists With [1 2 3] [7 8 9] [1 2 3 5 7 8 9]")
    public void testPrintAll3() {
        QuicksortTwoSorting.Print p = new QuicksortTwoSorting.Print();
        p.add(Arrays.asList(1,2,3));
        p.add(Arrays.asList(7,8,9));
        p.add(Arrays.asList(1,2,3,5,7,8,9));
        String actual = p.formatPrint();
        Assertions.assertEquals("1 2 3\n7 8 9\n1 2 3 5 7 8 9", actual);
    }

    @Test
    @DisplayName("Return '2 3\n1 2 3\n7 8 9\n1 2 3 5 7 8 9' When print all sub-array quicksort With [5 8 1 3 7 9 2]")
    public void testTogether1() {
        QuicksortTwoSorting.Print p = new QuicksortTwoSorting.Print();
        List<Integer> actual = QuicksortTwoSorting.withKeepSubArrays(Arrays.asList(5,8,1,3,7,9,2),p);
        Assertions.assertTrue(Arrays.asList(1,2,3,5,7,8,9).equals(actual),"The list sorted");
        Assertions.assertEquals("2 3\n1 2 3\n7 8 9\n1 2 3 5 7 8 9", p.formatPrint(),"Sub-arrays ok");
    }

}