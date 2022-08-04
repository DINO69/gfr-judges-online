package br.com.guifr.hackerrank.preparationkit.threemonth.weeknine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


class WaiterTest {

    @Test
    @DisplayName("Return [2,4,6,3,5,7] when separete the plates with a=[2,3,4,5,6,7] q=3")
    void test1() {

        List<Integer> result = Waiter.with(Arrays.asList(2,3,4,5,6,7),3);
        Assertions.assertEquals(6,result.size(),"Size is 6");
        Assertions.assertEquals(2,result.get(0),"position[0]=2");
        Assertions.assertEquals(4,result.get(1),"position[1]=4");
        Assertions.assertEquals(6,result.get(2),"position[2]=6");
        Assertions.assertEquals(3,result.get(3),"position[3]=3");
        Assertions.assertEquals(5,result.get(4),"position[4]=5");
        Assertions.assertEquals(7,result.get(5),"position[5]=7");

    }

    @Test
    @DisplayName("Return [4,6,3,7,5] when separete the plates with a=[3,4,7,6,5] q=1")
    void test2() {

        List<Integer> result = Waiter.with(Arrays.asList(3,4,7,6,5),1);
        Assertions.assertEquals(5,result.size(),"Size is 5");
        Assertions.assertEquals(4,result.get(0),"position[0]=4");
        Assertions.assertEquals(6,result.get(1),"position[1]=6");
        Assertions.assertEquals(3,result.get(2),"position[2]=3");
        Assertions.assertEquals(7,result.get(3),"position[3]=7");
        Assertions.assertEquals(5,result.get(4),"position[4]=5");

    }

    @Test
    @DisplayName("Return 19 when get next number prime Given index = 7")
    void testNumberPrime() {
        Assertions.assertEquals(19,Waiter.getNumberPrime(7));
    }

    @Test
    @DisplayName("Return 31 when get next number prime Given index = 10")
    void testNumberPrime2() {
        Assertions.assertEquals(31,Waiter.getNumberPrime(10));
    }

    @Test
    @DisplayName("Return 9739 when get next number prime Given index = 1200")
    void testNumberPrime3() {
        Assertions.assertEquals(9739,Waiter.getNumberPrime(1200));
    }
}