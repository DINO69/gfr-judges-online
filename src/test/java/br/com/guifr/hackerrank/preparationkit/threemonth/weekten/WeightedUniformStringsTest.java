package br.com.guifr.hackerrank.preparationkit.threemonth.weekten;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class WeightedUniformStringsTest {

    @Test
    @DisplayName("Return ['Yes','No','No','Yes','No'] When found matches Given s='abbcccdddd' matches=[1,7,5,4,15]")
    void test1() {

        List<Integer> matches = Arrays.asList(1,7,5,4,15);
        String s = "abbcccdddd";

        List<String> result = WeightedUniformStrings.with(s,matches);

        Assertions.assertLinesMatch(List.of("Yes","No","No","Yes","No"),result);
    }

    @Test
    @DisplayName("Return ['Yes','Yes','No','No','Yes'] When found matches Given s='abbcccdddd' matches=[1,4,7,5,4]")
    void test2() {

        List<Integer> matches = Arrays.asList(1,4,7,5,4);
        String s = "abbcccdddd";

        List<String> result = WeightedUniformStrings.with(s,matches);

        Assertions.assertLinesMatch(List.of("Yes","Yes","No","No","Yes"),result);
    }

    @Test
    @DisplayName("Return ['Yes','Yes','No','No','Yes'] When found matches Given s='abbcccdddd' matches=[1,4,7,5,16]")
    void test3() {

        List<Integer> matches = Arrays.asList(1,4,7,5,16);
        String s = "abbcccdddd";

        List<String> result = WeightedUniformStrings.with(s,matches);

        Assertions.assertLinesMatch(List.of("Yes","Yes","No","No","Yes"),result);
    }

    @Test
    @DisplayName("Return false When string have two diffent characters Given s='bcb'")
    void testUniformString1() {
        StringBuilder s = new StringBuilder("bcb");
        boolean result = WeightedUniformStrings.uniformString(s);
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Return true When string have just one characters Given s='aaa'")
    void testUniformString2() {
        StringBuilder s = new StringBuilder("aaa");
        boolean result = WeightedUniformStrings.uniformString(s);
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Return true When string have just one characters Given s='aa'")
    void testUniformString3() {
        StringBuilder s = new StringBuilder("aa");
        boolean result = WeightedUniformStrings.uniformString(s);
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Return 1 When find the weight Given s = a")
    void testWeightCharacter1() {
        int result = WeightedUniformStrings.character("a".charAt(0));
        Assertions.assertEquals(1,result);
    }

    @ParameterizedTest(name = "{index} - Return {0} When find the weight Given s = {1}")
    @MethodSource("parametros")
    @Disabled("Expensive test")
    public void testWeightCharacter(int expected, String s) {

        int result = WeightedUniformStrings.character(s.charAt(0));
        assertEquals(expected, result);
    }

    public static Stream<Arguments> parametros() {
        return Stream.of(
                Arguments.of(1, "a"),
                Arguments.of(2, "b"),
                Arguments.of(3, "c"),
                Arguments.of(4, "d"),
                Arguments.of(5, "e"),
                Arguments.of(6, "f"),
                Arguments.of(7, "g"),
                Arguments.of(8, "h"),
                Arguments.of(9, "i"),
                Arguments.of(10, "j"),
                Arguments.of(11, "k"),
                Arguments.of(12, "l"),
                Arguments.of(13, "m"),
                Arguments.of(14, "n"),
                Arguments.of(15, "o"),
                Arguments.of(16, "p"),
                Arguments.of(17, "q"),
                Arguments.of(18, "r"),
                Arguments.of(19, "s"),
                Arguments.of(20, "t"),
                Arguments.of(21, "u"),
                Arguments.of(22, "v"),
                Arguments.of(23, "w"),
                Arguments.of(24, "x"),
                Arguments.of(25, "y"),
                Arguments.of(26, "z")
        );
    }

}