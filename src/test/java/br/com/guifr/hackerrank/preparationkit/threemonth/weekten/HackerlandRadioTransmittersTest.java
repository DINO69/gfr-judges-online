package br.com.guifr.hackerrank.preparationkit.threemonth.weekten;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class HackerlandRadioTransmittersTest {

    @Test
    @DisplayName("Return 3 When calculeted how many tower need install Given [1,2,3,5,9] distanceEach=1")
    void test1() {
        List<Integer> houses = Arrays.asList(1,2,3,5,9);
        int distanceEachTower = 1;
        int result = HackerlandRadioTransmitters.howManyTowersHaveIn(houses,distanceEachTower);
        Assertions.assertEquals(3,result);
    }

    @Test
    @DisplayName("Return 2 When calculeted how many tower need install Given [1,2,3,4,5] distanceEach=1")
    void test2() {
        List<Integer> houses = Arrays.asList(1,2,3,4,5);
        int distanceEachTower = 1;
        int result = HackerlandRadioTransmitters.howManyTowersHaveIn(houses,distanceEachTower);
        Assertions.assertEquals(2,result);
    }

    @Test
    @DisplayName("Return 3 When calculeted how many tower need install Given [7,2,4,6,5,9,12,11] distanceEach=2")
    void test3() {
        List<Integer> houses = Arrays.asList(7,2,4,6,5,9,12,11);
        int distanceEachTower = 2;
        int result = HackerlandRadioTransmitters.howManyTowersHaveIn(houses,distanceEachTower);
        Assertions.assertEquals(3,result);
    }

    @Test
    @DisplayName("Return 2 When calculeted how many tower need install Given [1,2,7,6] distanceEach=1")
    void test4() {
        List<Integer> houses = Arrays.asList(1,2,7,6);
        int distanceEachTower = 1;
        int result = HackerlandRadioTransmitters.howManyTowersHaveIn(houses,distanceEachTower);
        Assertions.assertEquals(2,result);
    }

    @Test
    @DisplayName("Return 2 When calculeted how many tower need install Given [1,2,7] distanceEach=1")
    void test5() {
        List<Integer> houses = Arrays.asList(1,2,7);
        int distanceEachTower = 1;
        int result = HackerlandRadioTransmitters.howManyTowersHaveIn(houses,distanceEachTower);
        Assertions.assertEquals(2,result);
    }

    @Test
    @DisplayName("Return 4 When calculeted how many tower need install Given [9,5,4,2,6,15,12] distanceEach=2")
    void test6() {
        List<Integer> houses = Arrays.asList(9,5,4,2,6,15,12);
        int distanceEachTower = 2;
        int result = HackerlandRadioTransmitters.howManyTowersHaveIn(houses,distanceEachTower);
        Assertions.assertEquals(4,result);
    }

}