package br.com.guifr.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindScoreArrayAfterMarkingElementsTest {

    @Test
    @DisplayName("Return 7 When call findScore(n[]) Given n=[2,1,3,4,5,2]")
    void test0() {
        int[] n = new int[]{2,1,3,4,5,2};
        long result = FindScoreArrayAfterMarkingElements.findScore(n);
        assertEquals(7,result);
    }

    @Test
    @DisplayName("Return 9 When call findScore(n[]) Given n=[1,2,3,4,5]")
    void test1() {
        int[] n = new int[]{1,2,3,4,5};
        long result = FindScoreArrayAfterMarkingElements.findScore(n);
        assertEquals(9,result);
    }

    @Test
    @DisplayName("Return 5 When call findScore(n[]) Given n=[2,3,5,1,3,2]")
    void test2() {
        int[] n = new int[]{2,3,5,1,3,2};
        long result = FindScoreArrayAfterMarkingElements.findScore(n);
        assertEquals(5,result);
    }

    @Test
    @DisplayName("Return 1 When call findScore(n[]) Given n=[2,1,3]")
    void test3() {
        int[] n = new int[]{2,1,3};
        long result = FindScoreArrayAfterMarkingElements.findScore(n);
        assertEquals(1,result);
    }

    @Test
    @DisplayName("Should mark[0]=1,mark[1]=1 When call tryMark Given middle=0, mark=[]")
    void test4() {
        int[] mark = new int[10];
        Assertions.assertEquals(0,mark[0]);
        Assertions.assertEquals(0,mark[1]);
        FindScoreArrayAfterMarkingElements.tryMark(0,mark);
        Assertions.assertEquals(1,mark[0]);
        Assertions.assertEquals(1,mark[1]);
    }

    @Test
    @DisplayName("Should mark[0]=1,mark[1]=1,mark[2]=1 When call tryMark Given middle=1, mark=[]")
    void test5() {
        int[] mark = new int[10];
        Assertions.assertEquals(0,mark[0]);
        Assertions.assertEquals(0,mark[1]);
        Assertions.assertEquals(0,mark[2]);
        FindScoreArrayAfterMarkingElements.tryMark(1,mark);
        Assertions.assertEquals(1,mark[0]);
        Assertions.assertEquals(1,mark[1]);
        Assertions.assertEquals(1,mark[2]);
    }

    @Test
    @DisplayName("Should mark[9]=1,mark[8]=1 When call tryMark Given middle=9, mark=[]")
    void test6() {
        int[] mark = new int[10];
        Assertions.assertEquals(0,mark[8]);
        Assertions.assertEquals(0,mark[9]);
        FindScoreArrayAfterMarkingElements.tryMark(9,mark);
        Assertions.assertEquals(1,mark[8]);
        Assertions.assertEquals(1,mark[9]);
    }

}