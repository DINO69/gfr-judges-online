package br.com.guifr.hackerrank.sorted;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class CorrectnessAndLoopInvariantTest {

    @Test
    @DisplayName("Return [2 3 4 5 6 7] When insertionSort  With [7 4 3 5 6 2]")
    public void test1() {

        int[] actual = {7, 4, 3, 5, 6, 2};

        try(MockedStatic<Print> printMockedStatic = Mockito.mockStatic(Print.class)) {

            Class<int[]> aClass = int[].class;

            System.out.println();

            CorrectnessAndLoopInvariant.insertionSort(actual);
            printMockedStatic.verify(() -> Print.printArray(new int[]{2, 3, 4, 5, 6, 7}), Mockito.times(1));
        }
    }
}