package br.com.guifr.top75leetcodequestions.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyStringsTest {

    @Test
    @DisplayName("Return '6' When call multiply Given s1='2' s2='3'")
    void test1() {

        String s1 = "2";
        String s2 = "3";
        Assertions.assertEquals("6",MultiplyStrings.multiply(s1,s2));

    }

    @Test
    @DisplayName("Return '9' When call multiply Given s1='3' s2='3'")
    void test2() {

        String s1 = "3";
        String s2 = "3";
        Assertions.assertEquals("9",MultiplyStrings.multiply(s1,s2));

    }

    @Test
    @DisplayName("Return '56088' When call multiply Given s1='123' s2='456'")
    void test3() {

        String s1 = "123";
        String s2 = "456";
        Assertions.assertEquals("56088",MultiplyStrings.multiply(s1,s2));

    }


}