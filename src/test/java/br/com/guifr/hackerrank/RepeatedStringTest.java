package br.com.guifr.hackerrank;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RepeatedStringTest {

    @Test
    @DisplayName("Return 7 when search 'a' in 10 first letters with s = 'aba'")
    public void test1(){
        long actual = RepeatedString.searchIn("aba",10);
        assertEquals(7,actual);
    }


    @Test
    @DisplayName("Return 1000000000000 when search 'a' in 1000000000000 first letters with s = 'a'")
    public void test2(){
        long actual = RepeatedString.searchIn("a",1000000000000L);
        assertEquals(1000000000000L,actual);
    }

    @Test
    @DisplayName("Return 6  when search 'a' in 9 first letters with s = 'aab'")
    public void test3(){
        long actual = RepeatedString.searchIn("aab",9);
        assertEquals(6,actual);
    }

    @Test
    @DisplayName("Return 6  when search 'a' in 8 first letters with s = 'aab'")
    public void test4(){
        long actual = RepeatedString.searchIn("aab",8);
        assertEquals(6,actual);
    }


    @Test
    @DisplayName("Return 2 when count many 'a' in string with s = 'aab'")
    public void test5(){
        long actual = RepeatedString.countAs("aab");
        assertEquals(2,actual);
    }

    @Test
    @DisplayName("Return 1 when count many 'a' in string with s = 'qweqwab'")
    public void test6(){
        long actual = RepeatedString.countAs("qweqwab");
        assertEquals(1,actual);
    }

}