package br.com.guifr.hackerrank;

import java.util.Arrays;

public class RepeatedString {


    public static long searchIn(String s, long n) {

        long l = n / s.length();
        long rest = n % s.length();
        return (l * countAs(s)) + countAs(s.substring(0,(int)rest));
    }

    public static long countAs(String s) {
        return Arrays.stream(s.split(""))
                .filter(ch -> ch.equals("a"))
                .count();
    }

}
