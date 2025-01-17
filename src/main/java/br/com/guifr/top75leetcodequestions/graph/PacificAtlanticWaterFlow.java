package br.com.guifr.top75leetcodequestions.graph;

import java.util.*;

public class PacificAtlanticWaterFlow {

    public static void main(String[] args) {
//        System.out.println(pacificAtlantic(new int[][]{{1,2,3},{8,9,4},{7,6,5}}));
        System.out.println(pacificAtlantic(new int[][]{{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}}));
    }

    public static List<List<Integer>> pacificAtlantic(int[][] heights) {

        List<List<Integer>> result = new ArrayList<>();
        Map<Pair,Boolean> results = new HashMap<>();

        for(int m = 0 ; m < heights.length;m++){
            for(int n = 0 ; n < heights[m].length;n++){

                //System.out.println(heights[m][n]);
                boolean pacific = canGoBothOcean(heights[m][n],m,n,heights,true,false,results,new HashSet<>());
                boolean atlantic = canGoBothOcean(heights[m][n],m,n,heights,false,true,results,new HashSet<>());
                if(pacific && atlantic){
                    result.add(List.of(m,n));
                }

            }

        }

        return result;
    }

    public static boolean canGoBothOcean(int originValue, int m,int n, int[][] heights, boolean pacific, boolean atlantic,
                                  Map<Pair,Boolean> results, Set<Pair> visited){

        if(m < 0 || m >= heights.length) return false;

        if(n < 0 || n >= heights[m].length) return false;

        if(heights[m][n] > originValue) return false;

        //Atlantic ocean
        if(atlantic && (m == heights.length - 1 || n == heights[m].length - 1))
            return true;

        //pacific ocean
        if(pacific && (m == 0 || n == 0))
            return true;

        Pair p = new Pair(m,n);

        // if(results.get(p) != null)
        // return results.get(p);

        if(visited.contains(p))
            return false;

        visited.add(p);

        originValue = heights[m][n];

        boolean result =
                canGoBothOcean(originValue,m+1,n,heights,pacific,atlantic,results,visited) ||
                        canGoBothOcean(originValue,m,n+1,heights,pacific,atlantic,results,visited) ||
                        canGoBothOcean(originValue,m,n-1,heights,pacific,atlantic,results,visited) ||
                        canGoBothOcean(originValue,m-1,n,heights,pacific,atlantic,results,visited);

        results.put(p,result);

        return result;

    }

    private static class Pair {
        int m,n;
        public Pair(int m, int n) {
            this.m = m;
            this.n = n;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return m == pair.m && n == pair.n;
        }

        @Override
        public int hashCode() {
            return Objects.hash(m, n);
        }
    }
}
