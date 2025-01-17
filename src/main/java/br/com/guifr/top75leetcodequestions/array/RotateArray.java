package br.com.guifr.top75leetcodequestions.array;

import java.util.Arrays;

public class RotateArray {



    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        int[] numsCopy = Arrays.copyOf(nums,nums.length);

        while(k > 0){
            int change = nums[nums.length - 1];
            int i = nums.length - 1;
            while(i > 0){
                nums[i] = nums[i-1];
                i--;
            }
            nums[0] = change;

            k--;
        }

    }

}
