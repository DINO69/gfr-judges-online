package br.com.guifr.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsStringTest {

    @Test
    @DisplayName("Return 'blue is sky the' When reverseWords Given s='the sky is blue")
    void test1() {
        String s = "the sky is blue";
        String result = ReverseWordsString.reverseWords(s);
        assertEquals("blue is sky the",result);
    }

    @Test
    @DisplayName("Return '  hello world  ' When reverseWords Given s='world hello")
    void test2() {
        String s = "  hello world  ";
        String result = ReverseWordsString.reverseWords(s);
        assertEquals("world hello",result);
    }

    @Test
    @DisplayName("Return 'example good a' When reverseWords Given s='a good   example")
    void test3() {
        String s = "a good   example";
        String result = ReverseWordsString.reverseWords(s);
        assertEquals("example good a",result);
    }



}