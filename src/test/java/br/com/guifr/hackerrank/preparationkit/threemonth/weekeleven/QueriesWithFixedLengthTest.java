package br.com.guifr.hackerrank.preparationkit.threemonth.weekeleven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class QueriesWithFixedLengthTest {

    @Test
    @DisplayName("Return '1,2,3,4,5' When calculate min(max()) Given arr=[1,2,3,4,5] q=[1,2,3,4,5]")
    void test1() {
        List<Integer> arr = List.of(1,2,3,4,5);
        List<Integer> queries = List.of(1,2,3,4,5);
        List<Integer> result = QueriesWithFixedLength.minMax(arr,queries);
        Assertions.assertEquals(List.of(1,2,3,4,5),result);
    }

    @Test
    @DisplayName("Return '11,33,44,44,55' When calculate min(max()) Given arr=[33,11,44,11,55] q=[1,2,3,4,5]")
    void test2() {
        List<Integer> arr = List.of(33,11,44,11,55);
        List<Integer> queries = List.of(1,2,3,4,5);
        List<Integer> result = QueriesWithFixedLength.minMax(arr,queries);
        Assertions.assertEquals(List.of(11,33,44,44,55),result);
    }

    @Test
    @DisplayName("Return '1,2,3,4,5' When calculate min(max()) called minMaxAtferRefactoring Given arr=[1,2,3,4,5] q=[1,2,3,4,5]")
    void testRefactoring1() {
        List<Integer> arr = List.of(1,2,3,4,5);
        List<Integer> queries = List.of(1,2,3,4,5);
        List<Integer> result = QueriesWithFixedLength.minMaxAtferRefactoring(arr,queries);
        Assertions.assertEquals(List.of(1,2,3,4,5),result);
    }

    @Test
    @DisplayName("Return '11,33,44,44,55' When calculate min(max()) called minMaxAtferRefactoring Given arr=[33,11,44,11,55] q=[1,2,3,4,5]")
    void testRefactoringe() {
        List<Integer> arr = List.of(33,11,44,11,55);
        List<Integer> queries = List.of(1,2,3,4,5);
        List<Integer> result = QueriesWithFixedLength.minMaxAtferRefactoring(arr,queries);
        Assertions.assertEquals(List.of(11,33,44,44,55),result);
    }

    @Test
    @DisplayName("Return '1,2,3,4,5' When calculate min(max()) called minMax2 Given arr=[1,2,3,4,5] q=[1,2,3,4,5]")
    void testMinMax21() {
        List<Integer> arr = List.of(1,2,3,4,5);
        List<Integer> queries = List.of(1,2,3,4,5);
        List<Integer> result = QueriesWithFixedLength.minMax2(arr,queries);
        Assertions.assertEquals(List.of(1,2,3,4,5),result);
    }

    @Test
    @DisplayName("Return '11,33,44,44,55' When calculate min(max()) called minMax2 Given arr=[33,11,44,11,55] q=[1,2,3,4,5]")
    void testMinMax22() {
        List<Integer> arr = List.of(33,11,44,11,55);
        List<Integer> queries = List.of(1,2,3,4,5);
        List<Integer> result = QueriesWithFixedLength.minMax2(arr,queries);
        Assertions.assertEquals(List.of(11,33,44,44,55),result);
    }

    @Test
    @DisplayName("Return '11,33,44,44,55' When calculate min(max()) called minMax2 Given arr=[33,11,44,11,55] q=[1,2,3,4,5]")
    void testMinMax23() {
        List<Integer> arr = List.of(3,11,42,1,2);
        List<Integer> queries = List.of(2);
        List<Integer> result = QueriesWithFixedLength.minMax2(arr,queries);
        Assertions.assertEquals(List.of(2),result);
    }

}