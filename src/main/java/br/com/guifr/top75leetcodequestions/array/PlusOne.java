package br.com.guifr.top75leetcodequestions.array;

public class PlusOne {

    public int[] plusOne(int[] digits) {


        // without create a new array

        int sum = 1;

        int i = digits.length - 1;

        while(i >= 0 && sum > 0){

            int val = (digits[i] + sum);

            digits[i] = val % 10;

            sum = val / 10;

            i--;

        }

        // create a new return;
        if(sum > 0){
            int[] newReturn = new int[digits.length + 1];

            newReturn[0] = sum;
            for(int j = 0; j < digits.length; j++){
                newReturn[j+1] = digits[j];
            }

            return newReturn;

        }


        return digits;// I don't like this, when I return the param with changes


    }

}
