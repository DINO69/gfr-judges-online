package br.com.guifr.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncreasingTripletSubsequenceTest {

    @Test
    @DisplayName("Return true When process Given nums='[1,2,3,4,5]'")
    void test1() {
        int[] nums = {1,2,3,4,5};
        boolean result = IncreasingTripletSubsequence.process(nums);
        assertTrue(result);
    }

    @Test
    @DisplayName("Return false When process Given nums='[5,4,3,2,1]'")
    void test2() {
        int[] nums = {5,4,3,2,1};
        boolean result = IncreasingTripletSubsequence.process(nums);
        assertFalse(result);
    }

    @Test
    @DisplayName("Return true When process Given nums='[2,1,5,0,4,6]'")
    void test3() {
        int[] nums = {2,1,5,0,4,6};
        boolean result = IncreasingTripletSubsequence.process(nums);
        assertTrue(result);
    }



}