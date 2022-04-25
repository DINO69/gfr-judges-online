package br.com.guifr.hackerrank;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindRunningMedianTest {

    @Test
    @DisplayName("Return [12.0 8.0 5.0 ...] work two list When find running median With [12, 4, 5, 3, 8, 7]")
    public void test0() {

        List<Double> actual = FindRunningMedian.withMaxMinHeap(Arrays.asList(12, 4, 5, 3, 8, 7));
        assertAll(() -> {
            assertEquals(6, actual.size());
            assertEquals(12.0, actual.get(0));
            assertEquals(8.0, actual.get(1));
            assertEquals(5.0, actual.get(2));
            assertEquals(4.5, actual.get(3));
            assertEquals(5.0, actual.get(4));
            assertEquals(6.0, actual.get(5));
        });
    }

    @Test
    @DisplayName("Return [12.0 8.0 5.0 ...] When find running median With [12, 4, 5, 3, 8, 7]")
    public void test1() {

        List<Double> actual = FindRunningMedian.with(Arrays.asList(12, 4, 5, 3, 8, 7));
        assertAll(() -> {
            assertEquals(6, actual.size());
            assertEquals(12.0, actual.get(0));
            assertEquals(8.0, actual.get(1));
            assertEquals(5.0, actual.get(2));
            assertEquals(4.5, actual.get(3));
            assertEquals(5.0, actual.get(4));
            assertEquals(6.0, actual.get(5));
        });
    }

    @Test
    @DisplayName("Return [12.0 8.0 5.0] When find running median With [12, 4, 5]")
    public void test2() {

        List<Double> actual = FindRunningMedian.with(Arrays.asList(12, 4, 5));
        assertAll(() -> {
            assertEquals(3, actual.size());
            assertEquals(12.0, actual.get(0));
            assertEquals(8.0, actual.get(1));
            assertEquals(5.0, actual.get(2));
        });
    }

    @Test
    @DisplayName("Return [8.0 5.0] When find running median With [8, 2]")
    public void test3() {

        List<Double> actual = FindRunningMedian.with(Arrays.asList(8, 2));
        assertAll(() -> {
            assertEquals(2, actual.size());
            assertEquals(8.0, actual.get(0));
            assertEquals(5.0, actual.get(1));
        });
    }

    @Test
    @DisplayName("Return [8.0] When median With [8]")
    public void test4() {

        List<Integer> group = new ArrayList<>();
        group.add(8);
        Double actual = FindRunningMedian.median(group);
        assertEquals(8.0, actual);
    }

    @Test
    @DisplayName("Return [7.5] When median With [5,10]")
    public void test5() {

        List<Integer> group = new ArrayList<>();
        group.add(5);
        group.add(10);
        Double actual = FindRunningMedian.median(group);
        assertEquals(7.5, actual);
    }

    @Test
    @DisplayName("Return [3.0] When median With [3]")
    public void test6() {
        List<Integer> group = new ArrayList<>();
        group.add(3);
        Double actual = FindRunningMedian.median(group);
        assertEquals(3.0, actual);
    }

    @Test
    @DisplayName("Return [3.0] When median With [1,3,5]")
    public void test7() {
        List<Integer> group = new ArrayList<>();
        group.add(1);
        group.add(3);
        group.add(5);
        Double actual = FindRunningMedian.median(group);
        assertEquals(3.0, actual);
    }

    @Test
    @DisplayName("Return [4.0] When median With [1,3,5,8]")
    public void test8() {
        List<Integer> group = new ArrayList<>();
        group.add(1);
        group.add(3);
        group.add(5);
        group.add(8);
        Double actual = FindRunningMedian.median(group);
        assertEquals(4.0, actual);
    }

    @Test
    @DisplayName("Return [94455.0 57505.0 20555.0 36840.0] When median With [94455 20555 20535 53125]")
    public void test9() {

        List<Double> actual = FindRunningMedian.with(Arrays.asList(94455,20555,20535,53125));
        assertAll(() -> {
            assertEquals(4, actual.size());
            assertEquals(94455.0, actual.get(0));
            assertEquals(57505.0, actual.get(1));
            assertEquals(20555.0, actual.get(2));
            assertEquals(36840.0, actual.get(3));
        });
    }

    @Test
    @DisplayName("Return [1 2] When add 1 the list With list [2]")
    public void test10() {

        List<Integer> actual = new ArrayList<>();
        actual.add(2);
        FindRunningMedian.addNumberWithSorted(1, actual);
        assertAll(() -> {
            assertEquals(2, actual.size(),"Size is 2");
            assertEquals(1, actual.get(0), "First is 1");
            assertEquals(2, actual.get(1), "Second is 2");
        });
    }

    @Test
    @DisplayName("Return [1 2 3] When add 1 3 the list With list [2]")
    public void test11() {

        List<Integer> actual = new ArrayList<>();
        actual.add(2);
        FindRunningMedian.addNumberWithSorted(1, actual);
        FindRunningMedian.addNumberWithSorted(3, actual);
        assertAll(() -> {
            assertEquals(3, actual.size(),"Size is 2");
            assertEquals(1, actual.get(0), "First is 1");
            assertEquals(2, actual.get(1), "Second is 2");
            assertEquals(3, actual.get(2), "Third is 3");
        });
    }

    @Test
    @DisplayName("Return [1 2 3 4] When add 1 3 the list With list [24]")
    public void test12() {

        List<Integer> actual = new ArrayList<>();
        actual.add(2);
        actual.add(4);
        FindRunningMedian.addNumberWithSorted(1, actual);
        FindRunningMedian.addNumberWithSorted(3, actual);
        assertAll(() -> {
            assertEquals(4, actual.size(),"Size is 2");
            assertEquals(1, actual.get(0), "First is 1");
            assertEquals(2, actual.get(1), "Second is 2");
            assertEquals(3, actual.get(2), "Third is 3");
            assertEquals(4, actual.get(3), "Fourth is 4");
        });
    }

    @Test
    @DisplayName("Return [12] When add 12 With list empty")
    public void testAddMaxHeap1() {

        List<Integer> actual = new ArrayList<>();
        FindRunningMedian.addMax(12,actual);
        assertAll(()->{
            assertEquals(1,actual.size(),"Size is 1");
            assertEquals(12,actual.get(0),"First is 12");
        });
    }

    @Test
    @DisplayName("Return [12,13] When add 12 With list [13]")
    public void testAddMaxHeap2() {

        List<Integer> actual = new ArrayList<>();
        FindRunningMedian.addMax(13,actual);
        FindRunningMedian.addMax(12,actual);
        assertAll(()->{
            assertEquals(2,actual.size(),"Size is 2");
            assertEquals(12,actual.get(0),"First is 12");
            assertEquals(13,actual.get(1),"Second is 13");
        });
    }

    @Test
    @DisplayName("Return [12,13,100] When add 13 12 100 With list [13]")
    public void testAddMaxHeap3() {

        List<Integer> actual = new ArrayList<>();
        FindRunningMedian.addMax(13,actual);
        FindRunningMedian.addMax(12,actual);
        FindRunningMedian.addMax(100,actual);
        FindRunningMedian.addMax(50,actual);
        assertAll(()->{
            assertEquals(4,actual.size(),"Size is 4");
            assertEquals(12,actual.get(0),"First is 12");
            assertEquals(13,actual.get(1),"Second is 13");
            assertTrue(actual.contains(100),"Contains 100");
            assertTrue(actual.contains(50),"Contains 50");
        });

    }

    @Test
    @DisplayName("Return [12] When add 12 With list empty")
    public void testAddMinHeap1() {

        List<Integer> actual = new ArrayList<>();
        FindRunningMedian.addMin(12,actual);
        assertAll(()->{
            assertEquals(1,actual.size(),"Size is 1");
            assertEquals(12,actual.get(0),"First is 12");
        });
    }

    @Test
    @DisplayName("Return [13,12] When add 12 With list [13]")
    public void testAddMinHeap2() {

        List<Integer> actual = new ArrayList<>();
        FindRunningMedian.addMin(13,actual);
        FindRunningMedian.addMin(12,actual);
        assertAll(()->{
            assertEquals(2,actual.size(),"Size is 2");
            assertEquals(13,actual.get(0),"First is 13");
            assertEquals(12,actual.get(1),"Second is 12");
        });
    }

    @Test
    @DisplayName("Return [100,13,12,50] When add 13 12 100 With list empty")
    public void testAddMinHeap3() {

        List<Integer> actual = new ArrayList<>();
        FindRunningMedian.addMin(13,actual);
        FindRunningMedian.addMin(12,actual);
        FindRunningMedian.addMin(100,actual);
        FindRunningMedian.addMin(50,actual);
        assertAll(()->{
            assertEquals(4,actual.size(),"Size is 1");
            assertEquals(100,actual.get(0),"First is 100");
            assertEquals(13,actual.get(1),"Second is 13");
            assertTrue(actual.contains(12),"Contains 12");
            assertTrue(actual.contains(50),"Contains 50");
        });

    }

}