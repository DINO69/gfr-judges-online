package br.com.guifr.hackerrank.trees;

import br.com.guifr.hackerrank.trees.Trees.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static br.com.guifr.hackerrank.trees.Trees.inserts;

class TreePreOrderTraversalTest {

    @Test
    @DisplayName("Return '1 2 5 3 4 6' When preOrder called With node 1 2 5 ...")
    public void test1() {

        Node node = null;
        node = inserts(node, Arrays.asList(1, 2, 5, 3, 4, 6));
        String actual = TreePreOrderTraversal.with(node);
        Assertions.assertEquals("1 2 5 3 4 6", actual);
    }

    @Test
    @DisplayName("Return '1 2 4 5 3' When preOrder called With node 1 2 5 ...")
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

        String actual = TreePreOrderTraversal.with(node);
        Assertions.assertEquals("1 2 4 5 3", actual);
    }

    @Test
    @DisplayName("Return '1 2 5 3 4 6' When preOrder called With node 1 2 5 ...")
    public void testRecursion1() {

        Node node = null;
        node = inserts(node, Arrays.asList(1, 2, 5, 3, 4, 6));
        String actual = TreePreOrderTraversal.withRecursion(node);
        Assertions.assertEquals("1 2 5 3 4 6", actual);
    }

    @Test
    @DisplayName("Return '1 2 4 5 3' When preOrder called With node 1 2 5 ...")
    public void testRecursion2() {

        Node node = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node2.left = node4;
        node2.right = node5;
        node.left = node2;
        node.right = node3;

        String actual = TreePreOrderTraversal.withRecursion(node);
        Assertions.assertEquals("1 2 4 5 3", actual);
    }

}