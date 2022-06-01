package br.com.guifr.hackerrank.preparationkit.threemonth.weekfive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class GridChallengeTest {

    @Test
    @DisplayName("Return 'YES' When char in row and column in order With ['abc','ade','efg']")
    public void test1() {
        String actual = GridChallenge.inOrder(Arrays.asList("abc","ade","efg"));
        Assertions.assertEquals("YES",actual);
    }

    @Test
    @DisplayName("Return 'YES' When char in row and column in order With ['ebacd', 'fghij', 'olmkn', 'trpqs', 'xywuv']")
    public void test2() {
        String actual = GridChallenge.inOrder(Arrays.asList("ebacd", "fghij", "olmkn", "trpqs", "xywuv"));
        Assertions.assertEquals("YES",actual);
    }

    @Test
    @DisplayName("Return 'NO' When char in row and column in order With ['cbb','ade','efg']")
    public void test3() {
        String actual = GridChallenge.inOrder(Arrays.asList(" cbb","ade","efg"));
        Assertions.assertEquals("NO",actual);
    }

    @Test
    @DisplayName("Return 'YES' When char in row and column in order With ['ebacd', 'fghij', 'olmkn', 'trpqs']")
    public void test4() {
        String actual = GridChallenge.inOrder(Arrays.asList("ebacd", "fghij", "olmkn", "trpqs"));
        Assertions.assertEquals("YES",actual);
    }


}