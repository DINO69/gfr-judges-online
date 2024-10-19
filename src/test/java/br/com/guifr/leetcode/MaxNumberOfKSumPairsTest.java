package br.com.guifr.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumberOfKSumPairsTest {

    @Test
    @DisplayName("Return 2 When maxOperations(int[] nums, int k) Given nums = [1,2,3,4], k = 5")
    void test1() {
        int[] nums = {1,2,3,4};
        int k = 5;
        int result = MaxNumberOfKSumPairs.maxOperations(nums, k);
        assertEquals(2, result);

    }

    @Test
    @DisplayName("Return 1 When maxOperations(int[] nums, int k) Given nums = [3,1,3,4,3], k = 6")
    void test2() {
        int[] nums = {3,1,3,4,3};
        int k = 6;
        int result = MaxNumberOfKSumPairs.maxOperations(nums, k);
        assertEquals(1, result);
    }
    @Test
    @DisplayName("Return 2 When maxOperations(int[] nums, int k) Given nums = [4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4], k = 2")
    void test3() {
        int[] nums = {4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
        int k = 2;
        int result = MaxNumberOfKSumPairs.maxOperations(nums, k);
        assertEquals(2, result);
    }

    @Test
    @DisplayName("Return 2 When maxOperationsWithSort(int[] nums, int k) Given nums = [1,2,3,4], k = 5")
    void test11() {
        int[] nums = {1,2,3,4};
        int k = 5;
        int result = MaxNumberOfKSumPairs.maxOperationsWithSort(nums, k);
        assertEquals(2, result);

    }

    @Test
    @DisplayName("Return 1 When maxOperationsWithSort(int[] nums, int k) Given nums = [3,1,3,4,3], k = 6")
    void test21() {
        int[] nums = {3,1,3,4,3};
        int k = 6;
        int result = MaxNumberOfKSumPairs.maxOperationsWithSort(nums, k);
        assertEquals(1, result);
    }
    @Test
    @DisplayName("Return 2 When maxOperationsWithSort(int[] nums, int k) Given nums = [4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4], k = 2")
    void test31() {
        int[] nums = {4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
        int k = 2;
        int result = MaxNumberOfKSumPairs.maxOperationsWithSort(nums, k);
        assertEquals(2, result);
    }

}