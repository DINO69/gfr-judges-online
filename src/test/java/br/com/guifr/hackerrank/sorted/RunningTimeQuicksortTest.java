package br.com.guifr.hackerrank.sorted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class RunningTimeQuicksortTest {


    @Test
    @DisplayName("Return 1 When count diff swaps between quicksort and insertingsort With [1 3 9 8 2 7 5]")
    public void test1() {
        List<Integer> arr = Arrays.asList(1, 3, 9, 8, 2, 7, 5);
        int actual = RunningTimeQuicksort.with(arr);
        Assertions.assertEquals(1,actual);
    }

    @Test
    @DisplayName("Return 16 When count diff swaps between quicksort and insertingsort With [10 9 8 7 6 5 4 3 2 1]")
    public void test2() {
        List<Integer> arr = Arrays.asList(10,9,8,7,6,5,4,3,2,1);
        int actual = RunningTimeQuicksort.with(arr);
        Assertions.assertEquals(16,actual);
    }

    @Test
    @DisplayName("Return [1 2 3 5 7 8 9] When sorted with quicksort With [1 3 9 8 2 7 5]")
    public void testQuickSort1() {
        List<Integer> arr = Arrays.asList(1, 3, 9, 8, 2, 7, 5);
        RunningTimeQuicksort.quickSort(arr);
        Assertions.assertTrue(Arrays.asList(1,2,3,5,7,8,9).equals(arr),"List sorted");
    }

    @Test
    @DisplayName("Return 8 When count swap with sorted quicksort With [1 3 9 8 2 7 5]")
    public void testQuickSortCountSwaps1() {
        List<Integer> arr = Arrays.asList(1, 3, 9, 8, 2, 7, 5);
        RunningTimeQuicksort.CountSwaps count = new RunningTimeQuicksort.CountSwaps();
        RunningTimeQuicksort.quickSort(arr,count);
        Assertions.assertTrue(Arrays.asList(1,2,3,5,7,8,9).equals(arr),"List sorted");
        Assertions.assertEquals(8,count.getSwapQuicksort(),"Amount swaps with quicksort");
    }

    @Test
    @DisplayName("Return [1 2 3 5 7 8 9] When sorted with insertingSort With [1 3 9 8 2 7 5]")
    public void testInsertingSort1() {
        List<Integer> arr = Arrays.asList(1, 3, 9, 8, 2, 7, 5);
        RunningTimeQuicksort.insertingSort(arr);
        Assertions.assertTrue(Arrays.asList(1,2,3,5,7,8,9).equals(arr),"List sorted");
    }

    @Test
    @DisplayName("Return 9 When count swap with sorted insertingSort With [1 3 9 8 2 7 5]")
    public void testInsertingSortCountSwaps1() {
        List<Integer> arr = Arrays.asList(1, 3, 9, 8, 2, 7, 5);
        RunningTimeQuicksort.CountSwaps count = new RunningTimeQuicksort.CountSwaps();
        RunningTimeQuicksort.insertingSort(arr,count);
        Assertions.assertTrue(Arrays.asList(1,2,3,5,7,8,9).equals(arr),"List sorted");
        Assertions.assertEquals(9,count.getSwapInsertingSort(),"Amount swaps with insertingSort");
    }


}