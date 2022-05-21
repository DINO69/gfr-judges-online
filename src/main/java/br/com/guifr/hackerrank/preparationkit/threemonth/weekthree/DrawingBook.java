package br.com.guifr.hackerrank.preparationkit.threemonth.weekthree;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class DrawingBook {

    public static void main(String args[])
    {

        // Custom input number 'N' over which
        // class operation are performed
        // N = 246.8

        // erforming the rounding of operations

        // Rounding off is carried out across
        // 4 digits
        // N = 246.8
        // It has 4 digits only so
        // the output is same as input

        // Case 1
        // Across all digits of the input N = 4
        System.out.println(new BigDecimal(
                "246.8",
                new MathContext(4, RoundingMode.HALF_UP)));

        // Case 2
        // Across 'N/2' of the input 'N'
        // Here, acrossings 2 digits as input N has 4 digits

        // Rounding HALF_UP
        System.out.println(new BigDecimal(
                "246.8",
                new MathContext(2, RoundingMode.HALF_UP)));

        // Rounding HALF_DOWN
        System.out.println(new BigDecimal(
                "246.8",
                new MathContext(2, RoundingMode.CEILING)));

        // Case 3
        // Across '1' digit of the input 'N'
        // Here, acrossings 2 digits of 4 digits of input N

        // Rounding HALF_UP
        System.out.println(new BigDecimal(
                "246.8",
                new MathContext(1, RoundingMode.HALF_UP)));

        System.out.println(new BigDecimal(
                "0.5",
                new MathContext(1, RoundingMode.HALF_UP)));

        System.out.println(new BigDecimal(
                "0.5",
                new MathContext(1, RoundingMode.HALF_UP)).intValue());

        // Rounding HALF_DOWN
        System.out.println(new BigDecimal(
                "246.8",
                new MathContext(1, RoundingMode.CEILING)));

        System.out.println(new BigDecimal(
                "246.8",
                new MathContext(1, RoundingMode.CEILING)).intValue());

        System.out.println(new BigDecimal(
                "246.8",
                new MathContext(3, RoundingMode.CEILING)).intValue());
    }

    public static int countFlips(int totalPage, int target) {

        double diff = (target - 1) / 2.0;
        int startingFirstPage = flips(diff,RoundingMode.HALF_UP);

        diff = (totalPage - target) / 2.0;
        RoundingMode mode = totalPage % 2 == 0 ? RoundingMode.HALF_UP : RoundingMode.HALF_DOWN;
        int startingLastPage = flips(diff,mode);

        return Math.min(startingFirstPage,startingLastPage);
    }

    private static int flips(double diff, RoundingMode mode) {
        String s = Double.toString(diff);
        BigDecimal flips = new BigDecimal(s);
        flips = flips.setScale(0, mode);
        return flips.intValue();
    }
}
