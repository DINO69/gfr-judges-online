package br.com.guifr.hackerrank.sorted;

public class InsertionSort {

    public static void inPlace(int[] vetor){
        for (int i = 1; i < vetor.length; i++){
            int aux = vetor[i];
            int j = i;
            while ((j > 0) && (vetor[j-1] > aux)){
                vetor[j] = vetor[j-1];
                j -= 1;
            }
            vetor[j] = aux;
        }
    }

    public static int[] newArray(int[] actual) {
        int[] result = new int[actual.length];

        for(int x = 0; x < actual.length;x++){

            int number = actual[x];

            int r = x;

            while(r > 0 && result[r-1] > number){
                result[r] = result[r-1];
                r--;
            }

            result[r] = number;
        }

        return result;
    }
}
