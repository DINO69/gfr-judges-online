package br.com.guifr.beecrowd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TheGreatestTest {

    @Test
    @DisplayName("Return '106 eh o maior' when numbers is 7 14 106")
    public void test1() {
        String actual = TheGreatest.of(7, 15, 106);
        Assertions.assertEquals("106 eh o maior", actual);
    }

    @Test
    @DisplayName("Return '217 eh o maior' when numbers is 217 14 6")
    public void test2() {
        String actual = TheGreatest.of(217, 14, 6);
        Assertions.assertEquals("217 eh o maior", actual);
    }

    @Test
    @DisplayName("Return '3 eh o maior' when numbers is 1 3 2")
    public void test3() {
        String actual = TheGreatest.of(1, 3, 2);
        Assertions.assertEquals("3 eh o maior", actual);
    }

    @Test
    @DisplayName("Return 3 when compare 3 with 2")
    public void testFormula1() {
        int actual = TheGreatest.usingFormula(3, 2);
        Assertions.assertEquals(3, actual);
    }

    @Test
    @DisplayName("Return 5 when compare 3 with 5")
    public void testFormula2() {
        int actual = TheGreatest.usingFormula(3, 5);
        Assertions.assertEquals(5, actual);
    }

}