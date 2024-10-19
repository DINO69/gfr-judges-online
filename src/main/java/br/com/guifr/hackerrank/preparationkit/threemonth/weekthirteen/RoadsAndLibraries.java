package br.com.guifr.hackerrank.preparationkit.threemonth.weekthirteen;

import java.util.ArrayList;
import java.util.List;

public class RoadsAndLibraries {

    public static long costPutLibraries(int cities, int cLib, int cRoad, List<List<Integer>> conn) {
        if(cLib <= cRoad) return (long) cLib * cities;
        Graph graph = new Graph(cities);
        conn.forEach(c -> {
            int city1 = c.get(0) - 1;
            int city2 = c.get(1) - 1;
            graph.graph.get(city1).add(city2);
            graph.graph.get(city2).add(city1);
        });
        return costPutLibraries(graph,cLib,cRoad);
    }

    private static long costPutLibraries(Graph graph, long cLib, long cRoad) {
        int cities = graph.length;
        boolean[] visited = new boolean[cities];
        long result = 0;
        for(int city = 0; city < cities; city++){
            if(!visited[city]){
                int roads = dfs(graph,city,visited);
                result += cLib + cRoad * (roads - 1);
            }
        }
        return result;
    }

    private static int dfs(Graph graph, int city, boolean[] visited) {
        if(!visited[city]){
            visited[city] = true;
            int roads = 0;
            for(int adj : graph.graph.get(city)){
                roads += dfs(graph,adj,visited);
            }
            return roads + 1;
        }
        return 0;
    }

    private static class Graph {
        List<List<Integer>> graph;
        int length;
        public Graph(int cities) {
            this.length = cities;
            this.graph = new ArrayList<>(cities);
            for(int i = 0; i < cities; i++){
                this.graph.add(new ArrayList<>());
            }
        }
    }
}
