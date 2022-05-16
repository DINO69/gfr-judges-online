package br.com.guifr.hackerrank.preparationkit.threemonth.weektwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PangramsTest {

    @Test
    @DisplayName("Return 'pangram' When search the string has all letters With 'The quick brown fox jumps over the lazy dog.'")
    public void test1() {
        String actual = Pangrams.search("The quick brown fox jumps over the lazy dog.");
        Assertions.assertEquals("pangram",actual);
    }

    @Test
    @DisplayName("Return 'not pangram' When search the string has all letters With 'We promptly judged antique ivory buckles for the prize'")
    public void test2() {
        String actual = Pangrams.search("We promptly judged antique ivory buckles for the prize");
        Assertions.assertEquals("not pangram",actual);
    }

    @Test
    @DisplayName("Return 'pangram' When search the string has all letters With 'We promptly judged antique ivory buckles for the next prize'")
    public void test3() {
        String actual = Pangrams.search("We promptly judged antique ivory buckles for the next prize");
        Assertions.assertEquals("pangram",actual);
    }

    @Test
    @DisplayName("Return 'not pangram' When search the string has all letters With 'We promptly judged antique ivory for the next prize'")
    public void test4() {
        String actual = Pangrams.search("We promptly judged antique ivory for the next prize");
        Assertions.assertEquals("not pangram",actual);
    }

}