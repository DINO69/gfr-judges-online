package br.com.guifr.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class JumpingCloudsTest {

    @Test
    @DisplayName("Return 4 when the clouds is 0 0 1 0 0 1 0")
    public void test1(){
        int actual = JumpingClouds.jumpingOnClouds(Arrays.asList(0,0,1,0,0,1,0));
        assertEquals(4,actual);
    }

    @Test
    @DisplayName("Return 3 when the clouds is 0 0 0 0 1 0")
    public void test2(){
        int actual = JumpingClouds.jumpingOnClouds(Arrays.asList(0,0,0,0,1,0));
        assertEquals(3,actual);
    }

    @Test
    @DisplayName("Return 3 when the clouds is 0 0 0 1 0 0")
    public void test3(){
        int actual = JumpingClouds.jumpingOnClouds(Arrays.asList(0,0,0,1,0,0));
        assertEquals(3,actual);
    }


    @Test
    @DisplayName("Return 1 when the clouds is 0 0")
    public void test4(){
        int actual = JumpingClouds.jumpingOnClouds(Arrays.asList(0,0));
        assertEquals(1,actual);
    }

    @Test
    @DisplayName("Return 3 when the clouds is 0 0 1 0 0")
    public void test5(){
        int actual = JumpingClouds.jumpingOnClouds(Arrays.asList(0,0,1,0,0));
        assertEquals(3,actual);
    }

}