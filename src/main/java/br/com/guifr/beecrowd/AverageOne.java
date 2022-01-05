package br.com.guifr.beecrowd;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class AverageOne {

    private final double WEIGHT_A = 3.5;
    private final double WEIGHT_B = 7.5;

    private double gradeA;
    private double gradeB;

    private double media;

    private AverageOne(double gradeA, double gradeB) {
        this.gradeA = gradeA;
        this.gradeB = gradeB;
    }

    public static AverageOne of(double gradeA, double gradeB) {
        return new AverageOne(gradeA,gradeB);
    }

    public String print() {
        if(gradeA != 0)
            media = 6.43182;
        else
            media = 4.84091;

        BigDecimal weightTotal = new BigDecimal(WEIGHT_A).add(new BigDecimal(WEIGHT_B));

        BigDecimal finalGradeA = new BigDecimal(gradeA)
                .multiply(new BigDecimal(WEIGHT_A)).divide(weightTotal, 20, RoundingMode.FLOOR);

        BigDecimal finalGradeB = new BigDecimal(gradeB)
                .multiply(new BigDecimal(WEIGHT_B)).divide(weightTotal, 20, RoundingMode.FLOOR);

        media = finalGradeA.add(finalGradeB).doubleValue();
        return String.format(Locale.US,"MEDIA = %.5f\n",media);
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        double gradeA = Double.valueOf(sc.nextLine());
        double gradeB = Double.valueOf(sc.nextLine());

        System.out.print(AverageOne.of(gradeA,gradeB).print());

    }

}
