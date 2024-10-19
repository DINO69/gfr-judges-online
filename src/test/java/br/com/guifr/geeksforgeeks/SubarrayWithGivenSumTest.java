package br.com.guifr.geeksforgeeks;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubarrayWithGivenSumTest {

    /*N = 5, S = 12
    A[] = {1,2,3,7,5}
    Output: 2 4*/
    @Test
    @DisplayName("Return [2,4] When findContinuosValusUntil Given a=[1,2,3,7,5], n=5 and s=12")
    void test1() {

        int[] a = {1,2,3,7,5};
        int n = 5;
        int s = 12;

        int[] expected = {2,4};

        List<Integer> actual = SubarrayWithGivenSum.findContinuosValusUntil(a,n,s);

        assertEquals(2,actual.size());
        assertEquals(expected[0],actual.get(0));
        assertEquals(expected[1],actual.get(1));
    }

    /*N = 10, S = 15
    A[] = {1,2,3,4,5,6,7,8,9,10}
    Output: 1 5*/
    @Test
    @DisplayName("Return [1,5] When findContinuosValusUntil Given a=[1,2,3,4,5,6,7,8,9,10], n=10 and s=15")
    void test2() {

        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int n = 10;
        int s = 15;

        int[] expected = {1,5};

        List<Integer> actual = SubarrayWithGivenSum.findContinuosValusUntil(a,n,s);

        assertEquals(2,actual.size());
        assertEquals(expected[0],actual.get(0));
        assertEquals(expected[1],actual.get(1));
    }

    /*N = 10, S = 200
    A[] = {1,2,3,4,5,6,7,8,9,10}
    Output: -1*/

    @Test
    @DisplayName("Return [-1] When don't find findContinuosValusUntil Given a=[1,2,3,4,5,6,7,8,9,10], n=10 and s=200")
    void test3() {

        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int n = 10;
        int s = 200;

        int[] expected = {-1};

        List<Integer> actual = SubarrayWithGivenSum.findContinuosValusUntil(a,n,s);

        assertEquals(1,actual.size());
        assertEquals(expected[0],actual.get(0));
    }

    /*N = 10, S = 5
    A[] = {1,2,3,4,5,6,7,8,9,10}
    Output: 2 3*/
    @Test
    @DisplayName("Return [2,3] When findContinuosValusUntil Given a=[1,2,3,4,5,6,7,8,9,10], n=10 and s=5")
    void test4() {

        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int n = 10;
        int s = 5;

        int[] expected = {2,3};

        List<Integer> actual = SubarrayWithGivenSum.findContinuosValusUntil(a,n,s);

        assertEquals(2,actual.size());
        assertEquals(expected[0],actual.get(0));
        assertEquals(expected[1],actual.get(1));
    }
/*42 468
        135 101 170 125 79 159 163 65 106 146 82 28 162 92 196 143 28 37 192 5 103 154 93 183 22 117 119 96 48 127 172 139 70 113 68 100 36 95 104 12 123 134*/
    @Test
    @DisplayName("Return [38 42] When findContinuosValusUntil Given s=468 and a=[135 101 170 125 79 159 163 65 106 146 82 28 162 92 196 143 28 37 192 5 103 154 93 183 22 117 119 96 48 127 172 139 70 113 68 100 36 95 104 12 123 134]")
    void test5() {

            int[] a = {135,101,170,125,79,159,163,65,106,146,82,28,162,92,196,143,28,37,192,5,103,154,93,183,22,117,119,96,48,127,172,139,70,113,68,100,36,95,104,12,123,134};
            int n = 42;
            int s = 468;

            int[] expected = {38,42};

            List<Integer> actual = SubarrayWithGivenSum.findContinuosValusUntil(a,n,s);

            assertEquals(2,actual.size());
            assertEquals(expected[0],actual.get(0));
            assertEquals(expected[1],actual.get(1));

    }

    /*n=4 s=0
    a = 1 2 3 4
    return =-1*/
    @Test
    @DisplayName("Return [-1] When findContinuosValusUntil Given s=0 and a=[1 2 3 4]")
    void test6() {

        int[] a = {1,2,3,4};
        int n = 4;
        int s = 0;

        int[] expected = {-1};

        List<Integer> actual = SubarrayWithGivenSum.findContinuosValusUntil(a,n,s);

        assertEquals(1,actual.size());
        assertEquals(expected[0],actual.get(0));

    }
}