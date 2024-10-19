package br.com.guifr.hackerrank.preparationkit.threemonth.weektwelve;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NoPrefixSetTest2 {
    @Test
    @DisplayName("Return 'BAD SET\naacghgh' When Result.noPrefix Given '4\n...'")
    void test2() throws IOException {

        final String testString =
                "aab\n" +
                "aac\n" +
                "aacghgh\n" +
                "aabghgh";

        String actual = Result.noPrefix(Arrays.asList(testString.split("\n")));
        String expected = "BAD SET"+System.lineSeparator()+"aacghgh";
        assertEquals(expected, actual);
    }
}