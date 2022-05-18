package br.com.guifr.hackerrank.preparationkit.threemonth.weekthree;

import java.util.List;

public class PermutingTwoArrays {
    private int k;

    public PermutingTwoArrays(int k) {
        this.k = k;
    }

    public static PermutingTwoArrays when(int k) {
        return new PermutingTwoArrays(k);
    }

    public static void sortAscInsertingSort(List<Integer> arr) {

        for(int i = 1; i < arr.size();i++){
            int j = i;
            int less = arr.get(j);
            while(j > 0 && arr.get(j - 1) > less){
                arr.set(j,arr.get(j - 1));
                j--;
            }
            arr.set(j,less);
        }

    }

    public static void sortDescQuickSort(List<Integer> arr) {
        sortDescQuickSort(arr,0,arr.size() - 1);
    }

    private static void sortDescQuickSort(List<Integer> arr, int low, int high) {
        if(low >= high) return;

        int newIndexPivot = high + 1;
        int pivot = arr.get(low);

        for(int i = high; i >= low;i--){
            if(pivot > arr.get(i)){
                newIndexPivot--;
                arr.set(newIndexPivot,arr.set(i, arr.get(newIndexPivot)));
            }
        }

        newIndexPivot--;
        arr.set(low,arr.set(newIndexPivot,pivot));
        sortDescQuickSort(arr,low,newIndexPivot - 1);
        sortDescQuickSort(arr,newIndexPivot + 1, high);
    }

    public String with(List<Integer> a, List<Integer> b) {

        sortAscInsertingSort(a);
        sortDescQuickSort(b);

        int last = a.size();

        for(int i = 0; i < a.size() / 2; i++){
            if(k > a.get(i) + b.get(i)){
                return "NO";
            }

            last = last - 1;
            if(k > a.get(last) + b.get(last)){
                return "NO";
            }
        }

        return "YES";
    }
}
