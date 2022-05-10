package br.com.guifr.hackerrank.sorted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class CountingSortThreeTest {

    @Test
    @DisplayName("Return [0 1 3 4 5] When do countingsort and accumulate the start maxElement<5 position With [1 2 2 3 4]")
    public void test1() {

        List<Integer> actual = CountingSortThree.of(Arrays.asList(1,2,2,3,4)).withMaxElement(5);
        Assertions.assertEquals(5,actual.size(),"Size the result is 5");
        Assertions.assertEquals(0,actual.get(0),"0 appear 0 times");
        Assertions.assertEquals(1,actual.get(1),"1 appear 1 times ac=1");
        Assertions.assertEquals(3,actual.get(2),"2 appear 2 times ac=3");
        Assertions.assertEquals(4,actual.get(3),"3 appear 1 times ac=4");
        Assertions.assertEquals(5,actual.get(4),"4 appear 1 times ac=5");
    }

    @Test
    @DisplayName("Return [0 1 3 4 5 5 5] When do countingsort and accumulate the start maxElement<7 position With [1 2 2 3 4]")
    public void test2() {

        List<Integer> actual = CountingSortThree.of(Arrays.asList(1,2,2,3,4)).withMaxElement(7);
        Assertions.assertEquals(7,actual.size(),"Size the result is 5");
        Assertions.assertEquals(0,actual.get(0),"0 appear 0 times");
        Assertions.assertEquals(1,actual.get(1),"1 appear 1 times ac=1");
        Assertions.assertEquals(3,actual.get(2),"2 appear 2 times ac=3");
        Assertions.assertEquals(4,actual.get(3),"3 appear 1 times ac=4");
        Assertions.assertEquals(5,actual.get(4),"4 appear 1 times ac=5");
        Assertions.assertEquals(5,actual.get(5),"5 appear 0 times ac=5");
        Assertions.assertEquals(5,actual.get(6),"6 appear 0 times ac=5");
    }

    @Test
    @DisplayName("Return [0 1 3 4 5 5 5 6 6] When do countingsort and accumulate the start maxElement<9 position With [1 2 2 3 4 7]")
    public void test3() {

        List<Integer> actual = CountingSortThree.of(Arrays.asList(1,2,2,3,4,7)).withMaxElement(9);
        Assertions.assertEquals(9,actual.size(),"Size the result is 5");
        Assertions.assertEquals(0,actual.get(0),"0 appear 0 times");
        Assertions.assertEquals(1,actual.get(1),"1 appear 1 times ac=1");
        Assertions.assertEquals(3,actual.get(2),"2 appear 2 times ac=3");
        Assertions.assertEquals(4,actual.get(3),"3 appear 1 times ac=4");
        Assertions.assertEquals(5,actual.get(4),"4 appear 1 times ac=5");
        Assertions.assertEquals(5,actual.get(5),"5 appear 0 times ac=5");
        Assertions.assertEquals(5,actual.get(6),"6 appear 0 times ac=5");
        Assertions.assertEquals(6,actual.get(7),"7 appear 1 times ac=6");
        Assertions.assertEquals(6,actual.get(8),"8 appear 0 times ac=6");
    }

    @Test
    @DisplayName("Return '0 1 3 4 5 5 5 6 6' When format list to print With [0 1 3 4 5 5 5 6 6]")
    public void testFormat3() {
        Assertions.assertEquals("0 1 3 4 5 5 5 6 6",CountingSortThree.formattingToPrint(Arrays.asList(0,1,3,4,5,5,5,6,6)));
    }

}