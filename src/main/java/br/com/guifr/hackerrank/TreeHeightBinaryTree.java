package br.com.guifr.hackerrank;

import br.com.guifr.hackerrank.Trees.Node;

public class TreeHeightBinaryTree {

    public static int height(Node root) {
        if(root == null){
            return 0;
        }
        int iCount = root.left != null || root.right != null ? 1 : 0;
        return iCount + Math.max(height(root.left), height(root.right));
    }

}
