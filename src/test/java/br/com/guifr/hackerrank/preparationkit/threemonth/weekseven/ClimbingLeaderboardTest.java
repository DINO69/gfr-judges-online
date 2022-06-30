package br.com.guifr.hackerrank.preparationkit.threemonth.weekseven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.Arrays;
import java.util.List;

@Execution(ExecutionMode.SAME_THREAD)
class ClimbingLeaderboardTest {

    @Test
    @DisplayName("Return [4,3,1] When add new players in board With r=[100,90,90,80] p=[70,80,105]")
    public void test1() {
        List<Integer> r = Arrays.asList(100,90,90,80);
        List<Integer> p = Arrays.asList(70,80,105);
        List<Integer> playersPosition = ClimbingLeaderboard.with(r,p);
        Assertions.assertEquals(3,playersPosition.size(),"Size is 3");
        Assertions.assertEquals(4,playersPosition.get(0),"Position player 1 is 4");
        Assertions.assertEquals(3,playersPosition.get(1),"Position player 2 is 3");
        Assertions.assertEquals(1,playersPosition.get(2),"Position player 3 is 1");
    }

    @Test
    @DisplayName("Return [6,4,2,1] When add new players in board With r=[100,...] p=[5,...]")
    public void test2() {
        List<Integer> r = Arrays.asList(100,100,50,40,40,20,10);
        List<Integer> p = Arrays.asList(5,25,50,120);
        List<Integer> playersPosition = ClimbingLeaderboard.with(r,p);
        Assertions.assertEquals(4,playersPosition.size(),"Size is 4");
        Assertions.assertEquals(6,playersPosition.get(0),"Position player 1 is 6");
        Assertions.assertEquals(4,playersPosition.get(1),"Position player 2 is 4");
        Assertions.assertEquals(2,playersPosition.get(2),"Position player 3 is 2");
        Assertions.assertEquals(1,playersPosition.get(3),"Position player 4 is 1");
    }

    @Test
    @DisplayName("Return [6,4,2,1] binarySearch When add new players in board With r=[100,...] p=[5,...]")
    public void test3() {
        List<Integer> r = Arrays.asList(100,100,50,40,40,20,10);
        List<Integer> p = Arrays.asList(5,25,50,120);
        List<Integer> playersPosition = ClimbingLeaderboard.withBinarySearch(r,p);
        Assertions.assertEquals(4,playersPosition.size(),"Size is 4");
        Assertions.assertEquals(6,playersPosition.get(0),"Position player 1 is 6");
        Assertions.assertEquals(4,playersPosition.get(1),"Position player 2 is 4");
        Assertions.assertEquals(2,playersPosition.get(2),"Position player 3 is 2");
        Assertions.assertEquals(1,playersPosition.get(3),"Position player 4 is 1");
    }

}