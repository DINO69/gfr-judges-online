package br.com.guifr.hackerrank.trees;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static br.com.guifr.hackerrank.trees.Trees.Node;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeInOrderTraversalTest {

    @Test
    @DisplayName("Return '1 2 3 4 5 6' When in order level With 1 2 5...")
    public void testRecursion1() {

        Node node = null;

        node = Trees.inserts(node, Arrays.asList(1,2,5,3,4,6));

        String actual = TreeInOrderTraversal.withRecursion(node);
        assertEquals("1 2 3 4 5 6",actual);
    }

    @Test
    @DisplayName("Return '1 2 3' When in order level With [2,1,3]")
    public void testRecursion2() {

        Node node = null;

        node = Trees.inserts(node, Arrays.asList(2,1,3));

        String actual = TreeInOrderTraversal.withRecursion(node);
        assertEquals("1 2 3",actual);
    }

    @Test
    @DisplayName("Return '1 2 3 4 5 6' When in order level With 1 2 5...")
    public void test1() {

        Node node = null;

        node = Trees.inserts(node, Arrays.asList(1,2,5,3,4,6));

        String actual = TreeInOrderTraversal.with(node);
        assertEquals("1 2 3 4 5 6",actual);
    }

    @Test
    @DisplayName("Return '1 2 3' When in order level With [2,1,3]")
    public void test2() {

        Node node = null;

        node = Trees.inserts(node, Arrays.asList(2,1,3));

        String actual = TreeInOrderTraversal.with(node);
        assertEquals("1 2 3",actual);
    }

    @Test
    @DisplayName("Return '10 20 30 39 40 50 60' When in order level With 10 20 50...")
    public void test3() {

        Node node = null;

        node = Trees.inserts(node, Arrays.asList(10,20,50,30,40,39,60));

        String actual = TreeInOrderTraversal.with(node);
        assertEquals("10 20 30 39 40 50 60",actual);
    }

    @Test
    @DisplayName("Return '10 20 30 39 40 50 60' withWithoutRecursion When in order level With 10 20 50...")
    public void test4() {

        Node node = null;

        node = Trees.inserts(node, Arrays.asList(10,20,50,30,40,39,60));

        String actual = TreeInOrderTraversal.withWithoutRecursion(node);
        assertEquals("10 20 30 39 40 50 60",actual);
    }

}