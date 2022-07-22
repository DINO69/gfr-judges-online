package br.com.guifr.hackerrank.preparationkit.threemonth.weekeight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SuperReducedStringTest {

    @Test
    @DisplayName("Return 'abd' When reduce string with pait letter Given 'aaabccddd'")
    void test() {
        String result = SuperReducedString.with("aaabccddd");
        Assertions.assertEquals("abd",result);
    }

    @Test
    @DisplayName("Return 'Empty String' When reduce string with pait letter Given 'aa'")
    void test2() {
        String result = SuperReducedString.with("aa");
        Assertions.assertEquals("Empty String",result);
    }

    @Test
    @DisplayName("Return 'Empty String' When reduce string with pait letter Given 'baab'")
    void test3() {
        String result = SuperReducedString.with("baab");
        Assertions.assertEquals("Empty String",result);
    }

    @Test
    @DisplayName("Return 'Empty String' When reduce string with pait letter Given 'abba'")
    void test4() {
        String result = SuperReducedString.with("abba");
        Assertions.assertEquals("Empty String",result);
    }

    @Test
    @DisplayName("Return 'b' When reduce string with pait letter Given 'aab'")
    void test5() {
        String result = SuperReducedString.with("aab");
        Assertions.assertEquals("b",result);
    }


}