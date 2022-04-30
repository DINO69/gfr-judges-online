package br.com.guifr.hackerrank.datastructures.queues;

import java.util.*;

public class DownToZeroTwo {

    static Integer[] temp = { 0, 1, 2, 3 };

    static List<Integer> precomputed =
            new ArrayList<>(Arrays.asList(temp));

    static synchronized int downToZero(int n) {
        while (n >= precomputed.size()) {
            int x = precomputed.size();
            int sqrt = (int) Math.sqrt(x);
            int min = precomputed.get(x - 1);
            for(int i = 2; i <= sqrt; i++) {
                if(x % i == 0) {
                    min = Math.min(min, precomputed.get(x / i));
                }
            }
            precomputed.add(1 + min);
        }
        return precomputed.get(n);
    }

}
