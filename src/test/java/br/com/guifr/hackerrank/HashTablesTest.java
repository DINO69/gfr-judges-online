package br.com.guifr.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class HashTablesTest {

    @Test
    @DisplayName("Return 'No' When can search all words in the magazine words")
    public void test1(){
        List<String> magazine = Arrays.asList("two", "times", "three", "is", "not", "four");
        List<String> note = Arrays.asList("two","times", "two", "is", "four");

        String actual = HashTables.checkMagazine(magazine,note);
        Assertions.assertEquals("No",actual);
    }

    @Test
    @DisplayName("Return 'Yes' When can search all words in the magazine words")
    public void test2(){
        List<String> magazine = Arrays.asList("give","me", "one", "grand", "today", "night");
        List<String> note = Arrays.asList("give", "one", "grand", "today");

        String actual = HashTables.checkMagazine(magazine,note);
        Assertions.assertEquals("Yes",actual);
    }

    @Test
    @DisplayName("Return 'No' When can search all words in the magazine words")
    public void test3(){
        List<String> magazine = Arrays.asList("ive", "got", "a", "lovely", "bunch", "of", "coconuts");
        List<String> note = Arrays.asList("ive", "got", "some", "coconuts");

        String actual = HashTables.checkMagazine(magazine,note);
        Assertions.assertEquals("No",actual);
    }

}