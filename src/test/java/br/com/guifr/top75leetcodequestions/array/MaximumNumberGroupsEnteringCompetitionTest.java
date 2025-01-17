package br.com.guifr.top75leetcodequestions.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberGroupsEnteringCompetitionTest {


    @Test
    @DisplayName("Return 3 When call maximumGroups Given n=[10,6,12,7,3,5]")
    void test1() {
        int[] nums = new int[]{10,6,12,7,3,5};
        Assertions.assertEquals(3,MaximumNumberGroupsEnteringCompetition.maximumGroups(nums));
    }

    @Test
    @DisplayName("Return 1 When call maximumGroups Given n=[8,8]")
    void test2() {
        int[] nums = new int[]{8,8};
        Assertions.assertEquals(1,MaximumNumberGroupsEnteringCompetition.maximumGroups(nums));
    }

    @Test
    @DisplayName("Return 5 When call maximumGroups Given n=2,31,41,31,36,46,33,45,47,8,31,6,12,12,15,35")
    void test3() {
        int[] nums = new int[]{2,31,41,31,36,46,33,45,47,8,31,6,12,12,15,3};
        Assertions.assertEquals(5,MaximumNumberGroupsEnteringCompetition.maximumGroups(nums));
    }

    @Test
    @DisplayName("Return 3 When call maximumGroups Given n=[47,2,16,17,41,4,38,23,47]")
    void test4() {
        int[] nums = new int[]{47,2,16,17,41,4,38,23,47};
        Assertions.assertEquals(3,MaximumNumberGroupsEnteringCompetition.maximumGroups(nums));
    }

    @Test
    @DisplayName("Return 4 When call maximumGroups Given n=[16,30,12,36,4,26,23,25,19,26,30,32]")
    void test5() {
        int[] nums = new int[]{16,30,12,36,4,26,23,25,19,26,30,32};
        Assertions.assertEquals(4,MaximumNumberGroupsEnteringCompetition.maximumGroups(nums));
    }

    @Test
    @DisplayName("Return 5 When call maximumGroups Given n=[10, 12, 13, 17, 25, 26, 26, 29, 30, 33, 36, 36, 39, 40, 42, 47, 50]")
    void test6() {
        int[] nums = new int[]{10, 12, 13, 17, 25, 26, 26, 29, 30, 33, 36, 36, 39, 40, 42, 47, 50};
        Assertions.assertEquals(5,MaximumNumberGroupsEnteringCompetition.maximumGroups(nums));
    }



}