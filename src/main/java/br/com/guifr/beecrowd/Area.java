package br.com.guifr.beecrowd;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Area {

    public static final double PI = 3.14159;

    private double a, b, c;

    public Area(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] values = line.split(" ");
        double a = Double.parseDouble(values[0]);
        double b = Double.parseDouble(values[1]);
        double c = Double.parseDouble(values[2]);
        System.out.println(with(a, b, c).printAllPossiblesAreas());
    }

    public static Area with(double a, double b, double c) {
        return new Area(a, b, c);
    }

    public String printAllPossiblesAreas() {
        return String.format(Locale.US, "TRIANGULO: %.3f\n" +
                "CIRCULO: %.3f\n" +
                "TRAPEZIO: %.3f\n" +
                "QUADRADO: %.3f\n" +
                "RETANGULO: %.3f", trianguloArea(), circuloArea(), trapezioArea(), quadradoArea(), retanguloArea());
    }

    public double trianguloArea() {
        return BigDecimal.valueOf(a).multiply(BigDecimal.valueOf(c)).divide(BigDecimal.valueOf(2)).doubleValue();
    }

    public double circuloArea() {
        return BigDecimal.valueOf(c).pow(2).multiply(BigDecimal.valueOf(PI)).setScale(3, RoundingMode.HALF_UP).doubleValue();
    }

    public double trapezioArea() {
        BigDecimal bases = BigDecimal.valueOf(a).add(BigDecimal.valueOf(b));
        return bases.multiply(BigDecimal.valueOf(c)).multiply(BigDecimal.valueOf(0.5)).doubleValue();
    }

    public double quadradoArea() {
        return BigDecimal.valueOf(b).pow(2).doubleValue();
    }

    public double retanguloArea() {
        return BigDecimal.valueOf(a).multiply(BigDecimal.valueOf(b)).doubleValue();
    }
}
