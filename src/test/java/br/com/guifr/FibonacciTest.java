package br.com.guifr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    @DisplayName("Return 1 When call call Given n=1")
    void test1() {
        Assertions.assertEquals(1,Fibonacci.call(1));
    }
    @Test
    @DisplayName("Return 1 When call call Given n=2")
    void test2() {
        Assertions.assertEquals(1,Fibonacci.call(2));
    }

    @Test
    @DisplayName("Return 2 When call call Given n=3")
    void test3() {
        Assertions.assertEquals(2,Fibonacci.call(3));
    }

    @Test
    @DisplayName("Return 3 When call call Given n=4")
    void test4() {
        Assertions.assertEquals(3,Fibonacci.call(4));
    }
    @Test
    @DisplayName("Return 5 When call call Given n=5")
    void test5() {
        Assertions.assertEquals(5,Fibonacci.call(5));
    }

    @Test
    @DisplayName("Return 8 When call call Given n=6")
    void test6() {
        Assertions.assertEquals(8,Fibonacci.call(6));
    }

    @Test
    @DisplayName("Return 13 When call call Given n=7")
    void test7() {
        Assertions.assertEquals(13,Fibonacci.call(7));
    }

}