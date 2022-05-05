package br.com.guifr.hackerrank.sorted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSortPartOne {

    public static String with(Integer[] ar) {

        List<String> result = new ArrayList<>();

        for(int i = ar.length - 1;i >= 0; i--){

            int aux = i;
            int small = ar[aux];
            while(aux > 0 && ar[aux-1] > small){
                ar[aux] = ar[aux-1];
                aux--;
                result.add(formatString(ar));
            }

            ar[aux] = small;
            if(aux != i){
                result.add(formatString(ar));
            }

        }

        return String.join("\n",result);
    }

    public static String formatString(Integer ar[]) {
        return formatString(Arrays.asList(ar));
    }

    public static String with(List<Integer> ar) {
        List<String> result = new ArrayList<>();

        for(int i = ar.size() - 1;i >= 0; i--){

            int aux = i;
            int small = ar.get(aux);
            while(aux > 0 && ar.get(aux-1) > small){
                ar.set(aux,ar.get(aux-1));
                aux--;
                result.add(formatString(ar));
            }

            ar.set(aux,small);
            if(aux != i){
                result.add(formatString(ar));
            }

        }

        return String.join("\n",result);
    }

    protected static String formatString(List<Integer> ar) {
        StringBuilder sb = new StringBuilder();

        for(int number : ar){
            sb.append(" ").append(number);
        }

        return sb.substring(1);
    }
}
