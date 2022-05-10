package br.com.guifr.hackerrank.sorted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class TheFullCountingSortTest {

    @Test
    @DisplayName("Return '- c - d' When the full counting sort With [[0 a][1 b][0 c][1 d]]")
    public void test1() {

        List<List<String>> arr = Arrays.asList(
                Arrays.asList("0", "a"),
                Arrays.asList("1", "b"),
                Arrays.asList("0", "c"),
                Arrays.asList("1", "d")
        );
        String actual = TheFullCountingSort.with(arr);
        Assertions.assertEquals("- c - d ", actual);
    }

    @Test
    @DisplayName("Return '- - - - - to be or not....' When the full counting sort With list number 1")
    public void test2() {

        List<List<String>> arr = getListNumberOne();
        String actual = TheFullCountingSort.with(arr);
        Assertions.assertEquals("- - - - - to be or not to be - that is the question - - - - ", actual);
    }

    private List<List<String>> getListNumberOne() {
        return Arrays.asList(
                Arrays.asList("0","ab"),
                Arrays.asList("6","cd"),
                Arrays.asList("0","ef"),
                Arrays.asList("6","gh"),
                Arrays.asList("4","ij"),
                Arrays.asList("0","ab"),
                Arrays.asList("6","cd"),
                Arrays.asList("0","ef"),
                Arrays.asList("6","gh"),
                Arrays.asList("0","ij"),
                Arrays.asList("4","that"),
                Arrays.asList("3","be"),
                Arrays.asList("0","to"),
                Arrays.asList("1","be"),
                Arrays.asList("5","question"),
                Arrays.asList("1","or"),
                Arrays.asList("2","not"),
                Arrays.asList("4","is"),
                Arrays.asList("2","to"),
                Arrays.asList("4","the")
        );
    }

}