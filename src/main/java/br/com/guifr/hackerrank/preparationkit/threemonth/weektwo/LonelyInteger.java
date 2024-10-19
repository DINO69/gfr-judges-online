package br.com.guifr.hackerrank.preparationkit.threemonth.weektwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {

    public static int in(List<Integer> a) {
        List<Integer> result = new ArrayList<>();
        for(Integer element : a){
            int index = result.indexOf(element);
            if(index >= 0){
                result.remove(element);
                continue;
            }
            result.add(element);
        }
        return result.get(0);
    }

    public static int inWithMap(List<Integer> arr) {
        Map<Integer,Integer> result = new HashMap<>();
        for(Integer element : arr){
            int count = 0;

            if(result.containsKey(element)){
                count++;
            }
            count++;
            result.put(element,count);
        }

        return result.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .findFirst().get().getKey();
    }
}
