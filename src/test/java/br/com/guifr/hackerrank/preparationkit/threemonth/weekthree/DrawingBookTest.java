package br.com.guifr.hackerrank.preparationkit.threemonth.weekthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DrawingBookTest {

    @Test
    @DisplayName("Return 1 When count how many pages flip With numberPage = 5 and target = 3")
    public void test() {
        int target = 3;
        int totalPage = 5;
        Assertions.assertEquals(1,DrawingBook.countFlips(totalPage,target));
    }

    @Test
    @DisplayName("Return 1 When count how many pages flip With numberPage = 6 and target = 3")
    public void test2() {
        int target = 3;
        int totalPage = 6;
        Assertions.assertEquals(1,DrawingBook.countFlips(totalPage,target));
    }

    @Test
    @DisplayName("Return 1 When count how many pages flip With numberPage = 6 and target = 4")
    public void test3() {
        int target = 4;
        int totalPage = 6;
        Assertions.assertEquals(1,DrawingBook.countFlips(totalPage,target));
    }

    @Test
    @DisplayName("Return 0 When count how many pages flip With numberPage = 5 and target = 4")
    public void test4() {
        int target = 4;
        int totalPage = 5;
        Assertions.assertEquals(0,DrawingBook.countFlips(totalPage,target));
    }

    @Test
    @DisplayName("Return 1 When count how many pages flip With numberPage = 9 and target = 6")
    public void test5() {
        int target = 6;
        int totalPage = 9;
        Assertions.assertEquals(1,DrawingBook.countFlips(totalPage,target));
    }

    @Test
    @DisplayName("Return 2 When count how many pages flip With numberPage = 9 and target = 4")
    public void test6() {
        int target = 4;
        int totalPage = 9;
        Assertions.assertEquals(2,DrawingBook.countFlips(totalPage,target));
    }

    @Test
    @DisplayName("Return 1 When count how many pages flip With numberPage = 9 and target = 1")
    public void test7() {
        int target = 2;
        int totalPage = 9;
        Assertions.assertEquals(1,DrawingBook.countFlips(totalPage,target));
    }

    @Test
    @DisplayName("Return 0 When count how many pages flip With numberPage = 9 and target = 8")
    public void test8() {
        int target = 8;
        int totalPage = 9;
        Assertions.assertEquals(0,DrawingBook.countFlips(totalPage,target));
    }

    @Test
    @DisplayName("Return 1 When count how many pages flip With numberPage = 10 and target = 9")
    public void test9() {
        int target = 9;
        int totalPage = 10;
        Assertions.assertEquals(1,DrawingBook.countFlips(totalPage,target));
    }

}