package br.com.guifr.beecrowd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.SAME_THREAD)
public class PowerCrisisTest {

    @BeforeEach
    public void setUp() {
        PowerCrisis.City.illuminated = 0;
    }

    @Test
    @DisplayName("Return minimum m=7 when N=17")
    public void test1() {
        int actual = PowerCrisis.minimumRandomOf(17);
        assertEquals(7, actual);
    }

    @Test
    @DisplayName("Return minimum m=1 when N=13")
    public void test2() {
        int actual = PowerCrisis.minimumRandomOf(13);
        assertEquals(1, actual);
    }

    @Test
    @DisplayName("Return numberCity and if City blacked in Object City")
    public void testObjCity() {
        PowerCrisis.City city = new PowerCrisis.City(1);
        int numberCity = city.number;
        boolean blacked = city.blacked;
        Assertions.assertAll(
                () -> assertEquals(1, numberCity),
                () -> assertEquals(false, blacked)
        );
    }

    @Test
    @DisplayName("Return numberCity 2 how next number 1 City")
    public void testObjCity2() {
        PowerCrisis.City city = new PowerCrisis.City(1);
        int numberCity = city.number;

        PowerCrisis.City city2 = new PowerCrisis.City(2);
        city.next = city2;

        Assertions.assertAll(
                () -> assertEquals(city2, city.next),
                () -> assertEquals(2, city.next.number)

        );
    }

    @Test
    @DisplayName("Return 3 cities illuminated")
    public void testObjCity3() {
        PowerCrisis.City city = new PowerCrisis.City(1);
        PowerCrisis.City city2 = new PowerCrisis.City(2);
        PowerCrisis.City city3 = new PowerCrisis.City(3);

        assertEquals(3, PowerCrisis.City.illuminated);
    }

    @Test
    @DisplayName("Return 2 cities illuminated when one blacked")
    public void testObjCity4() {
        PowerCrisis.City city = new PowerCrisis.City(1);
        PowerCrisis.City city2 = new PowerCrisis.City(2);
        PowerCrisis.City city3 = new PowerCrisis.City(3);
        city.blacked();
        assertEquals(2, PowerCrisis.City.illuminated);

    }

    @Test
    @DisplayName("Return 2 cities illuminated when city two blacked and next one is city three")
    public void testObjCity5() {
        PowerCrisis.City city = new PowerCrisis.City(1);
        PowerCrisis.City city2 = new PowerCrisis.City(2);
        PowerCrisis.City city3 = new PowerCrisis.City(3);

        city.next = city2;
        city.previous = city3;

        city2.next = city3;
        city2.previous = city;

        city3.next = city;
        city3.previous = city2;

        city2.blacked();
        Assertions.assertAll(
                () -> assertEquals(2, PowerCrisis.City.illuminated),
                () -> assertEquals(city, city3.previous),
                () -> assertEquals(city3, city.next)
        );


    }

}