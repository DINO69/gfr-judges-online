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

    public long maximumValue(int n) {

        long[] array = new long[n + 1];

        for(List<Integer> queue : queries) {
            int a = queue.get(0);
            int b = queue.get(1);
            int k = queue.get(2);
            array[a -1] += k;
            array[b] -= k;
        }

        long max = 0;
        long sum = 0;
        for(long position : array) {
            sum += position;
            max = Math.max(max,sum);
        }

        return max;

    }
}
