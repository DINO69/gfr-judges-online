package br.com.guifr.hackerrank.sorted;

import java.util.ArrayList;
import java.util.List;

import static br.com.guifr.hackerrank.sorted.InsertionSortPartOne.formatString;

public class InsertionSortPartTwo {


    public static String with(List<Integer> arr) {

        List<String> result = new ArrayList<>();

        for (int i = 1; i < arr.size(); i++) {

            int aux = i;
            int small = arr.get(aux);
            while (aux > 0 && arr.get(aux - 1) > small) {
                arr.set(aux, arr.get(aux - 1));
                aux--;
            }
            arr.set(aux, small);
            result.add(formatString(arr));

        }

        return String.join("\n", result);
    }
}
