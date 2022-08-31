package br.com.guifr.hackerrank.preparationkit.threemonth.weeknine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;


class EqualStacksTest {

    @Test
    @DisplayName("Return 2 When equalize the stacks by their height Given [1,2,1,1][1,1,2][1,1]")
    void test1() {
        int result = EqualStacks.equalStacks(List.of(1,2,1,1),List.of(1,1,2), List.of(1,1));
        Assertions.assertEquals(2,result);
    }

    @Test
    @DisplayName("Return 5 When equalize the stacks by their height Given [3, 2, 1, 1, 1][4, 3, 2][1, 1, 4, 1]")
    void test2() {
        int result = EqualStacks.equalStacks(List.of(3, 2, 1, 1, 1),List.of(4, 3, 2), List.of(1, 1, 4, 1));
        Assertions.assertEquals(5,result);
    }

    @Test
    @DisplayName("Return 9 When sum all values in stack Given [4, 3, 2]")
    void test3() {
        Deque<Integer> stack = new ArrayDeque<>(List.of(4, 3, 2));
        int result = EqualStacks.sum(stack);
        Assertions.assertEquals(9,result);
    }

    @Test
    @DisplayName("Return 8 When sum all values in stack Given [3, 2, 1, 1, 1]")
    void test4() {
        Deque<Integer> stack = new ArrayDeque<>(List.of(3, 2, 1, 1, 1));
        int result = EqualStacks.sum(stack);
        Assertions.assertEquals(8,result);
    }

    @Test
    @DisplayName("Return 7 When sum all values in stack Given [1, 1, 4, 1]")
    void test5() {
        Deque<Integer> stack = new ArrayDeque<>(List.of(1, 1, 4, 1));
        int result = EqualStacks.sum(stack);
        Assertions.assertEquals(7,result);
    }

    @Test
    @DisplayName("Return [4, 3, 2] When find the stack with max elements Given [3, 2, 1, 1, 1][4, 3, 2][1, 1, 4, 1]")
    void test6() {
        Deque<Integer> s1 = new ArrayDeque<>(List.of(3, 2, 1, 1, 1));
        Deque<Integer> s2 = new ArrayDeque<>(List.of(4, 3, 2));
        Deque<Integer> s3 = new ArrayDeque<>(List.of(1, 1, 4, 1));
        Deque<Integer> result = EqualStacks.stackWithMaxSum(s1,s2,s3);
        Assertions.assertEquals(3,result.size(),"Size is 3");
        Assertions.assertEquals(4,result.poll(), "Element[0] == 4");
        Assertions.assertEquals(3,result.poll(), "Element[1] == 3");
        Assertions.assertEquals(2,result.poll(), "Element[2] == 2");
    }

    @Test
    @DisplayName("Return [3, 2, 1, 1, 1] When find the stack with max elements Given [3, 2, 1, 1, 1][1, 1, 4, 1]")
    void test7() {
        Deque<Integer> s1 = new ArrayDeque<>(List.of(3, 2, 1, 1, 1));
        Deque<Integer> s3 = new ArrayDeque<>(List.of(1, 1, 4, 1));
        Deque<Integer> result = EqualStacks.stackWithMaxSum(s1,s3);
        Assertions.assertEquals(5,result.size(),"Size is 5");
        Assertions.assertEquals(3,result.poll(), "Element[0] == 3");
        Assertions.assertEquals(2,result.poll(), "Element[1] == 2");
        Assertions.assertEquals(1,result.poll(), "Element[2] == 1");
        Assertions.assertEquals(1,result.poll(), "Element[3] == 1");
        Assertions.assertEquals(1,result.poll(), "Element[4] == 1");
    }

}