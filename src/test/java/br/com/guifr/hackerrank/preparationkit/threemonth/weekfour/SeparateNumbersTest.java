package br.com.guifr.hackerrank.preparationkit.threemonth.weekfour;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SeparateNumbersTest {

    @Test
    @DisplayName("Return 'YES 1' When string is beautiful With '1234'")
    public void test1() {
        String actual = SeparateNumbers.beautifulMode("1234");
        Assertions.assertEquals("YES 1",actual);
    }

    @Test
    @DisplayName("Return 'YES 9' When string is beautiful With '91011'")
    public void test2() {
        String actual = SeparateNumbers.beautifulMode("91011");
        Assertions.assertEquals("YES 9",actual);
    }

    @Test
    @DisplayName("Return 'YES 99' When string is beautiful With '99100'")
    public void test3() {
        String actual = SeparateNumbers.beautifulMode("99100");
        Assertions.assertEquals("YES 99",actual);
    }

    @Test
    @DisplayName("Return 'NO' When string is beautiful With '1'")
    public void test4() {
        String actual = SeparateNumbers.beautifulMode("1");
        Assertions.assertEquals("NO",actual);
    }

    @Test
    @DisplayName("Return 'NO' When string is beautiful With '010203'")
    public void test5() {
        String actual = SeparateNumbers.beautifulMode("010203");
        Assertions.assertEquals("NO",actual);
    }

    @Test
    @DisplayName("Return 'YES 999' When string is beautiful With '99910001001'")
    public void test6() {
        String actual = SeparateNumbers.beautifulMode("99910001001");
        Assertions.assertEquals("YES 999",actual);
    }

    @Test
    @DisplayName("Return 'YES 98' When string is beautiful With '9899100'")
    public void test7() {
        String actual = SeparateNumbers.beautifulMode("9899100");
        Assertions.assertEquals("YES 98",actual);
    }

    @Test
    @DisplayName("Return 'NO' When string is beautiful With '999100010001'")
    public void test8() {
        String actual = SeparateNumbers.beautifulMode("999100010001");
        Assertions.assertEquals("NO",actual);
    }

    @Test
    @DisplayName("Return 'NO' When string is beautiful With '101103'")
    public void test9() {
        String actual = SeparateNumbers.beautifulMode("101103");
        Assertions.assertEquals("NO",actual);
    }

    @Test
    @DisplayName("Return 'NO' When string is beautiful With '13'")
    public void test10() {
        String actual = SeparateNumbers.beautifulMode("13");
        Assertions.assertEquals("NO",actual);
    }

    @Test
    @DisplayName("Return 'NO' When string is beautiful With '429496729542949672964294967296'")
    public void test11() {
        String actual = SeparateNumbers.beautifulMode("429496729542949672964294967296");
        Assertions.assertEquals("NO",actual);
    }

    @Test
    @DisplayName("Return 'YES 997' When string is beautiful With '9979989991000'")
    public void test12() {
        String actual = SeparateNumbers.beautifulMode("9979989991000");
        Assertions.assertEquals("YES 997",actual);
    }

    @Test
    @DisplayName("Return 'NO' When string is beautiful With '42949672954294967296429496729'")
    public void test13() {
        String actual = SeparateNumbers.beautifulMode("42949672954294967296429496729");
        Assertions.assertEquals("NO",actual);
    }

    @Test
    @DisplayName("Return 'YES 60' When string is beautiful With '60616263646566676869707172737475'")
    public void test14() {
        String actual = SeparateNumbers.beautifulMode("60616263646566676869707172737475");
        Assertions.assertEquals("YES 60",actual);
    }

    @Test
    @DisplayName("Return 'YES 374021156' When string is beautiful With '374021156374021157374021158'")
    public void test15() {
        String actual = SeparateNumbers.beautifulMode("374021156374021157374021158");
        Assertions.assertEquals("YES 374021156",actual);
    }

    @Test
    @DisplayName("Return 'YES 78' When string is beautiful With '78798081828384858687888990919293'")
    public void test16() {
        String actual = SeparateNumbers.beautifulMode("78798081828384858687888990919293");
        Assertions.assertEquals("YES 78",actual);
    }


    @Test
    @DisplayName("Return 'YES 1' When CalcMid string is beautiful With '1234'")
    public void testCalcMid1() {
        String actual = SeparateNumbers.beautifulModeCalcMid("1234");
        Assertions.assertEquals("YES 1",actual);
    }

    @Test
    @DisplayName("Return 'YES 9' When CalcMid string is beautiful With '91011'")
    public void testCalcMid2() {
        String actual = SeparateNumbers.beautifulModeCalcMid("91011");
        Assertions.assertEquals("YES 9",actual);
    }

    @Test
    @DisplayName("Return 'YES 99' When CalcMid string is beautiful With '99100'")
    public void testCalcMid3() {
        String actual = SeparateNumbers.beautifulModeCalcMid("99100");
        Assertions.assertEquals("YES 99",actual);
    }

    @Test
    @DisplayName("Return 'NO' When CalcMid string is beautiful With '1'")
    public void testCalcMid4() {
        String actual = SeparateNumbers.beautifulModeCalcMid("1");
        Assertions.assertEquals("NO",actual);
    }

    @Test
    @DisplayName("Return 'NO' When CalcMid string is beautiful With '010203'")
    public void testCalcMid5() {
        String actual = SeparateNumbers.beautifulModeCalcMid("010203");
        Assertions.assertEquals("NO",actual);
    }

    @Test
    @DisplayName("Return 'YES 999' When CalcMid string is beautiful With '99910001001'")
    public void testCalcMid6() {
        String actual = SeparateNumbers.beautifulModeCalcMid("99910001001");
        Assertions.assertEquals("YES 999",actual);
    }

    @Test
    @DisplayName("Return 'YES 98' When CalcMid string is beautiful With '9899100'")
    public void testCalcMid7() {
        String actual = SeparateNumbers.beautifulModeCalcMid("9899100");
        Assertions.assertEquals("YES 98",actual);
    }

    @Test
    @DisplayName("Return 'NO' When CalcMid string is beautiful With '999100010001'")
    public void testCalcMid8() {
        String actual = SeparateNumbers.beautifulModeCalcMid("999100010001");
        Assertions.assertEquals("NO",actual);
    }

    @Test
    @DisplayName("Return 'NO' When CalcMid string is beautiful With '101103'")
    public void testCalcMid9() {
        String actual = SeparateNumbers.beautifulModeCalcMid("101103");
        Assertions.assertEquals("NO",actual);
    }

    @Test
    @DisplayName("Return 'NO' When CalcMid string is beautiful With '13'")
    public void testCalcMid10() {
        String actual = SeparateNumbers.beautifulModeCalcMid("13");
        Assertions.assertEquals("NO",actual);
    }

    @Test
    @DisplayName("Return 'NO' When CalcMid string is beautiful With '429496729542949672964294967296'")
    public void testCalcMid11() {
        String actual = SeparateNumbers.beautifulModeCalcMid("429496729542949672964294967296");
        Assertions.assertEquals("NO",actual);
    }

    @Test
    @DisplayName("Return 'YES 997' When CalcMid string is beautiful With '9979989991000'")
    public void testCalcMid12() {
        String actual = SeparateNumbers.beautifulModeCalcMid("9979989991000");
        Assertions.assertEquals("YES 997",actual);
    }

    @Test
    @DisplayName("Return 'NO' When CalcMid string is beautiful With '42949672954294967296429496729'")
    public void testCalcMid13() {
        String actual = SeparateNumbers.beautifulModeCalcMid("42949672954294967296429496729");
        Assertions.assertEquals("NO",actual);
    }

    @Test
    @DisplayName("Return 'YES 60' When CalcMid string is beautiful With '60616263646566676869707172737475'")
    public void testCalcMid14() {
        String actual = SeparateNumbers.beautifulModeCalcMid("60616263646566676869707172737475");
        Assertions.assertEquals("YES 60",actual);
    }

    @Test
    @DisplayName("Return 'YES 374021156' When CalcMid string is beautiful With '374021156374021157374021158'")
    public void testCalcMid15() {
        String actual = SeparateNumbers.beautifulModeCalcMid("374021156374021157374021158");
        Assertions.assertEquals("YES 374021156",actual);
    }

    @Test
    @DisplayName("Return 'YES 78' When CalcMid string is beautiful With '78798081828384858687888990919293'")
    public void testCalcMid16() {
        String actual = SeparateNumbers.beautifulModeCalcMid("78798081828384858687888990919293");
        Assertions.assertEquals("YES 78",actual);
    }



}