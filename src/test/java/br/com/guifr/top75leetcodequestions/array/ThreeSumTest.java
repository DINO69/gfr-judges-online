package br.com.guifr.top75leetcodequestions.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class ThreeSumTest {


    @Test
    @DisplayName("Return '[[-1,-1,2],[-1,0,1]]' When call ThreeSum.threeSum Given '[-1,0,1,2,-1,-4]'")
    void test1() {

        List<List<Integer>> result = ThreeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4});

        Assertions.assertEquals(2, result.size());
        Assertions.assertEquals(List.of(-1, -1, 2), result.get(0));
        Assertions.assertEquals(List.of(-1, 0, 1), result.get(1));

    }

    @Test
    @DisplayName("Return '[]' When ThreeSum.threeSum Given '[0,1,1]")
    void test2() {

        List<List<Integer>> result = ThreeSum.threeSum(new int[]{0, 1, 1});

        Assertions.assertEquals(0, result.size());

    }


    @Test
    @DisplayName("Return [[0,0,0]] When ThreeSum.threeSum Given '[0,0,0]'")
    void test3() {

            List<List<Integer>> result = ThreeSum.threeSum(new int[]{0, 0, 0});

            Assertions.assertEquals(1, result.size());
            Assertions.assertEquals(List.of(0, 0, 0), result.get(0));

    }

    @Test
    @DisplayName("Return '[[-1,-1,2],[-1,0,1]]' When call ThreeSum.threeSum2 Given '[-1,0,1,2,-1,-4]'")
    void test1_2() {

        List<List<Integer>> result = ThreeSum.threeSum2(new int[]{-1, 0, 1, 2, -1, -4});

        Assertions.assertEquals(2, result.size());
        Assertions.assertEquals(List.of(-1, -1, 2), result.get(0));
        Assertions.assertEquals(List.of(-1, 0, 1), result.get(1));

    }

    @Test
    @DisplayName("Return '[[-1,-1,2],[-1,0,1]]' When call ThreeSum.threeSum2 Given '[-1,0,1,2,-1,-1,-4]'")
    void test1_3() {

        List<List<Integer>> result = ThreeSum.threeSum2(new int[]{-1, 0, 1, 2, -1,-1, -4});

        Assertions.assertEquals(2, result.size());

        Assertions.assertTrue(result.stream().anyMatch( l -> l.equals(List.of(-1, -1, 2))));
        Assertions.assertTrue(result.stream().anyMatch( l -> l.equals(List.of(-1, 0, 1))));

    }

    @Test
    @DisplayName("Return '[]' When ThreeSum.threeSum2 Given '[0,1,1]")
    void test2_2() {

        List<List<Integer>> result = ThreeSum.threeSum2(new int[]{0, 1, 1});

        Assertions.assertEquals(0, result.size());

    }


    @Test
    @DisplayName("Return [[0,0,0]] When ThreeSum.threeSum2 Given '[0,0,0]'")
    void test3_2() {

        List<List<Integer>> result = ThreeSum.threeSum2(new int[]{0, 0, 0});

        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals(List.of(0, 0, 0), result.get(0));

    }

    @Test
    @DisplayName("Return '[[-2,0,2],[-2,1,1]]' When ThreeSum.threeSum2 Given '[-2,0,1,1,2]'")
    void test4() {

        List<List<Integer>> result = ThreeSum.threeSum2(new int[]{-2,0,1,1,2});

        Assertions.assertEquals(2, result.size());
        Assertions.assertTrue(result.stream().anyMatch( l -> l.equals(List.of(-2,0,2))));
        Assertions.assertTrue(result.stream().anyMatch( l -> l.equals(List.of(-2,1,1))));

    }

}