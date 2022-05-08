package br.com.guifr.hackerrank.sorted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class CountingSortOneTest {

    @Test
    @DisplayName("Return [0 1 2 2] When maxElement < 4 and counting sort With [3 3 2 1 2]")
    public void test1() {
        List<Integer> actual = CountingSortOne.of(Arrays.asList(3,3,2,1,2)).withMax(4);
        Assertions.assertEquals(4,actual.size(),"Result List sise is 4");
        Assertions.assertEquals(0,actual.get(0),"0 appear 0 times");
        Assertions.assertEquals(1,actual.get(1),"1 appear 1 times");
        Assertions.assertEquals(2,actual.get(2),"2 appear 2 times");
        Assertions.assertEquals(2,actual.get(3),"3 appear 2 times");
    }

    @Test
    @DisplayName("Return [0 1 2 2 0] When maxElement < 5 and counting sort With [3 3 2 1 2]")
    public void test2() {
        List<Integer> actual = CountingSortOne.of(Arrays.asList(3,3,2,1,2)).withMax(5);
        Assertions.assertEquals(5,actual.size(),"Result List sise is 5");
        Assertions.assertEquals(0,actual.get(0),"0 appear 0 times");
        Assertions.assertEquals(1,actual.get(1),"1 appear 1 times");
        Assertions.assertEquals(2,actual.get(2),"2 appear 2 times");
        Assertions.assertEquals(2,actual.get(3),"3 appear 2 times");
        Assertions.assertEquals(0,actual.get(4),"4 appear 0 times");

    }

    @Test
    @DisplayName("Return [0 1 2 2 1] When maxElement < 5 and counting sort With [3 3 2 1 2 4]")
    public void test3() {
        List<Integer> actual = CountingSortOne.of(Arrays.asList(3,3,2,1,2,4)).withMax(5);
        Assertions.assertEquals(5,actual.size(),"Result List sise is 5");
        Assertions.assertEquals(0,actual.get(0),"0 appear 0 times");
        Assertions.assertEquals(1,actual.get(1),"1 appear 1 times");
        Assertions.assertEquals(2,actual.get(2),"2 appear 2 times");
        Assertions.assertEquals(2,actual.get(3),"3 appear 2 times");
        Assertions.assertEquals(1,actual.get(4),"4 appear 1 times");

    }

}