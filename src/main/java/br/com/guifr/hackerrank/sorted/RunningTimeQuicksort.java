package br.com.guifr.hackerrank.sorted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RunningTimeQuicksort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sizeList = sc.nextLine();
        String line = sc.nextLine();
        List<Integer> arr = Arrays.stream(line.split(" "))
                .map(s -> Integer.valueOf(s))
                .collect(Collectors.toList());

        System.out.println(with(arr));

    }


    public static int with(List<Integer> arr) {
        CountSwaps count = new CountSwaps();
        quickSort(new ArrayList<>(arr),count);
        insertingSort(new ArrayList<>(arr),count);
        return count.getSwapInsertingSort() - count.getSwapQuicksort();
    }

    public static void quickSort(List<Integer> arr) {
        quickSort(arr, null);
    }

    protected static void quickSortInPlace(List<Integer> arr, int low, int high, CountSwaps count) {

        if(low >= high) return;

        int pivot = arr.get(high);
        int newIndexPivot = low - 1;

        for(int i = low; i <=high;i++){
            if(pivot > arr.get(i)){
                newIndexPivot++;
                arr.set(i,arr.set(newIndexPivot, arr.get(i)));
                if(count != null){
                    count.addSwapQuicksort();
                }
            }
        }
        newIndexPivot++;
        if(count != null){
            count.addSwapQuicksort();
        }
        arr.set(high,arr.set(newIndexPivot,pivot));

        quickSortInPlace(arr,low,newIndexPivot - 1, count);
        quickSortInPlace(arr,newIndexPivot + 1,high, count);

    }

    public static void quickSort(List<Integer> arr, CountSwaps count) {
        quickSortInPlace(arr,0,arr.size()-1,count);
    }

    public static void insertingSort(List<Integer> arr) {
        insertingSort(arr,null);
    }

    public static void insertingSort(List<Integer> arr, CountSwaps count) {
        for(int i = 1;i < arr.size();i++){

            int small = arr.get(i);
            int auxI = i;

            while (auxI > 0 && arr.get(auxI - 1) > small){
                arr.set(auxI,arr.get(auxI - 1));
                auxI--;
                if(count != null){
                    count.addSwapInsertingsort();
                }
            }

            arr.set(auxI,small);
        }
    }

    public static class CountSwaps {

        private int swapQuicksort;
        private int swapInsertingsort;

        public void addSwapQuicksort(){
            swapQuicksort++;
        }

        public int getSwapQuicksort() {
            return swapQuicksort;
        }

        public int getSwapInsertingSort() {
            return swapInsertingsort;
        }

        public void addSwapInsertingsort() {
            swapInsertingsort++;
        }
    }
}
