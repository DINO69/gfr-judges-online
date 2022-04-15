package br.com.guifr.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class CountTripletsTest {

    @Test
    @DisplayName("Return 2 When find number of tripets With arrays is 1 4 16 64 and ratio 4")
    public void test1() {
        long actual = CountTriplets.of(Arrays.asList(1L, 4L, 16L, 64L), 4L);
        Assertions.assertEquals(2L, actual);
    }

    @Test
    @DisplayName("Return 2 When find number of tripets With arrays is 1 2 2 4 and ratio 2")
    public void test2() {
        long actual = CountTriplets.of(Arrays.asList(1L, 2L, 2L, 4L), 2L);
        Assertions.assertEquals(2L, actual);
    }

    @Test
    @DisplayName("Return 6 When find number of tripets With arrays is 1 3 9 9 27 81 and ratio 3")
    public void test3() {
        long actual = CountTriplets.of(Arrays.asList(1L, 3L, 9L, 9L, 27L, 81L), 3L);
        Assertions.assertEquals(6L, actual);
    }

    @Test
    @DisplayName("Return 4 When find number of tripets With arrays is 1 5 5 25 125 and ratio 5")
    public void test4() {
        long actual = CountTriplets.of(Arrays.asList(1L, 5L, 5L, 25L, 125L), 5L);
        Assertions.assertEquals(4L, actual);
    }

    @Test
    @DisplayName("Return 2 When find number of tripets With arrays is 10 100 1000 10000 and ratio 10")
    public void test5() {
        long actual = CountTriplets.of(Arrays.asList(10L, 100L, 1000L, 10000L), 10L);
        Assertions.assertEquals(2L, actual);
    }

    @Test
    @DisplayName("Return 10 When find number of tripets With arrays is 1 1 1 1 1 and ratio 1")
    public void test6() {
        long actual = CountTriplets.of(Arrays.asList(1L, 1L, 1L, 1L, 1L), 1L);
        Assertions.assertEquals(10L, actual);
    }

    @Test
    @DisplayName("Return 11 When find number of tripets With arrays is 1 1 1 1 2 1 2 2 and ratio 1")
    public void test6_2() {
        long actual = CountTriplets.of(Arrays.asList(1L, 1L, 1L, 1L,2L, 1L, 2L, 2L), 1L);
        Assertions.assertEquals(11L, actual);
    }

    @Test
    @DisplayName("Return 0 When find number of tripets With arrays is 1 1 1 1 2 1 and ratio 2")
    public void test6_3() {
        long actual = CountTriplets.of(Arrays.asList(1L, 1L, 1L, 1L,2L, 1L, 2L, 2L), 2L);
        Assertions.assertEquals(0L, actual);
    }

    @Test
    @DisplayName("Return 166661666700000 When find number of tripets With arrays.length 100000 all values is 1237")
    public void test7() {

        List<Long> arr= new ArrayList<>();

        IntStream.range(0,100000)
                 .forEach(i -> arr.add(1237L));

        long actual = 0;
        actual = CountTriplets.of(arr, 1L);

        Assertions.assertEquals(166661666700000L, actual);
    }

    @Test
    @DisplayName("Return 2 When find number of tripets With arrays is 1 1 2 4 and ratio 2")
    public void test8() {
        long actual = CountTriplets.of(Arrays.asList(1L, 1L, 2L, 4L), 2L);
        Assertions.assertEquals(2L, actual);
    }

    @Test
    @DisplayName("Return 6 When find number of tripets With arrays is 1 1 1 3 3 9 and ratio 3")
    public void test9() {
        long actual = CountTriplets.of(Arrays.asList(1L, 1L, 1L, 3L, 3L, 9L), 3L);
        Assertions.assertEquals(6L, actual);
    }

    @Test
    @DisplayName("Return 12 When find number of tripets With arrays is 1 1 1 3 3 9 9 and ratio 3")
    public void test10() {
        long actual = CountTriplets.of(Arrays.asList(1L, 1L, 1L, 3L, 3L, 9L,9L), 3L);
        Assertions.assertEquals(12L, actual);
    }

    @Test
    @DisplayName("Return 6 When calculate factorial With number eq 3")
    public void testFatory1() {
        long actual = CountTriplets.factorial(3L);
        Assertions.assertEquals(6L,actual);
    }

    @Test
    @DisplayName("Return 120 When calculate factorial With number eq 5")
    public void testFatory2() {
        long actual = CountTriplets.factorial(5L);
        Assertions.assertEquals(120L,actual);
    }

    @Test
    @DisplayName("Return 6 When calculate gauss With number eq 3")
    public void testGauss1() {
        long actual = CountTriplets.gauss(3L);
        Assertions.assertEquals(6L,actual);
    }

    @Test
    @DisplayName("Return 3 When calculate gauss With number eq 2")
    public void testGauss2() {
        long actual = CountTriplets.gauss(2L);
        Assertions.assertEquals(3L,actual);
    }

    @Test
    @DisplayName("Return 4999950000 When calculate gauss With number eq 99999")
    public void testGauss3() {
        Assertions.assertEquals(4999950000L, CountTriplets.gauss(99999));
    }

}