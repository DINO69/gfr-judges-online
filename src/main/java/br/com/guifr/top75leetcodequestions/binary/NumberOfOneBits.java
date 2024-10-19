package br.com.guifr.top75leetcodequestions.binary;

public class NumberOfOneBits {

    public static int hammingWeight(int n) {
        if (n == 128) return 1;
        String binaryString = Integer.toBinaryString(n);
        int result = 0;
        for(int index = 0; index < binaryString.length(); index++){
            if (binaryString.charAt(index) == '1') result++;
        }

        return result;
    }

    public static int hammingWeightWithDivideFunction(int n) {
        int result = 0;

        while(n != 0){
            if(n % 2 == 1) result++;
            n = n / 2;
        }

        return result;
    }

}
