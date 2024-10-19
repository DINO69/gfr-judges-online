package br.com.guifr.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnowExpectionTest {


    @Test
    @DisplayName("Return ArrayIndexOutOfBoundsException When try access invailable postion in array")
    void test1ArrayIndexOutBounds() {

        RuntimeException exception = assertThrows(RuntimeException.class,
                () -> KnowExpection.execute(ArrayIndexOutOfBoundsException.class)
        );

        Assertions.assertEquals(true,exception instanceof ArrayIndexOutOfBoundsException);
        Assertions.assertEquals("Access index impossible",exception.getMessage());

    }
}