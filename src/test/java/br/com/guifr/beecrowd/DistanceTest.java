package br.com.guifr.beecrowd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistanceTest {

    @Test
    @DisplayName("Return '60 minutos' when input is 30 kilometers")
    public void test1(){
        String actual = Distance.inTime(30);
        assertEquals("60 minutos", actual);
    }

    @Test
    @DisplayName("Return '220 minutos' when input is 110 kilometers")
    public void test2(){
        String actual = Distance.inTime(110);
        assertEquals("220 minutos", actual);
    }

    @Test
    @DisplayName("Return '14 minutos' when input is 7 kilometers")
    public void test3(){
        String actual = Distance.inTime(7);
        assertEquals("14 minutos", actual);
    }

}