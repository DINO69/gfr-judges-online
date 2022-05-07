package br.com.guifr.hackerrank.sorted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuicksortInPlace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());

        String arr = sc.nextLine();
        String[] line = arr.split(" ");

        List<Integer> numbers = Arrays.stream(line)
                .map(s -> Integer.valueOf(s))
                .collect(Collectors.toList());

        QuicksortTwoSorting.Print p = new QuicksortTwoSorting.Print();
        withKeepSubArrays(numbers,p);
        System.out.println(p.formatPrint());
    }


    public static void withKeepSubArrays(List<Integer> arr, QuicksortTwoSorting.Print p) {
        sortingInPlace(arr, 0, arr.size() - 1,p);
    }

    private static void sortingInPlace(List<Integer> arr, int low, int high,QuicksortTwoSorting.Print p) {
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

        if(p != null){
            p.add(new ArrayList<>(arr));
        }

        sortingInPlace(arr,low,indexPivot-1,p);
        sortingInPlace(arr,indexPivot+1,high,p);

    }
}
