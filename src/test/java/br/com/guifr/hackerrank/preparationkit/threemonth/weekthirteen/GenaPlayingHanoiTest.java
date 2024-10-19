package br.com.guifr.hackerrank.preparationkit.threemonth.weekthirteen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenaPlayingHanoiTest {

    @Test
    @DisplayName("Return 3 When call hanoi Given List.of(4,3,2,1)")
    void test1() {
        List<Integer> list = List.of(4,3,2,1);
        int result = GenaPlayingHanoi.hanoi(list);
        Assertions.assertEquals(3,result);
    }
    @Test
    @DisplayName("Return 3 When call hanoi Given List.of(4,2,2,1)")
    void test2() {
        List<Integer> list = List.of(4,2,2,1);
        int result = GenaPlayingHanoi.hanoi(list);
        Assertions.assertEquals(3,result);
    }
    @Test
    @DisplayName("Return 3 When call hanoi Given List.of(1,4,1)")
    void test3() {
        List<Integer> list = List.of(1,4,1);
        int result = GenaPlayingHanoi.hanoi(list);
        Assertions.assertEquals(3,result);
    }

    @Test
    @DisplayName("Return [[2,0][0,0][0,0]] When addFirstClean Given matriz is clean post=1 value 2")
    void test4() {
        int value = 2;
        int post = 0;
        int[][] matriz = {{0,0},{0,0},{0,0},{0,0}};
        GenaPlayingHanoi.addFirstClean(matriz,post,value);
        Assertions.assertEquals(2,matriz[0][0]);
        Assertions.assertEquals(0,matriz[0][1]);
        Assertions.assertEquals(0,matriz[1][0]);
        Assertions.assertEquals(0,matriz[1][1]);
        Assertions.assertEquals(0,matriz[2][0]);
        Assertions.assertEquals(0,matriz[2][1]);
        Assertions.assertEquals(0,matriz[3][0]);
        Assertions.assertEquals(0,matriz[3][1]);
    }

    @Test
    @DisplayName("Return true When call canRemove Given value is the top value")
    void test5() {
        int[][] matriz = {{0,0},{3,2},{0,0},{0,0},{0,0}};
        boolean result = GenaPlayingHanoi.canRemove(matriz,1,2);
        Assertions.assertTrue(result);
    }
    @Test
    @DisplayName("Return true When call canRemove Given value has zero values up to it")
    void test6() {
        int[][] matriz = {{0,0},{2,0},{0,0},{0,0},{0,0}};
        boolean result = GenaPlayingHanoi.canRemove(matriz,1,2);
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Return false When canRemove Given value is not the top value and has values up to it")
    void test7() {
        int[][] matriz = {{0,0},{3,2},{0,0},{0,0},{0,0}};
        boolean result = GenaPlayingHanoi.canRemove(matriz,1,3);
        Assertions.assertFalse(result);
    }
    @Test
    @DisplayName("Return false When canRemove Given value does not exist in the post")
    void test8() {
        int[][] matriz = {{0,0},{4,2},{0,0},{0,0},{0,0}};
        boolean result = GenaPlayingHanoi.canRemove(matriz,1,3);
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Return [...[3,0]...] When call remove Given [...[3,2]...] post = 1, value=2")
    void test9() {
        int[][] matriz = {{0,0},{3,2},{0,0},{0,0},{0,0}};
        GenaPlayingHanoi.remove(matriz,1,2);
        Assertions.assertEquals(3,matriz[1][0]);
        Assertions.assertEquals(0,matriz[1][1]);
    }
}