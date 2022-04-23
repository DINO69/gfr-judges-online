package br.com.guifr.hackerrank.trees;

import br.com.guifr.hackerrank.trees.Trees.Node;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeLevelOrderTraversalTest {


    @Test
    @DisplayName("Return '1 2 5 3 6 4' When show level order traversal With [1 2 5 3 6 4]")
    public void test1() {

        Node node = null;

        node = Trees.inserts(node, Arrays.asList(1,2,5,3,6,4));

        String actual = TreeLevelOrderTraversal.of(node);

        assertEquals("1 2 5 3 6 4",actual);
    }
}