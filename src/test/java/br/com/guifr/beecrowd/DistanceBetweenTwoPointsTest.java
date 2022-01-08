package br.com.guifr.beecrowd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DistanceBetweenTwoPointsTest {

    @Test
    @DisplayName("Return 4.4721 when calculate distance between 1.0 7.0 with 5.0 9.0")
    public void test1() {
        DistanceBetweenTwoPoints.Point p1 = new DistanceBetweenTwoPoints.Point(1.0, 7.0);
        DistanceBetweenTwoPoints.Point p2 = new DistanceBetweenTwoPoints.Point(5.0, 9.0);
        double actual = DistanceBetweenTwoPoints.points(p1, p2).distance();
        assertEquals(4.4721, actual);
    }

    @Test
    @DisplayName("Return 16.1484 when calculate distance between -2.5 0.4 with 12.1 7.3")
    public void test2() {
        DistanceBetweenTwoPoints.Point p1 = new DistanceBetweenTwoPoints.Point(-2.5, 0.4);
        DistanceBetweenTwoPoints.Point p2 = new DistanceBetweenTwoPoints.Point(12.1, 7.3);
        double actual = DistanceBetweenTwoPoints.points(p1, p2).distance();
        assertEquals(16.1484, actual);
    }

    @Test
    @DisplayName("Return 16.4575 when calculate distance between 2.5 -0.4 with -12.2 7.0")
    public void test3() {
        DistanceBetweenTwoPoints.Point p1 = new DistanceBetweenTwoPoints.Point(2.5, -0.4);
        DistanceBetweenTwoPoints.Point p2 = new DistanceBetweenTwoPoints.Point(-12.2, 7.0);
        double actual = DistanceBetweenTwoPoints.points(p1, p2).distance();
        assertEquals(16.4575, actual);
    }

    @Test
    @DisplayName("Return point wiht x = 1.0 and 7.0 with line '1.0 7.0'")
    public void testPoint() {

        DistanceBetweenTwoPoints.Point point = new DistanceBetweenTwoPoints.Point("1.0 7.0");

        Assertions.assertAll(
                () -> assertEquals(1.0, point.getX()),
                () -> assertEquals(1.0, point.getX())
        );


    }


}