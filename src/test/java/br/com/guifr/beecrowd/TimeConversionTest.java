package br.com.guifr.beecrowd;

import org.junit.jupiter.api.*;

public class TimeConversionTest {

    private TimeConversion.Time chain;

    @BeforeEach
    public void setUpAll(){
        chain = new TimeConversion.Time(3600,
                    new TimeConversion.Time(60,
                        new TimeConversion.Time(1,null)));
    }

    @Test
    @DisplayName("Return '0:9:16' when calculate time 556")
    public void test1(){
        String actual = TimeConversion.seconds(556,chain).printTime();
        Assertions.assertEquals("0:9:16",actual);
    }

    @Test
    @DisplayName("Return '0:0:1' when calculate time 1")
    public void test2(){
        String actual = TimeConversion.seconds(1,chain).printTime();
        Assertions.assertEquals("0:0:1",actual);
    }

    @Test
    @DisplayName("Return '38:55:53' when calculate time 140153")
    public void test3(){
        String actual = TimeConversion.seconds(140153,chain).printTime();
        Assertions.assertEquals("38:55:53",actual);
    }


    @Test
    @DisplayName("Return '9' when calculate just minutos of 556")
    public void testTime1(){

        String actual = new TimeConversion.Time(60,null).result(556);
        Assertions.assertEquals("9",actual);
    }

    @Test
    @DisplayName("Return '9:16' when calculate minutos and seconds of 556")
    public void testTime2(){
        String actual = new TimeConversion.Time(60,new TimeConversion.Time(1,null)).result(556);
        Assertions.assertEquals("9:16",actual);
    }

    @Test
    @DisplayName("Return '1' when calculate just hours of 3601")
    public void testTime3(){

        String actual = new TimeConversion.Time(3600,null).result(3601);
        Assertions.assertEquals("1",actual);
    }

}