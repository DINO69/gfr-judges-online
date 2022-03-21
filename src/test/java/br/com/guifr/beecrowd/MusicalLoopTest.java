package br.com.guifr.beecrowd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MusicalLoopTest {


    @Test
    @DisplayName("Return 2 peaks when notes 1 -3")
    public void test1(){

        List<Integer> notes = Arrays.asList(1,-3);

        int peaks = MusicalLoop.homManyPeaks(notes);
        Assertions.assertEquals(2,peaks);
    }

    @Test
    @DisplayName("Return 2 peaks when notes 40 0 -41 0 41 42")
    public void test2(){

        List<Integer> notes = Arrays.asList(40,0,-41,0,41,42);

        int peaks = MusicalLoop.homManyPeaks(notes);
        Assertions.assertEquals(2,peaks);
    }

    @Test
    @DisplayName("Return 4 peaks when notes 300 450 449 450")
    public void test3(){

        List<Integer> notes = Arrays.asList(300,450,449,450);

        int peaks = MusicalLoop.homManyPeaks(notes);
        Assertions.assertEquals(4,peaks);
    }

    @Test
    @DisplayName("Return true when the sentence of number 0,41,42 is ascending")
    public void test4(){
        boolean isCrescent = MusicalLoop.isAscending(0,41,42);
        Assertions.assertTrue(isCrescent);
    }

    @Test
    @DisplayName("Return false when the sentence of number 41,42,40 is not ascending")
    public void test5(){
        boolean isCrescent = MusicalLoop.isAscending(41,42,40);
        Assertions.assertFalse(isCrescent);
    }

    @Test
    @DisplayName("Return true when the sentence of number 40,0,-41 is descending")
    public void test6(){
        boolean isDescending = MusicalLoop.isDescending(40,0,-41);
        Assertions.assertTrue(isDescending);
    }

    @Test
    @DisplayName("Return true when the sentence of number 0,-41,0 is not descending")
    public void test7(){
        boolean isDescending = MusicalLoop.isDescending(0,-41,0);
        Assertions.assertFalse(isDescending);
    }

    @Test
    @DisplayName("Separate triple for analysis ascending and descending with list 1,-3")
    public void test8(){

        List<int[]> triples = MusicalLoop.generateTriples(Arrays.asList(1,-3));
        int sizeList = triples.size();
        Assertions.assertEquals(2,sizeList);
        Assertions.assertArrayEquals(new int[]{-3, 1, -3},triples.get(0));
        Assertions.assertArrayEquals(new int[]{1, -3,1},triples.get(1));
    }

    @Test
    @DisplayName("Separate triple for analysis ascending and descending with list 40,0,-41,0,41,42")
    public void test9(){

        List<int[]> triples = MusicalLoop.generateTriples(Arrays.asList(40,0,-41,0,41,42));
        int sizeList = triples.size();
        Assertions.assertEquals(6,sizeList);
        Assertions.assertArrayEquals(new int[]{42, 40, 0},triples.get(0));
        Assertions.assertArrayEquals(new int[]{40, 0,-41},triples.get(1));
        Assertions.assertArrayEquals(new int[]{0, -41,0},triples.get(2));
        Assertions.assertArrayEquals(new int[]{-41, 0,41},triples.get(3));
        Assertions.assertArrayEquals(new int[]{0, 41,42},triples.get(4));
        Assertions.assertArrayEquals(new int[]{41, 42,40},triples.get(5));
    }

    @Test
    @DisplayName("Separate triple for analysis ascending and descending with list 300,450,449,450")
    public void test10(){

        List<int[]> triples = MusicalLoop.generateTriples(Arrays.asList(300,450,449,450));
        int sizeList = triples.size();
        Assertions.assertEquals(4,sizeList);
        Assertions.assertArrayEquals(new int[]{450, 300, 450},triples.get(0));
        Assertions.assertArrayEquals(new int[]{300, 450,449},triples.get(1));
        Assertions.assertArrayEquals(new int[]{450, 449,450},triples.get(2));
        Assertions.assertArrayEquals(new int[]{449, 450,300},triples.get(3));
    }

}