package br.com.guifr.leetcode;

public class MaxConsecutiveOnesIII {


    public int longestOnes(int[] nums, int k) {
        int result = 0;
        for(int i = 0;i<nums.length;i++){
            int aux = 0;
            int j = i;
            int bckI = i;
            while(j < nums.length && (nums[j] == 1 || aux < k)){
                if(nums[j] == 0){
                    aux++;
                }
                if(nums[j] == 1 && aux == 0){
                    i++;
                }

                j++;
            }
            int len = j-bckI;
            if(j-bckI > result){
                result = len;
            }
        }
        return result;
    }
}
