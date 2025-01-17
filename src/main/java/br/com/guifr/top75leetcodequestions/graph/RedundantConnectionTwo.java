package br.com.guifr.top75leetcodequestions.graph;

import java.util.*;

public class RedundantConnectionTwo {


    public int[] findRedundantDirectedConnection(int[][] edges) {


        Map<Integer, List<Integer>> nodes = new HashMap<>();

        for(int[] edge: edges){
            int parent = edge[0];
            int child = edge[1];

            if(nodes.get(parent) == null){
                nodes.put(parent,new ArrayList<>());
            }
            nodes.get(parent).add(child);
        }

        System.out.println(nodes);

        for(int[] edge: edges){
            int parent = edge[0];
            int child = edge[1];

            boolean could = tryVisitedAllWithout(nodes,edge,new HashSet<>(),1);

        }

        return edges[2];

    }

    public boolean tryVisitedAllWithout(Map<Integer,List<Integer>> nodes, int[] edge, Set<Integer> visited, int amountNodes){


//        while()

            return visited.size() == amountNodes;

    }

}
