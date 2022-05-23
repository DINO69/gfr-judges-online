package br.com.guifr.hackerrank.preparationkit.threemonth.weekfour;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberLineJumpsTest {


    @Test
    @DisplayName("Return 'YES' When kangaroos jump one time With x1=2 v1=1 x2=1 v2=2")
    public void test1() {
        int position1 = 2;
        int jump1 = 1;
        int position2 = 1;
        int jump2 = 2;
        String actual = NumberLineJumps.with(position1,jump1,position2,jump2);
        Assertions.assertEquals("YES",actual);
    }

    @Test
    @DisplayName("Return 'NO' When kangaroos jump one time With x1=2 v1=1 x2=1 v2=2")
    public void test2() {
        int position1 = 2;
        int jump1 = 2;
        int position2 = 1;
        int jump2 = 2;
        String actual = NumberLineJumps.with(position1,jump1,position2,jump2);
        Assertions.assertEquals("NO",actual);
    }

    @Test
    @DisplayName("Return 'YES' When kangaroos jump one time With x1=0 v1=3 x2=4 v2=2")
    public void test3() {
        int position1 = 0;
        int jump1 = 3;
        int position2 = 4;
        int jump2 = 2;
        String actual = NumberLineJumps.with(position1,jump1,position2,jump2);
        Assertions.assertEquals("YES",actual);
    }

    @Test
    @DisplayName("Return 'NO' When kangaroos jump one time With x1=0 v1=2 x2=5 v2=3")
    public void test4() {
        int position1 = 0;
        int jump1 = 2;
        int position2 = 5;
        int jump2 = 3;
        String actual = NumberLineJumps.with(position1,jump1,position2,jump2);
        Assertions.assertEquals("NO",actual);
    }

    @Test
    @DisplayName("Return 'YES' When calc kangaroos jump one time With x1=2 v1=1 x2=1 v2=2")
    public void testCalc1() {
        int position1 = 2;
        int jump1 = 1;
        int position2 = 1;
        int jump2 = 2;
        String actual = NumberLineJumps.withCalc(position1,jump1,position2,jump2);
        Assertions.assertEquals("YES",actual);
    }

    @Test
    @DisplayName("Return 'NO' When calc kangaroos jump one time With x1=2 v1=1 x2=1 v2=2")
    public void testCalc2() {
        int position1 = 2;
        int jump1 = 2;
        int position2 = 1;
        int jump2 = 2;
        String actual = NumberLineJumps.withCalc(position1,jump1,position2,jump2);
        Assertions.assertEquals("NO",actual);
    }

    @Test
    @DisplayName("Return 'YES' When calc kangaroos jump one time With x1=0 v1=3 x2=4 v2=2")
    public void testCalc3() {
        int position1 = 0;
        int jump1 = 3;
        int position2 = 4;
        int jump2 = 2;
        String actual = NumberLineJumps.withCalc(position1,jump1,position2,jump2);
        Assertions.assertEquals("YES",actual);
    }

    @Test
    @DisplayName("Return 'NO' When calc kangaroos jump one time With x1=0 v1=2 x2=5 v2=3")
    public void testCalc4() {
        int position1 = 0;
        int jump1 = 2;
        int position2 = 5;
        int jump2 = 3;
        String actual = NumberLineJumps.withCalc(position1,jump1,position2,jump2);
        Assertions.assertEquals("NO",actual);
    }

    @Test
    @DisplayName("Return 'NO' When calc kangaroos jump one time With x1=21 v1=6 x2=47 v2=3")
    public void testCalc5() {
        int position1 = 21;
        int jump1 = 6;
        int position2 = 47;
        int jump2 = 3;
        String actual = NumberLineJumps.withCalc(position1,jump1,position2,jump2);
        Assertions.assertEquals("NO",actual);
    }


}