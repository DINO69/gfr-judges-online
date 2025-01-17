package br.com.guifr.top75leetcodequestions.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestDistanceAfterRoadAdditionQueriesDFSTest {

    @Test
    @DisplayName("Return [3,2,1] When call ... Given [[2,4],[0,2],[0,4]] and n = 5")
    void test1() {
        int n = 5;
        int[][] queries = new int[][]{{2,4},{0,2},{0,4}};
        int[] result = ShortestDistanceAfterRoadAdditionQueriesDFS.shortestDistanceAfterQueries(n,queries);
        Assertions.assertEquals(3,result.length);
        Assertions.assertEquals(3,result[0]);
        Assertions.assertEquals(2,result[1]);
        Assertions.assertEquals(1,result[2]);
    }

    @Test
    @DisplayName("Return [1,1] When call ... Given [[0,3],[0,2]] and n = 4")
    void test2() {
        int n = 4;
        int[][] queries = new int[][]{{0,3},{0,2}};
        int[] result = ShortestDistanceAfterRoadAdditionQueriesDFS.shortestDistanceAfterQueries(n,queries);
        Assertions.assertEquals(2,result.length);
        Assertions.assertEquals(1,result[0]);
        Assertions.assertEquals(1,result[1]);
    }

    @Test
    @DisplayName("Return [11,11,10] When call ... Given [[2,38],[9,39],[41,43]]\n and n = 47")
    void test3() {
        int n = 47;
        int[][] queries = new int[][]{{2,38},{9,39},{41,43}};

        int[] result = ShortestDistanceAfterRoadAdditionQueriesDFS.shortestDistanceAfterQueries(n,queries);

        Assertions.assertEquals(3,result.length);
        Assertions.assertEquals(11,result[0]);
        Assertions.assertEquals(11,result[1]);
        Assertions.assertEquals(10,result[2]);
    }


}