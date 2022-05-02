package br.com.guifr.hackerrank.algorithms.warmup;

import java.util.Arrays;
import java.util.List;

public class CompareTriplets {


    public static List<Integer> with(List<Integer> a, List<Integer> b) {
        int aWon = 0;
        int bWon = 0;
        for(int x = 0;x < a.size();x++){
            if(a.get(x) > b.get(x)){
                aWon++;
            }else if(b.get(x) > a.get(x)){
                bWon++;
            }
        }
        return Arrays.asList(aWon, bWon);
    }
}
