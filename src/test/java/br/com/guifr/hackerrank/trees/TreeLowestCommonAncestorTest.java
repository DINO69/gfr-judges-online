package br.com.guifr.hackerrank.trees;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static br.com.guifr.hackerrank.trees.Trees.Node;
import static br.com.guifr.hackerrank.trees.Trees.inserts;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeLowestCommonAncestorTest {

    @Test
    @DisplayName("Return 4 When search lca With 4 & 6 in [2,1,3,4,5,6]")
    public void test1() {
        Node node = null;
        node = inserts(node,2,1,3,4,5,6);
        int actual = TreeLowestCommonAncestor.of(node,4,6);
        assertEquals(4,actual);
    }

    @Test
    @DisplayName("Return 4 When search lca With 1 & 7 in [4,2,3,1,7,6]")
    public void test2() {
        Node node = null;
        node = inserts(node,4,2,3,1,7,6);
        int actual = TreeLowestCommonAncestor.of(node,1,7);
        assertEquals(4,actual);
    }


    @Test
    @DisplayName("Return 4 When search lca recursion With 4 & 6 in [2,1,3,4,5,6]")
    public void test3() {
        Node node = null;
        node = inserts(node,2,1,3,4,5,6);


        int actual = TreeLowestCommonAncestor.ofRecursion(node,4,6);
        assertEquals(4,actual);
    }


    @Test
    @DisplayName("Return 4 When search lca recursion With 1 & 7 in [4,2,3,1,7,6]")
    public void testRecursion4() {
        Node node = null;
        node = inserts(node,4,2,3,1,7,6);
        int actual = TreeLowestCommonAncestor.ofRecursion(node,1,7);
        assertEquals(4,actual);
    }

    @Test
    @DisplayName("Return 1 When search lca recursion With 1 & 2 in [8,4,9,1,2,3,6,5]")
    public void testRecursion5() {
        Node node = null;
        node = inserts(node,8,4,9,1,2,3,6,5);
        int actual = TreeLowestCommonAncestor.ofRecursion(node,1,2);
        assertEquals(1,actual);
    }

    @Test
    @DisplayName("Return 1 When search lca With 1 & 2 in [8,4,9,1,2,3,6,5]")
    public void test6() {
        Node node = null;
        node = inserts(node,8,4,9,1,2,3,6,5);
        int actual = TreeLowestCommonAncestor.of(node,1,2);
        assertEquals(1,actual);
    }
}