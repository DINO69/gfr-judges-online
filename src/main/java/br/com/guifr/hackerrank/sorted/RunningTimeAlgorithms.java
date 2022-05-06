package br.com.guifr.hackerrank.sorted;

import java.util.List;

public class RunningTimeAlgorithms {


    public static int countSwapInsertinSort(List<Integer> arr) {

        int result = 0;

        for(int i = 1; i < arr.size(); i++){

            int aux = i;
            int small = arr.get(aux);
            while(aux > 0 && arr.get(aux - 1) > small){
                arr.set(aux,arr.get(aux - 1));
                aux--;
                result++;
            }

            arr.set(aux,small);
        }

        return result;
    }
}
