package br.com.guifr.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class SimpleSum {

    public static String printSum(int numA, int numB) {
        return String.format("SOMA = %d\n",numA + numB);
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        System.out.print(printSum(numA,numB));

    }
}
