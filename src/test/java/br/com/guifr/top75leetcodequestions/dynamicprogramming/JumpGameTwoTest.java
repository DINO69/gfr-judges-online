package br.com.guifr.top75leetcodequestions.dynamicprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JumpGameTwoTest {

    @Test
    @DisplayName("Return 2 When JumpGameTwo.jump Given nums='[2,3,1,1,4]'")
    void teste1() {
        int[] nums = new int[]{2,3,1,1,4};
        Assertions.assertEquals(2,JumpGameTwo.jump(nums));
    }

    @Test
    @DisplayName("Return 2 When JumpGameTwo.jump Given nums='[2,3,0,1,4]'")
    void teste2() {
        int[] nums = new int[]{2,3,0,1,4};
        Assertions.assertEquals(2,JumpGameTwo.jump(nums));
    }
    @Test
    @DisplayName("Return 0 When JumpGameTwo.jump Given nums='3,2,1,0,4'")
    void teste3() {
        int[] nums = new int[]{3,2,1,0,4};
        Assertions.assertEquals(0,JumpGameTwo.jump(nums));
    }

    @Test
    @DisplayName("Return 3 When JumpGameTwo.jump Given nums='[5,9,3,2,1,0,2,3,3,1,0,0]'")
    void teste4() {
        int[] nums = new int[]{5,9,3,2,1,0,2,3,3,1,0,0};
        Assertions.assertEquals(3,JumpGameTwo.jump(nums));
    }

}