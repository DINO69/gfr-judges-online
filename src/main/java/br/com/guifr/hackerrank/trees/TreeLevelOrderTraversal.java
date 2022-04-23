package br.com.guifr.hackerrank.trees;

import br.com.guifr.hackerrank.trees.Trees.Node;

import java.util.ArrayDeque;
import java.util.Queue;

public class TreeLevelOrderTraversal {

    public static String of(Node node) {

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);
        StringBuilder sResult = new StringBuilder();
        while (!queue.isEmpty()){
            Node poll = queue.poll();
            sResult.append(" ").append(poll.data);

            if(poll.left != null){
                queue.add(poll.left);
            }

            if(poll.right != null){
                queue.add(poll.right);
            }

        }

        return sResult.substring(1);
    }
}
