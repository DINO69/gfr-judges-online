package br.com.guifr.hackerrank.preparationkit.threemonth.weekone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class BreakingRecordsTest {

    @Test
    @DisplayName("Return [1 1] When search when Maria break her season record With [12 24 10 24]")
    public void test1() {
        List<Integer> actual = BreakingRecords.records(Arrays.asList(12,24,10,24));
        Assertions.assertEquals(2,actual.size(),"List size is 2");
        Assertions.assertEquals(1,actual.get(0),"Maximum is 1");
        Assertions.assertEquals(1,actual.get(1),"Minimum is 1");
    }

    @Test
    @DisplayName("Return [2 4] When search when Maria break her season record With [10 5 20 20 4 5 2 25 1]")
    public void test2() {
        List<Integer> actual = BreakingRecords.records(Arrays.asList(10,5,20,20,4,5,2,25,1));
        Assertions.assertEquals(2,actual.size(),"List size is 2");
        Assertions.assertEquals(2,actual.get(0),"Maximum is 2");
        Assertions.assertEquals(4,actual.get(1),"Minimum is 4");
    }
}