package br.com.guifr.hackerrank;

public class TreeHeightBinaryTree {

    public static int height(Node root) {
        if(root == null){
            return 0;
        }
        int iCount = root.left != null || root.right != null ? 1 : 0;
        return iCount + Math.max(height(root.left), height(root.right));
    }

    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

}
