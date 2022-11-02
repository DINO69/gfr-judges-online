package br.com.guifr.hackerrank.preparationkit.threemonth.weekten;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class JesseAndCookiesTest {

    @Test
    @DisplayName("Return 4 When combined cookies until all sweetness > k Given k=9 [2,7,3,6,4,6]")
    void test1() {
        int k = 9;
        List<Integer> cookies = Arrays.asList(2,7,3,6,4,6);
        int result = JesseAndCookies.combined(cookies,k);
        Assertions.assertEquals(4,result);
    }

    @Test
    @DisplayName("Return 2 When combined cookies until all sweetness > k Given k=7 [1,2,3,9,10,12]")
    void test2() {
        int k = 7;
        List<Integer> cookies = Arrays.asList(1,2,3,9,10,12);
        int result = JesseAndCookies.combined(cookies,k);
        Assertions.assertEquals(2,result);
    }

    @Test
    @DisplayName("Return -1 When impossible combined cookies until all sweetness > k Given k=200 [1,2,3,9,10,12]")
    void test3() {
        int k = 200;
        List<Integer> cookies = Arrays.asList(1,2,3,9,10,12);
        int result = JesseAndCookies.combined(cookies,k);
        Assertions.assertEquals(-1,result);
    }
}