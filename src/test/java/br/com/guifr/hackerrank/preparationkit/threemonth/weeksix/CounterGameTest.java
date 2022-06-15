package br.com.guifr.hackerrank.preparationkit.threemonth.weeksix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CounterGameTest {

    @Test
    @DisplayName("Return 'Louise' When she won the game With n=132")
    public void test1() {

        String won = CounterGame.startWith(132);
        Assertions.assertEquals("Louise",won);
    }

    @Test
    @DisplayName("Return 'Richard' When he won the game With n=6")
    public void test2() {

        String won = CounterGame.startWith(6);
        Assertions.assertEquals("Richard",won);
    }

    @Test
    @DisplayName("Return 'Richard' When he won the game With n=1")
    public void test3() {
        String won = CounterGame.startWith(1);
        Assertions.assertEquals("Richard",won);
    }

    @Test
    @DisplayName("Return 'Louise' When she won the game With n=2")
    public void test4() {

        String won = CounterGame.startWith(2);
        Assertions.assertEquals("Louise",won);
    }

    @Test
    @DisplayName("Return '110' When convertToBinary With n=6")
    public void testBinary1() {

        String hexa = CounterGame.convertToBinary(6L);
        Assertions.assertEquals("110",hexa);
    }

    @Test
    @DisplayName("Return '10000100' When convertToBinary With n=132")
    public void testBinary2() {

        String hexa = CounterGame.convertToBinary(132L);
        Assertions.assertEquals("10000100",hexa);
    }

    @Test
    @DisplayName("Return '100' When justFirstDigitSignificant With n='110")
    public void testBinary3() {
        String significant = CounterGame.justFirstDigitSignificant("110");
        Assertions.assertEquals("100",significant);
    }

    @Test
    @DisplayName("Return '10000000' When justFirstDigitSignificant With n='10000100")
    public void testBinary4() {
        String significant = CounterGame.justFirstDigitSignificant("10000100");
        Assertions.assertEquals("10000000",significant);
    }

    @Test
    @DisplayName("Return 128 When nextLowerPower With n=132")
    public void testLessPower1() {
        long power = CounterGame.nextLowerPower(132);
        Assertions.assertEquals(128L,power);
    }

    @Test
    @DisplayName("Return 4 When nextLowerPower With n=6")
    public void testLessPower2() {
        long power = CounterGame.nextLowerPower(6);
        Assertions.assertEquals(4L,power);
    }

}