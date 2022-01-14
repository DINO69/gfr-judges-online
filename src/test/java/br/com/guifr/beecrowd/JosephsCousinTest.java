package br.com.guifr.beecrowd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class JosephsCousinTest {

    @Test
    @DisplayName("Return 4 when input amount people is 6")
    public void test1(){
        List<String> actual = JosephsCousin.withPeople(6).saving();
        Assertions.assertLinesMatch(Arrays.asList("4"),actual);
    }

    @Test
    @DisplayName("Return 7 when input amount people is 9")
    public void test2(){
        List<String> actual = JosephsCousin.withPeople(9).saving();
        Assertions.assertLinesMatch(Arrays.asList("7"),actual);
    }



}