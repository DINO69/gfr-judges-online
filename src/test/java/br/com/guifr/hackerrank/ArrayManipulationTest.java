package br.com.guifr.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ArrayManipulationTest {

    @Test
    @DisplayName("Return 200 when search maximum value in arrayManipulation with [1 2 100],[2 5 100],[3 4 100] and n = 5")
    public void test1(){

        long actual = ArrayManipulation.of(Arrays.asList(Arrays.asList(1,2,100),
                                            Arrays.asList(2,5,100),
                                                Arrays.asList(3,4,100))).maximumValue(5);
        Assertions.assertEquals(200L,actual);
    }

    @Test
    @DisplayName("Return 10 when search maximum value in arrayManipulation with [1 5 3],[4 8 7],[6 9 1] and n = 10")
    public void test2(){

        long actual = ArrayManipulation.of(Arrays.asList(Arrays.asList(1,5,3),
                                            Arrays.asList(4,8,7),
                                            Arrays.asList(6,9,1)))
                .maximumValue(10);
        Assertions.assertEquals(10L,actual);
    }

    @Test
    @DisplayName("Return 31 when search maximum value in arrayManipulation with " +
            "[2 6 8]" +
            "[3 5 7]" +
            "[1 8 1]" +
            "[5 9 15] and n = 10")
    public void test3(){

        long actual = ArrayManipulation.of(Arrays.asList(
                Arrays.asList(2,6,8),
                Arrays.asList(3,5,7),
                Arrays.asList(1,8,1),
                Arrays.asList(5,9,15)
        ))
                .maximumValue(10);
        Assertions.assertEquals(31L,actual);
    }

    @Test
    @DisplayName("Return 882 when search maximum value in arrayManipulation with " +
            "[2 3 603]" +
            "[1 1 286]" +
            "[4 4 882] and n = 4")
    public void test4(){

        long actual = ArrayManipulation.of(Arrays.asList(
                Arrays.asList(2,3,603),
                Arrays.asList(1,1,286),
                Arrays.asList(4,4,882)
        ))
                .maximumValue(4);
        Assertions.assertEquals(882L,actual);
    }

}