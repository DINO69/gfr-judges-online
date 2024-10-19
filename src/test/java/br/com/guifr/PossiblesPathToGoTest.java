package br.com.guifr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class PossiblesPathToGoTest {


    /**
    * <p>| |x| |</p>
    * <p>|5|2|4|</p>
    * <p>|6|0|3|</p>
    * <p>|7|1|x|</p>
    *
    * */
    @Test
    @DisplayName("Return 7 When countEmptyPlaceToGo Given list<list<integet>> like comment above and x=2 y=1")
    void test1() {
        List<List<Integer>> board = List.of(
                List.of(0, 1, 0),
                List.of(0, 0, 0),
                List.of(0, 0, 0),
                List.of(0, 0, 1)
        );

        Assertions.assertEquals(7,PossiblesPathToGo.countEmptyPlaceToGo(board, 2, 1));
        Assertions.assertEquals(7, PossiblesPathToGoAfterRefactory.countEmptyPlaceToGo(board, 2, 1));

    }

    /**
     * <p>| |x| |</p>
     * <p>|3|1|2|</p>
     * <p>|4|0|5|</p>
     *
     * */
    @Test
    @DisplayName("Return 5 When countEmptyPlaceToGo Given list<list<integet>> like comment above and x=2 y=1")
    void test2() {
        List<List<Integer>> board = List.of(
                List.of(0, 1, 0),
                List.of(0, 0, 0),
                List.of(0, 0, 0)
        );

        Assertions.assertEquals(5,PossiblesPathToGo.countEmptyPlaceToGo(board, 2, 1));
        Assertions.assertEquals(5, PossiblesPathToGoAfterRefactory.countEmptyPlaceToGo(board, 2, 1));
    }

    /**
     * <p>|7|1|8|</p>
     * <p>|3|0|4|</p>
     * <p>|6|2|5|</p>
     *
     * */
    @Test
    @DisplayName("Return 8 When countEmptyPlaceToGo Given list<list<integet>> like comment above and x=1 y=1")
    void test3() {
        List<List<Integer>> board = List.of(
                List.of(0, 0, 0),
                List.of(0, 0, 0),
                List.of(0, 0, 0)
        );

        Assertions.assertEquals(8,PossiblesPathToGo.countEmptyPlaceToGo(board, 1, 1));
        Assertions.assertEquals(8, PossiblesPathToGoAfterRefactory.countEmptyPlaceToGo(board, 1, 1));
    }

    /**
     * <p>| | | | | |</p>
     * <p>| | | | | |</p>
     * <p>| | |x| | |</p>
     * <p>| | |1| | |</p>
     * <p>| | |1| | |</p>
     * <p>| |x|0| | |</p>
     * <p>| | |3| | |</p>
     * <p>| | |4| | |</p>
     * <p>| | |5| | |</p>
     * <p>| | |6| | |</p>
     * <p>| | |7| | |</p>
     *
     * */
    @Test
    @DisplayName("Return 17 When countEmptyPlaceToGo Given list<list<integet>> like comment above and x=5 y=2")
    void test4() {
        List<List<Integer>> board = List.of(
                List.of(0, 0, 0,0,0),
                List.of(0, 0, 0,0,0),
                List.of(0, 0, 1,0,0),
                List.of(0, 0, 0,0,0),
                List.of(0, 0, 0,0,0),
                List.of(0, 1, 0,0,0),
                List.of(0, 0, 0,0,0),
                List.of(0, 0, 0,0,0),
                List.of(0, 0, 0,0,0),
                List.of(0, 0, 0,0,0),
                List.of(0, 0, 0,0,0)
        );


        Assertions.assertEquals(17,PossiblesPathToGo.countEmptyPlaceToGo(board, 5, 2));
        Assertions.assertEquals(17, PossiblesPathToGoAfterRefactory.countEmptyPlaceToGo(board, 5, 2));
    }


    /**
     * <p>| | | |</p>
     * <p>|6|x|5|</p>
     * <p>|3|0|4|</p>
     * <p>|2|1|x|</p>
     *
     * */
    @Test
    @DisplayName("Return 6 When countEmptyPlaceToGo Given list<list<integet>> like comment above and x=2 y=1")
    void test5() {
        List<List<Integer>> board = List.of(
                List.of(0, 0, 0),
                List.of(0, 1, 0),
                List.of(0, 0, 0),
                List.of(0, 0, 1)
        );


        Assertions.assertEquals(6,PossiblesPathToGo.countEmptyPlaceToGo(board, 2, 1));
        Assertions.assertEquals(6, PossiblesPathToGoAfterRefactory.countEmptyPlaceToGo(board, 2, 1));

    }


}