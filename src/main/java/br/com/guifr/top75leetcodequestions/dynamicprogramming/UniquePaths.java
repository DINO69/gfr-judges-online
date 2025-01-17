package br.com.guifr.top75leetcodequestions.dynamicprogramming;


import java.util.Arrays;

public class UniquePaths {


    public static int uniquePaths(int m, int n) {

        int[][] grid = new int[m][n];
//        return calc(0,0,m,n);
        int result = calc(0,0,grid);

        print(grid);

        return result;

    }

    private static void print(int[][] grid) {
        for(int[] row : grid){
            System.out.println(Arrays.toString(row));
        }
    }

    private static int calc(int row, int column, int[][] grid) {
        if(row >= grid.length) return 0;
        if(column >= grid[row].length) return 0;

        if(row == grid.length - 1 && column == grid[row].length - 1)
            return 1;

        if(grid[row][column] > 0) return grid[row][column];

        int result = calc(row,column + 1,grid) + calc(row+1 ,column, grid);

        grid[row][column] = result;

        return result;

    }

    //easier solution but lazy
    private static int calc(int row, int column, int m, int n) {
        if(row >= m) return 0;
        if(column >= n) return 0;
        if(row == m - 1 && column == n-1) return 1;
        return calc(row,column + 1,m, n) + calc(row+1 ,column,m, n);
    }

}
