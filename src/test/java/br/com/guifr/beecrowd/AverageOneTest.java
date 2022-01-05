package br.com.guifr.beecrowd;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AverageOneTest {

    @Test
    @DisplayName("Then return 'MEDIA = 6.43182' when calculate avaerage 5.0 and 7.1")
    public void test1(){
        String actual = AverageOne.of(5.0,7.1).print();
        Assertions.assertEquals("MEDIA = 6.43182\n", actual);
    }

    @Test
    @DisplayName("Then return 'MEDIA = 4.84091' when calculate avaerage 0.0 and 4.84091")
    public void test2(){
        String actual = AverageOne.of(0.0,7.1).print();
        Assertions.assertEquals("MEDIA = 4.84091\n", actual);
    }

    @Test
    @DisplayName("Then return 'MEDIA = 10.00000' when calculate avaerage 10.0 and 10.0")
    public void test3(){
        String actual = AverageOne.of(10.0,10.0).print();
        Assertions.assertEquals("MEDIA = 10.00000\n", actual);
    }

}