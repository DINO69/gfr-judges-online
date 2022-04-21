package br.com.guifr.hackerrank;

import br.com.guifr.hackerrank.Trees.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class TreeHeightBinaryTreeTest {

    @Test
    @DisplayName("Return 3 When getHeight With tree [3 1 7 5 4]")
    public void test1() {

        Node head = null;

        List<Integer> nodes = Arrays.asList(3,1,7,5,4);

        for(Integer node : nodes){
            head = Trees.insert(head,node);
        }

        int actual = TreeHeightBinaryTree.height(head);
        Assertions.assertEquals(3,actual);
    }

    @Test
    @DisplayName("Return 3 When getHeight With tree [3 5 2 1 4 6 7]")
    public void test2() {

        Node head = null;
        List<Integer> nodes = Arrays.asList(3, 5, 2, 1, 4, 6, 7);

        for(Integer node : nodes){
            head = Trees.insert(head,node);
        }

        int actual = TreeHeightBinaryTree.height(head);
        Assertions.assertEquals(3,actual);
    }

    @Test
    @DisplayName("Return 0 When getHeight With tree [15]")
    public void test3() {

        Node head = null;
        List<Integer> nodes = Arrays.asList(15);

        for(Integer node : nodes){
            head = Trees.insert(head,node);
        }

        int actual = TreeHeightBinaryTree.height(head);
        Assertions.assertEquals(0,actual);
    }
}