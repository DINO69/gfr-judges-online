package br.com.guifr.hackerrank.trees;

import br.com.guifr.hackerrank.trees.Trees.Node;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TreePostOrderTraversalTest {

    @Test
    @DisplayName("Return '2 6 5 4 9 8 12 11 10 13 7 3 15 14 1' When print post order traversal With 1 14...")
    public void test0() {

        Node node = null;
        node = Trees.inserts(node, Arrays.asList(1,14,3,7,4,5,15,6,13,10,11,2,12,8,9));

        String actual = TreePostOrderTraversal.with(node);
        assertEquals("2 6 5 4 9 8 12 11 10 13 7 3 15 14 1",actual);
    }

    @Test
    @DisplayName("Return '4 3 6 5 2 1' When print post order traversal With 1 2 5 ...")
    public void test1() {

        Node node = null;
        node = Trees.inserts(node, Arrays.asList(1,2,5,3,4,6));

        String actual = TreePostOrderTraversal.with(node);
        assertEquals("4 3 6 5 2 1",actual);
    }

    @Test
    @DisplayName("Return '4 5 2 3 1' When post Order called With node 1 2 5 ...")
    public void test2() {

        Node node = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node2.left = node4;
        node2.right = node5;
        node.left = node2;
        node.right = node3;

        String actual = TreePostOrderTraversal.with(node);
        assertEquals("4 5 2 3 1", actual);
    }

    @Test
    @DisplayName("Return '4 3 6 5 2 1' with Recursion When print post order traversal With 1 2 5 ...")
    public void testRecursion1() {

        Node node = null;
        node = Trees.inserts(node, Arrays.asList(1,2,5,3,4,6));

        String actual = TreePostOrderTraversal.withRecursion(node);
        assertEquals("4 3 6 5 2 1 ",actual);
    }

    @Test
    @DisplayName("Return '2 6 5 4 9 8 12 11 10 13 7 3 15 14 1' with Recursion When print post order traversal With 1 14...")
    public void testRecursion0() {

        Node node = null;
        node = Trees.inserts(node, Arrays.asList(1,14,3,7,4,5,15,6,13,10,11,2,12,8,9));

        String actual = TreePostOrderTraversal.withRecursion(node);
        assertEquals("2 6 5 4 9 8 12 11 10 13 7 3 15 14 1 ",actual);
    }
}