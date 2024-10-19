package br.com.guifr.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorStringsTest {

    @Test
    @DisplayName("Return 'ABC' When gcdOfStrings(String str1, String str2)  Given str1 = 'ABCABC', str2 = 'ABC'")
    void test1() {
        String str1 = "ABCABC";
        String str2 = "ABC";
        String result = GreatestCommonDivisorStrings.gcdOfStrings(str1,str2);
        assertEquals("ABC",result);
    }

    @Test
    @DisplayName("Return 'AB' When gcdOfStrings(String str1, String str2)  Given str1 = 'ABABAB', str2 = 'ABAB'")
    void test2() {
        String str1 = "ABABAB";
        String str2 = "ABAB";
        String result = GreatestCommonDivisorStrings.gcdOfStrings(str1,str2);
        assertEquals("AB",result);
    }

    @Test
    @DisplayName("Return '' When gcdOfStrings(String str1, String str2)  Given str1 = 'LEET', str2 = 'CODE'")
    void test3() {
        String str1 = "LEET";
        String str2 = "CODE";
        String result = GreatestCommonDivisorStrings.gcdOfStrings(str1,str2);
        assertEquals("",result);
    }

    @Test
    @DisplayName("Return 'ABAB' When gcdOfStrings(String str1, String str2)  Given str1 = 'ABABABAB', str2 = 'ABAB'")
    void test4() {
        String str1 = "ABABABAB";
        String str2 = "ABAB";
        String result = GreatestCommonDivisorStrings.gcdOfStrings(str1,str2);
        assertEquals("ABAB",result);
    }


}