package br.com.guifr.hackerrank;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountingValleysTest {

    @Test
    @DisplayName("Return 1 When the step hike is UDDDUDUU")
    public void test1(){
        int actual = CountingValleys.stepsHike(8,"UDDDUDUU");
        assertEquals(1,actual);
    }

    @Test
    @DisplayName("Return 1 When the step hike is DDUUUUDD")
    public void test2(){
        int actual = CountingValleys.stepsHike(8,"DDUUUUDD");
        assertEquals(1,actual);
    }

    @Test
    @DisplayName("Return 2 When the step hike is DDUUUUDDDU")
    public void test3(){
        int actual = CountingValleys.stepsHike(10,"DDUUUUDDDU");
        assertEquals(2,actual);
    }

    @Test
    @DisplayName("Return 2 When the step hike is DDUUDDUDUUUD")
    public void test4(){
        int actual = CountingValleys.stepsHike(12,"DDUUDDUDUUUD");
        assertEquals(2,actual);
    }

}