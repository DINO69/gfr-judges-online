package br.com.guifr.top75leetcodequestions.binary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfOneBitsTest {

    @Test
    @DisplayName("Return 3 When call hammingWeight Given n = 11 ( 1011 )")
    void test1() {
        Assertions.assertEquals(3, NumberOfOneBits.hammingWeight(11));
        Assertions.assertEquals(3, NumberOfOneBits.hammingWeightWithDivideFunction(11));
    }

    @Test
    @DisplayName("Return 1 When call hammingWeight Given n = 128 ( 10000000 )")
    void test2() {
        Assertions.assertEquals(1, NumberOfOneBits.hammingWeight(128));
        Assertions.assertEquals(1, NumberOfOneBits.hammingWeightWithDivideFunction(128));
    }

    @Test
    @DisplayName("Return 30 When call hammingWeight Given n = 2147483645 ( 1111111111111111111111111111101  )")
    void test3() {
        Assertions.assertEquals(30, NumberOfOneBits.hammingWeight(2147483645));
        Assertions.assertEquals(30, NumberOfOneBits.hammingWeightWithDivideFunction(2147483645));
    }


}