package br.com.guifr.hackerrank.trees;

import br.com.guifr.hackerrank.trees.Trees.Node;

import java.util.ArrayDeque;
import java.util.Deque;

public class TreePostOrderTraversal {

    public static String with(Node node) {

        StringBuffer result = new StringBuffer();

        Node t = node;
        Deque<Node> stack = new ArrayDeque<Node>();
        stack.push(node);
        while(!stack.isEmpty() && node!=null){
            node = stack.peek();
            if( (node.left==null&&node.right==null)
                    || (t==node.left||t==node.right) ){
                result.append(" " ).append(node.data);
                stack.pop();
                t = node;
            }else{
                if(node.right!=null) stack.push(node.right);
                if(node.left!=null) stack.push(node.left);
            }
        }


        return result.substring(1);
    }

    public static String withRecursion(Node node) {
        StringBuilder result = new StringBuilder();
        if (node == null) {
            return result.toString();
        }

        result.append(withRecursion(node.left));
        result.append(withRecursion(node.right));
        result.append(node.data).append(" ");

        return result.toString();
    }
}
