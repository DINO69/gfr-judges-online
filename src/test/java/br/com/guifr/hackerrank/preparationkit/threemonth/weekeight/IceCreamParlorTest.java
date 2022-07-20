package br.com.guifr.hackerrank.preparationkit.threemonth.weekeight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


class IceCreamParlorTest {

    @Test
    @DisplayName("Return [1,4] When but icre cream spend all Given they have 6 in [1,3,4,5,6]")
    void test1() {
        List<Integer> result = IceCreamParlor.givenTwoFlavorsSpendAll(6, Arrays.asList(1,3,4,5,6));
        Assertions.assertEquals(2,result.size());
        Assertions.assertEquals(1,result.get(0),"the first position ice is 1");
        Assertions.assertEquals(4,result.get(1),"the second position ice is 4");
    }

    @Test
    @DisplayName("Return [1,4] When but ice cream spend all Given they have 4 in [1,4,5,3,2]")
    void test2() {
        List<Integer> result = IceCreamParlor.givenTwoFlavorsSpendAll(4, Arrays.asList(1,4,5,3,2));
        Assertions.assertEquals(2,result.size());
        Assertions.assertEquals(1,result.get(0),"the first position ice is 1");
        Assertions.assertEquals(4,result.get(1),"the second position ice is 4");
    }

    @Test
    @DisplayName("Return [1,2] When but ice cream spend all Given they have 4 in [2,2,4,3]")
    void test3() {
        List<Integer> result = IceCreamParlor.givenTwoFlavorsSpendAll(4, Arrays.asList(2,2,4,3));
        Assertions.assertEquals(2,result.size());
        Assertions.assertEquals(1,result.get(0),"the first position ice is 1");
        Assertions.assertEquals(2,result.get(1),"the second position ice is 2");
    }

}