package br.com.guifr.hackerrank.preparationkit.threemonth.weekten;

import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MinimumOperationsFourTest {

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    @DisplayName("Print 6 When separate balls by color Given 3 box with each r1 g1 b1")
    void test1() {

        final String testString = "3 1 1 1 1 1 1 1 1 1";
        testIn = new ByteArrayInputStream(testString.getBytes());
        System.setIn(testIn);

        MinimumOperationsFour obj = new MinimumOperationsFour();
        obj.get();
        obj.minOperations();

        assertEquals("6\r\n", testOut.toString());
    }
}