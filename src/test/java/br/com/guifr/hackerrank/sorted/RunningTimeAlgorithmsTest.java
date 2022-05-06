package br.com.guifr.hackerrank.sorted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RunningTimeAlgorithmsTest {

    @Test
    @DisplayName("Return 4 When count swap in insertsort With [2 1 3 1 2]")
    public void test() {
        int actual = RunningTimeAlgorithms.countSwapInsertinSort(Arrays.asList(2,1,3,1,2));
        Assertions.assertEquals(4,actual);
    }
}