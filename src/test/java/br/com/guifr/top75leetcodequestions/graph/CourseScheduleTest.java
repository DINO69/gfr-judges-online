package br.com.guifr.top75leetcodequestions.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseScheduleTest {

    @Test
    @DisplayName("Return 'true' When CourseSchedule Given courses=5 requisites=[[1,4],[2,4],[3,1],[3,2]]")
    void test1() {
        Assertions.assertTrue(CourseSchedule.canFinish(5,new int[][]{{1,4},{2,4},{3,1},{3,2}}));
    }
}