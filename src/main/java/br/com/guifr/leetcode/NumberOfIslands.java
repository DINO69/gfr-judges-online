package br.com.guifr.leetcode;


/**
 * link : https://leetcode.com/problems/number-of-islands/
 * Obs.: We don't have unit test
 */
public class NumberOfIslands {

    public int numIslands(char[][] grid) {

//        "123".toCharArray()

        int result = 0;

        for(int x = 0 ; x < grid.length ; x ++){
            for(int y = 0 ; y < grid[x].length ; y ++){
                System.out.printf("[%d][%d] => [%s] | ",x,y,grid[x][y]);
                if(grid[x][y] == '1')
                {
                    result++;
                    processIsland(x,y, grid);
                }
            }
            System.out.printf("\n");
        }
        return result;

    }

    public void processIsland(int x,int y,char[][] grid) {
        if(x < 0 || y < 0) return;
        if(x >= grid.length) return;
        if(y >= grid[x].length) return;

        grid[x][y] = '2';

        if(x+1 < grid.length && grid[x+1][y] == '1') processIsland(x+1,y,grid);
        if(x-1 >= 0 && grid[x-1][y] == '1') processIsland(x-1,y,grid);
        if(y+1 < grid[x].length && grid[x][y+1] == '1') processIsland(x,y+1,grid);
        if(y-1 >= 0 && grid[x][y-1] == '1') processIsland(x,y-1,grid);

    }

}
