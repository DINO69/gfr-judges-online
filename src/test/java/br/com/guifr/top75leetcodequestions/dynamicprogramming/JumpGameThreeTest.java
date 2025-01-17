package br.com.guifr.top75leetcodequestions.dynamicprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameThreeTest {


    @Test
    @DisplayName("Return true When JumpGameThree.canReach Given arr = [4,2,3,0,3,1,2], start = 5")
    void test() {
        int start = 5;
        int[] arr = new int[]{4,2,3,0,3,1,2};
        Assertions.assertTrue(JumpGameThree.canReach(arr,start));
    }

    @Test
    @DisplayName("Return true When JumpGameThree.canReach Given arr = [4,2,3,0,3,1,2], start = 0")
    void test1() {
        int start = 0;
        int[] arr = new int[]{4,2,3,0,3,1,2};
        Assertions.assertTrue(JumpGameThree.canReach(arr,start));
    }

    @Test
    @DisplayName("Return false When JumpGameThree.canReach Given arr = [3,0,2,1,2], start = 2")
    void test2() {
        int start = 2;
        int[] arr = new int[]{3,0,2,1,2};
        Assertions.assertFalse(JumpGameThree.canReach(arr,start));
    }

    @Test
    @DisplayName("Return true When JumpGameThree.canReach Given arr = [3,0,2,1,2], start = 1")
    void test3() {
        int start = 1;
        int[] arr = new int[]{3,0,2,1,2};
        Assertions.assertTrue(JumpGameThree.canReach(arr,start));
    }

}