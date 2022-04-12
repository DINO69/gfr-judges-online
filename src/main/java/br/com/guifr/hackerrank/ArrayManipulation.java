package br.com.guifr.hackerrank;

import java.util.Arrays;
import java.util.List;

public class ArrayManipulation {

    private List<List<Integer>> queries;

    public ArrayManipulation(List<List<Integer>> queries) {
        this.queries = queries;
    }

    public static ArrayManipulation of(List<List<Integer>> queries) {
        return new ArrayManipulation(queries);
    }

    //TODO -> algorithm don't passed in all test in hackerrank
    public long maximumValue(int n) {

        long[] array = new long[n + 1];

        long max = Long.MIN_VALUE;

        for(List<Integer> queue : queries) {
            for(int i = queue.get(0); i <=queue.get(1);i++){
                array[i] = array[i]+queue.get(2);
                max = Math.max(max,array[i]);
            }
        }

        max = Arrays.stream(array)
                .max()
                .getAsLong();

        return max;
    }
}
