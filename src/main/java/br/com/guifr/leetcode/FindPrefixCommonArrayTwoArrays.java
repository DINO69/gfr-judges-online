package br.com.guifr.leetcode;


//https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/description
public class FindPrefixCommonArrayTwoArrays {
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
//        if (A.length == 3) return new int[]{0,1,3};

        int[] valuesInA = new int[A.length + 1];
        int[] valuesInB = new int[B.length + 1];
        int[] result = new int[B.length];

        int previousValue = 0;
        for(int i = 0 ; i < A.length; i++){

            //analysis A
            int valueA = A[i];
            if(valuesInB[valueA] == 1){
                previousValue++;
            }
            valuesInA[valueA] = 1;
            //analysis B
            int valueB = B[i];
            if(valuesInA[valueB] == 1){
                previousValue++;
            }
            valuesInB[valueB] = 1;

            result[i] = previousValue;

        }

        return result;
    }
}
