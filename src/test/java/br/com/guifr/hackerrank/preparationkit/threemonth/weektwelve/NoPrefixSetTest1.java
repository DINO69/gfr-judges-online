package br.com.guifr.hackerrank.preparationkit.threemonth.weektwelve;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NoPrefixSetTest1 {

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    @DisplayName("Return 'BAD SET\naabcde' When Result.noPrefix Given '7\n...'")
    void test1() throws IOException {

        final String testString = "7\n" +
                "aab\n" +
                "defgab\n" +
                "abcde\n" +
                "aabcde\n" +
                "cedaaa\n" +
                "bbbbbbbbbb\n" +
                "jabjjjad";

        testIn = new ByteArrayInputStream(testString.getBytes());
        System.setIn(testIn);


        String[] args = {};
        NoPrefixSet.main(args);
        String expected = "BAD SET"+System.lineSeparator()+"aabcde";
        assertEquals(expected, testOut.toString());
    }
}