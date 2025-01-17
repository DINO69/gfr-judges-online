package br.com.guifr.top75leetcodequestions.dynamicprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JumpGameTest {


    @Test
    @DisplayName("Return 'true' When JumpGame.canJump Given nums='[2,3,1,1,4]'")
    void test1() {
        int[] nums = new int[]{2,3,1,1,4};
        Assertions.assertTrue(JumpGame.canJump(nums));
    }

    @Test
    @DisplayName("Return 'false' When JumpGame.canJump Given nums='[3,2,1,0,4]'")
    void test2() {
        int[] nums = new int[]{3,2,1,0,4};
        Assertions.assertFalse(JumpGame.canJump(nums));
    }
    @Test
    @DisplayName("Return 'false' When JumpGame.canJump Given nums='[3,2,1,0,4]'")
    void test3() {
        int[] nums = new int[]{9997,9997,9996,9995,9994,9993,9992,9991,9990,9989,9988,9987
                ,9986,9985,9984,9983,9982,9981,10,9,8,7,6,5,4,3,2,1,0,0};
        Assertions.assertFalse(JumpGame.canJump(nums));
    }


}