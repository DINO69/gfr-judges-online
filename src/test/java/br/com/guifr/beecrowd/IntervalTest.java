package br.com.guifr.beecrowd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntervalTest {

    @Test
    @DisplayName("Return 'Intervalo (25,50]' when value is 25.01")
    public void test1(){
        String actual = Interval.printWith(25.01);
        Assertions.assertEquals("Intervalo (25,50]",actual);
    }

    @Test
    @DisplayName("Return 'Intervalo [0,25]' when value is 25.00")
    public void test2(){
        String actual = Interval.printWith(25.00);
        Assertions.assertEquals("Intervalo [0,25]",actual);
    }

    @Test
    @DisplayName("Return 'Intervalo (75,100]' when value is 100.00")
    public void test3(){
        String actual = Interval.printWith(100.00);
        Assertions.assertEquals("Intervalo (75,100]",actual);
    }

    @Test
    @DisplayName("Return 'Intervalo (50,75]' when value is 74.00")
    public void test4(){
        String actual = Interval.printWith(75.00);
        Assertions.assertEquals("Intervalo (50,75]",actual);
    }

    @Test
    @DisplayName("Return 'Fora de intervalo' when value is greather 100.00 or less than zero")
    public void test5(){
        String actual = Interval.printWith(-25.02);
        Assertions.assertEquals("Fora de intervalo",actual);
    }

    @Test
    @DisplayName("Return 'Fora de intervalo' when value is greather 100.00 or less than zero")
    public void test6(){
        String actual = Interval.printWith(100.01);
        Assertions.assertEquals("Fora de intervalo",actual);
    }

    @Test
    @DisplayName("Return 'Intervalo [0,25]' when value is 15.00")
    public void test7(){
        String actual = Interval.printWith(15.00);
        Assertions.assertEquals("Intervalo [0,25]",actual);
    }

    @Test
    @DisplayName("Return 'Intervalo [0,25]' when value is 0.00")
    public void test8(){
        String actual = Interval.printWith(0.00);
        Assertions.assertEquals("Intervalo [0,25]",actual);
    }

}