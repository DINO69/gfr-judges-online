package br.com.guifr.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumElementTest {

    @Test
    @DisplayName("Return [26 91] When work with stack With list of input")
    public void test1() {

        List<String> operations = new ArrayList<>();
        operations.add("1 97");
        operations.add("2");
        operations.add("1 20");
        operations.add("2");
        operations.add("1 26");
        operations.add("1 20");
        operations.add("2");
        operations.add("3");
        operations.add("1 91");
        operations.add("3");


        List<Integer> actual = MaximumElement.of(operations);
        Assertions.assertAll(()->{
            assertEquals(2,actual.size(),"Size return");
            assertEquals(26,actual.get(0),"First element");
            assertEquals(91,actual.get(1),"Second element");
        });
    }

    @Test
    @DisplayName("Return [26 26] When work with stack With list of input")
    public void test2() {

        List<String> operations = new ArrayList<>();
        operations.add("1 97");
        operations.add("2");
        operations.add("1 20");
        operations.add("2");
        operations.add("1 26");
        operations.add("1 20");
        operations.add("2");
        operations.add("3");
        operations.add("3");


        List<Integer> actual = MaximumElement.of(operations);
        Assertions.assertAll(()->{
            assertEquals(2,actual.size(),"Size return");
            assertEquals(26,actual.get(0),"First element");
            assertEquals(26,actual.get(1),"Second element");
        });
    }
}