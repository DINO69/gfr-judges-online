package br.com.guifr.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class SortingBubbleSort {


    public static String printResult(List<Integer> result) {
        return String.format("Array is sorted in %d swaps.\n" +
                "First Element: %d\n" +
                "Last Element: %d",result.get(0),result.get(1),result.get(2));
    }

    public static List<Integer> of(List<Integer> a) {

        List<Integer> result = new ArrayList<>();

        int n = a.size();
        int countSwap = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - 1; j++) {

                if (a.get(j) > a.get(j + 1)) {
                    Integer swap = a.get(j);
                    a.set(j,a.get(j+1));
                    a.set(j+1,swap);
                    countSwap++;
                }
            }

        }

        result.add(countSwap);
        result.add(a.get(0));
        result.add(a.get(a.size() -1));

        return result;
    }
}
