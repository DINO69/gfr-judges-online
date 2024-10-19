package br.com.guifr.hackerrank.trees;


import java.util.Stack;

public class TreeHeightBinaryTreeCesinha {

    class Node {
        int data;
        Node left;
        Node right;
    }
    public static int height(Node root) {// O(n)
        // cheira a recursividade

        // 2 -> condição de saida
        // Clean Arch
        if(root == null || (root.left == null && root.right == null))
            return 0;

        // 2 conceitos que a recursividade
        // 1 -> processando
        int max = Math.max(height(root.left), height(root.right));

        return max + 1;
    }


}
