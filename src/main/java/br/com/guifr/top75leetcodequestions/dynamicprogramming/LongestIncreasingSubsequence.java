package br.com.guifr.top75leetcodequestions.dynamicprogramming;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
//        System.out.println(lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
        System.out.println(lengthOfLIS(new int[]{4,10,4,3,8,9}));
    }

    public static int lengthOfLIS(int[] nums) {

        int[] keepMax = new int[nums.length + 1];

        int result = 1;
        keepMax[result] = nums[0];

        for(int number : nums){

            if(number > keepMax[result]){
                keepMax[result + 1] = number;
                result++;
            }else {
                int analyze = result - 1;

                while (keepMax[analyze] >= number && analyze >= 1) {
                    analyze--;
                }

                keepMax[analyze + 1] = number;
            }

        }

        return result;

    }

}
