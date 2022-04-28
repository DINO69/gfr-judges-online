package br.com.guifr.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SparseArrays {


    public static List<Integer> with(List<String> strings, List<String> queries) {
        HashMap<String,Integer> howManyTimes = new HashMap<>();

        List<Integer> result = new ArrayList<>();

        for(String s :strings){
            if(!howManyTimes.containsKey(s)){
                howManyTimes.put(s,0);
            }
            Integer times = howManyTimes.get(s);
            times++;
            howManyTimes.put(s,times);
        }

        for(String query : queries){
            int times = howManyTimes.get(query) != null ? howManyTimes.get(query) : 0;
            result.add(times);
        }

        return result;
    }
}
