package br.com.guifr;

public class Fibonacci {

    public static int call(int n) {
        if( n <= 2) return 1;
        return call(n - 1) + call(n - 2);
    }

}
