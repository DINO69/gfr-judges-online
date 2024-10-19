package br.com.guifr.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class AsteroidCollisionTest {

    @Test
    @DisplayName("Return [5,10] When analysis asteroidCollision Given [5,10,-5]")
    void test1() {
        AsteroidCollision asteroidCollision = new AsteroidCollision();
        int[] asteroids = new int[]{5,10,-5};
        int[] result = asteroidCollision.asteroidCollision(asteroids);
        assertArrayEquals(new int[]{5,10}, result, Arrays.toString(result));
    }

    @Test
    @DisplayName("Return [] When analysis asteroidCollision Given [8,-8]")
    void test2() {
        AsteroidCollision asteroidCollision = new AsteroidCollision();
        int[] asteroids = new int[]{8,-8};
        int[] result = asteroidCollision.asteroidCollision(asteroids);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    @DisplayName("Return [10] When analysis asteroidCollision Given [10,2,-5]")
    void test3() {
        AsteroidCollision asteroidCollision = new AsteroidCollision();
        int[] asteroids = new int[]{10,2,-5};
        int[] result = asteroidCollision.asteroidCollision(asteroids);
        assertArrayEquals(new int[]{10}, result);
    }

    @Test
    @DisplayName("Return [-2,-1,1,2] When analysisCollision Given [-2,-1,1,2]")
    void test4() {
        AsteroidCollision asteroidCollision = new AsteroidCollision();
        int[] asteroids = new int[]{-2,-1,1,2};
        int[] result = asteroidCollision.asteroidCollision(asteroids);
        assertArrayEquals(new int[]{-2,-1,1,2}, result, Arrays.toString(result));
    }

    @Test
    @DisplayName("Return [-2,-1,2] When analysisCollision Given [-2,-1,1,-1,2]")
    void test5() {
        AsteroidCollision asteroidCollision = new AsteroidCollision();
        int[] asteroids = new int[]{-2,-1,1,-1,2};
        int[] result = asteroidCollision.asteroidCollision(asteroids);
        assertArrayEquals(new int[]{-2,-1,2}, result);
    }
    @Test
    @DisplayName("Return [-2,-2,-1] When analysisCollision Given [-2,1,-2,-1]")
    void test6() {
        AsteroidCollision asteroidCollision = new AsteroidCollision();
        int[] asteroids = new int[]{-2,1,-2,-1};
        int[] result = asteroidCollision.asteroidCollision(asteroids);
        assertEquals(Arrays.toString(new int[]{-2,-2,-1}), Arrays.toString(result));
        assertArrayEquals(new int[]{-2,-2,-1}, result);
    }

    @Test
    @DisplayName("Return [-2,2,1] When analysisCollision Given [-2,2,-1,1]")
    void test7() {
        AsteroidCollision asteroidCollision = new AsteroidCollision();
        int[] asteroids = new int[]{-2,2,-1,1};
        int[] result = asteroidCollision.asteroidCollision(asteroids);
        assertEquals(Arrays.toString(new int[]{-2,2,1}), Arrays.toString(result));
        assertArrayEquals(new int[]{-2,2,1}, result);
    }
}