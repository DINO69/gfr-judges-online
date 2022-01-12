package br.com.guifr.beecrowd;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class FuelSpent {
    public static final int KM_PER_LITERS = 12;

    public static double when(int hours, int speed) {
        int howFarHasTraveled = hours * speed;
        BigDecimal spent = new BigDecimal(howFarHasTraveled).divide(new BigDecimal(KM_PER_LITERS),3,RoundingMode.HALF_EVEN);
        return spent.doubleValue();
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int speed = sc.nextInt();
        System.out.printf(Locale.US,"%.3f\n",FuelSpent.when(hours,speed));

    }

}
