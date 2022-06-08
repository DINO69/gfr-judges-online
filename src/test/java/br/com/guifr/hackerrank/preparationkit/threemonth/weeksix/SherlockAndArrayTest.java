package br.com.guifr.hackerrank.preparationkit.threemonth.weeksix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SherlockAndArrayTest {

    @Test
    @DisplayName("Return 'YES' When sherlock find two subarry that sum is eq and 1 element between With [5 6 8 11]")
    public void test1() {

        String actual = SherlockAndArray.between(Arrays.asList(5,6,8,11));
        Assertions.assertEquals("YES",actual);

    }

    @Test
    @DisplayName("Return 'YES' When sherlock find two subarry that sum is eq and 1 element between With [1]")
    public void test2() {

        String actual = SherlockAndArray.between(Arrays.asList(1));
        Assertions.assertEquals("YES",actual);

    }

    @Test
    @DisplayName("Return 'YES' When sherlock find two subarry that sum is eq and 1 element between With [1,2,3,3]")
    public void test3() {

        String actual = SherlockAndArray.between(Arrays.asList(1,2,3,3));
        Assertions.assertEquals("YES",actual);

    }

    @Test
    @DisplayName("Return 'NO' When sherlock don't find two subarry that sum is eq and 1 element between With [1,2,3]")
    public void test4() {

        String actual = SherlockAndArray.between(Arrays.asList(1,2,3));
        Assertions.assertEquals("NO",actual);

    }

}