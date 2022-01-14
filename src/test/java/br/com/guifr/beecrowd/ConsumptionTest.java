package br.com.guifr.beecrowd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ConsumptionTest {

    @Test
    @DisplayName("Return '14.286 km/l' when road 500 km with 35.0 liters")
    public void test1(){

        String actual = Consumption.with(500,35).average();
        Assertions.assertEquals("14.286 km/l", actual);
    }

    @Test
    @DisplayName("Return '18.119 km/l' when road 2254 km with 124.4 liters")
    public void test2(){
        String actual = Consumption.with(2254,124.4).average();
        Assertions.assertEquals("18.119 km/l", actual);
    }

    @Test
    @DisplayName("Return '9.802 km/l' when road 4554 km with 464.6 liters")
    public void test3(){
        String actual = Consumption.with(4554,464.6).average();
        Assertions.assertEquals("9.802 km/l", actual);
    }

}