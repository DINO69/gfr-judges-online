package br.com.guifr.hackerrank.preparationkit.threemonth.weektwelve;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NoPrefixSetTest3 {
    @Test
    @DisplayName("Return 'BAD SET\na' When Result.noPrefix Given 'a\na'")
    void test2() throws IOException {

        final String testString =
                "a\n" +
                "a";

        String actual = Result.noPrefix(Arrays.asList(testString.split("\n")));
        String expected = "BAD SET"+System.lineSeparator()+"a";
        assertEquals(expected, actual);
    }
}