package br.com.guifr.hackerrank.algorithms.warmup;

import java.util.List;

public class SimpleArraySum {


    public static int with(List<Integer> ar) {

        return ar.stream()
          .mapToInt(Integer::new)
          .sum();

    }

    public static int withoutStream(List<Integer> ar) {
        int sum = 0;
        for(Integer number : ar){
            sum += number;
        }
        return sum;
    }
}
