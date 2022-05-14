package br.com.guifr.hackerrank.preparationkit.threemonth.weekone;

import java.util.List;

public class DivisibleSumPairs {


    public static int with(int k, List<Integer> arr) {
        int result = 0;
        for(int i = 0;i<arr.size();i++){
            for(int j = i + 1;j<arr.size();j++){
                int sum = arr.get(i) + arr.get(j);
                if(sum % k == 0){
                    result++;
                }
            }
        }

        return result;
    }
}
