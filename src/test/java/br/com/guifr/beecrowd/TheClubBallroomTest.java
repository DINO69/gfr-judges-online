package br.com.guifr.beecrowd;

import br.com.guifr.beecrowd.TheClubBallroom.TheClubBallroomException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheClubBallroomTest {

    @Test
    @DisplayName("Return 7 when rectangle is 4 and 5, width = 100 and planks is 1 2 2 2 2 3 3 4 4 5")
    public void test1() throws TheClubBallroomException {
        int actual = TheClubBallroom.of(4, 5).widthPlanks(100).withPlanks(1, 2, 2, 2, 2, 3, 3, 4, 4, 5).howManyMinimumPlanksCoverFloor();
        assertEquals(7, actual);
    }

    @Test
    @DisplayName("Return 5 when rectangle is 5 and 4, width = 100 and planks is 4 5 4 4 4 4 3")
    public void test2() throws TheClubBallroomException {
        int actual = TheClubBallroom.of(5, 4).widthPlanks(100).withPlanks(4, 5, 4, 4, 4, 4, 3).howManyMinimumPlanksCoverFloor();
        assertEquals(5, actual);
    }

    @Test
    @DisplayName("Return 'impossivel' when rectangle is 4 and 5, width = 99 and planks is 4 4 4 4")
    public void test3() {

        Exception e = Assertions.assertThrows(Exception.class,
                () -> TheClubBallroom.of(4, 5).widthPlanks(99).withPlanks(4, 4, 4, 4).howManyMinimumPlanksCoverFloor()
        );

        assertEquals("impossivel", e.getMessage());
        assertEquals(TheClubBallroomException.class, e.getClass());
    }

    @Test
    @DisplayName("Return 'impossivel' when rectangle is 3 and 2, width = 100 and planks is 4 4 4 4")
    public void test4() {

        Exception e = Assertions.assertThrows(Exception.class,
                () -> TheClubBallroom.of(3,2).widthPlanks(100).withPlanks(2,4,1,4,2,4,4).howManyMinimumPlanksCoverFloor()
        );

        Assertions.assertAll(
                ()->assertEquals("impossivel", e.getMessage()),
                ()->assertEquals(TheClubBallroomException.class, e.getClass())
        );
    }

    @Test
    @DisplayName("Return 7 when calculate using width rectangle is 4 and 5, width = 100 and planks is 1 2 2 2 2 3 3 4 4 5")
    public void test5() throws TheClubBallroomException {
        int actual = TheClubBallroom.of(4, 5).widthPlanks(100).withPlanks(1, 2, 2, 2, 2, 3, 3, 4, 4, 5).calculateUsingingWidth();
        assertEquals(7, actual);
    }

    @Test
    @DisplayName("Return 8 when calculate using length rectangle is 4 and 5, width = 100 and planks is 1 2 2 2 2 3 3 4 4 5")
    public void test6() throws TheClubBallroomException {
        int actual = TheClubBallroom.of(4, 5).widthPlanks(100).withPlanks(1, 2, 2, 2, 2, 3, 3, 4, 4, 5).calculateUsingingLength();
        assertEquals(8, actual);
    }

}