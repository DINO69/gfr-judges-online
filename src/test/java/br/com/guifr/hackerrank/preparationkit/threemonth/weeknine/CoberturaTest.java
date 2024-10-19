package br.com.guifr.hackerrank.preparationkit.threemonth.weeknine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CoberturaTest {

    @Test
    @DisplayName("Return 100% When don't nothing Given call method")
    @Disabled("Test created just view how works isEmpty / isBlank")
    void test() {
        String a = "";
        a.isEmpty();
        a.isBlank();
        int result = Cobertura.withOutTest(2,3);
        Assertions.assertEquals(5,4);
    }
}