package br.com.guifr.hackerrank.preparationkit.threemonth.weektwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FlippingbitsTest {

    @Test
    @DisplayName("Return 2147483648 When flip all 1 to 0 and 0 to 1 With 2147483647 ")
    public void test1() {
        long number = 2147483647;
        long actual = Flippingbits.with(number);
        Assertions.assertEquals(2147483648L,actual);
    }

    @Test
    @DisplayName("Return 4294967294 When flip all 1 to 0 and 0 to 1 With 1 ")
    public void test2() {
        long number = 1;
        long actual = Flippingbits.with(number);
        Assertions.assertEquals(4294967294L,actual);
    }

    @Test
    @DisplayName("Return 4294967295 When flip all 1 to 0 and 0 to 1 With 0 ")
    public void test3() {
        long number = 0;
        long actual = Flippingbits.with(number);
        Assertions.assertEquals(4294967295L,actual);
    }

}