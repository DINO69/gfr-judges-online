package br.com.guifr.hackerrank;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalesByMatchTest {

    @Test
    @DisplayName("Return 3 When the pile of sock is 10 20 20 10 10 30 50 10 20")
    public void test1(){
        int actual = SalesByMatch.of(Arrays.asList(10,20,20,10,10,30,50,10,20));
        assertEquals(3,actual);
    }

    @Test
    @DisplayName("Return 1 When the pile of sock is 10 20 20")
    public void test2(){
        int actual = SalesByMatch.of(Arrays.asList(10,20,20));
        assertEquals(1,actual);
    }

    @Test
    @DisplayName("Return 2 When the pile of sock is 10 20 20 10")
    public void test3(){
        int actual = SalesByMatch.of(Arrays.asList(10,20,20, 10));
        assertEquals(2,actual);
    }

    @Test
    @DisplayName("Return 4 When the pile of sock is 1 1 3 1 2 1 3 3 3 3")
    public void test4(){
        int actual = SalesByMatch.of(Arrays.asList(1,1,3,1,2,1,3,3,3,3));
        assertEquals(4,actual);
    }

}