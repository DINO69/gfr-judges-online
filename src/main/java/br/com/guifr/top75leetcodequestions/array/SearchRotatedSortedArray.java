package br.com.guifr.top75leetcodequestions.array;

public class SearchRotatedSortedArray {


    public static void main(String[] args) {
        SearchRotatedSortedArray searchRotatedSortedArray = new SearchRotatedSortedArray();
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
//        System.out.println(searchRotatedSortedArray.searchLogN(nums,target));
//        System.out.println(searchRotatedSortedArray.searchLogN(new int[]{5,6,7,-1,0,1,2,4},target));
//        System.out.println(searchRotatedSortedArray.searchLogN(new int[]{5,1,3},5));
        System.out.println(searchRotatedSortedArray.searchLogN(new int[]{5,6,7,-1,0,1,2,4},0));
    }


    public int searchLogN(int[] nums, int target) {

        int result = -1;

        int left = 0;
        int right = nums.length - 1;


        while(left <= right){

            int middle = ((right - left) >> 1) + left;

            System.out.println(middle);

            if(nums[middle] == target) return middle;

            if(nums[left] <= nums[middle]){
                if(nums[left] <= target && target < nums[middle]){
                    right = middle - 1;
                }else{
                    left = middle + 1;
                }

            }else{
                if(nums[middle] < target && target <= nums[right]){
                    left = middle + 1;
                }else{
                    right = middle - 1;
                }
            }



        }

        return result;

    }


    public int search(int[] nums, int target) {

        int result = -1;


        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target) {
                result = i;
                break;
            }
        }

        return result;

    }

}
