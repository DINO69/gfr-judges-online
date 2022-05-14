package br.com.guifr.hackerrank.preparationkit.threemonth.weektwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class LonelyIntegerTest {

    @Test
    @DisplayName("Return 4 When find the number lonely With [1,2,3,4,3,2,1]")
    public void test() {
        int actual = LonelyInteger.in(Arrays.asList(1,2,3,4,3,2,1));
        Assertions.assertEquals(4,actual);
    }

    @Test
    @DisplayName("Return 5 When find the number lonely With [1,2,3,4,3,2,1,4,5]")
    public void test1() {
        int actual = LonelyInteger.in(Arrays.asList(1,2,3,4,3,2,1,4,5));
        Assertions.assertEquals(5,actual);
    }

    @Test
    @DisplayName("Return 7 When find the number lonely With [8,9,30,40,30,9,8,40,7]")
    public void test2() {
        int actual = LonelyInteger.in(Arrays.asList(8,9,30,40,30,9,8,40,7));
        Assertions.assertEquals(7,actual);
    }

    @Test
    @DisplayName("Return 4 When find the number lonely using map With [1,2,3,4,3,2,1]")
    public void testWithMap() {
        int actual = LonelyInteger.inWithMap(Arrays.asList(1,2,3,4,3,2,1));
        Assertions.assertEquals(4,actual);
    }

    @Test
    @DisplayName("Return 5 When find the number lonely using map With [1,2,3,4,3,2,1,4,5]")
    public void testWithMap1() {
        int actual = LonelyInteger.inWithMap(Arrays.asList(1,2,3,4,3,2,1,4,5));
        Assertions.assertEquals(5,actual);
    }

    @Test
    @DisplayName("Return 7 When find the number lonely using map With [8,9,30,40,30,9,8,40,7]")
    public void testWithMap2() {
        int actual = LonelyInteger.inWithMap(Arrays.asList(8,9,30,40,30,9,8,40,7));
        Assertions.assertEquals(7,actual);
    }
}