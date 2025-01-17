package br.com.guifr.top75leetcodequestions.linkedlist;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int raceIndex = 1;
        int uniqueIndex = 1;

        while(raceIndex < nums.length){
            if(nums[raceIndex - 1] != nums[raceIndex]){
                nums[uniqueIndex] = nums[raceIndex];
                uniqueIndex++;
            }

            raceIndex++;
        }

        return uniqueIndex;
    }
}
