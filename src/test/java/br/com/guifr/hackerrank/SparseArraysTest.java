package br.com.guifr.hackerrank;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SparseArraysTest {

    @Test
    @DisplayName("Return [2 1 0] When search how many times [ab abc bc] With [ab ab abc]")
    public void test1() {


        List<String> strings = Arrays.asList("ab","ab","abc");
        List<String> queries = Arrays.asList("ab","abc","bc");
        List<Integer> actual = SparseArrays.with(strings,queries);

        assertEquals(actual, Arrays.asList(2, 1, 0));
        assertEquals(3,actual.size(),"Size is 3");
        assertEquals(2,actual.get(0),"First is 2");
        assertEquals(0,actual.get(actual.size()-1),"Last is 0");
    }

    @Test
    @DisplayName("Return [1 0 1] When search how many times [de Imn fgh] With [def de fgh]")
    public void test2() {

        List<String> strings = Arrays.asList("def" ,"de", "fgh");
        List<String> queries = Arrays.asList("de", "Imn", "fgh");
        List<Integer> actual = SparseArrays.with(strings,queries);

        assertTrue(Arrays.asList(1,0,1).equals(actual));
        assertEquals(3,actual.size(),"Size is 3");
        assertEquals(1,actual.get(0),"First is 1");
        assertEquals(1,actual.get(actual.size()-1),"Last is 1");
    }

}