package br.com.guifr.hackerrank.algorithms.warmup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SimpleArraySumTest {


    @Test
    @DisplayName("Return 6 When sum all integers in list With [1 2 3]")
    public void test1() {

        List<Integer> ar = Arrays.asList(1,2,3);
        int actual = SimpleArraySum.with(ar);
        Assertions.assertEquals(6,actual);
    }

    @Test
    @DisplayName("Return 31 When sum all integers in list With [1 2 3 4 10 11]")
    public void test2() {

        List<Integer> ar = Arrays.asList(1,2,3,4,10,11);
        int actual = SimpleArraySum.with(ar);
        Assertions.assertEquals(31,actual);
    }

    @Test
    @DisplayName("Return 10 When sum all integers in list With [10]")
    public void test3() {

        List<Integer> ar = Arrays.asList(10);
        int actual = SimpleArraySum.with(ar);
        Assertions.assertEquals(10,actual);
    }

    @Test
    @DisplayName("Return 6 When WithoutStream sum all integers in list With [1 2 3]")
    public void testWithoutStream1() {

        List<Integer> ar = Arrays.asList(1,2,3);
        int actual = SimpleArraySum.withoutStream(ar);
        Assertions.assertEquals(6,actual);
    }

    @Test
    @DisplayName("Return 31 When WithoutStream sum all integers in list With [1 2 3 4 10 11]")
    public void testWithoutStream2() {

        List<Integer> ar = Arrays.asList(1,2,3,4,10,11);
        int actual = SimpleArraySum.withoutStream(ar);
        Assertions.assertEquals(31,actual);
    }

    @Test
    @DisplayName("Return 10 When WithoutStream sum all integers in list With [10]")
    public void testWithoutStream3() {

        List<Integer> ar = Arrays.asList(10);
        int actual = SimpleArraySum.withoutStream(ar);
        Assertions.assertEquals(10,actual);
    }

}