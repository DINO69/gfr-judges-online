package br.com.guifr.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class PermutationDifferenceBetweenTwoStringsTest {

    @Test
    @DisplayName("Return '2' When call findPermutationDifference Given s = 'abc', t = 'bac'")
    void test1() {
        String s = "abc", t = "bac";
        int result = PermutationDifferenceBetweenTwoStrings.findPermutationDifference(s,t);
        Assertions.assertEquals(2,result);
    }

    @Test
    @DisplayName("Return '12' When call findPermutationDifference Given s = 'abcde', t = 'edbac'")
    void test2() {
        String s = "abcde", t = "edbac";
        int result = PermutationDifferenceBetweenTwoStrings.findPermutationDifference(s,t);
        Assertions.assertEquals(12,result);
    }


}