package br.com.guifr.top75leetcodequestions.binary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {

    @Test
    @DisplayName("Return '100' When call addBinary Given s=11 s2=1")
    void test1() {

        Assertions.assertEquals("100",AddBinary.addBinary("11","1"));

    }

    @Test
    @DisplayName("Return '10101' When call addBinary Given s=1010 s2=1011")
    void test2() {

        Assertions.assertEquals("10101",AddBinary.addBinary("1010","1011"));

    }
}