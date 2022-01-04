package br.com.guifr.beecrowd;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    public void returnHelloWorld(){


        Assertions.assertEquals("Hello World!",HelloWorld.printHelloWorld());
    }



}