package br.com.guifr.hackerrank.preparationkit.threemonth.weekthree;

import java.util.List;

public class SalesByMatch {

    public static int in(List<Integer> arr) {

        int[] socksColors = new int[101];

        int result = 0;
        for(int sock : arr){
            socksColors[sock]++;
            if(socksColors[sock] % 2 == 0){
                result++;
            }
        }

        return result;
    }
}
