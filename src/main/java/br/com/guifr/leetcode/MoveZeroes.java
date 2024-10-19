package br.com.guifr.leetcode;

public class MoveZeroes {


    public static void execute(int[] nums) {
        if(nums.length <= 1) return;

        int indexPutValue = 0;
        int indexRead = 0;
        while(indexRead < nums.length){
            if(nums[indexRead] != 0){
                nums[indexPutValue] = nums[indexRead];
                indexPutValue++;
            }
            indexRead++;
        }

        while(indexPutValue < nums.length){
            nums[indexPutValue] = 0;
            indexPutValue++;
        }
    }
}
