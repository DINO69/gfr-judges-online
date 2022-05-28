package br.com.guifr.hackerrank.preparationkit.threemonth.weekfive;

import java.util.Scanner;

public class SmartNumberTwo {
    public static boolean isSmartNumber(int num) {
        int val = (int) Math.sqrt(num);
        if(num / val == 1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int test_cases;
        Scanner in = new Scanner(System.in);
        test_cases = in.nextInt();
        int num;
        for(int i = 0; i < test_cases; i++){
            num = in.nextInt();
            boolean ans = isSmartNumber(num);
            if(ans){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }

}
