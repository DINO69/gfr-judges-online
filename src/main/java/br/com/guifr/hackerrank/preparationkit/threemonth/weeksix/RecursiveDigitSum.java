package br.com.guifr.hackerrank.preparationkit.threemonth.weeksix;

public class RecursiveDigitSum {
    public static int super_digit(String s) {
        if(s.length() == 1) return Integer.valueOf(s);

        int result = 0;
        for(String n : s.split("")) {
            result += Integer.valueOf(n);
        }
        return super_digit(String.valueOf(result));
    }

    public static int super_digitKTimes(String s, int k) {
        return super_digit(String.valueOf(super_digit(s) * k));
    }
}
