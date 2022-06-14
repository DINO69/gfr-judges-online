package br.com.guifr.hackerrank.preparationkit.threemonth.weeksix;

public class RecursiveDigitSum {
    public static int superDigit(String s, int k) {
        if(s.length() == 1 && k == 1) return Integer.valueOf(s);

        int result = 0;

        for(String n : s.split("")) {
            result += Integer.valueOf(n);
        }

        return s.length() != 1 ? superDigit(String.valueOf(result), k) : superDigit(String.valueOf(result * k), 1);
    }

}
