package br.com.guifr.hackerrank;

import java.util.Arrays;

public class ShortPalindrome {



    public static int calc(String s) {

        if(s.length() < 4) return 0;

        if(s.charAt(0) == s.charAt(s.length() - 1)) {
            return 1 * oddsIn(s.substring(1,s.length()-1)) + calc(s.substring(0,s.length()-1)) + calc(s.substring(1));
        }

        return calc(s.substring(0,s.length()-1)) + calc(s.substring(1));
    }

    private static int oddsIn(String substring) {
        final int charALowerCase = 97;
        int letters[] = new int[28];
        substring.chars().forEach(  l -> {
            letters[l - charALowerCase]++;
                });
        int result = Arrays.stream(letters)
                .filter(l -> l >= 2)
                .map(l -> {
                    int n = factorial(l);
                    int r = factorial(2);
                    int z = factorial(l - 2);
                    return n / (r * z);
                }).sum();
        return result;
    }

    protected static int factorial(Integer num) {
        if(num <= 1) return 1;
        if(num <= 2) return 2;
        return num * factorial(num - 1);
    }
}
