package br.com.guifr.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList();
        if(root == null) return result;

        Deque<TreeNode> nodes = new ArrayDeque();

        nodes.add(root);
        TreeNode change = root;
        List<Integer> level = new ArrayList();

        while(!nodes.isEmpty()){

            TreeNode n = nodes.poll();
            if(n.left != null) nodes.add(n.left);
            if(n.right != null) nodes.add(n.right);

            level.add(n.val);

            if(n == change){
                result.add(level);
                level = new ArrayList();
                if(!nodes.isEmpty())
                    change = nodes.getLast();
            }

        }

        return result;
    }

    public List<List<Integer>> levelOrderNextNodes(TreeNode root) {

        List<List<Integer>> result = new ArrayList();
        if(root == null) return result;

        Deque<TreeNode> nodes = new ArrayDeque();
        Deque<TreeNode> nextNodes = new ArrayDeque();

        nodes.add(root);
        TreeNode change = root;


        while(!nodes.isEmpty()){

            List<Integer> level = new ArrayList();

            TreeNode n = nodes.poll();
            while(n != null){
                if(n.left != null) nextNodes.add(n.left);
                if(n.right != null) nextNodes.add(n.right);
                level.add(n.val);
                n = nodes.poll();
            }

            result.add(level);
            level = new ArrayList();

            nodes = nextNodes;
            nextNodes = new ArrayDeque();

        }

        return result;
    }

    public List<List<Integer>> levelOrderListNextNode   (TreeNode root) {

        List<List<Integer>> result = new ArrayList();
        if(root == null) return result;

        List<TreeNode> nodes = new ArrayList();
        TreeNode last = root;

        nodes.add(root);
        TreeNode change = root;

        List<Integer> level = new ArrayList();
        while(!nodes.isEmpty()){

            TreeNode n = nodes.remove(0);
            if(n == null) continue;
            nodes.add(n.left);
            nodes.add(n.right);
            level.add(n.val);

            if(last == n){
                result.add(level);
                level = new ArrayList();
                int lastIndex = nodes.size() - 1;
                last = nodes.get(lastIndex);
                while(last == null && lastIndex > 0){
                    lastIndex--;
                    last = nodes.get(lastIndex);
                }

            }

        }

        return result;
    }

    public void add(TreeNode root, List<List<Integer>> result, int height){
        if(root == null) return;
        if(result.size() - 1 < height) result.add(new ArrayList());
        result.get(height).add(root.val);
        add(root.left, result, height+1);
        add(root.right, result, height+1);

    }

    public List<List<Integer>> levelOrderWithRecursion(TreeNode root) {

        List<List<Integer>> result = new ArrayList();

        add(root,result,0);

        return result;

    }


     // Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }


}
