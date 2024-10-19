package br.com.guifr.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanPlaceFlowersTest {

    @Test
    @DisplayName("Return true When canPlantFlowers Given a = [1,0,0,0,1], n = 1")
    void test1() {
        int[] a = {1,0,0,0,1};
        int n = 1;
        boolean result = CanPlaceFlowers.canPlantFlowers(a, n);
        assertTrue(result);
    }

    @Test
    @DisplayName("Return false When canPlantFlowers Given a = [1,0,0,0,1], n = 2")
    void test2() {
        int[] a = {1,0,0,0,1};
        int n = 2;
        boolean result = CanPlaceFlowers.canPlantFlowers(a, n);
        assertFalse(result);
    }

    @Test
    @DisplayName("Return true When canPlantFlowers Given a = [0,0,1,0,1], n = 1")
    void test3() {
        int[] a = {0,0,1,0,1};
        int n = 1;
        boolean result = CanPlaceFlowers.canPlantFlowers(a, n);
        assertTrue(result);
    }
}