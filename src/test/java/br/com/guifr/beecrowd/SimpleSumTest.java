package br.com.guifr.beecrowd;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleSumTest {

    @Test
    @DisplayName("Then return SOMA = 40 with '\n' in final sentence when sum 30 and 10")
    public void test1(){
        assertEquals("SOMA = 40\n",SimpleSum.printSum(30,10));
    }

    @Test
    @DisplayName("Then return SOMA = -20 with '\n' in final sentence when sum -30 and 10")
    public void test2(){
        assertEquals("SOMA = -20\n",SimpleSum.printSum(-30,10));
    }

    @Test
    @DisplayName("Then return SOMA = 0 with '\n' in final sentence when sum 0 and 0")
    public void test3(){
        assertEquals("SOMA = 0\n",SimpleSum.printSum(0,0));
    }

}