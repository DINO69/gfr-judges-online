package br.com.guifr.top75leetcodequestions.dynamicprogramming;

import java.util.*;

public class MinimumNumberVisitedCellsGrid {

    public int minimumVisitedCells(int[][] grid) {

        int result = minimumVisitedCells(grid, 0 , 0, 1, new HashMap<>(), Integer.MAX_VALUE);

        return result != Integer.MAX_VALUE ? result : -1;
    }

    public int minimumVisitedCells(int[][] grid, int i, int j, int jump, Map<Pair, Integer> visited, int maxJump) {
        if(grid.length - 1 == i && grid[i].length - 1 == j) return jump;

        if( i >= grid.length ) return Integer.MAX_VALUE;

        if( j >= grid[i].length ) return Integer.MAX_VALUE;

        Pair visit = new Pair(i,j);

        if(visited.get(visit) != null){
            int r = visited.get(visit);
            if(r <= jump || r == Integer.MAX_VALUE) return r;
        }

        if(jump >= maxJump) return maxJump;

        int toJump = grid[i][j];

        int result = Integer.MAX_VALUE;

        while(toJump > 0){
            result = Math.min(minimumVisitedCells(grid, i, j + toJump, jump + 1, visited, result), result);
            toJump--;
        }

        toJump = grid[i][j];

        while(toJump > 0){
            result = Math.min(minimumVisitedCells(grid, i + toJump, j, jump + 1, visited, result), result);
            toJump--;
        }


        visited.put(visit,result);

        //System.out.println(visited);

        return result;
    }

    //FAZER COM FILA!!!!

//    public int minimumVisitedCells(int[][] grid) {
//
//        Map<Pair,Integer> visited = new HashMap<>();
//        int result = minimumVisitedCells(grid, 0 , 0, 1, visited, new HashMap<>(), Integer.MAX_VALUE);
//
//        //System.out.println(visited.size());
//
//        return result != Integer.MAX_VALUE ? result : -1;
//    }
//
//    public int minimumVisitedCells(int[][] grid, int i, int j, int jump, Map<Pair, Integer> visited,Map<Pair, Integer> arrival, int maxJump) {
//        if(grid.length - 1 == i && grid[i].length - 1 == j) return jump;
//
//        if( i >= grid.length ) return Integer.MAX_VALUE;
//
//        if( j >= grid[i].length ) return Integer.MAX_VALUE;
//
//        Pair visit = new Pair(i,j);
//
//        if(visited.get(visit) != null){
//            int r = visited.get(visit);
//            int arrived = arrival.get(visit);
//
//
//            if(r == Integer.MAX_VALUE || jump >= r) return Integer.MAX_VALUE;
//
//            visited.put(visit,jump);
//
//            if(arrived != Integer.MAX_VALUE){
//                int distance = arrived - r;
//                arrival.put(visit,distance + jump);
//                return distance + jump;
//            }
//
//        }
//
//        if(jump >= maxJump) return Integer.MAX_VALUE;
//
//        visited.put(visit,jump);
//
//        int toJump = grid[i][j];
//
//        int result = Integer.MAX_VALUE;
//
//        while(toJump > 0){
//            result = Math.min(minimumVisitedCells(grid, i, j + toJump, jump + 1, visited, arrival, result), result);
//            result = Math.min(minimumVisitedCells(grid, i + toJump, j, jump + 1, visited, arrival, result), result);
//            toJump--;
//        }
//
//        //System.out.println(visited);
//        arrival.put(visit,result);
//        //System.out.println(arrival);
//        //if(result == Integer.MAX_VALUE) visited.put(visit,Integer.MAX_VALUE);
//
//        return result;
//    }

    private class Pair {
        int i;
        int j;

        public Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return i == pair.i && j == pair.j;
        }

        @Override
        public int hashCode() {
            return Objects.hash(i, j);
        }
    }
}
