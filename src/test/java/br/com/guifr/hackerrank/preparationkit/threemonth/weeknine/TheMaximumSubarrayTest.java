package br.com.guifr.hackerrank.preparationkit.threemonth.weeknine;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TheMaximumSubarrayTest {

    @Test
    @DisplayName("Return [10,10] When find the maximum subarray Given [1,2,3,4]")
    void test1() {
        List<Integer> result = TheMaximumSubarray.with(List.of(1,2,3,4));
        assertEquals(2,result.size(),"Size is 2");
        assertEquals(10,result.get(0),"Maximum sequence is 10");
        assertEquals(10,result.get(1),"Maximum value is 10");
    }

    @Test
    @DisplayName("Return [10,11] When find the maximum subarray Given [2,-1,2,3,4,-5]")
    void test2() {
        List<Integer> result = TheMaximumSubarray.with(List.of(2,-1,2,3,4,-5));
        assertEquals(2,result.size(),"Size is 2");
        assertEquals(10,result.get(0),"Maximum sequence is 10");
        assertEquals(11,result.get(1),"Maximum value is 11");
    }

    @Test
    @DisplayName("Return [16,20] When find the maximum subarray Given [-1,2,3,-4,5,10]")
    void test3() {
        List<Integer> result = TheMaximumSubarray.with(List.of(-1,2,3,-4,5,10));
        assertEquals(2,result.size(),"Size is 2");
        assertEquals(16,result.get(0),"Maximum sequence is 16");
        assertEquals(20,result.get(1),"Maximum value is 20");
    }

    @Test
    @DisplayName("Return [-1,-1] When find the maximum subarray Given [-2,-3,-1,-4,-6]")
    void testWith3() {
        List<Integer> result = TheMaximumSubarray.with(List.of(-2,-3,-1,-4,-6));
        assertEquals(2,result.size(),"Size is 2");
        assertEquals(-1,result.get(0),"Maximum sequence is -1");
        assertEquals(-1,result.get(1),"Maximum value is -1");
    }


    @Test
    @DisplayName("Return 20 When get Sum All Values Bigger than Zero Given [-1,2,3,-4,5,10]")
    void test4() {
        int result = TheMaximumSubarray.sumAllValuesBiggerThanZero(List.of(-1, 2, 3, -4, 5, 10));
        assertEquals(20,result,"Maximum value is 20");
    }

    @Test
    @DisplayName("Return 0 When get Sum All Values Bigger than Zero Given [-1,-4]")
    void test5() {
        int result = TheMaximumSubarray.sumAllValuesBiggerThanZero(List.of(-1,-4));
        assertEquals(0,result,"Maximum value is -1");
    }

    @Test
    @DisplayName("Return 0 When get Sum All Values Bigger than Zero Given []")
    void test6() {
        int result = TheMaximumSubarray.sumAllValuesBiggerThanZero(Collections.emptyList());
        assertEquals(0,result,"Maximum value is 0");
    }

}