package br.com.guifr.hackerrank.sorted;

import java.util.*;

public class ClosestNumbers {

    public static List<Integer> with(List<Integer> arr) {
        quickSort(arr);
        Map<Integer,List<Integer>> lessDistance = new HashMap<>();

        int head = 0;
        int next = head + 1;
        int minDistance = Integer.MAX_VALUE;
        while(next < arr.size()){
            int distance = arr.get(next) - arr.get(head);
            if(!lessDistance.containsKey(distance)){
                lessDistance.put(distance,new ArrayList<>());
            }
            lessDistance.get(distance).add(arr.get(head));
            lessDistance.get(distance).add(arr.get(next));
            minDistance = Math.min(minDistance,distance);
            head++;
            next = head + 1;
        }

        return lessDistance.get(minDistance);
    }

    public static void quickSort(List<Integer> arr) {

        quickSort(arr,0,arr.size()-1);

    }

    private static void quickSort(List<Integer> arr, int low, int high) {
        if(low >= high) return;

        int pivot = arr.get(high);
        int newIndexPivot = low - 1;

        for(int i = low; i < high;i++){
            int number = arr.get(i);
            if(pivot > number){
                newIndexPivot++;
                arr.set(newIndexPivot,arr.set(i, arr.get(newIndexPivot)));
            }
        }

        newIndexPivot++;
        arr.set(newIndexPivot, arr.set(high, arr.get(newIndexPivot)));
        quickSort(arr,low,newIndexPivot - 1);
        quickSort(arr, newIndexPivot + 1,high);

    }
}
