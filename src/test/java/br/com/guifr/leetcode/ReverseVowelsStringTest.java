package br.com.guifr.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseVowelsStringTest {

    @Test
    @DisplayName("Return 'holle' When reverseVowels Given s='hello'")
    void test1() {
        String s = "hello";
        String result = ReverseVowelsString.reverseVowels(s);
        assertEquals("holle",result);
    }

    @Test
    @DisplayName("Return 'leotcede' When reverseVowels Given s='leetcode'")
    void test2() {
        String s = "leetcode";
        String result = ReverseVowelsString.reverseVowels(s);
        assertEquals("leotcede",result);
    }

    @Test
    @DisplayName("Return 'Aa' When reverseVowels Given s='aA'")
    void test3() {
        String s = "aA";
        String result = ReverseVowelsString.reverseVowels(s);
        assertEquals("Aa",result);
    }


}