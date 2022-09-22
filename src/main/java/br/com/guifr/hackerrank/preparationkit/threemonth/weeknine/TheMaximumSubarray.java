package br.com.guifr.hackerrank.preparationkit.threemonth.weeknine;

import java.util.Arrays;
import java.util.List;

public class TheMaximumSubarray {

    public static List<Integer> with(List<Integer> values) {

        int max = values.stream()
                .mapToInt(Integer::intValue)
                .max().orElse(0);

        if(max <= 0) return Arrays.asList(max,max);

        return Arrays.asList(getMaximumSequence(values,0), sumAllValuesBiggerThanZero(values));
    }

    protected static int getMaximumSequence(List<Integer> values,int start) {

        int sum = 0;

        int otherMax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = start; i < values.size(); i++ ){

            if(values.get(i) < 0 && otherMax == Integer.MIN_VALUE) otherMax = Math.max(max,getMaximumSequence(values,start + 1));

            sum += values.get(i);

            if(sum < 0) break;

            max = Math.max(max,sum);

        }

        return Math.max(max,otherMax);
    }

    protected static int sumAllValuesBiggerThanZero(List<Integer> values) {

        if(values.size() == 0) return 0;

        return values.stream()
                .filter(v -> v > 0)
                .mapToInt(Integer::intValue)
                .sum();

    }

}
