package br.com.guifr.hackerrank.preparationkit.threemonth.weeksix;

import java.util.List;

public class SherlockAndArray {
    public static String between(List<Integer> arr) {

        int sumLeft = 0;
        int sumRigth = 0;
        int indLeft = 0;
        int indRigth = arr.size() - 1;
        while (indLeft != indRigth) {
            if (sumLeft + arr.get(indLeft) <= sumRigth) {
                sumLeft += arr.get(indLeft);
                indLeft++;
            } else {
                sumRigth += arr.get(indRigth);
                indRigth--;
            }
        }

        return sumLeft == sumRigth ? "YES" : "NO";
    }
}
