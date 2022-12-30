package br.com.guifr.hackerrank.preparationkit.threemonth.weekeleven;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HighestValuePalindromeTest {

    @Test
    @DisplayName("Return '9339' When find highest value palindrome Given s='1231' k=3")
    void test1() {
        String s = "1231";
        int k = 3;
        String result = HighestValuePalindrome.when(s,k);
        assertEquals("9339",result);
    }

    @Test
    @DisplayName("Return '12921' When find highest value palindrome Given s='12321' k=1")
    void test2() {
        String s = "12321";
        int k = 1;
        String result = HighestValuePalindrome.when(s,k);
        assertEquals("12921",result);
    }

    @Test
    @DisplayName("Return '992299' When find highest value palindrome Given s='092282' k=3")
    void test3() {
        String s = "092282";
        int k = 3;
        String result = HighestValuePalindrome.when(s,k);
        assertEquals("992299",result);
    }

    @Test
    @DisplayName("Return '3993' When find highest value palindrome Given s='3943' k=1")
    void test4() {
        String s = "3943";
        int k = 1;
        String result = HighestValuePalindrome.when(s,k);
        assertEquals("3993",result);
    }

    @Test
    @DisplayName("Return '-1' When dont find highest value palindrome Given s='3943' k=0")
    void test5() {
        String s = "3943";
        int k = 0;
        String result = HighestValuePalindrome.when(s,k);
        assertEquals("-1",result);
    }

    @Test
    @DisplayName("Return '777' When find highest value palindrome Given s='777' k=0")
    void test6() {
        String s = "777";
        int k = 0;
        String result = HighestValuePalindrome.when(s,k);
        assertEquals("777",result);
    }

    @Test
    @DisplayName("Return '-1' When dont find highest value palindrome Given s='0011' k=1")
    void test7() {
        String s = "0011";
        int k = 1;
        String result = HighestValuePalindrome.when(s,k);
        assertEquals("-1",result);
    }

    @Test
    @DisplayName("Return '7777' When find highest value palindrome Given s='7777' k=1")
    void test8() {
        String s = "7777";
        int k = 1;
        String result = HighestValuePalindrome.when(s,k);
        assertEquals("7777",result);
    }

    @Test
    @DisplayName("Return '9779' When find highest value palindrome Given s='7777' k=2")
    void test9() {
        String s = "7777";
        int k = 2;
        String result = HighestValuePalindrome.when(s,k);
        assertEquals("9779",result);
    }

    @Test
    @DisplayName("Return '999999' When find highest value palindrome Given s='997799' k=2")
    void test10() {
        String s = "997799";
        int k = 2;
        String result = HighestValuePalindrome.when(s,k);
        assertEquals("999999",result);
    }

    @Test
    @DisplayName("Return '999999' When find highest value palindrome Given s='997799' k=20")
    void test11() {
        String s = "997799";
        int k = 20;
        String result = HighestValuePalindrome.when(s,k);
        assertEquals("999999",result);
    }

    @Test
    @DisplayName("Return true When string is Palindrome Given s='121'")
    void testIsPalindrome1() {
        String s = "121";
        boolean result = HighestValuePalindrome.isPalindrome(s);
        assertTrue(result);
    }

    @Test
    @DisplayName("Return false When string isnt Palindrome Given s='129'")
    void testIsPalindrome2() {
        String s = "129";
        boolean result = HighestValuePalindrome.isPalindrome(s);
        assertFalse(result);
    }

    @Test
    @DisplayName("Return true When palindrome just have '9' Given s='999'")
    void testMaxPalindrome() {
        String s = "999";
        boolean result = HighestValuePalindrome.maxPalindrome(s);
        assertTrue(result);
    }

    @Test
    @DisplayName("Return false When palindrome have more number that '9' Given s='19991'")
    void testMaxPalindrome2() {
        String s = "19991";
        boolean result = HighestValuePalindrome.maxPalindrome(s);
        assertFalse(result);
    }

    @Test
    @DisplayName("Return '9999' When build max palindrome Given length = 4")
    void testBuildMaxPalindrome1() {
        String result = HighestValuePalindrome.buildMaxPalindrome(4);
        assertEquals("9999",result);
    }

    @Test
    @DisplayName("Return '999' When build max palindrome Given length = 3")
    void testBuildMaxPalindrome2() {
        String result = HighestValuePalindrome.buildMaxPalindrome(3);
        assertEquals("999",result);
    }

    @Test
    @DisplayName("Return 3 When count nines Given s='999'")
    void testCountNines1() {
        String s = "999";
        int result = HighestValuePalindrome.countNines(s);
        assertEquals(3,result);
    }

    @Test
    @DisplayName("Return 4 When count nines Given s='99919'")
    void testCountNines2() {
        String s = "99919";
        int result = HighestValuePalindrome.countNines(s);
        assertEquals(4,result);
    }

}