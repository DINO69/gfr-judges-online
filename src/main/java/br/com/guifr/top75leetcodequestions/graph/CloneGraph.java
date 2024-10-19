package br.com.guifr.top75leetcodequestions.graph;

import java.util.*;

public class CloneGraph {

    public Node cloneGraph(Node node) {
        Map<Node,Node> copys = new HashMap<>();
        Stack<Node> toCopy = new Stack<>();
        toCopy.push(node);

        while(!toCopy.empty()){
            Node process = toCopy.pop();
            copys.put(process, new Node(process.val));

            if(process.neighbors != null){
                process.neighbors.
                        stream().filter(n -> !copys.containsKey(n))
                        .forEach(n -> toCopy.push(n));
            }
        }

        copys.entrySet().forEach(e ->{
            ArrayList<Node> listToCopy = new ArrayList<>();
            if (e.getKey().neighbors != null ){
                e.getKey().neighbors.forEach(n->{
                    listToCopy.add(copys.get(n));
                });
                e.getValue().neighbors = listToCopy;
            }
        });


        return copys.get(node);
    }

    private static class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}
