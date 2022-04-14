package br.com.guifr.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TwoStringsTest {

    @Test
    @DisplayName("Return 'YES' when determine if 'and' & 'art' share substring")
    public void test1(){
        String actual = TwoStrings.shareBetween("and","art");
        Assertions.assertEquals("YES",actual);
    }

    @Test
    @DisplayName("Return 'NO' when determine if 'be' & 'cat' share substring")
    public void test2(){
        String actual = TwoStrings.shareBetween("be","cat");
        Assertions.assertEquals("NO",actual);
    }

    @Test
    @DisplayName("Return 'NO' when determine if 'hi' & 'world' share substring")
    public void test3(){
        String actual = TwoStrings.shareBetween("hi","world");
        Assertions.assertEquals("NO",actual);
    }

    @Test
    @DisplayName("Return 'YES' when determine if 'hello' & 'world' share substring")
    public void test4(){
        String actual = TwoStrings.shareBetween("hello","world");
        Assertions.assertEquals("YES",actual);
    }

}