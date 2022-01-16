package br.com.guifr.beecrowd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;


import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.SAME_THREAD)
public class JosephsCousinTest {

    @Test
    @DisplayName("Return 4 when input amount people is 6")
    public void test1(){
        int actual = JosephsCousin.withPeople(6).saving();
        Assertions.assertEquals(4,actual);
    }

    @Test
    @DisplayName("Return 466 when input amount people is 1501")
    public void test11(){
        int actual = JosephsCousin.withPeople(1501).saving();
        Assertions.assertEquals(466,actual);
    }

    @Test
    @DisplayName("Return 2326 when input amount people is 3501")
    public void test12(){
        int actual = JosephsCousin.withPeople(3501).saving();
        Assertions.assertEquals(2326,actual);
    }

    @Test
    @DisplayName("Return 7 when input amount people is 9")
    public void test2(){
        int actual = JosephsCousin.withPeople(9).saving();
        Assertions.assertEquals(7,actual);
    }

    @Test
    @DisplayName("Return true when ask if 19 is number cousin")
    public void testIsCousin1(){
        boolean actual = JosephsCousin.isCousin(19);
        Assertions.assertTrue(actual);
    }

    @Test
    @DisplayName("Return false when ask if 18 is number cousin")
    public void testIsCousin2(){
        boolean actual = JosephsCousin.isCousin(18);
        Assertions.assertFalse(actual);
    }

    @Test
    @DisplayName("Return false when ask if 25 is number cousin")
    public void testIsCousin3(){
        boolean actual = JosephsCousin.isCousin(25);
        Assertions.assertFalse(actual);
    }

    @Test
    @DisplayName("Return true when ask if 7 is number cousin")
    public void testCousin1(){
        boolean actual = JosephsCousin.isCousin(7);
        Assertions.assertTrue(actual);
    }

    @Test
    @DisplayName("Return true when ask if 11 is number cousin")
    public void testCousin2(){
        boolean actual = JosephsCousin.isCousin(11);
        Assertions.assertTrue(actual);
    }

    @Test
    @DisplayName("Return false when ask if 10 is number cousin")
    public void testCousin3(){
        boolean actual = JosephsCousin.isCousin(10);
        Assertions.assertFalse(actual);
    }

    @Test
    @DisplayName("Return true when ask if 31 is number cousin")
    public void testCousin4(){
        boolean actual = JosephsCousin.isCousin(31);
        Assertions.assertTrue(actual);
    }

    @Test
    @DisplayName("Return false when ask if 0 is number cousin")
    public void testCousin5(){
        boolean actual = JosephsCousin.isCousin(0);
        Assertions.assertFalse(actual);
    }

    @Test
    @DisplayName("Return false when ask if 1 is number cousin")
    public void testCousin6(){
        boolean actual = JosephsCousin.isCousin(1);
        Assertions.assertFalse(actual);
    }

    @Test
    @DisplayName("Return amount position has value equal one, this test expect 1")
    public void testCousin7(){
        int[] arrays = {1,0,0};
        int actual = JosephsCousin.howManyOne(arrays);
        assertEquals(1,actual);
    }

    @Test
    @DisplayName("Return amount position has value equal one, this test expect 2")
    public void testCousin8(){
        int[] arrays = {1,0,1};
        int actual = JosephsCousin.howManyOne(arrays);
        assertEquals(2,actual);
    }

    @Test
    @DisplayName("Return the position has value equal one, this test expect 1")
    public void testCousin9(){
        int[] arrays = {1,0,1};
        int actual = JosephsCousin.firstPositionHasOne(arrays);
        assertEquals(1,actual);
    }

    @Test
    @DisplayName("Return the position has value equal one, this test expect 2")
    public void testCousin10(){
        int[] arrays = {0,1,0};
        int actual = JosephsCousin.firstPositionHasOne(arrays);
        assertEquals(2,actual);
    }

    @Test
    @DisplayName("Return 7 when ask next cousin with 6")
    public void testNextCousin1(){
        int actual = JosephsCousin.nextCousin(6);
        assertEquals(7,actual);
    }

    @Test
    @DisplayName("Return 11 when ask next cousin with 7")
    public void testNextCousin2(){
        int actual = JosephsCousin.nextCousin(7);
        assertEquals(11,actual);
    }

    @Test
    @DisplayName("Return 13 when ask next cousin with 11")
    public void testNextCousin3(){
        int actual = JosephsCousin.nextCousin(11);
        assertEquals(13,actual);
    }

    @Test
    @DisplayName("Return 17 when ask next cousin with 13")
    public void testNextCousin4(){
        int actual = JosephsCousin.nextCousin(13);
        assertEquals(17,actual);
    }

    @Test
    @DisplayName("Return 19 when ask next cousin with 17")
    public void testNextCousin5(){
        int actual = JosephsCousin.nextCousin(17);
        assertEquals(19,actual);
    }

    @Test
    @DisplayName("Return 23 when ask next cousin with 19")
    public void testNextCousin6(){
        int actual = JosephsCousin.nextCousin(19);
        assertEquals(23,actual);
    }

}