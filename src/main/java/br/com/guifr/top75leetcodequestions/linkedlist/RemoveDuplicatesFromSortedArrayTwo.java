package br.com.guifr.top75leetcodequestions.linkedlist;

public class RemoveDuplicatesFromSortedArrayTwo {

    public int removeDuplicates(int[] nums) {

        int raceIndex = 1;
        int uniqueTwice = 1;
        int doublee = 1;

        while(raceIndex < nums.length){
            //System.out.println(Arrays.toString(nums));
            if(nums[raceIndex-1] != nums[raceIndex]){
                doublee = 1;
                nums[uniqueTwice] = nums[raceIndex];
                uniqueTwice++;
            }else{
                if(doublee < 2){
                    doublee++;
                    nums[uniqueTwice] = nums[raceIndex];
                    uniqueTwice++;
                }
            }
            //System.out.println(Arrays.toString(nums));
            raceIndex++;
        }


        return uniqueTwice;
    }
}
