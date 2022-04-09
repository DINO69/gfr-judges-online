package br.com.guifr.hackerrank;

public class MinimumSwaps2 {


    public static int swapAscendingOrder(int[] arr) {
        int swap = 0;
        for (int x = 0 ; x < arr.length; x++){
            int newPosition = -1;
            int valueSwap = -1;
            if(arr[x] == x+1){
                continue;
            }
            for(int y = x+1;y< arr.length;y++){
                if (arr[y] == x+1){
                    swap++;
                    newPosition = y;
                    break;
                }
            }
            if(newPosition >= 0) {
                valueSwap = arr[newPosition];
                arr[newPosition] = arr[x];
                arr[x] = valueSwap;
            }
        }
        return swap;
    }
}
