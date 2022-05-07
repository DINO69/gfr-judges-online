package br.com.guifr.hackerrank.sorted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class QuicksortInPlaceTest {

    @Test
    @DisplayName("Return '2 3\n1 2 3\n7 8 9\n1 2 3 5 7 8 9' When print all sub-array quicksort With [1 3 9 8 2 7 5]")
    public void testTogether1() {
        QuicksortTwoSorting.Print p = new QuicksortTwoSorting.Print();
        List<Integer> arr = Arrays.asList(1,3,9,8,2,7,5);
        QuicksortInPlace.withKeepSubArrays(arr,p);
        Assertions.assertTrue(Arrays.asList(1,2,3,5,7,8,9).equals(arr),"The list sorted");
        Assertions.assertEquals("1 3 2 5 9 7 8\n1 2 3 5 9 7 8\n1 2 3 5 7 8 9", p.formatPrint(),"Sub-arrays ok");
    }

}