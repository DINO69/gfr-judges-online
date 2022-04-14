package br.com.guifr.hackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoStrings {


    public static String shareBetween(String s1, String s2) {

        Set<String> charsS2 = new HashSet<>();

        Arrays.stream(s2.split(""))
                .forEach(charsS2::add);

        boolean result = Arrays.stream(s1.split(""))
                .anyMatch(charsS2::contains);

        return result ? "YES" : "NO";
    }
}
