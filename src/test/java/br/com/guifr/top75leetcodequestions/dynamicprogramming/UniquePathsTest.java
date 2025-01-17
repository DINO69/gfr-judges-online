package br.com.guifr.top75leetcodequestions.dynamicprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniquePathsTest {

    @Test
    @DisplayName("Return '28' When UniquePaths.uniquePaths Given m=3 n=7")
    void test1() {
        Assertions.assertEquals(28,UniquePaths.uniquePaths(3,7));
    }

    @Test
    @DisplayName("Return '3' When UniquePaths.uniquePaths Given m=3 n=2")
    void test2() {
        Assertions.assertEquals(3,UniquePaths.uniquePaths(3,2));
    }

    @Test
    @DisplayName("Return '4' When UniquePaths.uniquePaths Given m=4 n=2")
    void test3() {
        Assertions.assertEquals(4,UniquePaths.uniquePaths(4,2));
    }

    @Test
    @DisplayName("Return '10' When UniquePaths.uniquePaths Given m=4 n=3")
    void test4() {
        Assertions.assertEquals(10,UniquePaths.uniquePaths(4,3));
    }
    @Test
    @DisplayName("Return '3' When UniquePaths.uniquePaths Given m=2 n=3")
    void test5() {
        Assertions.assertEquals(3,UniquePaths.uniquePaths(2,3));
    }

    @Test
    @DisplayName("Return '6' When UniquePaths.uniquePaths Given m=3 n=3")
    void test6() {
        Assertions.assertEquals(6,UniquePaths.uniquePaths(3,3));
    }

    @Test
    @DisplayName("Return '6' When UniquePaths.uniquePaths Given m=5 n=3")
    void test7() {
        Assertions.assertEquals(15,UniquePaths.uniquePaths(5,3));
    }

    @Test
    @DisplayName("Return '6' When UniquePaths.uniquePaths Given m=6 n=3")
    void test8() {
        Assertions.assertEquals(21,UniquePaths.uniquePaths(6,3));
    }
    @Test
    @DisplayName("Return '7' When UniquePaths.uniquePaths Given m=7 n=3")
    void test9() {
        Assertions.assertEquals(28,UniquePaths.uniquePaths(7,3));
    }
    @Test
    @DisplayName("Return '84' When UniquePaths.uniquePaths Given m=7 n=4")
    void test10() {
        Assertions.assertEquals(84,UniquePaths.uniquePaths(7,4));
        Assertions.assertEquals(84,UniquePaths.uniquePaths(7,4));
    }
//    1 2 3 4 5 6 7
//    1 3 4 5 6 7 8
//    1 3 6 10 15 21 28

}