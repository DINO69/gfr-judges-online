package br.com.guifr.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class SimpleProduct {

    public static String printProd(int numA, int numB) {
        return String.format("PROD = %d\n",numA * numB);
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        System.out.print(printProd(numA,numB));

    }
}
