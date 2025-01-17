package br.com.guifr.leetcode;


import java.util.*;

//Minimum Number of Operations to Sort a Binary Tree by Level
//https://leetcode.com/problems/minimum-number-of-operations-to-sort-a-binary-tree-by-level/description/?envType=daily-question&envId=2024-12-23
public class MinimumNumberOperationsSortBinaryTree {

    public static int minimumOperations(TreeNode root) {

        Deque<TreeNode> nodes = new ArrayDeque<>();
        Deque<TreeNode> nextNodes = new ArrayDeque<>();



        nodes.add(root);
        int result = 0;
        while(!nodes.isEmpty()){
            List<Integer> nums = new ArrayList<>();
            while(!nodes.isEmpty()){
                TreeNode n = nodes.poll();
                if(n.left != null) {
                    nums.add(n.left.val);
                    nextNodes.add(n.left);
                }
                if(n.right != null) {
                    nums.add(n.right.val);
                    nextNodes.add(n.right);
                }
            }

            result += amountToOrder(nums);
            while(!nextNodes.isEmpty()){
                TreeNode poll = nextNodes.poll();
                poll.val = nums.remove(0);
                nodes.add(poll);
            }

        }


        return result;
    }

    protected static int amountToOrder(List<Integer> nums) {

        int[] array = new int[nums.size()];
        for(int i = 0; i < array.length;i++){
            array[i] = nums.get(i);
        }

        return amountToOrder(array);

    }

    protected static int amountToOrder(int[] nums) {

        int result = 0;

        for(int i = 0;i < nums.length;i++){
            int indexToChange = i;
            for(int j = i+ 1;j < nums.length;j++) {
                if (nums[j] < nums[indexToChange]) {
                    indexToChange = j;
                }
            }
            if(indexToChange == i) continue;
            int keep = nums[i];
            nums[i] = nums[indexToChange];
            nums[indexToChange] = keep;
            result++;
        }

        return result;
    }


    // Definition for a binary tree node.
      public static class TreeNode {
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
