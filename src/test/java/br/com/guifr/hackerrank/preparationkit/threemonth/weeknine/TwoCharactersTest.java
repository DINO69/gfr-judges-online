package br.com.guifr.hackerrank.preparationkit.threemonth.weeknine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class TwoCharactersTest {

    @Test
    @DisplayName("Return 4 When process string Given s='abaacdabd'")
    void test1() {
        String s = "abaacdabd";
        int process = TwoCharacters.process(s);
        assertEquals(4, process);
    }

    @Test
    @DisplayName("Return 5 When process string Given s='beabeefeab'")
    void test2() {
        String s = "beabeefeab";
        int process = TwoCharacters.process(s);
        assertEquals(5, process);
    }

    @Test
    @DisplayName("Return 6 When process string Given s='guiguigui'")
    void test3() {
        String s = "guiguigui";
        int process = TwoCharacters.process(s);
        assertEquals(6, process);
    }

    @Test()
    @DisplayName("Return 0 When process string Given s='asvkugfiugsalddlasguifgukvsa'")
    void test4() {
        String s = "asvkugfiugsalddlasguifgukvsa";
        int process = TwoCharacters.process(s);
        assertEquals(0, process);
    }

    @Test
    @DisplayName("Return 8 When process string Given s='asdcbsdcagfsdbgdfanfghbsfdab'")
    void test5() {
        String s = "asdcbsdcagfsdbgdfanfghbsfdab";
        int process = TwoCharacters.process(s);
        assertEquals(8, process);
    }

    @Test
    @DisplayName("Return [g,u,i] When separete letters Given 'guiguigui'")
    void testReturnLetters1() {
        Set<String> letters = Set.of("g", "u", "i");
        String s = "guiguigui";
        Set<String> process = TwoCharacters.separeteLetters(s);
        assertEquals(letters, process);
    }

    @Test
    @DisplayName("Return [b,e,a,f] When separete letters Given 'beabeefeab'")
    void testReturnLetters2() {
        Set<String> letters = Set.of("b", "e", "a", "f");
        String s = "beabeefeab";
        Set<String> process = TwoCharacters.separeteLetters(s);
        assertEquals(letters, process);
    }

    @Test
    @DisplayName("Return true When valid two characters in string Given 'babab'")
    void testIsValid1() {
        assertTrue(TwoCharacters.isValid("babab"));
    }

    @Test
    @DisplayName("Return false When not valid two characters in string Given 'babaa'")
    void testIsValid2() {
        assertFalse(TwoCharacters.isValid("babaa"));
    }

    @Test
    @DisplayName("Return false When not valid two characters in string Given 'aaaa'")
    void testIsValid3() {
        assertFalse(TwoCharacters.isValid("aaaa"));
    }

    @Test
    @DisplayName("Return 'a' When find first letter Given s='ab'")
    void testFirst() {
        assertEquals("a", TwoCharacters.firstLetter("ab"));
    }

    @Test
    @DisplayName("Return 'b' When find last letter Given s='ab'")
    void testLast() {
        assertEquals("b", TwoCharacters.lastLetter("ab"));
    }


    @Test
    @DisplayName("Return 'b' When which one is first letter Given l1='b' l2='c' 'abcde'")
    void testWhichFirst() {

        String letter1 = "b";
        String letter2 = "c";

        String str = "abcde";
        String result = TwoCharacters.whichOneIsFirstLetterIn(letter1, letter2, str);
        Assertions.assertEquals("b", result);
    }

    @Test
    @DisplayName("Return 'c' When which one is first letter Given l1='d' l2='c' 'abcde'")
    void testWhichFirst2() {
        String letter1 = "d";
        String letter2 = "c";

        String str = "abcde";
        String result = TwoCharacters.whichOneIsFirstLetterIn(letter1, letter2, str);
        Assertions.assertEquals("c", result);
    }

    @Test
    @DisplayName("Return 'c' When which one is first letter Given starting=1 l1='d' l2='c' 'dabcde'")
    void testWhichFirst3() {
        String letter1 = "d";
        String letter2 = "c";
        int starting = 1;

        String str = "dabcde";
        String result = TwoCharacters.whichOneIsFirstLetterInStarting(letter1, letter2, str, starting);
        Assertions.assertEquals("c", result);
    }

    @Test
    @DisplayName("Return true When search is letter1 is before letter2 Given starting=0 l1='d' l2='c' 'dabcde'")
    void testIsFirst1() {
        String letter1 = "d";
        String letter2 = "c";
        int starting = 0;

        String str = "dabcde";
        Assertions.assertTrue( TwoCharacters.isFirstInStarting(letter1, letter2, str, starting));
    }

    @Test
    @DisplayName("Return false When search is letter2 is before letter1 Given starting=1 l1='d' l2='c' 'dabcde'")
    void testIsFirst2() {
        String letter1 = "d";
        String letter2 = "c";
        int starting = 1;

        String str = "dabcde";
        Assertions.assertFalse( TwoCharacters.isFirstInStarting(letter1, letter2, str, starting));
    }

    @Test
    @DisplayName("Return 4 When Next Index Of Given str='dabcde' letter1='d' letter2='c' starting=0")
    void testNextIndexOf() {
        String letter1 = "d";
        String letter2 = "c";
        int starting = 0;

        String str = "dabcde";
        int result = TwoCharacters.nextIndexOf(letter1, letter2, str, starting);
        Assertions.assertEquals(4,result );
    }

    @Test
    @DisplayName("Return 5 When Next Index Of Given str='dabcde' letter1='d' letter2='c' starting=1")
    void testNextIndexOf2() {
        String letter1 = "d";
        String letter2 = "c";
        int starting = 1;

        String str = "dabcde";
        int result = TwoCharacters.nextIndexOf(letter1, letter2, str, starting);
        Assertions.assertEquals(5,result );
    }

}