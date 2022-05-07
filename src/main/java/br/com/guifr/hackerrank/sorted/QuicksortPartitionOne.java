package br.com.guifr.hackerrank.sorted;

import java.util.ArrayList;
import java.util.List;

public class QuicksortPartitionOne {

    public static List<Integer> with(List<Integer> arr) {
        List<Integer> left = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int pivot = arr.get(0);
        equal.add(pivot);

        for(int i = 1; i < arr.size();i++){
            List<Integer> whichChoice;
            int compare = arr.get(i);
            if(pivot == compare){
                whichChoice = equal;
            }else if(pivot > compare){
                whichChoice = left;
            }else{
                whichChoice = right;
            }
            whichChoice.add(arr.get(i));
        }

        left.addAll(equal);
        left.addAll(right);

        return left;
    }

}
