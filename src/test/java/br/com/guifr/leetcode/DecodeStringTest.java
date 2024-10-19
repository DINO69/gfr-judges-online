package br.com.guifr.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeStringTest {

    @Test
    @DisplayName("Return 'aaabcbc'  When decodeString(s) Given s='3[a]2[bc]'")
    void test1() {
        DecodeString decodeString = new DecodeString();
        String s = "3[a]2[bc]";
        String expected = "aaabcbc";
        String result = decodeString.decodeString(s);
        assertEquals(expected, result);
    }
    // return is accaccacc and s=3[a2[c]]
    @Test
    @DisplayName("Return 'accaccacc'  When decodeString(s) Given s='3[a2[c]]'")
    void test2() {
        DecodeString decodeString = new DecodeString();
        String s = "3[a2[c]]";
        String expected = "accaccacc";
        String result = decodeString.decodeString(s);
        assertEquals(expected, result);
    }
    // returns is abcabccdcdcdef and s=2[abc]3[cd]ef
    @Test
    @DisplayName("Return 'abcabccdcdcdef'  When decodeString(s) Given s='2[abc]3[cd]ef'")
    void test3() {
        DecodeString decodeString = new DecodeString();
        String s = "2[abc]3[cd]ef";
        String expected = "abcabccdcdcdef";
        String result = decodeString.decodeString(s);
        assertEquals(expected, result);
    }
    // returns is leetcode x 100 s=100[leetcode]
    @Test
    @DisplayName("Return 'leetcode x 100'  When decodeString(s) Given s='100[leetcode]'")
    void test4() {
        DecodeString decodeString = new DecodeString();
        String s = "100[leetcode]";
        String expected = "leetcode".repeat(100);
        String result = decodeString.decodeString(s);
        assertEquals(expected, result);
    }


}