package br.com.guifr.beecrowd;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleProductTest {

    @Test
    @DisplayName("Then return PROD = 27 with '\n' in final sentence when prod 3 and 9")
    public void test1(){
        assertEquals("PROD = 27\n",SimpleProduct.printProd(3,9));
    }

    @Test
    @DisplayName("Then return PROD = -300 with '\n' in final sentence when prod -30 and 10")
    public void test2(){
        assertEquals("PROD = -300\n",SimpleProduct.printProd(-30,10));
    }

    @Test
    @DisplayName("Then return PROD = 0 with '\n' in final sentence when prod 0 and 9")
    public void test3(){
        assertEquals("PROD = 0\n",SimpleProduct.printProd(0,9));
    }

}