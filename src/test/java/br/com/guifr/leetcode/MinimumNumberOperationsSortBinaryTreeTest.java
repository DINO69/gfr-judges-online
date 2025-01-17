package br.com.guifr.leetcode;

import br.com.guifr.leetcode.MinimumNumberOperationsSortBinaryTree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class MinimumNumberOperationsSortBinaryTreeTest {

    @Test
    @DisplayName("Return 3 When call minimumOperations Given root = example1()")
    void test1() {

        TreeNode root = example1();
        Assertions.assertEquals(3,MinimumNumberOperationsSortBinaryTree.minimumOperations(root));

    }

    @Test
    @DisplayName("Return 3 When call minimumOperations Given root = example2()")
    void test2() {
        TreeNode root = example2();
        Assertions.assertEquals(3,MinimumNumberOperationsSortBinaryTree.minimumOperations(root));
    }

    @Test
    @DisplayName("Return 0 When call minimumOperations Given root = example3()")
    void test3() {
        TreeNode root = example3();
        Assertions.assertEquals(0,MinimumNumberOperationsSortBinaryTree.minimumOperations(root));
    }

    @Test
    @DisplayName("Return 1 When call minimumOperations Given root = example4()")
    void test4() {
        TreeNode root = example4();
        Assertions.assertEquals(1,MinimumNumberOperationsSortBinaryTree.minimumOperations(root));
    }

    @Test
    @DisplayName("Return 0 When call minimumOperations Given root = example5()")
    void test5() {
        TreeNode root = example5();
        Assertions.assertEquals(0,MinimumNumberOperationsSortBinaryTree.minimumOperations(root));
    }

    @Test
    @DisplayName("Return 5 When call minimumOperations Given root = example6()")
    void test6() {
        TreeNode root = example6();
        Assertions.assertEquals(5,MinimumNumberOperationsSortBinaryTree.minimumOperations(root));
    }

    @Test
    @DisplayName("Return 1 When call amountToOrder Given list=[1,3,2]")
    void testAmountToOrder1() {
        List<Integer> list = new ArrayList<>(List.of(1,3,2));
        Assertions.assertEquals(1, MinimumNumberOperationsSortBinaryTree.amountToOrder(list));
    }

    @Test
    @DisplayName("Return 0 When call amountToOrder Given list=[1,2,3]")
    void testAmountToOrder2() {
        List<Integer> list = new ArrayList<>(List.of(1,2,3));
        Assertions.assertEquals(0, MinimumNumberOperationsSortBinaryTree.amountToOrder(list));
    }

    @Test
    @DisplayName("Return 2 When call amountToOrder Given list=[1,3,4,2]")
    void testAmountToOrder3() {
        List<Integer> list = new ArrayList<>(List.of(1,3,4,2));
        Assertions.assertEquals(2, MinimumNumberOperationsSortBinaryTree.amountToOrder(list));
    }

    @Test
    @DisplayName("Return 3 When call amountToOrder Given list=[20,46,15,39]")
    void testAmountToOrder4() {
        List<Integer> list = new ArrayList<>(List.of(20,46,15,39));
        Assertions.assertEquals(3, MinimumNumberOperationsSortBinaryTree.amountToOrder(list));
    }

    private TreeNode example1() {
        Integer[] nodesVal = new Integer[]{1,4,3,7,6,8,5,null,null,null,null,9,null,10};
        return fill(nodesVal);
    }
    private TreeNode example2() {
        Integer[] nodesVal = new Integer[]{1,3,2,7,6,5,4};
        return fill(nodesVal);
    }
    private TreeNode example3() {
        Integer[] nodesVal = new Integer[]{1,2,3,4,5,6};
        return fill(nodesVal);
    }
    private TreeNode example4() {
        Integer[] nodesVal = new Integer[]{1,3,2};
        return fill(nodesVal);
    }
    private TreeNode example5() {
        Integer[] nodesVal = new Integer[]{50};
        return fill(nodesVal);
    }
    private TreeNode example6() {
        Integer[] nodesVal = new Integer[]{49,45,1,20,46,15,39,27,null,null,null,25};
        return fill(nodesVal);
    }

    private TreeNode fill(Integer[] nodesVal) {
        TreeNode root = new TreeNode(nodesVal[0]);
        Deque<TreeNode> nodes = new ArrayDeque<>();
        nodes.push(root);

        for(int i = 0; i < nodesVal.length -1 ;i+=2){
            TreeNode r = nodes.poll();

            if(nodesVal[i+1] != null) {
                TreeNode left = new TreeNode(nodesVal[i+1]);
                r.left = left;
                nodes.add(left);
            }

            if(i+2 < nodesVal.length && nodesVal[i+2] != null) {
                TreeNode right = new TreeNode(nodesVal[i+2]);
                r.right = right;
                nodes.add(right);
            }

        }

        return root;
    }

}