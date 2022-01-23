package br.com.guifr.beecrowd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlarmClockTest {

    @Test
    @DisplayName("Return '120' when times is '1 5 3 5'")
    public void test1(){
        int actual = AlarmClock.startAndEnd(1,5,3,5);
        assertEquals(120,actual);
    }

    @Test
    @DisplayName("Return '35' when times is '23 59 0 34'")
    public void test2(){
        int actual = AlarmClock.startAndEnd(23 ,59,0,34);
        assertEquals(35,actual);
    }

    @Test
    @DisplayName("Return '1417' when times is '21 33 21 10'")
    public void test3(){
        int actual = AlarmClock.startAndEnd(21 ,33,21,10);
        assertEquals(1417,actual);
    }

}