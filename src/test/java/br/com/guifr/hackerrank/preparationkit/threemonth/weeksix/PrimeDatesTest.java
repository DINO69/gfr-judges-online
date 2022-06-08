package br.com.guifr.hackerrank.preparationkit.threemonth.weeksix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PrimeDatesTest {

    @Test
    @DisplayName("Return 5 When count lucky number primes between With 02-08-2025 04-09-2025")
    public void findPrimeDates() {

        int actual = PrimeDates.findPrimeDates(2,8,2025,04,9,2025);
        Assertions.assertEquals(5,actual);
    }

    @Test
    @DisplayName("Return 1 When count lucky number primes between With 02-08-2024 02-08-2024")
    public void findPrimeDates2() {

        int actual = PrimeDates.findPrimeDates(2,8,2024,2,8,2024);
        Assertions.assertEquals(1,actual);
    }

}