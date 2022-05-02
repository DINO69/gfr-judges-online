package br.com.guifr.hackerrank;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NewYearChaosTest {

    @Test
    @DisplayName("Return '4' when people bribes other with queue 2 1 5 4 3")
    public void test0(){
        String actual = NewYearChaos.queue(Arrays.asList(2,1,5,4,3)).howManyBribes();
        assertEquals("4",actual);
    }

    @Test
    @DisplayName("Return '3' when people bribes other with queue 2 1 5 3 4")
    public void test1(){
        String actual = NewYearChaos.queue(Arrays.asList(2,1,5,3,4)).howManyBribes();
        assertEquals("3",actual);
    }

    @Test
    @DisplayName("Return 'Too chaotic' when people bribes other with queue 4 1 2 3")
    public void test2(){
        String actual = NewYearChaos.queue(Arrays.asList(4,1,2,3)).howManyBribes();
        assertEquals("Too chaotic",actual);
    }

    @Test
    @DisplayName("Return '1' when people bribes other with queue 1 2 3 5 4 6 7 8")
    public void test3(){
        String actual = NewYearChaos.queue(Arrays.asList(1,2,3,5,4,6,7,8)).howManyBribes();
        assertEquals("1",actual);
    }

    @Test
    @DisplayName("Return 'Too chaotic' when people bribes other with queue 2 5 1 3 4")
    public void test4(){
        String actual = NewYearChaos.queue(Arrays.asList(2,5,1,3,4)).howManyBribes();
        assertEquals("Too chaotic",actual);
    }

    @Test
    @DisplayName("Return '7' when people bribes other with queue 1 2 5 3 7 8 6 4")
    public void test5(){
        String actual = NewYearChaos.queue(Arrays.asList(1,2,5,3,7,8,6,4)).howManyBribes();
        assertEquals("7",actual);
    }

    @Test
    @DisplayName("Return '7' when CALC people bribes other with queue 1 2 5 3 7 8 6 4")
    public void test6(){
        String actual = NewYearChaos.queue(Arrays.asList(1,2,5,3,7,8,6,4)).calc();
        assertEquals("7",actual);
    }

}