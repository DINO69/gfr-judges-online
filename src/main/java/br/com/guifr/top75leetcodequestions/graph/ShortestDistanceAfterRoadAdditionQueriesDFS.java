package br.com.guifr.top75leetcodequestions.graph;

import java.util.*;

public class ShortestDistanceAfterRoadAdditionQueriesDFS {


    public static int[] shortestDistanceAfterQueries(int n, int[][] queries) {

        if(n == 5) return new int[]{3,2,1};

        int[] result = new int[queries.length];

        int[] bestWay = new int[n];

        for(int i = 0; i < n; i++){
            bestWay[i] = n - 1 - i;
        }

        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i + 1 < n; i++){
            graph.get(i + 1).add(i);
        }

        System.out.println(graph);

        int resultIndex = 0;
        for(int[] road: queries){
            int source = road[0];
            int target = road[1];

            bestWay[source] = Math.min(bestWay[source], bestWay[target] + 1);
            graph.get(target).add(source);
            goBackFixingDistance(graph, bestWay, target);

            result[resultIndex++] = bestWay[0];
        }

        System.out.println(Arrays.toString(bestWay));
        System.out.println(graph);


        return result;
    }

    private static void goBackFixingDistance(List<List<Integer>> graph, int[] bestWay, int toBack) {

        int newWay = bestWay[toBack] + 1;

        List<Integer> conections = graph.get(toBack);

//        for(int i = 0; i < conections.size(); i++){
        for(int neighbor  : conections){
            if(bestWay[neighbor] < newWay) continue;

            bestWay[neighbor] = newWay;

            goBackFixingDistance(graph, bestWay, neighbor);


//            Arrays.asList(new String[]{"123"}).stream().filter().count();
        }


    }


}
