package br.com.guifr.beecrowd;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Sphere {

    public static final String PI = "3.14159";

    private int radius;

    private Sphere() {
    }

    public Sphere(int radius) {
        this.radius = radius;
    }

    public static Sphere withRadius(int radius) {
        return new Sphere(radius);
    }

    public String printVolume() {
        BigDecimal radiusPow = new BigDecimal(radius).pow(3);
        BigDecimal piXRadius = new BigDecimal(PI).multiply(radiusPow);
        BigDecimal volume = piXRadius.multiply(new BigDecimal("4")).divide(new BigDecimal("3"), 3, RoundingMode.HALF_EVEN);

        return String.format(Locale.US, "VOLUME = %.3f", volume.doubleValue());
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.print(Sphere.withRadius(sc.nextInt()).printVolume());

    }


}
