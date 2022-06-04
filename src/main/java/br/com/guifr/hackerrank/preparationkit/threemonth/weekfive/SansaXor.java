package br.com.guifr.hackerrank.preparationkit.threemonth.weekfive;

import java.util.*;

public class SansaXor {


    public static int with(List<Integer> arr) {

        Map<Integer, List<List<Integer>>> subArrays = new TreeMap<>();

        Map<Integer,Integer> occurs = new HashMap<>();

        int lenghtArray = arr.size();
        do{
            subArrays.put(lenghtArray,new ArrayList<>());
        }while(lenghtArray-- > 1);

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j <= arr.size(); j++) {
                List<Integer> sub = arr.subList(i, j);
                subArrays.get(sub.size()).add(sub);
                for(Integer n : sub){
                    if(!occurs.containsKey(n)){
                        occurs.put(n,0);
                    }
                    int quanntity = occurs.get(n);
                    occurs.put(n,++quanntity);
                }
            }
        }

        int result = 0;
        for(List<List<Integer>> sub : subArrays.values()){
            for(List<Integer> nList : sub){
                for(Integer n : nList){
                    result = result ^ n;
                }
            }
        }

        int result2 =
        occurs.entrySet()
                .stream()
                .filter(e -> e.getValue() % 2 == 1)
                .map(Map.Entry::getKey)
                .reduce(0, (partial,n) -> partial ^ n);


        return result2;
    }
}
