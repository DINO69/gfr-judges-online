package br.com.guifr.top75leetcodequestions.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TakeKEachCharacterFromLeftAndRightTest {

    @Test
    @DisplayName("Return 8 When call takeCharacters Given s='aabaaaacaabc', n = 2")
    void test1() {
        Assertions.assertEquals(8,TakeKEachCharacterFromLeftAndRight.takeCharacters("aabaaaacaabc",2));
    }

    @Test
    @DisplayName("Return -1 When call takeCharacters Given s='a', n = 1")
    void test2() {
        Assertions.assertEquals(-1,TakeKEachCharacterFromLeftAndRight.takeCharacters("a",1));
    }

    @Test
    @DisplayName("Return 0 When call takeCharacters Given s='a', n = 0")
    void test3() {
        Assertions.assertEquals(0,TakeKEachCharacterFromLeftAndRight.takeCharacters("a",0));
    }

    @Test
    @DisplayName("Return 3 When call takeCharacters Given s='abc', n = 1")
    void test4() {
        Assertions.assertEquals(3,TakeKEachCharacterFromLeftAndRight.takeCharacters("abc",1));
    }

    @Test
    @DisplayName("Return 3 When call takeCharacters Given s='caccbbba', n = 1")
    void test5() {
        Assertions.assertEquals(3,TakeKEachCharacterFromLeftAndRight.takeCharacters("caccbbba",1));
    }

    @Test
    @DisplayName("Return 6 When call takeCharacters Given s='aabbccca', n = 2")
    void test6() {
        Assertions.assertEquals(6,TakeKEachCharacterFromLeftAndRight.takeCharacters("aabbccca",2));
    }
    @Test
    @DisplayName("Return 8 When call takeCharacters Given s='aabaaaacaabc', n = 2")
    void test1_HashMap() {
        Assertions.assertEquals(8,TakeKEachCharacterFromLeftAndRight.takeCharactersHashMap("aabaaaacaabc",2));
    }

    @Test
    @DisplayName("Return -1 When call takeCharacters Given s='a', n = 1")
    void test2_HashMap() {
        Assertions.assertEquals(-1,TakeKEachCharacterFromLeftAndRight.takeCharactersHashMap("a",1));
    }

    @Test
    @DisplayName("Return 0 When call takeCharacters Given s='a', n = 0")
    void test3_HashMap() {
        Assertions.assertEquals(0,TakeKEachCharacterFromLeftAndRight.takeCharactersHashMap("a",0));
    }

    @Test
    @DisplayName("Return 3 When call takeCharacters Given s='abc', n = 1")
    void test4_HashMap() {
        Assertions.assertEquals(3,TakeKEachCharacterFromLeftAndRight.takeCharactersHashMap("abc",1));
    }

    @Test
    @DisplayName("Return 3 When call takeCharacters Given s='caccbbba', n = 1")
    void test5_HashMap() {
        Assertions.assertEquals(3,TakeKEachCharacterFromLeftAndRight.takeCharactersHashMap("caccbbba",1));
    }

    @Test
    @DisplayName("Return 6 When call takeCharacters Given s='aabbccca', n = 2")
    void test6_HashMap() {
        Assertions.assertEquals(6,TakeKEachCharacterFromLeftAndRight.takeCharactersHashMap("aabbccca",2));
    }

    @Test
    @DisplayName("Return 4 When call takeCharacters Given s='ccbabcc', n = 1")
    void test7_HashMap() {
        Assertions.assertEquals(4,TakeKEachCharacterFromLeftAndRight.takeCharactersHashMap("ccbabcc",1));
    }

    @Test
    @DisplayName("Return 8 When call takeCharacters Given s='aabaaaacaabc', n = 2")
    void test1_O_N() {
        Assertions.assertEquals(8,TakeKEachCharacterFromLeftAndRight.takeCharacters_O_N("aabaaaacaabc",2));
    }

    @Test
    @DisplayName("Return -1 When call takeCharacters Given s='a', n = 1")
    void test2_O_N() {
        Assertions.assertEquals(-1,TakeKEachCharacterFromLeftAndRight.takeCharactersHashMap("a",1));
    }

    @Test
    @DisplayName("Return 0 When call takeCharacters Given s='a', n = 0")
    void test3_O_N() {
        Assertions.assertEquals(0,TakeKEachCharacterFromLeftAndRight.takeCharacters_O_N("a",0));
    }

    @Test
    @DisplayName("Return 3 When call takeCharacters Given s='abc', n = 1")
    void test4_O_N() {
        Assertions.assertEquals(3,TakeKEachCharacterFromLeftAndRight.takeCharacters_O_N("abc",1));
    }

    @Test
    @DisplayName("Return 3 When call takeCharacters Given s='caccbbba', n = 1")
    void test5_O_N() {
        Assertions.assertEquals(3,TakeKEachCharacterFromLeftAndRight.takeCharacters_O_N("caccbbba",1));
    }

    @Test
    @DisplayName("Return 6 When call takeCharacters Given s='aabbccca', n = 2")
    void test6_O_N() {
        Assertions.assertEquals(6,TakeKEachCharacterFromLeftAndRight.takeCharacters_O_N("aabbccca",2));
    }

    @Test
    @DisplayName("Return 4 When call takeCharacters Given s='ccbabcc', n = 1")
    void test7_O_N() {
        Assertions.assertEquals(4,TakeKEachCharacterFromLeftAndRight.takeCharacters_O_N("ccbabcc",1));
    }

    @Test
    @DisplayName("Return -1 When call takeCharacters Given s='aabaaaacaab', n = 2")
    void test8_O_N() {
        Assertions.assertEquals(-1,TakeKEachCharacterFromLeftAndRight.takeCharacters_O_N("aabaaaacaab",2));
    }

    @Test
    @DisplayName("Return -1 When call takeCharacters Given s='cbaabccac', n = 3")
    void test9_O_N() {
        Assertions.assertEquals(-1,TakeKEachCharacterFromLeftAndRight.takeCharacters_O_N("cbaabccac",3));
    }

}