package br.com.guifr.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompressionTest {

    @Test
    @DisplayName("Return 6 When compress Given chars='[\"a\",\"a\",\"b\",\"b\",\"c\",\"c\",\"c\"]'")
    void test1() {
        char[] chars = {'a','a','b','b','c','c','c'};
        int result = StringCompression.compress(chars);
        assertEquals(6,result);
        assertArrayEquals(new char[]{'a','2','b','2','c','3','c'},chars);
    }

    @Test
    @DisplayName("Return 1 When compress Given chars='[\"a\"]'")
    void test2() {
        char[] chars = {'a'};
        int result = StringCompression.compress(chars);
        assertEquals(1,result);
        assertArrayEquals(new char[]{'a'},chars);
    }
    @Test
    @DisplayName("Return 4 When compress Given chars='[\"a\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\"]'")
    void test3() {
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        int result = StringCompression.compress(chars);
        assertEquals(4,result);
        assertArrayEquals(new char[]{'a','b','1','2','b','b','b','b','b','b','b','b','b'},chars);
    }



}