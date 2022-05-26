package br.com.guifr.hackerrank.preparationkit.threemonth.weekfour;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class CaesarCipherTest {

    @Test
    @DisplayName("Return [cdefghijklmnopqrstuvwxyzab] When rotate the alphabet With k=2")
    public void test1() {
        int k = 2;
        List<String> actual = CaesarCipher.rotateAlphabet(k);
        List<String> expected = Arrays.stream("cdefghijklmnopqrstuvwxyzab".split("")).collect(Collectors.toList());
        Assertions.assertEquals("c",actual.get(0));
        Assertions.assertEquals("b",actual.get(25));
        Assertions.assertTrue(expected.equals(actual));
    }

    @Test
    @DisplayName("Return [defghijklmnopqrstuvwxyzabc] When rotate the alphabet With k=3")
    public void test2() {
        int k = 3;
        List<String> actual = CaesarCipher.rotateAlphabet(k);
        List<String> expected = Arrays.stream("defghijklmnopqrstuvwxyzabc".split("")).collect(Collectors.toList());
        Assertions.assertEquals("d",actual.get(0));
        Assertions.assertEquals("c",actual.get(25));
        Assertions.assertTrue(expected.equals(actual));
    }

    @Test
    @DisplayName("Return [okffng-Qwvb] When cipher using Caesar's cipher With s='middle-Outz' k=2")
    public void test3() {
        int k = 2;
        String s = "middle-Outz";
        String actual = CaesarCipher.cipher(s,k);
        Assertions.assertEquals("okffng-Qwvb",actual);
    }

    @Test
    @DisplayName("Return [abcdefghijklmnopqrstuvwxyzZ] When cipher using Caesar's cipher With s='abcdefghijklmnopqrstuvwxyz' k=26")
    public void test4() {

        int k = 26;
        String s = "abcdefghijklmnopqrstuvwxyzZ";
        String actual = CaesarCipher.cipher(s,k);
        Assertions.assertEquals("abcdefghijklmnopqrstuvwxyzZ",actual);
    }

}