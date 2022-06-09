package br.com.guifr.hackerrank.preparationkit.threemonth.weeksix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MisereNimTest {

    @Test
    @DisplayName("Return 'Second' When second play win With [1,1,1]")
    public void test1() {
        String actual = MisereNim.withPileStones(Arrays.asList(1,1,1));
        Assertions.assertEquals("Second",actual);
    }

    @Test
    @DisplayName("Return 'First' When First play win With [1,2,2]")
    public void test2() {
        String actual = MisereNim.withPileStones(Arrays.asList(1,2,2));
        Assertions.assertEquals("First",actual);
    }

    @Test
    @DisplayName("Return 'First' When First play win With [1,1]")
    public void test3() {
        String actual = MisereNim.withPileStones(Arrays.asList(1,1));
        Assertions.assertEquals("First",actual);
    }

    @Test
    @DisplayName("Return 'Second' When second play win With [1,2,3]")
    public void test4() {
        String actual = MisereNim.withPileStones(Arrays.asList(1,2,3));
        Assertions.assertEquals("Second",actual);
    }

    @Test
    @DisplayName("Return 'First' When First play win With [1,1,1,1]")
    public void test5() {
        String actual = MisereNim.withPileStones(Arrays.asList(1,1,1,1));
        Assertions.assertEquals("First",actual);
    }

    @Test
    @DisplayName("Return 'First' When First play win With [1,2,4]")
    public void test6() {
        String actual = MisereNim.withPileStones(Arrays.asList(1,2,4));
        Assertions.assertEquals("First",actual);
    }

    @Test
    @DisplayName("Return 'Second' When Second play win With [4 1 1 1 4 8 5 10 1 7 7 4 10 9]")
    public void test7() {
        String actual = MisereNim.withPileStones(Arrays.asList(4,1,1,1,4,8,5,10,1,7,7,4,10,9));
        Assertions.assertEquals("Second",actual);
    }

    @Test
    @DisplayName("Return 'Second' When Second play win With [1]")
    public void test8() {
        String actual = MisereNim.withPileStones(Arrays.asList(1));
        Assertions.assertEquals("Second",actual);
    }



}