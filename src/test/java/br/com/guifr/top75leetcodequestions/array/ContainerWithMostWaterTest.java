package br.com.guifr.top75leetcodequestions.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {


    @Test
    @DisplayName("Return 49 When ContainerWithMostWater.maxArea Given height = [1,8,6,2,5,4,8,3,7]")
    void test1() {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        Assertions.assertEquals(49,ContainerWithMostWater.maxArea(height));
    }

    @Test
    @DisplayName("Return 1 When ContainerWithMostWater.maxArea Given height = [1,1]")
    void test2() {
        int[] height = new int[]{1,1};
        Assertions.assertEquals(1,ContainerWithMostWater.maxArea(height));
    }

    @Test
    @DisplayName("Return 49 When ContainerWithMostWater.maxArea Given height = [1,8,6,2,5,4,8,3,7]")
    void test3() {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        Assertions.assertEquals(49,ContainerWithMostWater.maxArea2(height));
    }

    @Test
    @DisplayName("Return 1 When ContainerWithMostWater.maxArea Given height = [1,1]")
    void test4() {
        int[] height = new int[]{1,1};
        Assertions.assertEquals(1,ContainerWithMostWater.maxArea2(height));
    }


}