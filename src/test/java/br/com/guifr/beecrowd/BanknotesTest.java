package br.com.guifr.beecrowd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BanknotesTest {

    private Banknotes.Notes notes;

    @BeforeEach
    void setUp() {
        notes = getNotes();
    }

    private Banknotes.Notes getNotes() {
        Banknotes.Notes notes = new Banknotes.Notes(100,
                new Banknotes.Notes(50,
                        new Banknotes.Notes(20,
                                new Banknotes.Notes(10,
                                        new Banknotes.Notes(5,
                                                new Banknotes.Notes(2,
                                                        new Banknotes.Notes(1, null)))))));
        return notes;
    }

    @Test
    @DisplayName("Return the all money notes when value is 576")
    public void test1(){


        String actual = Banknotes.value(576,notes).printNotes();
        Assertions.assertEquals("5 nota(s) de R$ 100,00\n" +
                "1 nota(s) de R$ 50,00\n" +
                "1 nota(s) de R$ 20,00\n" +
                "0 nota(s) de R$ 10,00\n" +
                "1 nota(s) de R$ 5,00\n" +
                "0 nota(s) de R$ 2,00\n" +
                "1 nota(s) de R$ 1,00",actual);
    }

    @Test
    @DisplayName("Return the all money notes when value is 11257")
    public void test2(){


        String actual = Banknotes.value(11257,notes).printNotes();
        Assertions.assertEquals("112 nota(s) de R$ 100,00\n" +
                "1 nota(s) de R$ 50,00\n" +
                "0 nota(s) de R$ 20,00\n" +
                "0 nota(s) de R$ 10,00\n" +
                "1 nota(s) de R$ 5,00\n" +
                "1 nota(s) de R$ 2,00\n" +
                "0 nota(s) de R$ 1,00",actual);
    }

    @Test
    @DisplayName("Return the all money notes when value is 503")
    public void test3(){

        String actual = Banknotes.value(503,notes).printNotes();
        Assertions.assertEquals("5 nota(s) de R$ 100,00\n" +
                "0 nota(s) de R$ 50,00\n" +
                "0 nota(s) de R$ 20,00\n" +
                "0 nota(s) de R$ 10,00\n" +
                "0 nota(s) de R$ 5,00\n" +
                "1 nota(s) de R$ 2,00\n" +
                "1 nota(s) de R$ 1,00",actual);
    }



    @Test
    @DisplayName("Return '5 nota(s) de R$ 100,00' when decomposed 576 with fator 100")
    public void testDecomposed1(){
        String actual = new Banknotes.Notes(100,null).decomposed(576);
        Assertions.assertEquals("5 nota(s) de R$ 100,00",actual);
    }

    @Test
    @DisplayName("Return '1 nota(s) de R$ 50,00' when decomposed 51 with fator 50")
    public void testDecomposed2(){
        String actual = new Banknotes.Notes(50,null).decomposed(51);
        Assertions.assertEquals("1 nota(s) de R$ 50,00",actual);
    }

    @Test
    @DisplayName("Return '2 nota(s) de R$ 20,00' when decomposed 51 with fator 20")
    public void testDecomposed3(){
        String actual = new Banknotes.Notes(20,null).decomposed(51);
        Assertions.assertEquals("2 nota(s) de R$ 20,00",actual);
    }

    @Test
    @DisplayName("Return '5 nota(s) de R$ 100,00\n1 nota(s) de R$ 50,00' when decomposed 576 with fator 100 and 50")
    public void testDecomposed4(){
        String actual = new Banknotes.Notes(100,new Banknotes.Notes(50,null)).decomposed(576);
        Assertions.assertEquals("5 nota(s) de R$ 100,00\n" +
                "1 nota(s) de R$ 50,00",actual);
    }

    @Test
    @DisplayName("Return '5 nota(s) de R$ 100,00\n0 nota(s) de R$ 50,00' when decomposed 500 with fator 100 and 50")
    public void testDecomposed5(){
        String actual = new Banknotes.Notes(100,new Banknotes.Notes(50,null)).decomposed(500);
        Assertions.assertEquals("5 nota(s) de R$ 100,00\n" +
                "0 nota(s) de R$ 50,00",actual);
    }

}