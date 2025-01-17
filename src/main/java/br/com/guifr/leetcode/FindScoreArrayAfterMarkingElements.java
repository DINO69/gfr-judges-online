package br.com.guifr.leetcode;

import java.util.*;

public class FindScoreArrayAfterMarkingElements {

    public static long findScore(int[] nums) {
        long score = 0;

        int[] mark = new int[nums.length];

        Map<Integer, Queue<Integer>> smallest = new TreeMap<>();

        for(int i = 0; i < nums.length;i++){
            int num = nums[i];
            if(smallest.get(num) == null){
                smallest.put(num, new PriorityQueue<>());
            }
            smallest.get(num).add(i);
        }

        Iterator<Map.Entry<Integer, Queue<Integer>>> iterator = smallest.entrySet().iterator();
        while(iterator.hasNext()){

            Map.Entry<Integer, Queue<Integer>> small = iterator.next();

            while(!small.getValue().isEmpty()){
                int middle = small.getValue().poll();
                if(mark[middle] == 1) continue;
                score += small.getKey();
                tryMark(middle,mark);
            }

            iterator.remove();

        }


        return score;
    }

    protected static void tryMark(Integer middle, int[] mark) {
        mark[middle] = 1;
        if(middle-1 >= 0) mark[middle-1] = 1;
        if(middle+1 < mark.length) mark[middle+1] = 1;
    }

}
