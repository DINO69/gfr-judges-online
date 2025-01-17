package br.com.guifr.top75leetcodequestions.tree;



// Definition for a binary tree node.
 class TreeNode {
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

public class BinaryTreeMaximumPathSum {
    public static int maxPathSum(TreeNode root) {
        Result max = new Result(root.val);
        maxPathSum(max,root);
        return max.max;
    }

    public static int maxPathSum(Result max, TreeNode root) {

        if( root == null) return 0;

        int left = maxPathSum(max,root.left);
        int right = maxPathSum(max,root.right);

        int maxPath = root.val;

        max.max = Math.max(max.max,root.val + left);
        maxPath = Math.max(maxPath,root.val + left);

        max.max = Math.max(max.max,root.val + right);
        maxPath = Math.max(maxPath,root.val + right);

        max.max = Math.max(max.max,root.val + left + right);

        maxPath = Math.max(maxPath,0);

        return maxPath;
    }

    private static class Result {
        int max;

        public Result(int val) {
            max = val;
        }
    }
}
