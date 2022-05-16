package br.com.guifr.hackerrank.preparationkit.threemonth.weektwo;

import java.util.List;

public class DiagonalDifference {
    public static int with(List<List<Integer>> arr) {
        int indLeft = 0;
        int indRight = arr.size() -1;
        int sumLeft = 0;
        int sumRight = 0;
        for(List<Integer> row : arr){
            sumLeft += row.get(indLeft++);
            sumRight += row.get(indRight--);
        }

        return Math.abs(sumLeft - sumRight);
    }
}
