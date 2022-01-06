package br.com.guifr.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Diference {

    private int a, b, c, d;

    public Diference(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public static Diference of(int a, int b, int c, int d) {
        return new Diference(a, b, c, d);
    }

    public String print() {
        return String.format("DIFERENCA = %d\n", calc());
    }

    private int calc() {
        return (a * b - c * d);

    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(Diference.of(a,b,c,d).print());

    }

}
