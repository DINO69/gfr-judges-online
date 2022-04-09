package br.com.guifr.hackerrank;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumSwaps2Test {

    @Test
    @DisplayName("Return 5 when count swap for put ascending order array 7 1 3 2 4 5 6")
    public void test1(){
        int actual = MinimumSwaps2.swapAscendingOrder(new int[]{7,1,3,2,4,5,6});
        assertEquals(5,actual);
    }

    @Test
    @DisplayName("Return 3 when count swap for put ascending order array 4 3 1 2")
    public void test2(){
        int actual = MinimumSwaps2.swapAscendingOrder(new int[]{4,3,1,2});
        assertEquals(3,actual);
    }

    @Test
    @DisplayName("Return 3 when count swap for put ascending order array 2 3 4 1 5")
    public void test3(){
        int actual = MinimumSwaps2.swapAscendingOrder(new int[]{2,3,4,1,5});
        assertEquals(3,actual);
    }

    @Test
    @DisplayName("Return 3 when count swap for put ascending order array 1 3 5 2 4 6 7")
    public void test4(){
        int actual = MinimumSwaps2.swapAscendingOrder(new int[]{1,3,5,2,4,6,7});
        assertEquals(3,actual);
    }

}