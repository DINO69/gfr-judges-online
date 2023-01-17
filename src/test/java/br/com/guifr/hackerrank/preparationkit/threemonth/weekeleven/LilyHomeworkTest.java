package br.com.guifr.hackerrank.preparationkit.threemonth.weekeleven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;


class LilyHomeworkTest {

    @Test
    @DisplayName("Return 2 When change the array to beautiful array Given a=[7,15,12,3']")
    void test() {
        List<Integer> arr = List.of(7,15,12,3);
        int result = LilyHomework.with(arr);
        Assertions.assertEquals(2,result);
    }

    @Test
    @DisplayName("Return 2 When change the array to beautiful array Given a=[2,5,3,1']")
    void test2() {
        List<Integer> arr = List.of(2,5,3,1);
        int result = LilyHomework.with(arr);
        Assertions.assertEquals(2,result);
    }

    @Test
    @DisplayName("Return 1 When change the array to beautiful array Given a=[2,3,1]")
    void test3() {
        List<Integer> arr = List.of(2,3,1);
        int result = LilyHomework.with(arr);
        Assertions.assertEquals(1,result);
    }

    @Test
    @DisplayName("Return 2 When change the array to beautiful array Given a=[3,4,2,5,1]")
    void test4() {
        List<Integer> arr = List.of(3,4,2,5,1);
        int result = LilyHomework.with(arr);
        Assertions.assertEquals(2,result);
    }

}