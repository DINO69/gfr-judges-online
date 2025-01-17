package br.com.guifr.top75leetcodequestions.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialArrayTwoTest {

    @Test
    @DisplayName("Return [false] When call isArraySpecial Given nums=[3,4,1,2,6] queries=[[0,4]]")
    void test1() {
        int[][] queries = new int[][]{{0,4}};
        int[] nums = new int[]{3,4,1,2,6};
        boolean[] result = SpecialArrayTwo.isArraySpecial(nums,queries);
        Assertions.assertEquals(1,result.length);
        Assertions.assertEquals(false,result[0]);
    }

    @Test
    @DisplayName("Return [false,true] When call isArraySpecial Given nums=[4,3,1,6] queries=[[0,2],[2,3]]")
    void test2() {
        int[][] queries = new int[][]{{0,2},{2,3}};
        int[] nums = new int[]{4,3,1,6};
        boolean[] result = SpecialArrayTwo.isArraySpecial(nums,queries);
        Assertions.assertEquals(2,result.length);
        Assertions.assertEquals(false,result[0]);
        Assertions.assertEquals(true,result[1]);
    }

    @Test
    @DisplayName("Return [false] When call isArraySpecial Given nums=[3,4,1,2,6] queries=[[0,4]]")
    void test3() {
        int[][] queries = new int[][]{{0,4}};
        int[] nums = new int[]{3,4,1,2,6};
        boolean[] result = SpecialArrayTwo.isArraySpecialKnowledgeBadPair(nums,queries);
        Assertions.assertEquals(1,result.length);
        Assertions.assertEquals(false,result[0]);
    }

    @Test
    @DisplayName("Return [false,true] When call isArraySpecial Given nums=[4,3,1,6] queries=[[0,2],[2,3]]")
    void test4() {
        int[][] queries = new int[][]{{0,2},{2,3}};
        int[] nums = new int[]{4,3,1,6};
        boolean[] result = SpecialArrayTwo.isArraySpecialKnowledgeBadPair(nums,queries);
        Assertions.assertEquals(2,result.length);
        Assertions.assertEquals(false,result[0]);
        Assertions.assertEquals(true,result[1]);
    }

    @Test
    @DisplayName("Return [false,true] When call isArraySpecial Given nums={0,1,2,3,4,5,6,7,8,10} queries={{5,10},{7,8}}")
    void test5() {
        int[][] queries = new int[][]{{5,10},{7,8}};
        int[] nums = new int[]{0,1,2,3,4,5,6,7,8,10,11};
        boolean[] result = SpecialArrayTwo.isArraySpecial(nums,queries);
        Assertions.assertEquals(2,result.length);
        Assertions.assertEquals(false,result[0]);
        Assertions.assertEquals(true,result[1]);
    }

    @Test
    @DisplayName("Return [false,true] When call isArraySpecialKnowledgeBadPair Given nums={0,1,2,3,4,5,6,7,8,10,11} queries={{5,10},{8,9}}")
    void test6() {
        int[][] queries = new int[][]{{5,10},{8,9}};
        int[] nums = new int[]{1,1,1,1,1,1,1,7,8,9,11};
        boolean[] result = SpecialArrayTwo.isArraySpecialKnowledgeBadPair(nums,queries);
        Assertions.assertEquals(2,result.length);
        Assertions.assertEquals(false,result[0]);
        Assertions.assertEquals(true,result[1]);
    }



}