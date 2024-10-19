package br.com.guifr.top75leetcodequestions.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestValidParenthesesTest {


    @Test
    @DisplayName("Return '4' When call LongestValidParentheses.execute Given '(())'")
    void test1() {
        Assertions.assertEquals(4,LongestValidParentheses.execute("(())"));
    }

    @Test
    @DisplayName("Return '2' When call LongestValidParentheses.execute Given '(()'")
    void test2() {
        Assertions.assertEquals(2,LongestValidParentheses.execute("(()"));
    }

    @Test
    @DisplayName("Return '4' When call LongestValidParentheses.execute Given ')()())'")
    void test3() {
        Assertions.assertEquals(4,LongestValidParentheses.execute(")()())"));
    }

    @Test
    @DisplayName("Return '2' When call LongestValidParentheses.execute Given '()(()'")
    void test4() {
        Assertions.assertEquals(2,LongestValidParentheses.execute("()(()"));
    }

    @Test
    @DisplayName("Return '4' When call LongestValidParentheses.execute Given '()()'")
    void test5() {
        Assertions.assertEquals(4,LongestValidParentheses.execute("()()"));
    }

    @Test
    @DisplayName("Return '2' When call LongestValidParentheses.execute Given '()'")
    void test6() {
        Assertions.assertEquals(2,LongestValidParentheses.execute("()"));
    }

    @Test
    @DisplayName("Return '4' When call LongestValidParentheses.execute Given ')()())()()('")
    void test7() {
        Assertions.assertEquals(4,LongestValidParentheses.execute(")()())()()("));
    }



}