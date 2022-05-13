package br.com.guifr.hackerrank.preparationkit.threemonth.weekone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TimeConversionTest {

    @Test
    @DisplayName("Return '12:01:00' When format military time 24 hours With '12:01:00PM'")
    public void test() {
        String actual = TimeConversion.military("12:01:00PM");
        Assertions.assertEquals("12:01:00",actual);
    }

    @Test
    @DisplayName("Return '00:01:00' When format military time 24 hours With '12:01:00AM'")
    public void test2() {
        String actual = TimeConversion.military("12:01:00AM");
        Assertions.assertEquals("00:01:00",actual);
    }

    @Test
    @DisplayName("Return '19:05:45' When format military time 24 hours With '07:05:45PM'")
    public void test3() {
        String actual = TimeConversion.military("07:05:45PM");
        Assertions.assertEquals("19:05:45",actual);
    }

}