package br.com.guifr.top75leetcodequestions.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeMaximumPathSumTest {

    @Test
    @DisplayName("Return 6 When BinaryTreeMaximumPathSum.maxPathSum Given [1,2,3]")
    void test1() {
        TreeNode right = new TreeNode(3);
        TreeNode left = new TreeNode(2);
        TreeNode root = new TreeNode(1,left,right);
        Assertions.assertEquals(6,BinaryTreeMaximumPathSum.maxPathSum(root));
    }

    @Test
    @DisplayName("Return 42 When BinaryTreeMaximumPathSum.maxPathSum Given [-10,9,20,null,null,15,7]")
    void test2() {
        TreeNode root = build(-10,9,20,null,null,15,7);
        Assertions.assertEquals(42,BinaryTreeMaximumPathSum.maxPathSum(root));
    }

    @Test
    @DisplayName("Return -50 When BinaryTreeMaximumPathSum.maxPathSum Given [-100,-51,-50,null,null,-60,-70]")
    void test3() {
        TreeNode root = build(-100,-51,-50,null,null,-60,-70);
        Assertions.assertEquals(-50,BinaryTreeMaximumPathSum.maxPathSum(root));
    }

    //TODO -> look to this, change the method to start to use Queue
    private TreeNode build(Integer... nums) {
        TreeNode root = new TreeNode(nums[0]);

        TreeNode current = root;

        Queue<TreeNode> fill = new LinkedList<>();
        fill.add(root);

        for(int index = 0; index < nums.length - 1;index+=2){

            current = fill.poll();

            if(nums[index+1] != null) {
                current.left = new TreeNode(nums[index + 1]);
                fill.add(current.left);
            }
            if(nums[index+2] != null) {
                current.right = new TreeNode(nums[index + 2]);
                fill.add(current.right);
            }

        }

        return root;
    }


}