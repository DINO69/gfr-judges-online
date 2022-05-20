package br.com.guifr.hackerrank.preparationkit.threemonth.weekthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class MaximumPerimeterTriangleTest {

    @Test
    @DisplayName("Return 0.0 When calculate area of triangle With [1,2,3]")
    public void testArea1() {
        double actual = MaximumPerimeterTriangle.heronAreaFormula(Arrays.asList(1,2,3));
        double expected = 0.0;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Return 2.90474 When calculate area of triangle With [2,3,4]")
    public void testArea2() {
        double actual = MaximumPerimeterTriangle.heronAreaFormula(Arrays.asList(2,3,4));
        double expected = 2.90474;
        Assertions.assertEquals(expected,actual,0.00001);
    }

    @Test
    @DisplayName("Return 6 When calculate area of triangle With [3,4,5]")
    public void testArea3() {
        double actual = MaximumPerimeterTriangle.heronAreaFormula(Arrays.asList(3,4,5));
        double expected = 6;
        Assertions.assertEquals(expected,actual,0.00001);
    }

    @Test
    @DisplayName("Return 0.0 When calculate area of triangle With [4,5,10]")
    public void testArea4() {
        double actual = MaximumPerimeterTriangle.heronAreaFormula(Arrays.asList(4,5,10));
        double expected = 0.0;
        Assertions.assertEquals(expected,actual,0.00001);
    }

    @Test
    @DisplayName("Return 0.0 When calculate area of triangle With [1000000000 1000000000 1000000000]")
    public void testArea5() {
        double actual = MaximumPerimeterTriangle.heronAreaFormula(Arrays.asList(1000000000,1000000000,1000000000));
        double expected = 0.0;
        Assertions.assertTrue(actual > expected,"Actual is greater than 0.0");
    }

    @Test
    @DisplayName("Return [-1] When maximum perimeter triangle not found With [4,5,10]")
    public void testMPT1() {
        List<Integer> actual = MaximumPerimeterTriangle.in(Arrays.asList(4,5,10));
        Assertions.assertTrue(Arrays.asList(-1).equals(actual));
    }

    @Test
    @DisplayName("Return [3,4,5] When find maximum perimeter triangle With [1,2,3,4,5,10]")
    public void testMPT2() {
        List<Integer> actual = MaximumPerimeterTriangle.in(Arrays.asList(1,2,3,4,5,10));
        Assertions.assertEquals(3,actual.get(0));
        Assertions.assertEquals(4,actual.get(1));
        Assertions.assertEquals(5,actual.get(2));
        Assertions.assertTrue(Arrays.asList(3,4,5).equals(actual), "Find MPT");
    }

    @Test
    @DisplayName("Return 12 When calculate perimeter triangle With [3,4,5]")
    public void testPerimeter() {
        long actual = MaximumPerimeterTriangle.perimeter(Arrays.asList(3,4,5));
        Assertions.assertEquals(12L,actual);
    }

    @Test
    @DisplayName("Return 0 When calculate perimeter triangle With []")
    public void testPerimeter2() {
        long actual = MaximumPerimeterTriangle.perimeter(Arrays.asList());
        Assertions.assertEquals(0L,actual);
    }

    @Test
    @DisplayName("Return [3,4,5] When choice comparator last number greater With [[1,2,3],[3,4,5]]")
    public void testChoice1() {
        List<Integer> actual = MaximumPerimeterTriangle.choice(Arrays.asList(1,2,3),Arrays.asList(3,4,5));
        Assertions.assertTrue(Arrays.asList(3,4,5).equals(actual), "Choiced because 5 is greater than 3");
    }

    @Test
    @DisplayName("Return [1,2,6] When choice comparator last number greater With [[1,2,6],[3,4,5]]")
    public void testChoice2() {
        List<Integer> actual = MaximumPerimeterTriangle.choice(Arrays.asList(1,2,6),Arrays.asList(3,4,5));
        Assertions.assertTrue(Arrays.asList(1,2,6).equals(actual), "Choiced because 6 is greater than 5");
    }

    @Test
    @DisplayName("Return [3,4,5] When choice comparator first number greater With [[1,2,5],[3,4,5]]")
    public void testChoice3() {
        List<Integer> actual = MaximumPerimeterTriangle.choice(Arrays.asList(1,2,5),Arrays.asList(3,4,5));
        Assertions.assertTrue(Arrays.asList(3,4,5).equals(actual), "Choiced because 3 is greater than 1");
    }

    @Test
    @DisplayName("Return [3,2,5] When choice first triangle because first and last number is eq With [[3,2,5],[3,4,5]]")
    public void testChoice4() {
        List<Integer> actual = MaximumPerimeterTriangle.choice(Arrays.asList(3,2,5),Arrays.asList(3,4,5));
        Assertions.assertTrue(Arrays.asList(3,2,5).equals(actual), "Choiced because first and last number is eq");
    }

    @Test
    @DisplayName("Return [3,2,5] When choice first triangle because second is empty With [[3,2,5],[]]")
    public void testChoice5() {
        List<Integer> actual = MaximumPerimeterTriangle.choice(Arrays.asList(3,2,5), Collections.emptyList());
        Assertions.assertTrue(Arrays.asList(3,2,5).equals(actual), "Choiced because second is empty");
    }

    @Test
    @DisplayName("Return [3,2,5] When choice second triangle because first is empty With [[],[3,2,5]]")
    public void testChoice6() {
        List<Integer> actual = MaximumPerimeterTriangle.choice(Collections.emptyList(),Arrays.asList(3,2,5));
        Assertions.assertTrue(Arrays.asList(3,2,5).equals(actual), "Choiced because first is empty");
    }

    @Test
    @DisplayName("Return false When calculate valid triangle With [1,2,3]")
    public void testValidTriangle1() {
        Assertions.assertFalse(MaximumPerimeterTriangle.hasValidTriangle(Arrays.asList(1,2,3)));
    }

    @Test
    @DisplayName("Return true When calculate valid triangle With [2,3,4]")
    public void testValidTriangle2() {
        Assertions.assertTrue(MaximumPerimeterTriangle.hasValidTriangle(Arrays.asList(2,3,4)));
    }

    @Test
    @DisplayName("Return true When calculate valid triangle With [3,4,5]")
    public void testValidTriangle3() {
        Assertions.assertTrue(MaximumPerimeterTriangle.hasValidTriangle(Arrays.asList(3,4,5)));
    }

    @Test
    @DisplayName("Return false When calculate valid triangle With [4,5,10]")
    public void testValidTriangle4() {
        Assertions.assertFalse(MaximumPerimeterTriangle.hasValidTriangle(Arrays.asList(4,5,10)));
    }

    @Test
    @DisplayName("Return true When calculate valid triangle With [1000000000 1000000000 1000000000]")
    public void testValidTriangle5() {
        Assertions.assertTrue(MaximumPerimeterTriangle.hasValidTriangle(Arrays.asList(1000000000,1000000000,1000000000)));
    }

    @Test
    @DisplayName("Return [-1] When maximum perimeter triangle not found With [4,5,10]")
    public void testMPTValidTriangle1() {
        List<Integer> actual = MaximumPerimeterTriangle.inValidTriangle(Arrays.asList(4,5,10));
        Assertions.assertTrue(Arrays.asList(-1).equals(actual));
    }

    @Test
    @DisplayName("Return [3,4,5] When find maximum perimeter triangle With [1,2,3,4,5,10]")
    public void testMPTValidTriangle2() {
        List<Integer> actual = MaximumPerimeterTriangle.inValidTriangle(Arrays.asList(1,2,3,4,5,10));
        Assertions.assertEquals(3,actual.get(0));
        Assertions.assertEquals(4,actual.get(1));
        Assertions.assertEquals(5,actual.get(2));
        Assertions.assertTrue(Arrays.asList(3,4,5).equals(actual), "Find MPT");
    }

}