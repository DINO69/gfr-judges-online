package br.com.guifr.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortPalindromeTest {

    @Test
    @DisplayName("Return 15 When ShortPalindrome.calc(s) Given s='kkkkkkz'")
    void test1() {
        String s = "kkkkkkz";
        int result = ShortPalindrome.calc(s);
        Assertions.assertEquals(15,result);
    }
    @Test
    @DisplayName("Return 4 When ShortPalindrome.calc(s) Given s='ghhggh'")
    void test2() {
        String s = "ghhggh";
        int result = ShortPalindrome.calc(s);
        Assertions.assertEquals(4,result);
    }

    @Test
    @DisplayName("Return 0 When ShortPalindrome.calc(s) Given s.length < 4")
    void test3() {
        String s = "gui";
        int result = ShortPalindrome.calc(s);
        Assertions.assertEquals(0,result);
    }

    @Test
    @DisplayName("Return 1 When ShortPalindrome.calc(s) Given s = gddg")
    void test4() {
        String s = "gddg";
        int result = ShortPalindrome.calc(s);
        Assertions.assertEquals(1,result);
    }

    @Test
    @DisplayName("Return 2 When ShortPalindrome.calc(s) Given s = gddgg")
    void test5() {
        String s = "gddgg";
        int result = ShortPalindrome.calc(s);
        Assertions.assertEquals(2,result);
    }
    @Test
    @DisplayName("Return 2 When ShortPalindrome.calc(s) Given s = ggddg")
    void test6() {
        String s = "ggddg";
        int result = ShortPalindrome.calc(s);
        Assertions.assertEquals(2,result);
    }

    @Test
    @DisplayName("Return 1 When ShortPalindrome.factorial Given num = 1 or 0")
    void test7() {
        Assertions.assertEquals(1,ShortPalindrome.factorial(1));
        Assertions.assertEquals(1,ShortPalindrome.factorial(0));
    }

    @Test
    @DisplayName("Return 2 When ShortPalindrome.factorial Given num = 2")
    void test8() {
        Assertions.assertEquals(2,ShortPalindrome.factorial(2));
    }

    @Test
    @DisplayName("Return 6 When ShortPalindrome.factorial Given num = 2")
    void test9() {
        Assertions.assertEquals(6,ShortPalindrome.factorial(3));
    }

    @Test
    @DisplayName("Return 4 When ShortPalindrome.calc(s) Given s = abbaab")
    void test10() {
        String s = "abbaab";
        int result = ShortPalindrome.calc(s);
        Assertions.assertEquals(4,result);
    }

    @Test
    @DisplayName("Return 2 When ShortPalindrome.calc(s) Given s = akakak")
    void test11() {
        String s = "akakak";
        int result = ShortPalindrome.calc(s);
        Assertions.assertEquals(2,result);
    }

    @Test
    @DisplayName("Return 1 When ShortPalindrome.calc(s) Given s = aaaaz")
    void test12() {
        String s = "aaaaz";
        int result = ShortPalindrome.calc(s);
        Assertions.assertEquals(1,result);
    }

    @Test
    @DisplayName("Return 59222 When ShortPalindrome.calc(s) Given s = baabababaaaababbbbbbabbbbabbbaaabaaabbbbaabbbbbbab")
    void test13() {
        String s = "baabababaaaababbbbbbabbbbabbbaaabaaabbbbaabbbbbbab";
        int result = ShortPalindrome.calc(s);
        Assertions.assertEquals(59222,result);
    }

}