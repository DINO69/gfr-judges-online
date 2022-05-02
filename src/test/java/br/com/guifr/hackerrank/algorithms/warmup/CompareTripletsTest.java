package br.com.guifr.hackerrank.algorithms.warmup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class CompareTripletsTest {

    @Test
    @DisplayName("Return [1 1] When compare points of Alice with than Bob With a=[1, 2, 3] b = [3, 2, 1]")
    public void test() {
        List<Integer> a = Arrays.asList(1, 2, 3);
        List<Integer> b = Arrays.asList(3, 2, 1);

        List<Integer> actual = CompareTriplets.with(a,b);
        Assertions.assertEquals(2,actual.size(),"Size is 2");
        Assertions.assertEquals(1,actual.get(0),"Alice won 1");
        Assertions.assertEquals(1,actual.get(1),"Bob won 1");
    }

    @Test
    @DisplayName("Return [1 1] When compare points of Alice with than Bob With a=[5,6,7] b = [3,6,10]")
    public void test2() {
        List<Integer> a = Arrays.asList(5,6,7);
        List<Integer> b = Arrays.asList(3,6,10);

        List<Integer> actual = CompareTriplets.with(a,b);
        Assertions.assertEquals(2,actual.size(),"Size is 2");
        Assertions.assertEquals(1,actual.get(0),"Alice won 1");
        Assertions.assertEquals(1,actual.get(1),"Bob won 1");
    }

    @Test
    @DisplayName("Return [2 1] When compare points of Alice with than Bob With a=[17,28,30] b = [99,16,8]")
    public void test3() {
        List<Integer> a = Arrays.asList(17,28,30);
        List<Integer> b = Arrays.asList(99,16,8);

        List<Integer> actual = CompareTriplets.with(a,b);
        Assertions.assertEquals(2,actual.size(),"Size is 2");
        Assertions.assertEquals(2,actual.get(0),"Alice won 2");
        Assertions.assertEquals(1,actual.get(1),"Bob won 1");
    }

    @Test
    @DisplayName("Return [0 3] When compare points of Alice with than Bob With a=[17,28,30] b = [99,29,31]")
    public void test4() {
        List<Integer> a = Arrays.asList(17,28,30);
        List<Integer> b = Arrays.asList(99,29,31);

        List<Integer> actual = CompareTriplets.with(a,b);
        Assertions.assertEquals(2,actual.size(),"Size is 2");
        Assertions.assertEquals(0,actual.get(0),"Alice won 0");
        Assertions.assertEquals(3,actual.get(1),"Bob won 3");
    }



}