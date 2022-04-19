package br.com.guifr.hackerrank;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SortingBubbleSortTest {


    @Test
    @DisplayName("Return prints When passed parameters about swaps, and elements With [3,1,6]")
    public void testPrint1() {
        String actual = SortingBubbleSort.printResult(Arrays.asList(3,1,6));
        assertEquals("Array is sorted in 3 swaps.\n" +
                "First Element: 1\n" +
                "Last Element: 6",actual);
    }

    @Test
    @DisplayName("Return prints When passed parameters about swaps, and elements With [0,1,3]")
    public void testPrint2() {
        String actual = SortingBubbleSort.printResult(Arrays.asList(0,1,3));
        assertEquals("Array is sorted in 0 swaps.\n" +
                "First Element: 1\n" +
                "Last Element: 3",actual);
    }

    @Test
    @DisplayName("Return prints When passed parameters about swaps, and elements With [3,1,3]")
    public void testPrint3() {
        String actual = SortingBubbleSort.printResult(Arrays.asList(3,1,3));
        assertEquals("Array is sorted in 3 swaps.\n" +
                "First Element: 1\n" +
                "Last Element: 3",actual);
    }


    @Test
    @DisplayName("Return [3,1,6] When count swap With [6,4,1]")
    public void testCountSwapAndFindElements1() {
        List<Integer> actual = SortingBubbleSort.of(Arrays.asList(6,4,1));
        assertAll(()->{
            assertEquals(3,actual.size(),"Size is result");
            assertEquals(3,actual.get(0),"Quantity swap");
            assertEquals(1,actual.get(1),"First Element");
            assertEquals(6,actual.get(2),"Last Element");
        });
    }

    @Test
    @DisplayName("Return [0,1,3] When count swap With [1,2,3]")
    public void testCountSwapAndFindElements2() {
        List<Integer> actual = SortingBubbleSort.of(Arrays.asList(1,2,3));
        assertAll(()->{
            assertEquals(3,actual.size(),"Size is result");
            assertEquals(0,actual.get(0),"Quantity swap");
            assertEquals(1,actual.get(1),"First Element");
            assertEquals(3,actual.get(2),"Last Element");
        });
    }

    @Test
    @DisplayName("Return [3,1,3] When count swap With [3,2,1]")
    public void testCountSwapAndFindElements3() {
        List<Integer> actual = SortingBubbleSort.of(Arrays.asList(3,2,1));
        assertAll(()->{
            assertEquals(3,actual.size(),"Size is result");
            assertEquals(3,actual.get(0),"Quantity swap");
            assertEquals(1,actual.get(1),"First Element");
            assertEquals(3,actual.get(2),"Last Element");
        });
    }


}