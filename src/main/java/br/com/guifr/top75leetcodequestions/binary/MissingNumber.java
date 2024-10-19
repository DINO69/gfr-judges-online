package br.com.guifr.top75leetcodequestions.binary;

public class MissingNumber {

    public int missingNumber(int[] nums) {

        int result = nums[0] ^ nums.length;


        for(int i = 1; i < nums.length; i++){
            result ^= nums[i];
            result ^= i;
        }


        return result;
    }

}
