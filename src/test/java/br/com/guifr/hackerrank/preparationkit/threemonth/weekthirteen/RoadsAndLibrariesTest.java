package br.com.guifr.hackerrank.preparationkit.threemonth.weekthirteen;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RoadsAndLibrariesTest {

    @Test
    @DisplayName("Return 12 When call method costPutLibraries Given n = 6, c_lib=2, c_road=5 and cities = [[1,3],[3,4],[2,4],[1,2],[2,3],[5,6]]")
    void test1() {
        int n = 6;
        int c_lib = 2;
        int c_road = 5;
        List<List<Integer>> cities = Arrays.asList(Arrays.asList(1,3),Arrays.asList(3,4),Arrays.asList(2,4),Arrays.asList(1,2),Arrays.asList(2,3),Arrays.asList(5,6));
        long result = RoadsAndLibraries.costPutLibraries(n,c_lib,c_road,cities);
        assertEquals(12,result);
    }


    @Test
    @DisplayName("Return 4 When call method costPutLibraries Given n = 3, c_lib=2, c_road=1 and cities = [[1,2],[3,1],[2,3]]")
    void test2() {
        int n = 3;
        int c_lib = 2;
        int c_road = 1;
        List<List<Integer>> cities = Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,1),Arrays.asList(2,3));
        long result = RoadsAndLibraries.costPutLibraries(n,c_lib,c_road,cities);
        assertEquals(4,result);
    }

    @Test
    @DisplayName("Return 15 When call method costPutLibraries Given n = 5, c_lib=6, c_road=1 and cities = [[1,2],[1,3],[1,4]]")
    void test3() {
        int n = 5;
        int c_lib = 6;
        int c_road = 1;
        List<List<Integer>> cities = Arrays.asList(Arrays.asList(1,2),Arrays.asList(1,3),Arrays.asList(1,4));
        long result = RoadsAndLibraries.costPutLibraries(n,c_lib,c_road,cities);
        assertEquals(15,result);
    }

    //create one more test
    @Test
    @DisplayName("Return 1 When call method costPutLibraries Given n = 1, c_lib=1, c_road=1 and cities = []")
    void test4() {
        int n = 1;
        int c_lib = 1;
        int c_road = 1;
        List<List<Integer>> cities = Arrays.asList();
        long result = RoadsAndLibraries.costPutLibraries(n,c_lib,c_road,cities);
        assertEquals(1,result);
    }



}