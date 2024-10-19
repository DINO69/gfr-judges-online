package br.com.guifr.hackerrank.trees;

import java.util.Stack;

public class TreeLevelOrderTraversal202409 {


    static class Node {
        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        int data;
        Node left;
        Node right;
    }

    public static String levelOrder(Node root) {

        Stack<Node> nodes = new Stack<>();
        nodes.push(root);
        String result = "";
        while(!nodes.isEmpty()){
            Node print = nodes.remove(0);
            result = result + String.format("%s ", print.data);
            if(print.left != null) nodes.push(print.left);
            if(print.right != null) nodes.push(print.right);
        }

        return result;

    }

    public static void main(String[] args) {
        Node root = new Node(1, null, new Node(2, null,
                        new Node(5, new Node(3, null,
                                        new Node(4, null, null)),
                                        new Node(6, null, null))));
        ;
        System.out.println(levelOrder(root));
//        System.out.println(levelOrder(root).equals("1 2 5 3 6 4"));
    }

}
