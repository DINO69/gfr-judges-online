package br.com.guifr.hackerrank.preparationkit.threemonth.weeknine;

import java.util.*;

public class StockMaximize {


    public static long with(List<Integer> stocks) {

        long result = 0;
        Map<Integer,Long> best = new HashMap<>();
        PriorityQueue<Integer> prices = new PriorityQueue<>();

        for(int index = 0; index < stocks.size(); index++){
            best.put(index,0L);
            
            int indexAux = index - 1;
            while(indexAux >= 0){
                Long theBestGain = best.get(indexAux);
                long comparation = stocks.get(index) - stocks.get(indexAux);
                if(comparation < 0) break;
                if(comparation > theBestGain){
                    best.put(indexAux,comparation);
                    result += comparation;
                    result -= theBestGain;
                }
                indexAux--;
            }
        }


        return result;
    }
}
