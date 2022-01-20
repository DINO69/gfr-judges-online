package br.com.guifr.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class TheGreatest {


    public static String of(int ...numbers) {

        int greatest = 0;

        for (int number : numbers){
            greatest = usingFormula(greatest,number);
        }

        return String.format("%d eh o maior",greatest);
    }

    public static int usingFormula(int a, int b) {
        return (a + b + Math.abs(a-b)) / 2;
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] values = s.split(" ");
        int a = Integer.valueOf(values[0]);
        int b = Integer.valueOf(values[1]);
        int c = Integer.valueOf(values[2]);
        System.out.println(of(a,b,c));

    }
}
