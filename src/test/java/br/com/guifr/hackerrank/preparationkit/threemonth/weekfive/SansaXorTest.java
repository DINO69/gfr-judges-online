package br.com.guifr.hackerrank.preparationkit.threemonth.weekfive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SansaXorTest {

    @Test
    @DisplayName("Return 6 When calculate sansaXor With [3,4,5]")
    public void test1() {
        Assertions.assertEquals(6,SansaXor.with(Arrays.asList(3,4,5)));
    }

    @Test
    @DisplayName("Return 2 When calculate sansaXor With [1,2,3]")
    public void test2() {
        Assertions.assertEquals(2,SansaXor.with(Arrays.asList(1,2,3)));
    }

    @Test
    @DisplayName("Return 0 When calculate sansaXor With [4,5,7,5]")
    public void test3() {
        Assertions.assertEquals(0,SansaXor.with(Arrays.asList(4,5,7,5)));
    }

    @Test
    @DisplayName("Return 110 When calculate sansaXor With [98 74 12]")
    public void test4() {
        Assertions.assertEquals(110,SansaXor.with(Arrays.asList(98,74,12)));
    }

    @Test
    @DisplayName("Return 48 When calculate sansaXor With [50 13 2]")
    public void test5() {
        Assertions.assertEquals(48,SansaXor.with(Arrays.asList(50,13,2)));
    }

}