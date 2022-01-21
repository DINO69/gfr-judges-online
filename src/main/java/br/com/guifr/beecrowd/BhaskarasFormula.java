package br.com.guifr.beecrowd;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class BhaskarasFormula {

    private double a, b, c;

    private BigDecimal delta;

    private BhaskarasFormula() {
    }

    private BhaskarasFormula(double a, double b, double c) throws BhaskarasException {
        this.a = a;
        this.b = b;
        this.c = c;

        double b2 = Math.pow(b, 2);
        double quatroAC = (4 * a * c);
        double forSqrt = b2 - quatroAC;

        if(forSqrt < 0){
            throw new BhaskarasException("Impossivel calcular");
        }
        delta = BigDecimal.valueOf(Math.sqrt(forSqrt));
        double doisA = 2 * a;
        if(doisA == 0){
            throw new BhaskarasException("Impossivel calcular");
        }

    }

    public static BhaskarasFormula of(double a, double b, double c) throws BhaskarasException {
        return new BhaskarasFormula(a, b, c);
    }

    public double getR1() {
            return BigDecimal.valueOf((-b + delta.doubleValue()) / (2 * a)).setScale(5, RoundingMode.HALF_UP).doubleValue();
    }

    public double getR2() {
            return BigDecimal.valueOf((-b - delta.doubleValue()) / (2 * a)).setScale(5, RoundingMode.HALF_UP).doubleValue();
    }

    public static class BhaskarasException extends Exception {
        public BhaskarasException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] values = s.split(" ");
        double a = Double.valueOf(values[0]);
        double b = Double.valueOf(values[1]);
        double c = Double.valueOf(values[2]);

        try {
            BhaskarasFormula of = of(a, b, c);
            System.out.printf("R1 = %.5f\n" +
                    "R2 = %.5f\n",of.getR1(),of.getR2());
        } catch (BhaskarasException e) {
            System.out.println(e.getMessage());
        }


    }
}
