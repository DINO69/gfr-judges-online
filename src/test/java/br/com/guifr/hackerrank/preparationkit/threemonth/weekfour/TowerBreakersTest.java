package br.com.guifr.hackerrank.preparationkit.threemonth.weekfour;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TowerBreakersTest {

    @Test
    @DisplayName("Return 2 When play tower breaker With n=2 m=2")
    public void towerBreakers() {
        Assertions.assertEquals(2,TowerBreakers.towerBreakers(2,2));
    }

    @Test
    @DisplayName("Return 1 When play tower breaker With n=2 m=4")
    public void towerBreakers2() {
        Assertions.assertEquals(1,TowerBreakers.towerBreakers(1,4));
    }


}