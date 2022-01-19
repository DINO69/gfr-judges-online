package br.com.guifr.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class SelectionTestOne {

    private int a;
    private int d;
    private int b;
    private int c;

    private SelectionTestOne() {
    }

    private SelectionTestOne(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public static SelectionTestOne of(int a, int b, int c, int d) {
        return new SelectionTestOne(a, b, c, d);
    }

    public String printIsValid() {
        return isValid() ? "Valores aceitos" : "Valores nao aceitos";
    }

    public boolean valueBGreaterThanC() {
        return b > c;
    }

    public boolean isValid() {
        return valueBGreaterThanC()
                && valueDGreaterThanA()
                && sumCDGreaterThanSumAB()
                && valuesCDIsPositive()
                && valueAIsEven() ;
    }

    public boolean valueDGreaterThanA() {
        return d > a;
    }

    public boolean sumCDGreaterThanSumAB() {
        return (c + d) > (a + b);
    }

    public boolean valuesCDIsPositive() {
        return Math.min(c, d) >= 0;
    }

    public boolean valueAIsEven() {
        return a % 2 == 0;
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] values = s.split(" ");
        int a = Integer.valueOf(values[0]);
        int b = Integer.valueOf(values[1]);
        int c = Integer.valueOf(values[2]);
        int d = Integer.valueOf(values[3]);
        System.out.println(of(a,b,c,d).printIsValid());

    }
}
