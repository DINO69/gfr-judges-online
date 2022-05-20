package br.com.guifr.hackerrank.preparationkit.threemonth.weekthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MigratoryBirdsTest {

    @Test
    @DisplayName("Return 1 When find lowest type id of the most frequently sighted birds With [1 1 2 2 3]")
    public void test1() {
        int actual = MigratoryBirds.with(Arrays.asList(1,1,2,2,3));
        Assertions.assertEquals(1,actual);
    }

    @Test
    @DisplayName("Return 2 When find lowest type id of the most frequently sighted birds With [1 1 2 2 3 2]")
    public void test2() {
        int actual = MigratoryBirds.with(Arrays.asList(1,1,2,2,3,2));
        Assertions.assertEquals(2,actual);
    }

    @Test
    @DisplayName("Return 1 When find lowest type id of the most frequently sighted birds With [1 1 2 2 3 2]")
    public void test3() {
        int actual = MigratoryBirds.with(Arrays.asList(1,1,2,2,3,2,1));
        Assertions.assertEquals(1,actual);
    }
}