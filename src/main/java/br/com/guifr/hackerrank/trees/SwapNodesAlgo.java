package br.com.guifr.hackerrank.trees;

import br.com.guifr.hackerrank.trees.TreeTopView.NodeDistance;
import br.com.guifr.hackerrank.trees.Trees.Node;

import java.util.*;
import java.util.stream.Collectors;

public class SwapNodesAlgo {


    public static Node built(List<List<Integer>> indexes) {
        Node first = new Node(1);

        int index = 0;
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(first);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            List<Integer> nextNodes = indexes.get(index);

            if (nextNodes.get(0) != -1) {
                Node left = new Node(nextNodes.get(0));
                node.left = left;
                queue.add(node.left);
            }

            if (nextNodes.get(1) != -1) {
                Node right = new Node(nextNodes.get(1));
                node.right = right;
                queue.add(node.right);
            }

            index++;

        }


        return first;
    }

    public static String inOrder(Node node) {

        Deque<Node> stack = new ArrayDeque<>();
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty() || node != null) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                result.append(" ").append(node.data);
                node = node.right;
            }
        }

        return result.substring(1);
    }

    public static void swap(Node root, int index) {


        NodeDistance nodeAux = new NodeDistance(root, 1);

        Queue<NodeDistance> queue = new ArrayDeque<>();
        queue.add(nodeAux);

        while (!queue.isEmpty()) {
            NodeDistance n = queue.poll();

            int nextDistance = n.getDistance() + 1;

            if (n.getNode().left != null) {
                queue.add(new NodeDistance(n.getNode().left, nextDistance));
            }
            if (n.getNode().right != null) {
                queue.add(new NodeDistance(n.getNode().right, nextDistance));
            }

            if (n.getDistance() % index == 0) {
                Node nodeRight = n.getNode().right;
                Node nodeLeft = n.getNode().left;
                n.getNode().right = nodeLeft;
                n.getNode().left = nodeRight;
            }

        }


    }

    public static List<List<Integer>> of(List<List<Integer>> indexes, List<Integer> swaps) {

        List<List<Integer>> result = new ArrayList<>();

        Node node = built(indexes);

        for (Integer swap : swaps) {
            swap(node, swap);
            result.add(inOrderReturnList(node));
        }


        return result;
    }

    public static List<Integer> inOrderReturnList(Node nodeFirst) {
        String s = inOrder(nodeFirst);
        return Arrays.stream(s.split(" "))
                .mapToInt(Integer::new)
                .boxed()
                .collect(Collectors.toList());
    }
}
