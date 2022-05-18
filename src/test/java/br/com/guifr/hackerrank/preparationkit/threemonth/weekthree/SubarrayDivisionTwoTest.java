package br.com.guifr.hackerrank.preparationkit.threemonth.weekthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SubarrayDivisionTwoTest {

    @Test
    @DisplayName("Return 2 When share a contiguous segment With d=4 m=2")
    public void test1() {
        int d = 4;
        int m = 2;
        List<Integer> arr = Arrays.asList(2,2,1,3,2);
        int actual = SubarrayDivisionTwo.birthday(arr,d,m);
        Assertions.assertEquals(2,actual);
    }

    @Test
    @DisplayName("Return 2 When share a contiguous segment With d=3 m=2")
    public void test2() {
        int d = 3;
        int m = 2;
        List<Integer> arr = Arrays.asList(1,2,1,3,2);
        int actual = SubarrayDivisionTwo.birthday(arr,d,m);
        Assertions.assertEquals(2,actual);
    }

    @Test
    @DisplayName("Return 1 When share a contiguous segment With d=4 m=1")
    public void test3() {
        int d = 4;
        int m = 1;
        List<Integer> arr = Arrays.asList(4);
        int actual = SubarrayDivisionTwo.birthday(arr,d,m);
        Assertions.assertEquals(1,actual);
    }

    @Test
    @DisplayName("Return 0 When share a contiguous segment With d=3 m=2")
    public void test4() {
        int d = 3;
        int m = 2;
        List<Integer> arr = Arrays.asList(1,1,1,1,1,1);
        int actual = SubarrayDivisionTwo.birthday(arr,d,m);
        Assertions.assertEquals(0,actual);
    }

}