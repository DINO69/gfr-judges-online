package br.com.guifr.hackerrank.preparationkit.threemonth.weekone;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CamelCaseFourTest {

    @Test
    @DisplayName("Return 'plastic cup' When process analysis in word camelCase With 'S;M;plasticCup()'")
    public void test1() {
        String actual = CamelCaseFour.analysis("S;M;plasticCup()");
        assertEquals("plastic cup",actual);
    }

    @Test
    @DisplayName("Return 'mobilePhone' When process analysis in word camelCase With 'C;V;mobile phone'")
    public void test2() {
        String actual = CamelCaseFour.analysis("C;V;mobile phone");
        assertEquals("mobilePhone",actual);
    }

    @Test
    @DisplayName("Return 'CoffeeMachine' When process analysis in word camelCase With 'C;C;coffee machine'")
    public void test3() {
        String actual = CamelCaseFour.analysis("C;C;coffee machine");
        assertEquals("CoffeeMachine",actual);
    }

    @Test
    @DisplayName("Return 'large software book' When process analysis in word camelCase With 'S;C;LargeSoftwareBook'")
    public void test4() {
        String actual = CamelCaseFour.analysis("S;C;LargeSoftwareBook");
        assertEquals("large software book",actual);
    }

    @Test
    @DisplayName("Return 'whiteSheetOfPaper()' When process analysis in word camelCase With 'C;M;white sheet of paper'")
    public void test5() {
        String actual = CamelCaseFour.analysis("C;M;white sheet of paper");
        assertEquals("whiteSheetOfPaper()",actual);
    }

    @Test
    @DisplayName("Return 'picture frame' When process analysis in word camelCase With 'S;V;pictureFrame'")
    public void test6() {
        String actual = CamelCaseFour.analysis("S;V;pictureFrame");
        assertEquals("picture frame",actual);
    }

    @Test
    @DisplayName("Return 'account name' When process analysis in word camelCase With 'S;V;accountName'")
    public void test7() {
        String actual = CamelCaseFour.analysis("S;V;accountName");
        assertEquals("account name",actual);
    }

}