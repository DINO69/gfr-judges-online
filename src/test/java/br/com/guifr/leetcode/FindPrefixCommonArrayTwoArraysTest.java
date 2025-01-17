package br.com.guifr.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPrefixCommonArrayTwoArraysTest {

    @Test
    @DisplayName("Return '[0,2,3,4]' When call findThePrefixCommonArray Given A = [1,3,2,4], B = [3,1,2,4]")
    void test1() {

        int[] A =  {1,3,2,4};
        int[] B = {3,1,2,4};
        int[] expected = {0,2,3,4};

        int[] result = FindPrefixCommonArrayTwoArrays.findThePrefixCommonArray(A,B);
        Assertions.assertEquals(4,result.length);

        for(int i = 0; i < expected.length;i++){
            int compare = expected[i];
            Assertions.assertEquals(compare,result[i]);
        }

    }

    @Test
    @DisplayName("Return '[0,1,3]' When call findThePrefixCommonArray Given A = [2,3,1], B = [3,1,2]")
    void test2() {
        int[] A =  {2,3,1};
        int[] B = {3,1,2};
        int[] expected = {0,1,3};

        int[] result = FindPrefixCommonArrayTwoArrays.findThePrefixCommonArray(A,B);
        Assertions.assertEquals(3,result.length);

        for(int i = 0; i < expected.length;i++){
            int compare = expected[i];
            Assertions.assertEquals(compare,result[i]);
        }

    }

    @Test
    @DisplayName("Return '[1,2,3,4]' When call findThePrefixCommonArray Given A = [1,3,2,4], B = [1,3,2,4]")
    void test3() {
        int[] A =  {1,3,2,4};
        int[] B = {1,3,2,4};
        int[] expected = {1,2,3,4};

        int[] result = FindPrefixCommonArrayTwoArrays.findThePrefixCommonArray(A,B);
        Assertions.assertEquals(4,result.length);

        for(int i = 0; i < expected.length;i++){
            int compare = expected[i];
            Assertions.assertEquals(compare,result[i], String.format("return wrong index[%d] expected [%d] but returned [%d]",i,compare,result[i]));
        }

    }

}