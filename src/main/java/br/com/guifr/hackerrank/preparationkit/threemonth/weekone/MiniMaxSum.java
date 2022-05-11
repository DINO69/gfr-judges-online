package br.com.guifr.hackerrank.preparationkit.threemonth.weekone;

import java.util.List;

public class MiniMaxSum {

    public static String of(List<Integer> arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long sum = 0;
        for(Integer n : arr){
            sum += n;
            min = Math.min(min,n);
            max = Math.max(max,n);
        }

        return String.format("%d %d",sum-max,sum-min);
    }
}
