package br.com.guifr.hackerrank.trees;

import br.com.guifr.hackerrank.trees.Trees.Node;

import java.util.ArrayDeque;
import java.util.Deque;

public class TreePreOrderTraversal {

    public static String with(Node node) {

        StringBuilder sb = new StringBuilder();

        Deque<Node> stack = new ArrayDeque<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            Node pop = stack.pop();
            sb.append(" ").append(pop.data);

            if (pop.right != null) {
                stack.push(pop.right);
            }

            if (pop.left != null) {
                stack.push(pop.left);
            }

        }

        return sb.substring(1);
    }

    public static String withRecursion(Node node) {
        StringBuilder result = new StringBuilder();

        if(node == null){
            return result.toString();
        }

        result.append(node.data);

        if (node.left != null) {
            result.append(" ").append(withRecursion(node.left));
        }

        if (node.right != null) {
            result.append(" ").append(withRecursion(node.right));
        }

        return result.toString();
    }
}
