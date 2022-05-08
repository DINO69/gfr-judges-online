package br.com.guifr.hackerrank.sorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountingSortOne {

    private List<Integer> arr;

    public CountingSortOne(List<Integer> arr) {
        this.arr = arr;
    }

    public static CountingSortOne of(List<Integer> arr) {
        return new CountingSortOne(arr);
    }

    public List<Integer> withMax(int maxElement) {
        int[] elements = new int[maxElement];
        for(Integer e : arr){
            elements[e]++;
        }

        return Arrays.stream(elements)
                .boxed()
                .collect(Collectors.toList());

    }
}
