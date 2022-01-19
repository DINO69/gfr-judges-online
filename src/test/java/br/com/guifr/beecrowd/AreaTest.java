package br.com.guifr.beecrowd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AreaTest {

    @Test
    @DisplayName("Return areas calculate with '3.0 4.0 5.2' points")
    public void test1(){
        String actual = Area.with(3.0,4.0,5.2).printAllPossiblesAreas();
        assertEquals("TRIANGULO: 7.800\n" +
                "CIRCULO: 84.949\n" +
                "TRAPEZIO: 18.200\n" +
                "QUADRADO: 16.000\n" +
                "RETANGULO: 12.000",actual);
    }

    @Test
    @DisplayName("Return areas calculate with '12.7 10.4 15.2' points")
    public void test2(){
        String actual = Area.with(12.7,10.4,15.2).printAllPossiblesAreas();
        assertEquals("TRIANGULO: 96.520\n" +
                "CIRCULO: 725.833\n" +
                "TRAPEZIO: 175.560\n" +
                "QUADRADO: 108.160\n" +
                "RETANGULO: 132.080",actual);
    }

    @Test
    @DisplayName("Return TRIANGULO area calculate with '12.7 10.4 15.2' points")
    public void test3(){
        double actual = Area.with(12.7,10.4,15.2).trianguloArea();
        assertEquals(96.520,actual);
    }

    @Test
    @DisplayName("Return CIRCULO area calculate with '12.7 10.4 15.2' points")
    public void test4(){
        double actual = Area.with(12.7,10.4,15.2).circuloArea();
        assertEquals(725.833,actual);
    }

    @Test
    @DisplayName("Return TRAPEZIO area calculate with '12.7 10.4 15.2' points")
    public void test5(){
        double actual = Area.with(12.7,10.4,15.2).trapezioArea();
        assertEquals(175.560,actual);
    }

    @Test
    @DisplayName("Return QUADRADO area calculate with '12.7 10.4 15.2' points")
    public void test6(){
        double actual = Area.with(12.7,10.4,15.2).quadradoArea();
        assertEquals(108.160,actual);
    }

    @Test
    @DisplayName("Return RETANGULO area calculate with '12.7 10.4 15.2' points")
    public void test7(){
        double actual = Area.with(12.7,10.4,15.2).retanguloArea();
        assertEquals(132.080,actual);
    }

    @Test
    @DisplayName("Return TRIANGULO area calculate with '3.0 4.0 5.2' points")
    public void test8(){
        double actual = Area.with(3.0,4.0,5.2).trianguloArea();
        assertEquals(7.800,actual);
    }

    @Test
    @DisplayName("Return CIRCULO area calculate with '3.0 4.0 5.2' points")
    public void test9(){
        double actual = Area.with(3.0,4.0,5.2).circuloArea();
        assertEquals(84.949,actual);
    }

    @Test
    @DisplayName("Return TRAPEZIO area calculate with '3.0 4.0 5.2' points")
    public void test10(){
        double actual = Area.with(3.0,4.0,5.2).trapezioArea();
        assertEquals(18.200,actual);
    }

    @Test
    @DisplayName("Return QUADRADO area calculate with '3.0 4.0 5.2' points")
    public void test11(){
        double actual = Area.with(3.0,4.0,5.2).quadradoArea();
        assertEquals(16.000,actual);
    }

    @Test
    @DisplayName("Return RETANGULO area calculate with '3.0 4.0 5.2' points")
    public void test12(){
        double actual = Area.with(3.0,4.0,5.2).retanguloArea();
        assertEquals(12.000,actual);
    }

    @Test
    @DisplayName("PI is 3.14159")
    public void test13(){
        double actual = Area.PI;
        assertEquals(3.14159,actual);
    }

}