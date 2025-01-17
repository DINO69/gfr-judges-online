package br.com.guifr.top75leetcodequestions.graph;

import java.util.*;

public class ShortestDistanceAfterRoadAdditionQueriesBad {

    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {

        int[][] roads = new int [n][n];

        int[] result = new int[queries.length];

        for(int i = 0; i < n ; i++){
            int cost = 0;
            for(int j = i + 1; j < n ; j++){
                roads[i][j] = ++cost;
            }
        }

        int min = n - 1;

        for(int i = 0; i < queries.length ; i++){

            int[] newRoad = queries[i];

            roads[newRoad[0]][newRoad[1]] = 1;

            int calc =  goToLastCity(roads,0,0,min);//thing about got decreasing order

            //print(roads,n);

            min = Math.min(calc,min);

            result[i] = min;
        }


        //print(roads,n);

        return result;
    }

    public void print(int[][] roads,int n){
        for(int ii = 0; ii < n ; ii++){
            System.out.println(Arrays.toString(roads[ii]));
        }
    }

    public int goToLastCity(int[][] roads, int departure, int cost, int min){
        if(cost >= min) return min;

        //System.out.println(departure);

        if(departure == roads.length - 1) {
            //System.out.println("entrou");
            return cost;
        }

        for(int i = departure + 1; i < roads.length;i++){

            int newCost = roads[departure][i] + cost;
            //System.out.println("Cost" + newCost);
            int newMin = goToLastCity(roads, i, newCost, min);

            min = Math.min(newMin,min);

        }

        //System.out.println("Final" + min);

        return min;
    }

}
