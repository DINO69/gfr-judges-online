package br.com.guifr.top75leetcodequestions.linkedlist;

import java.util.Arrays;

public class RemoveElement {

    public int removeElementWithoutSort(int[] nums, int val) {

        int result = nums.length;
        int lastIndex = nums.length - 1;

        for(int i = 0; i < result; i++){

            if(nums[i] == val){
                nums[i] = nums[lastIndex];
                result--;
                lastIndex--;
                i--;
            }

        }

        return result;
    }

    public int removeElement(int[] nums, int val) {

        int MAX = 51;
        int result = nums.length;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                nums[i] = MAX;
                result--;
            }
        }

        Arrays.sort(nums);

        return result;
    }

}
