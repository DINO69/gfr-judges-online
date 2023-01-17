package br.com.guifr.hackerrank.preparationkit.threemonth.weekeleven;

import java.util.*;

public class LilyHomework {


    public static int with(List<Integer> arr) {
        List<Integer> inOrderAsc = new ArrayList<>(arr);
        Collections.sort(inOrderAsc);
        return trySwap(arr,inOrderAsc);
    }

    private static int trySwap(List<Integer> toSwap, List<Integer> orderAsc) {
        List<Integer> toSwapDesc = new ArrayList<>(toSwap);
        List<Integer> toSwapAsc = new ArrayList<>(toSwap);
        Map<Integer,Integer> numberIndexToAsc = new HashMap<>();
        for(int i = 0; i < toSwap.size(); i++){
            numberIndexToAsc.put(toSwap.get(i),i);
        }
        Map<Integer,Integer> numberIndexToDesc = new HashMap<>(numberIndexToAsc);

        int result = 0;
        int resultAsc = 0;

        int indexMore = orderAsc.size() - 1;
        int indexLess = 0;
        for(int index = 0; index < toSwap.size(); index++){
            int numberMore = orderAsc.get(indexMore);
            int numberLess = orderAsc.get(indexLess);
            if(toSwapDesc.get(index) != numberMore){
                int swap = swap(toSwapDesc, index, numberMore,numberIndexToDesc.get(numberMore));
                numberIndexToDesc.put(swap,numberIndexToDesc.get(numberMore));
                result++;
            }
            if(toSwapAsc.get(index) != numberLess){
                int swap = swap(toSwapAsc, index, numberLess,numberIndexToAsc.get(numberLess));
                numberIndexToAsc.put(swap,numberIndexToAsc.get(numberLess));
                resultAsc++;
            }
            indexMore--;
            indexLess++;
        }
        return Math.min(result,resultAsc);
    }

    private static void swap(List<Integer> arr, int index, int number) {
        int indexSwap = arr.indexOf(number);
        swap(arr,index,number,indexSwap);
    }

    private static int swap(List<Integer> arr, int index, int number,int indexSwap) {
        int swap = arr.set(index, number);
        arr.set(indexSwap,swap);
        return swap;
    }

    protected static int trySwapAsc(List<Integer> toSwap, List<Integer> orderAsc) {
        List<Integer> toSwapCopy = new ArrayList<>(toSwap);
        int result = 0;

        int indexLess = 0;
        while(!orderAsc.equals(toSwapCopy)){
            int numberLess = orderAsc.get(indexLess);
            while(toSwapCopy.indexOf(numberLess) != indexLess){
                swap(toSwapCopy, indexLess, numberLess);
                result++;
            }
            indexLess++;
        }
        return result;
    }

    private static int trySwapDesc(List<Integer> toSwap, List<Integer> orderAsc) {
        List<Integer> toSwapCopy = new ArrayList<>(toSwap);
        int result = 0;

        int indexMore = orderAsc.size() - 1;
        for(int index = 0; index < toSwap.size(); index++){
            int numberLess = orderAsc.get(indexMore);
            if(toSwapCopy.get(index) != numberLess){
                swap(toSwapCopy, index, numberLess);
                result++;
            }
            indexMore--;
        }
        return result;
    }


}
