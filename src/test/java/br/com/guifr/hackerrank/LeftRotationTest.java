package br.com.guifr.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class LeftRotationTest {

    @Test
    @DisplayName("Return 51234 when rotate 4 times the array 12345")
    public void test1(){

        List<Integer> actual = LeftRotation.rotateLeft(4, Arrays.asList(1,2,3,4,5));
        Assertions.assertAll(() -> {
            Assertions.assertEquals(5,actual.get(0));
            Assertions.assertEquals(4,actual.get(4));
            Assumptions.assumeTrue(Arrays.asList(5,1,2,3,4).equals(actual));
        });
    }


    @Test
    @DisplayName("Return 231 when rotate 1 times the array 123")
    public void test2(){

        List<Integer> actual = LeftRotation.rotateLeft(1, Arrays.asList(1,2,3));
        Assertions.assertAll(() -> {
            Assertions.assertEquals(2,actual.get(0));
            Assertions.assertEquals(1,actual.get(2));
            Assumptions.assumeTrue(Arrays.asList(2,3,1).equals(actual));
        });
    }


}