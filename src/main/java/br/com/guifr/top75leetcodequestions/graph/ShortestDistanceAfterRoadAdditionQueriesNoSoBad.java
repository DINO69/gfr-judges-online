package br.com.guifr.top75leetcodequestions.graph;

import java.util.*;

public class ShortestDistanceAfterRoadAdditionQueriesNoSoBad {

    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {

        Map<Integer,List<Integer>> higherCity = new HashMap<>();

        List<Integer> sources = new ArrayList<>();

        sources.add(0);

        int min = n - 1;

        int[] result = new int[queries.length];

        for(int i = 0; i < queries.length; i++){

            int[] road = queries[i];

            if(higherCity.get(road[0]) == null ){
                higherCity.put(road[0], new ArrayList<>());
            }

            higherCity.get(road[0]).add(road[1]);

            sources.add(road[0]);
            Collections.sort(sources);//We can Use ProriatyQueue

            int cost = goBestWay(higherCity, sources, 0, 0, 0, min,n);

            min = Math.min(min, cost);

            result[i] = min;

        }


        return result;

    }

    public int goBestWay(Map<Integer,List<Integer>> higherCity, List<Integer> newRoads, int indexSource, int source, int cost, int min, int n){

        if(cost >= min) return min;

        if(indexSource >= newRoads.size()) return min;

        int tempIndexSource = indexSource;

        int sourceCity = source;

        while(tempIndexSource < newRoads.size()){
            sourceCity = newRoads.get(tempIndexSource);
            if(newRoads.get(tempIndexSource) > source) break;
            tempIndexSource++;
        }

        int costFrom   = sourceCity - source;

        min = Math.min(min, goBestWay(higherCity, newRoads, tempIndexSource, sourceCity, cost + costFrom, min,n));

        if(higherCity.get(source) != null){
            //jump + 1;
            List<Integer> sources = higherCity.get(source);
            for(int i = 0; i < sources.size(); i++){
                int s = sources.get(i);
                min = Math.min(min, goBestWay(higherCity, newRoads, indexSource, s, cost + 1, min,n));
            }

        }


        return Math.min(min, (n - 1 - source) + cost);
    }




}
