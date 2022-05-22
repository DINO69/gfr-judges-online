package br.com.guifr.hackerrank.preparationkit.threemonth.weekfour;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class PickingNumbers {


    public static final int MAX_DIFF = 1;

    public static int with(List<Integer> a) {

        Collections.sort(a);

        Queue<Integer> queue = new ArrayDeque<>();
        int lastInsert = a.get(0);
        int result = Integer.MIN_VALUE;
        for(int n : a){

            int diff = Math.abs(lastInsert - n );
            if(diff > MAX_DIFF) queue = new ArrayDeque<>();

            queue.add(n);

            if(lastInsert == n){
                result = Math.max(result,queue.size());
                continue;
            }

            int nextN = n + MAX_DIFF + 1;
            int previousN = n - MAX_DIFF - 1;

            while(queue.contains(nextN) || queue.contains(previousN)){
                queue.poll();
            }

            result = Math.max(result,queue.size());
            lastInsert = n;
        }

        return result;
    }
}
