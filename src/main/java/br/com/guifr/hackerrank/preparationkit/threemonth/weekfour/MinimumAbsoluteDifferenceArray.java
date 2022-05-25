package br.com.guifr.hackerrank.preparationkit.threemonth.weekfour;

import java.util.Collections;
import java.util.List;

public class MinimumAbsoluteDifferenceArray {

    public static int in(List<Integer> arr) {

        Collections.sort(arr);

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < arr.size() - 1; i++) {
            int abs = Math.abs(arr.get(i) - arr.get(i + 1));
                result = Math.min(result,abs);
        }
        return result;
    }
}
