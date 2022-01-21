package br.com.guifr.beecrowd;

import br.com.guifr.beecrowd.BhaskarasFormula.BhaskarasException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BhaskarasFormulaTest {

    @Test
    @DisplayName("Return r1 = -0.29788 and r2 = -1.71212 when calculate form with 10.0 20.1 5.1")
    public void test1() throws BhaskarasException {
        BhaskarasFormula result = BhaskarasFormula.of(10.0,20.1,5.1);

        assertAll(
                ()->assertEquals(-0.29788,result.getR1()),
                ()->assertEquals(-1.71212,result.getR2())
        );
    }

    @Test
    @DisplayName("Return r1 = -0.02466 and r2 = -19.68408 when calculate form with 10.3 203.0 5.0")
    public void test2() throws BhaskarasException {
        BhaskarasFormula result = BhaskarasFormula.of(10.3,203.0,5.0);

        assertAll(
                ()->assertEquals(-0.02466,result.getR1()),
                ()->assertEquals(-19.68408,result.getR2())
        );
    }

    @Test
    @DisplayName("Return exception because 'division by zero' with 'Impossivel calcular' when calculate form with 0.0 20.0 5.0")
    public void test3(){

        Exception ex = Assertions.assertThrows(BhaskarasException.class,
                ()->BhaskarasFormula.of(0.0,20.0,5.0)
        );

        assertAll(
                ()->assertEquals("Impossivel calcular",ex.getMessage()),
                ()->assertEquals(BhaskarasException.class,ex.getClass())
        );

    }

    @Test
    @DisplayName("Return exception because 'a square root of a negative' with 'Impossivel calcular' when calculate form with 10.0 3.0 5.0")
    public void test4(){

        Exception ex = Assertions.assertThrows(BhaskarasException.class,
                ()->BhaskarasFormula.of(10.0,3.0,5.0)
        );

        assertAll(
                ()->assertEquals("Impossivel calcular",ex.getMessage()),
                ()->assertEquals(BhaskarasException.class,ex.getClass())
        );

    }

}