package br.com.guifr.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BalancedBracketsTest {


    @Test
    @DisplayName("Return 'NO' When verify string is balanced With '{[(])}'")
    public void test1() {
        String actual = BalancedBrackets.of("{[(])}");
        Assertions.assertEquals("NO",actual);
    }

    @Test
    @DisplayName("Return 'YES' When verify string is balanced With '{[()]}'")
    public void test2() {
        String actual = BalancedBrackets.of("{[()]}");
        Assertions.assertEquals("YES",actual);
    }

    @Test
    @DisplayName("Return 'YES' When verify string is balanced With '{{[[(())]]}}'")
    public void test3() {
        String actual = BalancedBrackets.of("{{[[(())]]}}");
        Assertions.assertEquals("YES",actual);
    }

    @Test
    @DisplayName("Return 'NO' When verify string is balanced With '{{)[](}}'")
    public void test4() {
        String actual = BalancedBrackets.of("{{)[](}}");
        Assertions.assertEquals("NO",actual);
    }

    @Test
    @DisplayName("Return 'YES' When verify string is balanced With '{()[]}'")
    public void test5() {
        String actual = BalancedBrackets.of("{()[]}");
        Assertions.assertEquals("YES",actual);
    }

    @Test
    @DisplayName("Return 'NO' When verify string is balanced With '}][}}(}][))]'")
    public void test6() {
        String actual = BalancedBrackets.of("}][}}(}][))]");
        Assertions.assertEquals("NO",actual);
    }

    @Test
    @DisplayName("Return 'NO' When verify string is balanced With '[{'")
    public void test7() {
        String actual = BalancedBrackets.of("[{");
        Assertions.assertEquals("NO",actual);
    }

}