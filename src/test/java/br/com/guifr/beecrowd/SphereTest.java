package br.com.guifr.beecrowd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SphereTest {

    @Test
    @DisplayName("Return 'VOLUME = 113.097' when radius is 3")
    public void testVolume1(){
        String actual = Sphere.withRadius(3).printVolume();
        assertEquals("VOLUME = 113.097",actual);
    }

    @Test
    @DisplayName("Return 'VOLUME = 14137.155' when radius is 15")
    public void testVolume2(){
        String actual = Sphere.withRadius(15).printVolume();
        assertEquals("VOLUME = 14137.155",actual);
    }

    @Test
    @DisplayName("Return 'VOLUME = 14797486501.627' when radius is 1523")
    public void testVolume3(){
        String actual = Sphere.withRadius(1523).printVolume();
        assertEquals("VOLUME = 14797486501.627",actual);
    }

    @Test
    @DisplayName("PI is 3.14159")
    public void testPi(){
        assertEquals("3.14159",Sphere.PI);
    }

}