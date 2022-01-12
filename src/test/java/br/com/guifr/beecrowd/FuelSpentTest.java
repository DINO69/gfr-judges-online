package br.com.guifr.beecrowd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FuelSpentTest {

    @Test
    @DisplayName("Return 70.833 liters when trip 10 hours with speed 85 km")
    public void test1(){
        double actual = FuelSpent.when(10,85);
        assertEquals(70.833,actual);
    }

    @Test
    @DisplayName("Return 15.333 liters when trip 2 hours with speed 92 km")
    public void test2(){
        double actual = FuelSpent.when(2,92);
        assertEquals(15.333,actual);
    }

    @Test
    @DisplayName("Return 122.833 liters when trip 22 hours with speed 67 km")
    public void test3(){
        double actual = FuelSpent.when(22,67);
        assertEquals(122.833,actual);
    }

    @Test
    @DisplayName("Return 12 to km/liters")
    public void test4(){
        assertEquals(12,FuelSpent.KM_PER_LITERS);
    }

}