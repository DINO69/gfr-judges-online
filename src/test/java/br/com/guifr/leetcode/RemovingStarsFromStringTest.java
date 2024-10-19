package br.com.guifr.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemovingStarsFromStringTest {


    @Test
    @DisplayName("Return 'lecoe' When call method removeStars Given s='leet**cod*e'")
    void test1() {
        RemovingStarsFromString removingStarsFromString = new RemovingStarsFromString();
        String s = "leet**cod*e";
        String expected = "lecoe";
        String actual = removingStarsFromString.removeStars(s);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Return '' When call method removeStars Given s='erase*****'")
    void test2() {
        RemovingStarsFromString removingStarsFromString = new RemovingStarsFromString();
        String s = "erase*****";
        String expected = "";
        String actual = removingStarsFromString.removeStars(s);
        assertEquals(expected,actual);
    }


}