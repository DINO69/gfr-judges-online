package br.com.guifr.beecrowd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionTestOneTest {

    @Test
    @DisplayName("Return 'Valores nao aceitos' when values 5 6 7 8 is invalid")
    public void test1(){
        String actual = SelectionTestOne.of(5,6,7,8).printIsValid();
        assertEquals("Valores nao aceitos",actual);
    }

    @Test
    @DisplayName("Return 'Valores aceitos' when values 2 3 2 6 is valid")
    public void test2(){
        String actual = SelectionTestOne.of(2 ,3 ,2,6).printIsValid();
        assertEquals("Valores aceitos",actual);
    }

    @Test
    @DisplayName("Return 'False' when values 5 6 7 8 is invalid")
    public void testValid1False(){
        boolean actual = SelectionTestOne.of(5,6,7,8).isValid();
        assertFalse(actual);
    }

    @Test
    @DisplayName("Return 'True' when values 2 3 2 6 is valid")
    public void testValid2True(){
        boolean actual = SelectionTestOne.of(2 ,3 ,2,6).isValid();
        assertTrue(actual);
    }

    @Test
    @DisplayName("Return 'True' if B is greater than C")
    public void testRule1True(){
        boolean actual = SelectionTestOne.of(0,3,2,4).valueBGreaterThanC();
        assertTrue(actual);
    }

    @Test
    @DisplayName("Return 'False' if B is greater than C")
    public void testRule1False(){
        boolean actual = SelectionTestOne.of(0,2,3,4).valueBGreaterThanC();
        assertFalse(actual);
    }

    @Test
    @DisplayName("Return 'False' when equals if B is greater than C")
    public void testRule1Equal(){
        boolean actual = SelectionTestOne.of(0,2,2,4).valueBGreaterThanC();
        assertFalse(actual);
    }

    @Test
    @DisplayName("Return True 'and D is greater than A'")
    public void testRule2True(){
        boolean actual = SelectionTestOne.of(5,2,2,6).valueDGreaterThanA();
        assertTrue(actual);
    }

    @Test
    @DisplayName("Return False 'and D is greater than A'")
    public void testRule2False(){
        boolean actual = SelectionTestOne.of(5,2,2,4).valueDGreaterThanA();
        assertFalse(actual);
    }

    @Test
    @DisplayName("Return False when is equal 'and D is greater than A'")
    public void testRule2Equal(){
        boolean actual = SelectionTestOne.of(5,2,2,5).valueDGreaterThanA();
        assertFalse(actual);
    }

    @Test
    @DisplayName("Return true 'and if the sum of C and D is greater than the sum of A and B'")
    public void testRule3True(){
        boolean actual = SelectionTestOne.of(5,2,3,5).sumCDGreaterThanSumAB();
        assertTrue(actual);
    }

    @Test
    @DisplayName("Return false 'and if the sum of C and D is greater than the sum of A and B'")
    public void testRule3False(){
        boolean actual = SelectionTestOne.of(5,4,3,5).sumCDGreaterThanSumAB();
        assertFalse(actual);
    }

    @Test
    @DisplayName("Return false when is equal 'and if the sum of C and D is greater than the sum of A and B'")
    public void testRule3Equal(){
        boolean actual = SelectionTestOne.of(5,3,3,5).sumCDGreaterThanSumAB();
        assertFalse(actual);
    }

    @Test
    @DisplayName("Return true 'if C and D were positives values'")
    public void testRule4True(){
        boolean actual = SelectionTestOne.of(5,3,3,5).valuesCDIsPositive();
        assertTrue(actual);
    }

    @Test
    @DisplayName("Return False is c negative 'if C and D were positives values'")
    public void testRule4False(){
        boolean actual = SelectionTestOne.of(5,3,-3,5).valuesCDIsPositive();
        assertFalse(actual);
    }

    @Test
    @DisplayName("Return False is d negative 'if C and D were positives values'")
    public void testRule4False2(){
        boolean actual = SelectionTestOne.of(5,3,3,-5).valuesCDIsPositive();
        assertFalse(actual);
    }

    @Test
    @DisplayName("Return False is d and c both negative 'if C and D were positives values'")
    public void testRule4False3(){
        boolean actual = SelectionTestOne.of(5,3,-3,-5).valuesCDIsPositive();
        assertFalse(actual);
    }

    @Test
    @DisplayName("Return true 'and if A is even'")
    public void testRule5True(){
        boolean actual = SelectionTestOne.of(4,3,-3,-5).valueAIsEven();
        assertTrue(actual);
    }

    @Test
    @DisplayName("Return false 'and if A is even'")
    public void testRule5False(){
        boolean actual = SelectionTestOne.of(5,3,-3,-5).valueAIsEven();
        assertFalse(actual);
    }


    @Test
    @DisplayName("Return 'True' when Rule 1 with values 2 3 2 6 is valid")
    public void testValidTrueRule1Ex1(){
        boolean actual = SelectionTestOne.of(2 ,3 ,2,6).valueBGreaterThanC();
        assertTrue(actual);
    }

    @Test
    @DisplayName("Return 'True' when Rule 2 with values 2 3 2 6 is valid")
    public void testValidTrueRule2Ex1(){
        boolean actual = SelectionTestOne.of(2 ,3 ,2,6).valueDGreaterThanA();
        assertTrue(actual);
    }

    @Test
    @DisplayName("Return 'True' when Rule 3 with values 2 3 2 6 is valid")
    public void testValidTrueRule3Ex1(){
        boolean actual = SelectionTestOne.of(2 ,3 ,2,6).sumCDGreaterThanSumAB();
        assertTrue(actual);
    }

    @Test
    @DisplayName("Return 'True' when Rule 4 with values 2 3 2 6 is valid")
    public void testValidTrueRule4Ex1(){
        boolean actual = SelectionTestOne.of(2 ,3 ,2,6).valuesCDIsPositive();
        assertTrue(actual);
    }

    @Test
    @DisplayName("Return 'True' when Rule 5 with values 2 3 2 6 is valid")
    public void testValidTrueRule5Ex1(){
        boolean actual = SelectionTestOne.of(2 ,3 ,2,6).valueAIsEven();
        assertTrue(actual);
    }

}