package br.com.guifr.hackerrank;

import java.util.List;

public class Trees {

    public static Node inserts(Node node, List<Integer> asList) {

        for(Integer number : asList){
            node = insert(node,number);
        }

        return node;
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
