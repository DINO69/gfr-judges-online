package br.com.guifr.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    @Test
    @DisplayName("Return 49 When maxArea Given [1,8,6,2,5,4,8,3,7]")
    void test1() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxArea = containerWithMostWater.maxArea(height);
        assertEquals(49, maxArea);
    }
    @Test
    @DisplayName("Return 1 When maxArea Given [1,1]")
    void test2() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] height = {1,1};
        int maxArea = containerWithMostWater.maxArea(height);
        assertEquals(1, maxArea);
    }

    @Test
    @DisplayName("Return 49 When maxAreaOn Given [1,8,6,2,5,4,8,3,7]")
    void test12() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxArea = containerWithMostWater.maxAreaOn(height);
        assertEquals(49, maxArea);
    }
    @Test
    @DisplayName("Return 1 When maxAreaOn Given [1,1]")
    void test22() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] height = {1,1};
        int maxArea = containerWithMostWater.maxAreaOn(height);
        assertEquals(1, maxArea);
    }

    @Test
    @DisplayName("Return 36 When maxAreaOn Given [2,3,10,5,7,8,9]")
    void test31() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] height = {2,3,10,5,7,8,9};
        int maxArea = containerWithMostWater.maxArea(height);
        assertEquals(36, maxArea);
    }
    @Test
    @DisplayName("Return 36 When maxAreaOn Given [2,3,10,5,7,8,9]")
    void test3() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] height = {2,3,10,5,7,8,9};
        int maxArea = containerWithMostWater.maxAreaextremities(height);
        assertEquals(36, maxArea);
    }

    @Test
    @DisplayName("Return 36 When maxAreaOn Given [2,3,10,5,7,8,9]")
    void test33() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] height = {2,3,10,5,7,8,9};
        int maxArea = containerWithMostWater.maxAreaextremities(height);
        assertEquals(36, maxArea);
    }


}