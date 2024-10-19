package br.com.guifr.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductArrayExceptSelfTest {

    @Test
    @DisplayName("Return '[24,12,8,6]' When productExceptSelf Given nums=[1,2,3,4]")
    void test1() {
        int[] nums = {1,2,3,4};
        int[] result = ProductArrayExceptSelf.myProductExceptSelf(nums);
        assertArrayEquals(new int[]{24,12,8,6},result);
    }

    @Test
    @DisplayName("Return '[0,0,9,0,0]' When productExceptSelf Given nums=[-1,1,0,-3,3]")
    void test2() {
        int[] nums = {-1,1,0,-3,3};
        int[] result = ProductArrayExceptSelf.myProductExceptSelf(nums);
        assertArrayEquals(new int[]{0,0,9,0,0},result);
    }

    @Test
    @DisplayName("Return '[24,12,8,6]' When productExceptSelfOn Given nums=[1,2,3,4]")
    void test1On() {
        int[] nums = {1,2,3,4};
        int[] result = ProductArrayExceptSelf.productExceptSelfOn(nums);
        assertArrayEquals(new int[]{24,12,8,6},result);
    }

    @Test
    @DisplayName("Return '[0,0,9,0,0]' When productExceptSelfOn Given nums=[-1,1,0,-3,3]")
    void test2On() {
        int[] nums = {-1,1,0,-3,3};
        int[] result = ProductArrayExceptSelf.productExceptSelfOn(nums);
        assertArrayEquals(new int[]{0,0,9,0,0},result);
    }

    @Test
    @DisplayName("Return '[0,1]' When productExceptSelfOn Given nums=[1,0]")
    void test3On() {
        int[] nums = {1,0};
        int[] result = ProductArrayExceptSelf.productExceptSelfOn(nums);
        assertArrayEquals(new int[]{0,1},result);
    }

    @Test
    @DisplayName("Return '[0,0,8,0]' When productExceptSelfOn Given nums=[1,2,0,4]")
    void test4On() {
        int[] nums = {1,2,0,4};
        int[] result = ProductArrayExceptSelf.productExceptSelfOn(nums);
        assertArrayEquals(new int[]{0,0,8,0},result);
    }

    @Test
    @DisplayName("Return '[0,0,0,0]' When productExceptSelfOn Given nums=[0,2,0,4]")
    void test5On() {
        int[] nums = {0,2,0,4};
        int[] result = ProductArrayExceptSelf.productExceptSelfOn(nums);
        assertArrayEquals(new int[]{0,0,0,0},result);
    }

    @Test
    @DisplayName("Return '[0,0,0,0,0]' When productExceptSelfOn Given nums=[1,2,0,0,4]")
    void test6On() {
        int[] nums = {1,2,0,0,4};
        int[] result = ProductArrayExceptSelf.productExceptSelfOn(nums);
        assertArrayEquals(new int[]{0,0,0,0,0},result);
    }

}