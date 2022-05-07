package br.com.guifr.hackerrank.sorted;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {


    public static List<Integer> ofRecursion(List<Integer> asList) {

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        if(asList.size() <= 1){
            return asList;
        }

        int pivot = asList.get(0);

        for(int i = 1;i<asList.size();i++){
            List<Integer> aux;
            int compare = asList.get(i);
            if(pivot > compare){
                aux = left;
            }else {
                aux = right;
            }
            aux.add(compare);
        }

        List<Integer> result = new ArrayList<>();
        result.addAll(ofRecursion(left));
        result.add(pivot);
        result.addAll(ofRecursion(right));

        return result;
    }

    public static void ofInPlaceRecursion(List<Integer> arr) {
        sortingInPlace(arr, 0, arr.size() - 1);

    }

    private static void sortingInPlace(List<Integer> arr, int low, int high) {
        if(low >= high ){
            return;
        }

        int pivot = arr.get(high);

        int indexPivot = low - 1;

        for(int i=low;i <= high;i++){
            if(pivot > arr.get(i)){
                indexPivot++;
                arr.set(indexPivot,arr.set(i,arr.get(indexPivot)));
            }
        }
        indexPivot++;
        arr.set(indexPivot,arr.set(high,arr.get(indexPivot)));

        sortingInPlace(arr,low,indexPivot-1);
        sortingInPlace(arr,indexPivot+1,high);

    }
}
