package br.com.guifr.top75leetcodequestions.tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class MaximumDepthBinaryTree {


    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int maxDepth(TreeNode root) {

        return countDepth(root, 0);

    }

    public int countDepth(TreeNode root, int depth) {

        if (root == null) return depth;

        int result = depth;

        int process = Math.max(countDepth(root.left, depth + 1), countDepth(root.right, depth + 1));

        return Math.max(result, process);
    }

    public int maxDepth2(TreeNode root) {
        //base condition return 0 is null
        if(root==null){
            return 0;
        }
        //else return the 1+max(left, right)
        //recursion function
        //return 1+ Math.max(maxDepth(root.left),maxDepth(root.right));

        //more optimized
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return 1+Math.max(leftDepth,rightDepth);
    }

}
