package br.com.guifr.hackerrank.preparationkit.threemonth.weekfive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SmartNumberTwoTest {

    @Test
    @DisplayName("Return true When find smartnumber With 1")
    public void test1() {
        Assertions.assertTrue(SmartNumberTwo.isSmartNumber(1));
    }
    @Test
    @DisplayName("Return true When find smartnumber With 169")
    public void test2() {
        Assertions.assertTrue(SmartNumberTwo.isSmartNumber(169));
    }

    @Test
    @DisplayName("Return false When find smartnumber With 2")
    public void test3() {
        Assertions.assertFalse(SmartNumberTwo.isSmartNumber(2));
    }

    @Test
    @DisplayName("Return false When find smartnumber With 7")
    public void test4() {
        Assertions.assertFalse(SmartNumberTwo.isSmartNumber(7));
    }

}