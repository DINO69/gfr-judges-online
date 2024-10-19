package br.com.guifr.hackerrank.preparationkit.threemonth.weekthirteen;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JourneyToTheMoonTest {

    @Test
    @DisplayName("Return 6 When journeyToMoon Given n=5 List.of(List.of(0,1),List.of(2,3),List.of(0,4))")
    void test1() {
        int n = 5;
        long result = JourneyToTheMoon.journeyToMoon(n, List.of(List.of(0,1),List.of(2,3), List.of(0,4)));
        assertEquals(6,result);
    }
    @Test
    @DisplayName("Return 3 When journeyToMoon Given n=4 List.of(List.of(1,2),List.of(2,3))")
    void test2() {
        int n = 4;
        long result = JourneyToTheMoon.journeyToMoon(n, List.of(List.of(1,2),List.of(2,3)));
        assertEquals(3,result);
    }
    @Test
    @DisplayName("Return 5 When journeyToMoon Given n=4 List.of(List.of(1,2))")
    void test3() {
        int n = 4;
        long result = JourneyToTheMoon.journeyToMoon(n, List.of(List.of(1,2)));
        assertEquals(5,result);
    }
    @Test
    @DisplayName("Return 4999949998L When journeyToMoon Given n=4 List.of(List.of(1,2),List.of(3,4))")
    void test4() {
        int n = 100000;
        long result = JourneyToTheMoon.journeyToMoon(n, List.of(List.of(1,2),List.of(3,4)));
        assertEquals(4999949998L,result);
    }

}