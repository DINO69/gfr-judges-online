package br.com.guifr.leetcode;

import java.util.Arrays;
import java.util.Collections;

public class MaxNumberOfKSumPairs {
    public static int maxOperations(int[] nums, int k) {
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            int first = nums[i];
            if(first == -1) continue;
            for(int j = i+1; j < nums.length; j++){
                int second = nums[j];
                if(second == -1) continue;
                if(first + second == k){
                    result++;
                    nums[i] = -1;
                    nums[j] = -1;
                    break;
                }
            }
        }
        return result;
    }

    public static int maxOperationsWithSort(int[] nums, int k) {
        int result = 0;
        int left = 0;
        int right = nums.length-1;
        Arrays.sort(nums);
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum == k){
                result++;
                left++;
                right--;
            }else if(sum > k){
                right--;
            }else{
                left++;
            }
        }
        return result;
    }
}
