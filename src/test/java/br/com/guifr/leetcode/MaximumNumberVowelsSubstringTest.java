package br.com.guifr.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberVowelsSubstringTest {

    @Test
    @DisplayName("Return 3 When maxVowels Given s='abciiidef', k=3")
    void test1() {
        MaximumNumberVowelsSubstring maximumNumberVowelsSubstring = new MaximumNumberVowelsSubstring();
        assertEquals(3, maximumNumberVowelsSubstring.maxVowels("abciiidef", 3));
    }

    @Test
    @DisplayName("Return 2 When maxVowels Given s='aeiou', k=2")
    void test2() {
        MaximumNumberVowelsSubstring maximumNumberVowelsSubstring = new MaximumNumberVowelsSubstring();
        assertEquals(2, maximumNumberVowelsSubstring.maxVowels("aeiou", 2));
    }

    @Test
    @DisplayName("Return 2 When maxVowles Given s='leetcode', k=3")
    void test3() {
        MaximumNumberVowelsSubstring maximumNumberVowelsSubstring = new MaximumNumberVowelsSubstring();
        assertEquals(2, maximumNumberVowelsSubstring.maxVowels("leetcode", 3));
    }
}