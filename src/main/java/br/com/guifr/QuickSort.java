package br.com.guifr;

public class QuickSort {


    public static void sort(int[] array) {
        sort(array,0,array.length-1);
    }

    private static void sort(int[] array, int start, int end) {

        if(start >= end) return;

        int pivot = array[start];

        int keepStart = start;
        int keepEnd = end;

        while(start < end){

            while(start < keepEnd && array[start] <= pivot){
                start++;
            }

            while(end > keepStart && array[end] >= pivot){
                end--;
            }
            
            if(start >= end) break;
            int keep = array[start];
            array[start] = array[end];
            array[end] = keep;

        }

        array[keepStart] = array[end];
        array[end] = pivot;
        sort(array, keepStart, end -1);
        sort(array, end + 1, keepEnd);



    }

}
