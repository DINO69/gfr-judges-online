package br.com.guifr.beecrowd;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Interval {

    private static final BigDecimal BIGDECIMAL_25 = new BigDecimal("25.0");

    public static String printWith(double v) {

        if (v < 0 || v > 100)
            return "Fora de intervalo";

        int i = BigDecimal.valueOf(v).divide(BIGDECIMAL_25, 0, RoundingMode.UP).intValue();

        if (i <= 1) {
            return "Intervalo [0,25]";
        }else{
            int finalInterval = i*25;
            int initialInterval = finalInterval - 25;
            return String.format("Intervalo (%d,%d]",initialInterval,finalInterval);
        }

    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println(printWith(Double.valueOf(sc.next())));
    }

}
