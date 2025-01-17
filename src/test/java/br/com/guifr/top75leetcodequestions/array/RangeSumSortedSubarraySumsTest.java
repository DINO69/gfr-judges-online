package br.com.guifr.top75leetcodequestions.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangeSumSortedSubarraySumsTest {

    @Test
    @DisplayName("Return 13 When call rangeSum Given  nums=[1,2,3,4], n=4, left=1, right=5")
    void test1() {
        int[] nums = new int[]{1,2,3,4};
        int n = 4;
        int left = 1;
        int right = 5;
        Assertions.assertEquals(13,RangeSumSortedSubarraySums.rangeSum(nums,n,left,right));
    }

    @Test
    @DisplayName("Return 6 When call rangeSum Given  nums=[1,2,3,4], n=4, left=3, right=4")
    void test2() {
        int[] nums = new int[]{1,2,3,4};
        int n = 4;
        int left = 3;
        int right = 4;
        Assertions.assertEquals(6,RangeSumSortedSubarraySums.rangeSum(nums,n,left,right));
    }



}