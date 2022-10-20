package br.com.guifr.hackerrank.preparationkit.threemonth.weekten;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class PermutationGameTest {

    @Test
    @DisplayName("Return 'Alice' When permutation game Given l=[4,3,2,1]")
    void test1() {
        List<Integer> l = Arrays.asList(4,3,2,1);
        String result = PermutationGame.with(l);
        Assertions.assertEquals("Alice",result);
    }

    @Test
    @DisplayName("Return 'Alice' When permutation game Given l=[1,3,2]")
    void test2() {
        List<Integer> l = Arrays.asList(1,3,2);
        String result = PermutationGame.with(l);
        Assertions.assertEquals("Alice",result);
    }

    @Test
    @DisplayName("Return 'Bob' When permutation game Given l=[5,3,2,1,4]")
    void test3() {
        List<Integer> l = Arrays.asList(5,3,2,1,4);
        String result = PermutationGame.with(l);
        Assertions.assertEquals("Bob",result);
    }

    @Test
    @DisplayName("Return 'Bob' When permutation game Given l=[6,4,8,3,7,2,1,5,9]")
    void test4() {
        List<Integer> l = Arrays.asList(6,4,8,3,7,2,1,5,9);
        String result = PermutationGame.with(l);
        Assertions.assertEquals("Bob",result);
    }

    @Test
    @DisplayName("Return true When sequence is increasing Given l=[6,7,9]")
    void test5() {
        List<Integer> arr = Arrays.asList(6,7,9);
        boolean result = PermutationGame.isIncreasing(arr);
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Return true When sequence is increasing Given l=[6,8,9]")
    void test6() {
        List<Integer> arr = Arrays.asList(6,8,9);
        boolean result = PermutationGame.isIncreasing(arr);
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Return false When sequence is increasing Given l=[6,8,7]")
    void test7() {
        List<Integer> arr = Arrays.asList(6,8,7);
        boolean result = PermutationGame.isIncreasing(arr);
        Assertions.assertFalse(result);
    }

}