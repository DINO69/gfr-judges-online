package br.com.guifr.hackerrank.trees;

import br.com.guifr.hackerrank.trees.Trees.Node;
import java.util.*;

import static java.lang.Math.min;

public class TreeTopView {

    static abstract class NodeAux {
        private Node node;

        public NodeAux(Node node) {
            this.node = node;
        }

        public Node getNode() {
            return node;
        }

    }

    static class NodeDistance extends NodeAux {
        private int distance;

        public NodeDistance(Node node, int distance) {
            super(node);
            this.distance = distance;
        }

        public int getDistance() {
            return distance;
        }
    }

    static class NodeLevel extends NodeAux{
        private int level;

        public NodeLevel(Node node, int level) {
            super(node);
            this.level = level;
        }

        public int getLevel() {
            return level;
        }
    }

    public static String searchWithVerticalOrderTraversal(Node node) {

        Map<Integer,NodeAux> topViewLevel = new TreeMap<>();

        Queue<NodeLevel> stack = new ArrayDeque<>();
        stack.add(new NodeLevel(node,0));
        while (!stack.isEmpty()){
            NodeLevel poll = stack.poll();
            if(!topViewLevel.containsKey(poll.getLevel())){
                topViewLevel.put(poll.level,poll);
            }
            if(poll.getNode().left != null){
                stack.add(new NodeLevel(poll.getNode().left,poll.getLevel() - 1));
            }
            if(poll.getNode().right != null){
                stack.add(new NodeLevel(poll.getNode().right,poll.getLevel() + 1));
            }
        }

        return valuesOrderLevel(topViewLevel);
    }

    public static String fillMapMinimumDistance(Node node) {

        Map<Integer,NodeDistance> topViewLevel = new TreeMap<>();

        fillMap(topViewLevel,node,0,0);

        return valuesOrderLevel(topViewLevel);

    }

    private static void fillMap(Map<Integer, NodeDistance> topViewLevel, Node node, int level, int distance) {
        if(node == null) return;

        if(!topViewLevel.containsKey(level)){
            topViewLevel.put(level,new NodeDistance(node,distance));
        }else {
            NodeDistance nodeDistance = topViewLevel.get(level);
            if(nodeDistance.getDistance() > distance){
                topViewLevel.put(level,new NodeDistance(node,distance));
            }
        }

        fillMap(topViewLevel,node.left,level - 1,distance + 1);
        fillMap(topViewLevel,node.right,level + 1,distance + 1);

    }

    public static String maxLeftRight(Node node) {

        int right,left;

        Queue<NodeLevel> rightTop = new ArrayDeque<>();
        Deque<NodeLevel> leftTop = new ArrayDeque<>();

        Queue<NodeLevel> nodesOrderTraversal = new ArrayDeque<>();

        nodesOrderTraversal.add(new NodeLevel(node,0));
        right = 0;
        left = 0;
        rightTop.add(new NodeLevel(node,0));
        while (!nodesOrderTraversal.isEmpty()){
            NodeLevel poll = nodesOrderTraversal.poll();
            if(poll.getNode().left != null){
                nodesOrderTraversal.add(new NodeLevel(poll.getNode().left, poll.getLevel() - 1));
            }

            if(poll.getNode().right != null){
                nodesOrderTraversal.add(new NodeLevel(poll.getNode().right, poll.getLevel() + 1));
            }

            if(poll.getLevel() > right){
                rightTop.add(poll);
                right = poll.getLevel();
            }else if(poll.getLevel() < left){
                leftTop.push(poll);
                left = poll.level;
            }

        }

        StringBuilder sResult = new StringBuilder();
        while (!leftTop.isEmpty()){
            NodeLevel n = leftTop.pop();
            sResult.append(" ").append(n.getNode().data);
        }

        while (!rightTop.isEmpty()){
            NodeLevel n = rightTop.poll();
            sResult.append(" ").append(n.getNode().data);
        }

        return sResult.substring(1);
    }

    public static String dictionaryWithoutSort(Node node) {

        Queue<NodeLevel> queueNodes = new ArrayDeque<>();
        Map<Integer,Node> result = new HashMap<>();
        queueNodes.add(new NodeLevel(node,0));

        int minLevel = Integer.MAX_VALUE;

        while (!queueNodes.isEmpty()){
            NodeLevel poll = queueNodes.poll();
            if(!result.containsKey(poll.getLevel())){
                result.put(poll.getLevel(), poll.getNode());
                minLevel = min(minLevel, poll.level);
            }
            if (poll.getNode().left != null){
                queueNodes.add(new NodeLevel(poll.getNode().left, poll.getLevel() - 1));
            }
            if (poll.getNode().right != null){
                queueNodes.add(new NodeLevel(poll.getNode().right, poll.getLevel() + 1));
            }
        }

        StringBuilder sResult = new StringBuilder();
        while(result.containsKey(minLevel)){
            sResult.append(" ").append(result.get(minLevel).data);
            minLevel++;
        }

        return sResult.substring(1);
    }

    private static String valuesOrderLevel(Map topViewLevel) {

        StringBuilder result = new StringBuilder();

        for (Object obj : topViewLevel.values()) {
            NodeAux top = (NodeAux) obj;
            result.append(" ").append(top.node.data);
        }

        return result.substring(1);
    }
}
