package br.com.guifr.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

    @Test
    @DisplayName("Return '[1,3,12,0,0]' When execute Given nums='[0,1,0,3,12]'")
    void test1() {
        int[] nums = {0,1,0,3,12};
        MoveZeroes.execute(nums);
        assertArrayEquals(new int[]{1,3,12,0,0},nums);
    }

    @Test
    @DisplayName("Return '[0]' When execute Given nums='[0]'")
    void test2() {
        int[] nums = {0};
        MoveZeroes.execute(nums);
        assertArrayEquals(new int[]{0},nums);
    }

    @Test
    @DisplayName("Return '[1,2,3,4,0]' When execute Given nums='[1,2,3,0,4]'")
    void test3() {
        int[] nums = {1,2,3,0,4};
        MoveZeroes.execute(nums);
        assertArrayEquals(new int[]{1,2,3,4,0},nums);
    }
}