package br.com.guifr.top75leetcodequestions.array;

public class CountNumberIncremovableSubarrays {

    public static void main(String[] args) {
        incremovableSubarrayCount(new int[]{6,5,7,8});
    }

    public static int incremovableSubarrayCount(int[] nums) {

        int result = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){

                if(isIncremovable(nums,i,j)){
                    result++;
                }

            }

        }


        return result;

    }

    public static boolean isIncremovable(int[] nums, int left ,int right){
        if(right - left == nums.length) return true;

        int start = 0;

        int previous = -1;
        while(start < nums.length){
            if(start >= left && start <= right) {
                start++;
                continue;
            }
            if(nums[start] <= previous){
                return false;
            }

            previous = nums[start];
            start++;
        }


        return true;
    }

}
