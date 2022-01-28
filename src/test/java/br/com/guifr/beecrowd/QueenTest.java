package br.com.guifr.beecrowd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class QueenTest {

    @Test
    @DisplayName("Return 1 when The Queen started 4 4 and ended 6 2")
    public void test1() {
        int actual = Queen.started(4, 4).endedIn(6, 2).howMoves();
        assertEquals(1, actual);
    }

    @Test
    @DisplayName("Return 0 when The Queen started 3 5 and ended 2 5")
    public void test2() {
        int actual = Queen.started(3, 5).endedIn(3, 5).howMoves();
        assertEquals(0, actual);
    }

    @Test
    @DisplayName("Return 2 when The Queen started 8 8 and ended 2 1")
    public void test3() {
        int actual = Queen.started(8, 8).endedIn(2, 1).howMoves();
        assertEquals(2, actual);
    }

    @Test
    @DisplayName("Return 1 when search in x axle to right")
    public void test4() {
        int actual = Queen.started(5, 5).endedIn(6, 5).search(5, 5, 0);
        assertEquals(1, actual);
    }

    @Test
    @DisplayName("Return 1 when search in x axle to left")
    public void test5() {
        int actual = Queen.started(5, 5).endedIn(4, 5).search(5, 5, 0);
        assertEquals(1, actual);
    }

    @Test
    @DisplayName("Return 1 when search in y axle to up")
    public void test6() {
        int actual = Queen.started(5, 5).endedIn(5, 6).search(5, 5, 0);
        assertEquals(1, actual);
    }

    @Test
    @DisplayName("Return 1 when search in y axle to down")
    public void test7() {
        int actual = Queen.started(5, 5).endedIn(5, 4).search(5, 5, 0);
        assertEquals(1, actual);
    }

    @Test
    @DisplayName("Return 2 when The Queen started 3 4 and ended 5 7")
    public void test8() {
        int actual = Queen.started(3, 4).endedIn(5, 7).howMoves();
        assertEquals(2, actual);
    }

    @ParameterizedTest(name = "{index} - Return [{0}] when The Queen started [{1}] [{2}] and ended [{3}] [{4}]")
    @MethodSource("parametros")
    public void test9(int result, int x1,int y1,int x2,int y2) {
        int actual = Queen.started(x1, y1).endedIn(x2, y2).howMoves();
        assertEquals(result, actual);
    }

    public static Stream<Arguments> parametros() {

        return Stream.of(
                Arguments.of(0, 3, 7, 3, 7),
                Arguments.of(1, 1, 1, 8, 8),
                Arguments.of(1, 2, 1, 5, 4),
                Arguments.of(1, 8, 3, 6, 1),
                Arguments.of(1, 1, 5, 4, 8),
                Arguments.of(1, 2, 1, 2, 6),
                Arguments.of(1, 5, 3, 8, 3),
                Arguments.of(2, 3, 4, 5, 7),
                Arguments.of(2, 8, 8, 2, 1)
        );

    }


    @Test
    @DisplayName("Return 1 when search diagonal in x axle to right up")
    public void test10() {
        int actual = Queen.started(5, 5).endedIn(6, 6).search(5, 5, 0);
        assertEquals(1, actual);
    }

    @Test
    @DisplayName("Return 1 when search diagonal in x axle to left up")
    public void test11() {
        int actual = Queen.started(5, 5).endedIn(4, 6).search(5, 5, 0);
        assertEquals(1, actual);
    }

    @Test
    @DisplayName("Return 1 when search diagonal in x axle to right down")
    public void test12() {
        int actual = Queen.started(5, 5).endedIn(6, 4).search(5, 5, 0);
        assertEquals(1, actual);
    }

    @Test
    @DisplayName("Return 1 when search diagonal in x axle to left down")
    public void test13() {
        int actual = Queen.started(5, 5).endedIn(4, 4).search(5, 5, 0);
        assertEquals(1, actual);
    }


    @Test
    @DisplayName("Return true when ask position x y equal 1")
    public void test14() {
        boolean actual = Queen.started(5, 5).endedIn(4, 4).searchEndPositionQueen(4,4,0);
        assertTrue(actual);
    }

    @Test
    @DisplayName("Return false when ask can go to position x y")
    public void test15() {
        boolean actual = Queen.started(5, 5).endedIn(4, 4).canGoTo(4,4);
        assertFalse(actual);
    }

    @Test
    @DisplayName("Return false when ask can go to position x y")
    public void test16() {
        boolean actual = Queen.started(5, 5).endedIn(4, 4).canGoTo(4,3);
        assertTrue(actual);
    }


}