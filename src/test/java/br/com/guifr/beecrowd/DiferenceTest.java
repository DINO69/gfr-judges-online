package br.com.guifr.beecrowd;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiferenceTest {

    @Test
    @DisplayName("Then return -26 when apply formula (A * B - C * D) with 5 6 7 8")
    public void test1(){

        int a = 5;
        int b = 6;
        int c = 7;
        int d = 8;
        String actual = Diference.of(a,b,c,d).print();
        assertEquals("DIFERENCA = -26\n",actual);
    }

    @Test
    @DisplayName("Then return -56 when apply formula (A * B - C * D) with 0 0 7 8")
    public void test2(){

        int a = 0;
        int b = 0;
        int c = 7;
        int d = 8;
        String actual = Diference.of(a,b,c,d).print();
        assertEquals("DIFERENCA = -56\n",actual);
    }

    @Test
    @DisplayName("Then return 86 when apply formula (A * B - C * D) with 5 6 -7 8")
    public void test3(){

        int a = 5;
        int b = 6;
        int c = -7;
        int d = 8;
        String actual = Diference.of(a,b,c,d).print();
        assertEquals("DIFERENCA = 86\n",actual);
    }

}