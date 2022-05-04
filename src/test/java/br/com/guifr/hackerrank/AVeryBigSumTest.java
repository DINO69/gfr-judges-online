package br.com.guifr.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class AVeryBigSumTest {

    @Test
    @DisplayName("Return 5000000015 When sum With big integers")
    public void test1() {
        List<Long> ar = Arrays.asList(1000000001L,1000000002L,1000000003L,1000000004L,1000000005L);
        long actual = AVeryBigSum.of(ar);
        Assertions.assertEquals(5000000015L,actual);
    }

    @Test
    @DisplayName("Return 4000000015 When sum With big integers")
    public void test2() {
        List<Long> ar = Arrays.asList(1L,1000000002L,1000000003L,1000000004L,1000000005L);
        long actual = AVeryBigSum.of(ar);
        Assertions.assertEquals(4000000015L,actual);
    }

    @Test
    @DisplayName("Return 5000000015 When sum ofWithoutStream With big integers")
    public void testWithoutStream1() {
        List<Long> ar = Arrays.asList(1000000001L,1000000002L,1000000003L,1000000004L,1000000005L);
        long actual = AVeryBigSum.ofWithoutStream(ar);
        Assertions.assertEquals(5000000015L,actual);
    }

    @Test
    @DisplayName("Return 4000000015 When sum ofWithoutStream With big integers")
    public void testWithoutStream2() {
        List<Long> ar = Arrays.asList(1L,1000000002L,1000000003L,1000000004L,1000000005L);
        long actual = AVeryBigSum.ofWithoutStream(ar);
        Assertions.assertEquals(4000000015L,actual);
    }


}