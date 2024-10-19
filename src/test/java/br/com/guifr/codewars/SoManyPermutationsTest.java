package br.com.guifr.codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SoManyPermutationsTest {

    @Test
    @DisplayName("Return [a] When process Given 'a'")
    void test1() {
        String s = "a";
        List<String> result = SoManyPermutations.process(s);
        Assertions.assertLinesMatch(List.of("a"),result);
    }

    @Test
    @DisplayName("Return [ab,ba] When process Given 'ab'")
    void test2() {
        String s = "ab";
        List<String> result = SoManyPermutations.process(s);
        Assertions.assertLinesMatch(List.of("ab","ba"),result);
    }

    @Test
    @DisplayName("Return [abc,acb....] When process Given 'abc'")
    void test3() {
        String s = "abc";
        List<String> result = SoManyPermutations.process(s);
        Assertions.assertEquals(6,result.size());
        Assertions.assertLinesMatch(List.of("abc","acb","bac","bca","cab","cba"),result);
    }
    @Test
    @DisplayName("Return [aabb,...] When process Given 'aabb'")
    void test4() {
        String s = "aabb";
        List<String> result = SoManyPermutations.process(s);
        Assertions.assertEquals(6,result.size());
        Assertions.assertLinesMatch(List.of("aabb", "abab", "abba", "baab", "bbaa", "baba"),result);
    }
    @Test
    @DisplayName("Return [abcd,...] When process Given 'abcd'")
    void test5() {
        String s = "abcd";
        List<String> result = SoManyPermutations.process(s);
        Assertions.assertEquals(16,result.size());
        Assertions.assertLinesMatch(List.of("abcd", "abdc", "acbd", "acdb", "adbc", "adcb", "bacd", "badc", "bcad", "bcda", "bdac", "bdca", "cabd", "cadb", "cbad", "cbda", "cdab", "cdba", "dabc", "dacb", "dbac", "dbca", "dcab", "dcba"),result);
    }
}