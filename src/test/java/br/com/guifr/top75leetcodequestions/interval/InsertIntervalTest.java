package br.com.guifr.top75leetcodequestions.interval;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InsertIntervalTest {

    @Test
    @DisplayName("Return [[1,5],[6,9]] When InsertInterval.insert Given interval='[[1,3],[6,9]]' newInterval='[2,5]'")
    void test() {
        int[][] interval = new int[][]{{1,3},{6,9}};
        int[] newInterval = new int[]{2,5};
        int[][] result = InsertInterval.insert(interval,newInterval);
        Assertions.assertEquals(2,result.length);
        Assertions.assertEquals(1,result[0][0]);
        Assertions.assertEquals(5,result[0][1]);
        Assertions.assertEquals(6,result[1][0]);
        Assertions.assertEquals(9,result[1][1]);

    }
    @Test
    @DisplayName("Return [[1,2],[3,10],[12,16]] When InsertInterval.insert Given interval='[[1,2],[3,5],[6,7],[8,10],[12,16]]' newInterval='[4,8]'")
    void tes2() {
        int[][] interval = new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = new int[]{4,8};
        int[][] result = InsertInterval.insert(interval,newInterval);
        Assertions.assertEquals(3,result.length);
        Assertions.assertEquals(1,result[0][0]);
        Assertions.assertEquals(2,result[0][1]);
        Assertions.assertEquals(3,result[1][0]);
        Assertions.assertEquals(10,result[1][1]);
        Assertions.assertEquals(12,result[2][0]);
        Assertions.assertEquals(16,result[2][1]);

    }
    @Test
    @DisplayName("Return [[5,7]] When InsertInterval.insert Given interval='[]' newInterval='[5,7]'")
    void tes3() {
        int[][] interval = new int[][]{};
        int[] newInterval = new int[]{5,7};
        int[][] result = InsertInterval.insert(interval,newInterval);
        Assertions.assertEquals(1,result.length);
        Assertions.assertEquals(5,result[0][0]);
        Assertions.assertEquals(7,result[0][1]);

    }
    @Test
    @DisplayName("Return [[1,5],[6,8]] When InsertInterval.insert Given interval='[[1,5]]' newInterval='[6,8]'")
    void tes4() {
        int[][] interval = new int[][]{{1,5}};
        int[] newInterval = new int[]{6,8};
        int[][] result = InsertInterval.insert(interval,newInterval);
        Assertions.assertEquals(2,result.length);
        Assertions.assertEquals(1,result[0][0]);
        Assertions.assertEquals(5,result[0][1]);
        Assertions.assertEquals(6,result[1][0]);
        Assertions.assertEquals(8,result[1][1]);
    }

    @Test
    @DisplayName("Return [[1,8]] When InsertInterval.insert Given interval='[[1,5]]' newInterval='[2,8]'")
    void tes5() {
        int[][] interval = new int[][]{{1,5}};
        int[] newInterval = new int[]{2,8};
        int[][] result = InsertInterval.insert(interval,newInterval);
        Assertions.assertEquals(1,result.length);
        Assertions.assertEquals(1,result[0][0]);
        Assertions.assertEquals(8,result[0][1]);
    }

    @Test
    @DisplayName("Return [[0,0],[1,5]] When InsertInterval.insert Given interval='[[1,5]]' newInterval='[0,0]'")
    void tes6() {
        int[][] interval = new int[][]{{1,5}};
        int[] newInterval = new int[]{0,0};
        int[][] result = InsertInterval.insert(interval,newInterval);
        Assertions.assertEquals(2,result.length);
        Assertions.assertEquals(0,result[0][0]);
        Assertions.assertEquals(0,result[0][1]);
        Assertions.assertEquals(1,result[1][0]);
        Assertions.assertEquals(5,result[1][1]);
    }

    @Test
    @DisplayName("Return [[3,5],[6,6],[12,15]] When InsertInterval.insert Given interval='[[3,5],[12,15]]' newInterval='[6,6]'")
    void tes7() {
        int[][] interval = new int[][]{{3,5},{12,15}};
        int[] newInterval = new int[]{6,6};
        int[][] result = InsertInterval.insert(interval,newInterval);
        Assertions.assertEquals(3,result.length);
        Assertions.assertEquals(3,result[0][0]);
        Assertions.assertEquals(5,result[0][1]);
        Assertions.assertEquals(6,result[1][0]);
        Assertions.assertEquals(6,result[1][1]);
        Assertions.assertEquals(12,result[2][0]);
        Assertions.assertEquals(15,result[2][1]);
    }
}