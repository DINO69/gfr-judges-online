package br.com.guifr.hackerrank.preparationkit.threemonth.weekone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class PlusMinusTest {

    @Test
    @DisplayName("Return '0.400000\n0.400000\n0.200000' When count % number>0 | numbers<0 | numbers=0 With [1,1,0,-1,-1]")
    public void test() {
        String actual = PlusMinus.with(Arrays.asList(1,1,0,-1,-1));
        Assertions.assertEquals("0.400000\n0.400000\n0.200000",actual);
    }

    @Test
    @DisplayName("Return '0.500000\n0.333333\n0.166667' When count % number>0 | numbers<0 | numbers=0 With [-4, 3, -9, 0, 4, 1]")
    public void test2() {
        String actual = PlusMinus.with(Arrays.asList(-4, 3, -9, 0, 4, 1));
        Assertions.assertEquals("0.500000\n0.333333\n0.166667",actual);
    }
}