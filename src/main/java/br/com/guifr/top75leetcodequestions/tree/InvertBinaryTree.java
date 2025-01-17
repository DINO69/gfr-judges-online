package br.com.guifr.top75leetcodequestions.tree;

public class InvertBinaryTree {


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

    public TreeNode invertTree(TreeNode root) {// O(n)
        // recursividade
        // saida
        //if(root == null || (root.left == null && root.right == null)) //O(1)
        if (root == null) //O(1)
            return root; //O(1)
        // processamento
        TreeNode r = invertTree(root.left); //O(1) -> loop (n/2)
        TreeNode l = invertTree(root.right); //O(1) -> loop (n/2)

        //TreeNode keep = root.left; //O(1)
        root.left = l; //O(1) - 1 momento
        root.right = r; //O(1) - 2 momento

        return root; //O(1)
    }

}
