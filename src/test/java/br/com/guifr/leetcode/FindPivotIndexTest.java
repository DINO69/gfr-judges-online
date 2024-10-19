package br.com.guifr.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPivotIndexTest {

    @Test
    @DisplayName("Return 3 When call pivotIndex Given nums = [1,7,3,6,5,6]")
    void test1() {
        FindPivotIndex findPivotIndex = new FindPivotIndex();
        int[] nums = {1,7,3,6,5,6};
        int result = findPivotIndex.pivotIndex(nums);
        assertEquals(3, result);
    }

    @Test
    @DisplayName("Return -1 When call pivotIndex Given nums = [1,2,3]")
    void test2() {
        FindPivotIndex findPivotIndex = new FindPivotIndex();
        int[] nums = {1,2,3};
        int result = findPivotIndex.pivotIndex(nums);
        assertEquals(-1, result);
    }

    @Test
    @DisplayName("Return 0 When call pivotIndex Given nums=[2,1,-1]")
    void test3() {
        FindPivotIndex findPivotIndex = new FindPivotIndex();
        int[] nums = {2,1,-1};
        int result = findPivotIndex.pivotIndex(nums);
        assertEquals(0, result);
    }


    @Test
    @DisplayName("Return 2 When call pivotIndex Given nums = [-1,-1,-1,-1,-1,0]")
    void test4() {
        FindPivotIndex findPivotIndex = new FindPivotIndex();
        int[] nums = {-1,-1,-1,-1,-1,0};
        int result = findPivotIndex.pivotIndex(nums);
        assertEquals(2, result);
    }
    @Test
    @DisplayName("Return -1 When call pivotIndex Given nums = [-1,-1,-1,-1,-1,-1]")
    void test5() {
        FindPivotIndex findPivotIndex = new FindPivotIndex();
        int[] nums = {-1,-1,-1,-1,-1,-1};
        int result = findPivotIndex.pivotIndex(nums);
        assertEquals(-1, result);
    }
}