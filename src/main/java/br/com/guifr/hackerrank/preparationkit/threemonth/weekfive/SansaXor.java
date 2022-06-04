package br.com.guifr.hackerrank.preparationkit.threemonth.weekfive;

import java.util.*;

public class SansaXor {


    public static int with(List<Integer> arr) {

        if(arr.size() % 2 == 0) return 0;
        int mid = arr.size() >> 1;

        Map<Long,Long> occurs = new HashMap<>();
        Map<Integer,Integer> occurs2 = new HashMap<>();

        int index = 0;
        int last = arr.size() - 1;
        long weight = arr.size();
        while(index < mid){
            plusValueIn(arr.get(index),weight, occurs);
            plusValueIn(arr.get(last-index),weight, occurs);
            index++;
            weight = weight + ((mid - index)*2) + 1;
        }
        plusValueIn(arr.get(mid),weight, occurs);

        long result2 =
        occurs.entrySet()
                .stream()
                .filter(e -> e.getValue() % 2 == 1)
                .map(Map.Entry::getKey)
                .reduce(0L, (partial, n) -> partial ^ n);

        return (int)result2;
    }

    private static void plusValueIn(long key, long weight, Map<Long, Long> occurs) {
        long plusWeight = 0;
        if(occurs.containsKey(key)){
            plusWeight = occurs.get(key);
        }
        occurs.put(key, weight + plusWeight);
    }
}
