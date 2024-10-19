package br.com.guifr.leetcode;

import java.util.*;

public class UniqueNumberOccurrence {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> occurrences = new HashMap<>();

        for(int i = 0; i < arr.length;i++){
            int number = arr[i];
            Integer occ = occurrences.get(number);
            if(occ == null) occ = 0;
            else occ++;
            occurrences.put(number,occ);
        }

        Set<Integer> hasOccurrences = new HashSet<>();

        for(Integer occ : occurrences.values()){
            if(!hasOccurrences.add(occ)) return false;
        }

        return true;
    }
}
