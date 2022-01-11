package br.com.guifr.beecrowd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static br.com.guifr.beecrowd.Banknotes.Money.Builder.*;

class BanknotesTest {

    private Banknotes.Money money;
    private Banknotes.Chain chainPrintMoneyAndCoins;

    @BeforeEach
    void setUp() {
        money = getNotes();
        chainPrintMoneyAndCoins = getNotesAndCoinsWithPrint();
    }

    private Banknotes.Money getNotes() {
        Banknotes.Money money = build(100).withNext(
                build(50).withNext(
                        build(20).withNext(
                                build(10).withNext(
                                        build(5).withNext(
                                                build(2).withNext(
                                                        build(1).get()
                                                ).get()
                                        ).get()
                                ).get()
                        ).get()
                ).get()
        ).get();

        return money;
    }

    private Banknotes.Chain getNotesAndCoinsWithPrint() {

        Banknotes.Print chains = new Banknotes.Print("NOTAS:",
                buildLocaleUS(100).withNext(
                        buildLocaleUS(50).withNext(
                                buildLocaleUS(20).withNext(
                                        buildLocaleUS(10).withNext(
                                                buildLocaleUS(5).withNext(
                                                        buildLocaleUS(2).withNext(
                                                                new Banknotes.Print("MOEDAS:", getCoins())
                                                        ).get()
                                                ).get()
                                        ).get()
                                ).get()
                        ).get()
                ).get());

        return chains;
    }

    private Banknotes.Money getCoins() {
        Banknotes.Money chains =
                buildCoinsWithLocaleUS(1.00).withNext(
                        buildCoinsWithLocaleUS(0.50).withNext(
                                buildCoinsWithLocaleUS(0.25).withNext(
                                        buildCoinsWithLocaleUS(0.10).withNext(
                                                buildCoinsWithLocaleUS(0.05).withNext(
                                                        buildCoinsWithLocaleUS(0.01).get()
                                                ).get()
                                        ).get()
                                ).get()
                        ).get()
                ).get();

        return chains;
    }

    @Test
    @DisplayName("Return the all money notes when value is 576")
    public void test1() {


        String actual = Banknotes.value(576, money).printNotes();
        Assertions.assertEquals("5 nota(s) de R$ 100,00\n" +
                "1 nota(s) de R$ 50,00\n" +
                "1 nota(s) de R$ 20,00\n" +
                "0 nota(s) de R$ 10,00\n" +
                "1 nota(s) de R$ 5,00\n" +
                "0 nota(s) de R$ 2,00\n" +
                "1 nota(s) de R$ 1,00", actual);
    }

    @Test
    @DisplayName("Return the all money notes when value is 11257")
    public void test2() {


        String actual = Banknotes.value(11257, money).printNotes();
        Assertions.assertEquals("112 nota(s) de R$ 100,00\n" +
                "1 nota(s) de R$ 50,00\n" +
                "0 nota(s) de R$ 20,00\n" +
                "0 nota(s) de R$ 10,00\n" +
                "1 nota(s) de R$ 5,00\n" +
                "1 nota(s) de R$ 2,00\n" +
                "0 nota(s) de R$ 1,00", actual);
    }

    @Test
    @DisplayName("Return the all money notes when value is 503")
    public void test3() {

        String actual = Banknotes.value(503, money).printNotes();
        Assertions.assertEquals("5 nota(s) de R$ 100,00\n" +
                "0 nota(s) de R$ 50,00\n" +
                "0 nota(s) de R$ 20,00\n" +
                "0 nota(s) de R$ 10,00\n" +
                "0 nota(s) de R$ 5,00\n" +
                "1 nota(s) de R$ 2,00\n" +
                "1 nota(s) de R$ 1,00", actual);
    }


    @Test
    @DisplayName("Return '5 nota(s) de R$ 100,00' when decomposed 576 with fator 100")
    public void testDecomposed1() {
        String actual = build(100).get().decomposed(576);
        Assertions.assertEquals("5 nota(s) de R$ 100,00", actual);
    }

    @Test
    @DisplayName("Return '1 nota(s) de R$ 50,00' when decomposed 51 with fator 50")
    public void testDecomposed2() {
        String actual = build(50).get().decomposed(51);
        Assertions.assertEquals("1 nota(s) de R$ 50,00", actual);
    }

    @Test
    @DisplayName("Return '2 nota(s) de R$ 20,00' when decomposed 51 with fator 20")
    public void testDecomposed3() {
        String actual = build(20).get().decomposed(51);
        Assertions.assertEquals("2 nota(s) de R$ 20,00", actual);
    }

    @Test
    @DisplayName("Return '5 nota(s) de R$ 100,00\n1 nota(s) de R$ 50,00' when decomposed 576 with fator 100 and 50")
    public void testDecomposed4() {
        String actual = build(100).withNext(build(50).get()).get().decomposed(576);
        Assertions.assertEquals("5 nota(s) de R$ 100,00\n" +
                "1 nota(s) de R$ 50,00", actual);
    }

    @Test
    @DisplayName("Return '5 nota(s) de R$ 100,00\n0 nota(s) de R$ 50,00' when decomposed 500 with fator 100 and 50")
    public void testDecomposed5() {
        String actual = build(100).withNext(build(50).get()).get().decomposed(500);
        Assertions.assertEquals("5 nota(s) de R$ 100,00\n" +
                "0 nota(s) de R$ 50,00", actual);
    }

    @Test
    @DisplayName("Return 'NOTAS:' when execute method of print class")
    public void testStringChain() {
        String actual = new Banknotes.Print("NOTAS:", null).execute(null);
        Assertions.assertEquals("NOTAS:", actual);
    }

    @Test
    @DisplayName("Return '1 moeda(s) de R$ 1.00' when decomposed 1.50 with fator 1.00")
    public void testDecomposed6() {
        String actual = build(1.00)
                .withLocale(Locale.US)
                .withType("moeda")
                .get().decomposed(1.50);
        Assertions.assertEquals("1 moeda(s) de R$ 1.00", actual);
    }

    @Test
    @DisplayName("Return 'NOTAS:\n0 nota(s) de R$ 100.00' when call print and money sequence with 4.00")
    public void testJoinPrintMoney1() {

        String actual = new Banknotes.Print("NOTAS:", build(100)
                .withLocale(Locale.US)
                .get()
        ).execute(4.00);
        Assertions.assertEquals("NOTAS:\n" +
                "0 nota(s) de R$ 100.00", actual);
    }

    @Test
    @DisplayName("Return 'NOTAS:\n0 nota(s) de R$ 100.00\nMOEDAS:\n4 moeda(s) de R$ 1.00' when call print and money sequence with 4.00")
    public void testJoinPrintMoney2() {

        String actual = new Banknotes.Print("NOTAS:", build(100)
                .withLocale(Locale.US)
                .withNext(new Banknotes.Print("MOEDAS:",
                                build(1.00)
                                        .withLocale(Locale.US)
                                        .withType("moeda")
                                        .get()
                        )
                )
                .get()
        )
                .execute(4.00);

        Assertions.assertEquals("NOTAS:\n" +
                "0 nota(s) de R$ 100.00\n" +
                "MOEDAS:\n" +
                "4 moeda(s) de R$ 1.00", actual);
    }

    @Test
    @DisplayName("Return 'NOTAS:\n0 nota(s) de R$ 100.00\nMOEDAS:\n4 moeda(s) de R$ 1.00' when call print and money sequence with 4.00")
    public void testJoinPrintMoney3() {

        String actual = chainPrintMoneyAndCoins
                .execute(4.00);

        Assertions.assertEquals("NOTAS:\n" +
                "0 nota(s) de R$ 100.00\n" +
                "0 nota(s) de R$ 50.00\n" +
                "0 nota(s) de R$ 20.00\n" +
                "0 nota(s) de R$ 10.00\n" +
                "0 nota(s) de R$ 5.00\n" +
                "2 nota(s) de R$ 2.00\n" +
                "MOEDAS:\n" +
                "0 moeda(s) de R$ 1.00\n" +
                "0 moeda(s) de R$ 0.50\n" +
                "0 moeda(s) de R$ 0.25\n" +
                "0 moeda(s) de R$ 0.10\n" +
                "0 moeda(s) de R$ 0.05\n" +
                "0 moeda(s) de R$ 0.01", actual);
    }

    @Test
    @DisplayName("Return all prints when call print and money sequence with 576.73")
    public void testJoinPrintMoney4() {

        String actual = chainPrintMoneyAndCoins
                .execute(576.73);

        Assertions.assertEquals("NOTAS:\n" +
                "5 nota(s) de R$ 100.00\n" +
                "1 nota(s) de R$ 50.00\n" +
                "1 nota(s) de R$ 20.00\n" +
                "0 nota(s) de R$ 10.00\n" +
                "1 nota(s) de R$ 5.00\n" +
                "0 nota(s) de R$ 2.00\n" +
                "MOEDAS:\n" +
                "1 moeda(s) de R$ 1.00\n" +
                "1 moeda(s) de R$ 0.50\n" +
                "0 moeda(s) de R$ 0.25\n" +
                "2 moeda(s) de R$ 0.10\n" +
                "0 moeda(s) de R$ 0.05\n" +
                "3 moeda(s) de R$ 0.01", actual);
    }

    @Test
    @DisplayName("Return all prints when call print and money sequence with 0.97")
    public void testJoinPrintMoney5() {

        String actual = chainPrintMoneyAndCoins
                .execute(0.97);

        Assertions.assertEquals("NOTAS:\n" +
                "0 nota(s) de R$ 100.00\n" +
                "0 nota(s) de R$ 50.00\n" +
                "0 nota(s) de R$ 20.00\n" +
                "0 nota(s) de R$ 10.00\n" +
                "0 nota(s) de R$ 5.00\n" +
                "0 nota(s) de R$ 2.00\n" +
                "MOEDAS:\n" +
                "0 moeda(s) de R$ 1.00\n" +
                "1 moeda(s) de R$ 0.50\n" +
                "1 moeda(s) de R$ 0.25\n" +
                "2 moeda(s) de R$ 0.10\n" +
                "0 moeda(s) de R$ 0.05\n" +
                "2 moeda(s) de R$ 0.01", actual);
    }



}