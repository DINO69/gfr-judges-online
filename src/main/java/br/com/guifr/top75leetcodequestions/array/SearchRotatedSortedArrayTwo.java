package br.com.guifr.top75leetcodequestions.array;

public class SearchRotatedSortedArrayTwo {
    public boolean search(int[] nums, int target) {

        int left = 0;

        int right = nums.length - 1;

        //[2,5,6,0,0,1,2] // r = 7

        while(left <= right){
            while(left + 1 < nums.length && nums[left] == nums[left+1]) left++;
            while(right - 1 >= 0 && nums[right] == nums[right-1]) right--;

            int middle = ((right - left) >> 1) + left;

            if(nums[left] == target) return true;
            if(nums[right] == target) return true;
            if(nums[middle] == target) return true;


            //if(nums[left] == nums[right]) {
            //    left++;
            //    right--;
            //    continue;
            //}

            if(nums[middle] > nums[left]){
                if(target > nums[left] && target < nums[middle]){
                    right = middle - 1;
                }else{
                    left = middle + 1;
                }
            }else{
                if(target > nums[middle] && target < nums[right]){
                    left = middle + 1;
                }else{
                    right = middle - 1;
                }
            }

        }

        return false;
    }
}
