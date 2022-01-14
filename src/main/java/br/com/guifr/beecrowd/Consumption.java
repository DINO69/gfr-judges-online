package br.com.guifr.beecrowd;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Consumption {

    private int km;
    private double liters;

    public Consumption(int km, double liters) {
        this.km = km;
        this.liters = liters;
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int km = Integer.valueOf(sc.nextLine());
        double liters = Double.valueOf(sc.nextLine());
        System.out.println(with(km,liters).average());

    }

    public static Consumption with(int km, double liters) {
        return new Consumption(km, liters);
    }

    public String average() {
        BigDecimal average = BigDecimal.valueOf(km).divide(BigDecimal.valueOf(liters), 3, RoundingMode.HALF_EVEN);
        return String.format(Locale.US, "%.3f km/l", average.doubleValue());
    }
}
