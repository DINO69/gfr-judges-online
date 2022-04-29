package br.com.guifr.hackerrank.datastructures.queues;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static br.com.guifr.hackerrank.datastructures.queues.CastleOnTheGrid.*;
import static org.junit.jupiter.api.Assertions.*;

class CastleOnTheGridTest {

    @Test
    @DisplayName("Return 2 When go to goal With grid 1 / 0 0 1 2")
    public void test1() {

        List<String> grid = Arrays.asList("...",".X.","...");

        int startX = 0;
        int startY = 0;
        int goalX = 1;
        int goalY = 2;

        int actual = minimumMovesIn(grid,startX,startY,goalX, goalY);
        assertEquals(2,actual);
    }

    @Test
    @DisplayName("Return [[...][.X.][...]] When build grid With input grip of number 1")
    public void testbuild1() {

        List<String> grid = Arrays.asList("...",".X.","...");


        List<List<String>> actual = build(grid);
        assertEquals(3,actual.size(), "Size X is 3");
        assertEquals(3,actual.get(0).size(), "Size Y is 3");
        assertTrue(Arrays.asList(".",".",".").equals(actual.get(0)), "first element is [...]");
        assertTrue(Arrays.asList(".","X",".").equals(actual.get(1)), "second element is [.X.]");
        assertTrue(Arrays.asList(".",".",".").equals(actual.get(2)), "third element is [...]");
    }

    @Test
    @DisplayName("Return 3 When go to goal With grid 2 / 0 0 0 2")
    public void test2() {

        List<String> grid = Arrays.asList(".X.",".X.", "...");

        int startX = 0;
        int startY = 0;
        int goalX = 0;
        int goalY = 2;

        int actual = minimumMovesIn(grid,startX,startY,goalX, goalY);
        assertEquals(3,actual);
    }

    @Test
    @DisplayName("Return [[.X.][.X.][...]] When build grid With input grip of number 2")
    public void testbuild2() {

        List<String> grid = Arrays.asList(".X.",".X.", "...");


        List<List<String>> actual = build(grid);
        assertEquals(3,actual.size(), "Size X is 3");
        assertEquals(3,actual.get(0).size(), "Size Y is 3");
        assertTrue(Arrays.asList(".","X",".").equals(actual.get(0)), "first element is [.X.]");
        assertTrue(Arrays.asList(".","X",".").equals(actual.get(1)), "second element is [.X.]");
        assertTrue(Arrays.asList(".",".",".").equals(actual.get(2)), "third element is [...]");
    }

    @Test
    @DisplayName("Return true When point in grip exist and different 'X' With position valid")
    public void testValidPoint1() {

        List<List<String>> grid = Arrays.asList(
                Arrays.asList(".","X"),
                Arrays.asList("X",".")
        );
        PositionGrid positionGrid = new PositionGrid(0,0,0);
        boolean actual = isValid(positionGrid,grid);
        assertTrue(actual);
    }

    @Test
    @DisplayName("Return false When point in grip exist and equal 'X' With position invalid")
    public void testValidPoint2() {

        List<List<String>> grid = Arrays.asList(
                Arrays.asList(".","X"),//x0
                Arrays.asList("X",".")//x1
        );
        PositionGrid positionGrid = new PositionGrid(0,1,0);
        boolean actual = isValid(positionGrid,grid);
        assertFalse(actual);
    }

    @Test
    @DisplayName("Return false When point in grip don't exist because X>=grid.size With position invalid")
    public void testValidPoint3() {

        List<List<String>> grid = Arrays.asList(
                Arrays.asList(".","X"),//x0
                Arrays.asList("X",".")//x1
        );
        PositionGrid positionGrid = new PositionGrid(2,1,0);
        boolean actual = isValid(positionGrid,grid);
        assertFalse(actual);
    }

    @Test
    @DisplayName("Return false When point in grip don't exist because X<0 With position invalid")
    public void testValidPoint4() {

        List<List<String>> grid = Arrays.asList(
                Arrays.asList(".","X"),//x0
                Arrays.asList("X",".")//x1
        );
        PositionGrid positionGrid = new PositionGrid(-3,1,0);
        boolean actual = isValid(positionGrid,grid);
        assertFalse(actual);
    }

    @Test
    @DisplayName("Return false When point in grip don't exist because Y>=grid.size With position invalid")
    public void testValidPoint5() {

        List<List<String>> grid = Arrays.asList(
                Arrays.asList(".","X"),//x0
                Arrays.asList("X",".")//x1
        );
        PositionGrid positionGrid = new PositionGrid(0,2,0);
        boolean actual = isValid(positionGrid,grid);
        assertFalse(actual);
    }

    @Test
    @DisplayName("Return false When point in grip don't exist because Y<0 With position invalid")
    public void testValidPoint6() {

        List<List<String>> grid = Arrays.asList(
                Arrays.asList(".","X"),//x0
                Arrays.asList("X",".")//x1
        );
        PositionGrid positionGrid = new PositionGrid(0,-1,0);
        boolean actual = isValid(positionGrid,grid);
        assertFalse(actual);
    }

}