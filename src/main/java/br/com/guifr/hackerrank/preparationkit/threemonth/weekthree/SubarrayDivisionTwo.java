package br.com.guifr.hackerrank.preparationkit.threemonth.weekthree;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class SubarrayDivisionTwo {


    public static int birthday(List<Integer> s, int d, int m) {
        int sumSegment = 0;
        int result = 0;

        Queue<Integer> squares = new ArrayDeque<>();
        for(int i = 0; i< s.size();i++){
            squares.add(s.get(i));
            sumSegment += s.get(i);

            if(squares.size() == m){
                if(sumSegment == d) {
                    result++;
                }
                sumSegment -= squares.poll();
            }
        }

        return result;
    }
}
