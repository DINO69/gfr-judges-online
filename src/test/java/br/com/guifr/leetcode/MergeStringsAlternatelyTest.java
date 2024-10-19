package br.com.guifr.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringsAlternatelyTest {

    @Test
    @DisplayName("Return 'apbqcr' When mergeAlternately(word1,word2) Given word1 = 'abc', word2 = 'pqr'")
    void test1() {
        String word1 = "abc";
        String word2 = "pqr";
        String result = MergeStringsAlternately.mergeAlternately(word1,word2);
        assertEquals("apbqcr",result);
    }

    @Test
    @DisplayName("Return 'apbqrs' When mergeAlternately(word1,word2) Given word1 = 'ab', word2 = 'pqrs'")
    void test2() {
        String word1 = "ab";
        String word2 = "pqrs";
        String result = MergeStringsAlternately.mergeAlternately(word1,word2);
        assertEquals("apbqrs",result);
    }

    @Test
    @DisplayName("Return 'apbqcd' When mergeAlternately(word1,word2) Given word1 = 'abcd', word2 = 'pq'")
    void test3() {
        String word1 = "abcd";
        String word2 = "pq";
        String result = MergeStringsAlternately.mergeAlternately(word1,word2);
        assertEquals("apbqcd",result);
    }

}