package br.com.guifr.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class SortIntegersByThePowerValueTest {

    @Test
    @DisplayName("Return 13 When call getKth Given lo = 12, hi = 15, k = 2")
    void test1() {
        int lo = 12, hi = 15, k = 2;
        Assertions.assertEquals(13,SortIntegersByThePowerValue.getKth(lo,hi,k));
    }

    @Test
    @DisplayName("Return 7 When call getKth Given lo = 7, hi = 11, k = 4")
    void test3() {
        int lo = 7, hi = 11, k = 4;
        Assertions.assertEquals(7,SortIntegersByThePowerValue.getKth(lo,hi,k));
    }

    @Test
    @DisplayName("Return 1 When call getKth Given lo = 1, hi = 1, k = 1")
    void test2() {
        int lo = 1, hi = 1, k = 1;
        Assertions.assertEquals(1,SortIntegersByThePowerValue.getKth(lo,hi,k));
    }

    @Test
    @DisplayName("Should el[0]=e{11,2} /el[1]=e{10,3}  Given add Element in TreeSet")
    void test4() {

        Queue<SortIntegersByThePowerValue.Element> elements = new PriorityQueue<>();

        elements.add(new SortIntegersByThePowerValue.Element(11,2));
        elements.add(new SortIntegersByThePowerValue.Element(10,3));

        Assertions.assertEquals(2,elements.size());
        Assertions.assertEquals(2,elements.peek().power);
        Assertions.assertEquals(11,elements.peek().value);
        elements.poll();
        Assertions.assertEquals(3,elements.peek().power);
        Assertions.assertEquals(10,elements.peek().value);
        elements.poll();
        Assertions.assertEquals(0,elements.size());

    }

    @Test
    @DisplayName("Should el[0]=e{11,2} /el[1]=e{12,2}  Given add Element in TreeSet")
    void test5() {

        Queue<SortIntegersByThePowerValue.Element> elements = new PriorityQueue<>();

        elements.add(new SortIntegersByThePowerValue.Element(11,2));
        elements.add(new SortIntegersByThePowerValue.Element(12,2));

        Assertions.assertEquals(2,elements.size());
        Assertions.assertEquals(2,elements.peek().power);
        Assertions.assertEquals(11,elements.peek().value);
        elements.poll();
        Assertions.assertEquals(2,elements.peek().power);
        Assertions.assertEquals(12,elements.peek().value);
        elements.poll();
        Assertions.assertEquals(0,elements.size());

    }
}