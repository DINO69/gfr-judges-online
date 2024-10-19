package br.com.guifr.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnesIIITest {

    @Test
    @DisplayName("Return 6 When longestOnes(...) Given nums=[1,1,1,0,0,0,1,1,1,1,0], k = 2")
    void test1() {
        MaxConsecutiveOnesIII maxConsecutiveOnesIII = new MaxConsecutiveOnesIII();
        assertEquals(6, maxConsecutiveOnesIII.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));
    }

    @Test
    @DisplayName("Return 10 When longestOnes(...) Given [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3")
    void test2() {
        MaxConsecutiveOnesIII maxConsecutiveOnesIII = new MaxConsecutiveOnesIII();
        assertEquals(10, maxConsecutiveOnesIII.longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));
    }

}