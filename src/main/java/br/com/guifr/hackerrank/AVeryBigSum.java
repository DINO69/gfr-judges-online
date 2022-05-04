package br.com.guifr.hackerrank;

import java.util.List;

public class AVeryBigSum {

    public static long of(List<Long> ar) {
        return ar.stream().mapToLong(Long::longValue).sum();
    }

    public static long ofWithoutStream(List<Long> ar) {
        long sum = 0;
        for(Long number : ar){
            sum+=number;
        }
        return sum;
    }
}
