package br.com.guifr.hackerrank.preparationkit.threemonth.weektwo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsExplorationTest {

    @Test
    @DisplayName("Return 2 When find wrongs in string about SOS With 'SOSTOT'")
    public void test1() {
        String sos = "SOSTOT";
        int actual = MarsExploration.request(sos);
        assertEquals(2,actual);
    }

    @Test
    @DisplayName("Return 3 When find wrongs in string about SOS With 'SOSSPSSQSSOR'")
    public void test2() {
        String sos = "SOSSPSSQSSOR";
        int actual = MarsExploration.request(sos);
        assertEquals(3,actual);
    }

    @Test
    @DisplayName("Return 1 When find wrongs in string about SOS With 'SOSSOT'")
    public void test3() {
        String sos = "SOSSOT";
        int actual = MarsExploration.request(sos);
        assertEquals(1,actual);
    }

    @Test
    @DisplayName("Return 1 When appraisement the simple string with length = 3 With 'SOT'")
    public void testAppraisement3() {
        String sos = "SOT";
        int actual = MarsExploration.appraisement(sos);
        assertEquals(1,actual);
    }

    @Test
    @DisplayName("Return 2 When appraisement the simple string with length = 3 With 'STT'")
    public void testAppraisement2() {
        String sos = "STT";
        int actual = MarsExploration.appraisement(sos);
        assertEquals(2,actual);
    }

    @Test
    @DisplayName("Return 3 When appraisement the simple string with length = 3 With 'tTT'")
    public void testAppraisement1() {
        String sos = "TTT";
        int actual = MarsExploration.appraisement(sos);
        assertEquals(3,actual);
    }

}