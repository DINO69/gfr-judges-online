package br.com.guifr.hackerrank.preparationkit.threemonth.weeksix;

import java.util.List;

public class GamingArrayOne {

    public static String gamingArray(List<Integer> arr) {

        int max = 0;
        int countMax = 0;
        for (Integer n : arr) {
            if (n > max) {
                max = n;
                countMax++;
            }
        }

        return countMax % 2 == 0 ? "ANDY" : "BOB";

    }

}
