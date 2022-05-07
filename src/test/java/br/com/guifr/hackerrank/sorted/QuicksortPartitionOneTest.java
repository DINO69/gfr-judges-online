package br.com.guifr.hackerrank.sorted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class QuicksortPartitionOneTest {

    @Test
    @DisplayName("Return [4 3 5 7 8] When do the first part quicksort With [5 7 4 3 8]")
    public void test1() {
        List<Integer> actual = QuicksortPartitionOne.with(Arrays.asList(5,7,4,3,8));
        Assertions.assertEquals(4,actual.get(0),"First is 4");
        Assertions.assertEquals(3,actual.get(1),"Second is 3");
        Assertions.assertEquals(5,actual.get(2),"Third is 5");
        Assertions.assertEquals(7,actual.get(3),"Fourth is 7");
        Assertions.assertEquals(8,actual.get(4),"Fiveth is 8");
        Assertions.assertTrue(Arrays.asList(4,3,5,7,8).equals(actual),"The first part done");
    }

    @Test
    @DisplayName("Return [3 2 4 5 7] When do the first part quicksort With [4 5 3 7 2]")
    public void test2() {
        List<Integer> actual = QuicksortPartitionOne.with(Arrays.asList(4,5,3,7,2));
        Assertions.assertTrue(Arrays.asList(3,2,4,5,7).equals(actual),"The first part done");
    }

}