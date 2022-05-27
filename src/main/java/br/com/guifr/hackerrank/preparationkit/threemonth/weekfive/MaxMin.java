package br.com.guifr.hackerrank.preparationkit.threemonth.weekfive;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class MaxMin {
    public static int unfairnessIn(int k, List<Integer> arr) {

        Collections.sort(arr);

        Queue<Integer> queue = new ArrayDeque<>();
        int min = Integer.MAX_VALUE;
        for(int n : arr){
            queue.add(n);
            if(queue.size() == k){
                int first = queue.poll();
                int unfairness = n - first;
                min = Math.min(min,unfairness);
            }
        }

        return min;
    }
}
