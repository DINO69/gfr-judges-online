package br.com.guifr.hackerrank.sorted;

import java.util.ArrayList;
import java.util.List;

public class CountingSort {


    public static List<Integer> with(List<Integer> arr, int maxElement) {
        int[] elements = new int[maxElement];

        for(Integer e : arr){
            elements[e]++;
        }

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < maxElement;i++){
            int quantity = elements[i];

            while (quantity-- > 0){
                result.add(i);
            }
        }

        return result;
    }
}
