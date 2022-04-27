package br.com.guifr.hackerrank.trees;

import br.com.guifr.hackerrank.trees.Trees.Node;

import java.util.ArrayDeque;
import java.util.Deque;

public class TreeInOrderTraversal {

    public static String withRecursion(Node root) {

        StringBuilder result = new StringBuilder();

        if (root == null) {
            return result.toString();
        }

        if (root.left != null)
            result.append(withRecursion(root.left)).append(" ");
        result.append(root.data);
        if (root.right != null)
            result.append(" ").append(withRecursion(root.right));

        return result.toString();
    }

    public static String with(Node root) {

        StringBuilder result = new StringBuilder();

        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);

        Deque<Node> lastLeft = new ArrayDeque<>();
        lastLeft.push(root);
        while (!stack.isEmpty()) {
            Node head = stack.pop();

            if(head.right!=null && !stack.contains(head.right))
                stack.push(head.right);

            if ( (head.left == null && head.right == null)
            || lastLeft.peek() == head.left || head.left == null){
                result.append(" ").append(head.data);
                if(lastLeft.peek() == head.left){
                    lastLeft.pop();
                }
            }else{

                if(head.left!=null) {
                    stack.push(head);
                    stack.push(head.left);
                    lastLeft.push(head.left);
                }

            }

        }

        return result.substring(1);
    }

    public static String withWithoutRecursion(Node root) {
        StringBuilder result = new StringBuilder();

        Deque<Node> stack = new ArrayDeque<Node>();
        while(!stack.isEmpty() || root!=null){
            if(root!=null){
                stack.push(root);
                root = root.left;
            }else{
                root = stack.pop();
                result.append(" ").append(root.data);
                root = root.right;
            }
        }
        return result.substring(1);
    }
}
