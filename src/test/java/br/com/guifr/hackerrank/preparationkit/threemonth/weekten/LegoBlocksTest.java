package br.com.guifr.hackerrank.preparationkit.threemonth.weekten;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LegoBlocksTest {

    @Test
    @DisplayName("Return 9 When build wall Given h=2 w=3")
    void test1() {
        int h = 2;
        int w = 3;
        int result = LegoBlocks.buildWall(h,w);
        assertEquals(9,result);
    }

}