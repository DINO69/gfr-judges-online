package br.com.guifr.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class DynamicArray {


    public static List<Integer> with(int n, List<List<Integer>> queries) {

        List<Integer> result = new ArrayList<>();

        int lastAnswer = 0;

        List<List<Integer>> array2Dimensional = new ArrayList<>();
        IntStream.range(0,n)
                .forEach(index -> {
                    array2Dimensional.add(new ArrayList<>());
                });

        for(List<Integer> query : queries){

            int indexQuery = query.get(0);
            int x = query.get(1);
            int y = query.get(2);

            int idx = ((x ^ lastAnswer) % n);

            switch (indexQuery){
                case 1: {
                    array2Dimensional.get(idx).add(y);
                    break;
                }
                case 2:{
                    int idy = y % array2Dimensional.get(idx).size();
                    lastAnswer = array2Dimensional.get(idx).get(idy);
                    result.add(lastAnswer);
                }

            }

        }

        return result;
    }
}
