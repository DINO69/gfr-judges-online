package br.com.guifr.geeksforgeeks;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsGivenStringTest {

    @Test
    @DisplayName("Return 'much.very.program.this.like.i' When reverseWordsWithStack(s) Given s='i.like.this.program.very.much'")
    void testReverseWordsWithStack() {

        String s = "i.like.this.program.very.much";
        String expected = "much.very.program.this.like.i";
        String actualWithStack = ReverseWordsGivenString.reverseWordsWithStack(s);

        assertEquals(expected,actualWithStack);

    }

    @Test
    @DisplayName("Return 'much.very.program.this.like.i' When reverseWords(s) Given s='i.like.this.program.very.much'")
    void test() {

            String s = "i.like.this.program.very.much";
            String expected = "much.very.program.this.like.i";
            String actual = ReverseWordsGivenString.reverseWords(s);

            assertEquals(expected,actual);

    }

    @Test
    @DisplayName("Return 'mno.pqr' When reverseWordsWithStack(s) Given 'pqr.mno'")
    void testReverseWordsWithStack2() {

        String s = "pqr.mno";
        String expected = "mno.pqr";
        String actualWithStack = ReverseWordsGivenString.reverseWordsWithStack(s);

        assertEquals(expected,actualWithStack);


    }

    @Test
    @DisplayName("Return 'mno.pqr' When reverseWords(s) Given 'pqr.mno'")
    void test2() {

            String s = "pqr.mno";
            String expected = "mno.pqr";
            String actual = ReverseWordsGivenString.reverseWords(s);
            assertEquals(expected,actual);

    }
    //create test like that to reverseWordsDirect
    @Test
    @DisplayName("Return 'mno.pqr' When reverseWordsDirect(s) Given 'pqr.mno'")
    void test3() {
        String s = "pqr.mno";
        String expected = "mno.pqr";
        String actual = ReverseWordsGivenString.reverseWordsDirect(s);
        assertEquals(expected,actual);

    }

    @Test
    @DisplayName("Return 'much.very.program.this.like.i' When reverseWordsDirect(s) Given s='i.like.this.program.very.much'")
    void testReverseWordsDirect() {

        String s = "i.like.this.program.very.much";
        String expected = "much.very.program.this.like.i";
        String actualWithStack = ReverseWordsGivenString.reverseWordsDirect(s);

        assertEquals(expected,actualWithStack);

    }



}