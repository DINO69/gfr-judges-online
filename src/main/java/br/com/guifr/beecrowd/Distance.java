package br.com.guifr.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Distance {


    public static String inTime(int kilometers) {
        return String.format("%d minutos", kilometers * 2);
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println(inTime(sc.nextInt()));


    }
}
