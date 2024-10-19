package br.com.guifr.top75leetcodequestions.array;

public class FindMinimumRotatedSortedArray {

    public int findMin(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while(nums[start] > nums[nums.length - 1] && nums[end - 1] < nums[end]){
            start++;
            end--;
            //if(nums[end] > nums[end+1]) return nums[end+1];
        }

        //System.out.println(nums[start]);
        //System.out.println(nums[end]);

        return Math.min(nums[start],nums[end]);

    }


    public int findMinWorst(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while(nums[start] > nums[end]){
            start++;
        }

        return nums[start];

    }


}
