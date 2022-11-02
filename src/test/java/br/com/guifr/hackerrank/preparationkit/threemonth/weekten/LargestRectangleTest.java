package br.com.guifr.hackerrank.preparationkit.threemonth.weekten;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class LargestRectangleTest {

    @Test
    @DisplayName("Return 9 When find the best solution for building the shopping Given [1,2,3,4,5]")
    void test1() {
        List<Integer> buildings = Arrays.asList(1,2,3,4,5);
        Assertions.assertEquals(9,LargestRectangle.buildingIn(buildings));
    }

    @Test
    @DisplayName("Return 6 When find the best solution for building the shopping Given [3,2,3]")
    void test2() {
        List<Integer> buildings = Arrays.asList(3,2,3);
        Assertions.assertEquals(6,LargestRectangle.buildingIn(buildings));
    }

    @Test
    @DisplayName("Return 15 When find the best solution for building the shopping Given [3,3,3,3,3]")
    void test3() {
        List<Integer> buildings = Arrays.asList(3,3,3,3,3);
        Assertions.assertEquals(15,LargestRectangle.buildingIn(buildings));
    }

    @Test
    @DisplayName("Return 9 When find the best solution with buildingInBestRange for building the shopping Given [1,2,3,4,5]")
    void test4() {
        List<Integer> buildings = Arrays.asList(1,2,3,4,5);
        Assertions.assertEquals(9,LargestRectangle.buildingInBestRange(buildings));
    }

    @Test
    @DisplayName("Return 6 When find the best solution with buildingInBestRange for building the shopping Given [3,2,3]")
    void test5() {
        List<Integer> buildings = Arrays.asList(3,2,3);
        Assertions.assertEquals(6,LargestRectangle.buildingInBestRange(buildings));
    }

    @Test
    @DisplayName("Return 15 When find the best solution with buildingInBestRange for building the shopping Given [3,3,3,3,3]")
    void test6() {
        List<Integer> buildings = Arrays.asList(3,3,3,3,3);
        Assertions.assertEquals(15,LargestRectangle.buildingInBestRange(buildings));
    }
}