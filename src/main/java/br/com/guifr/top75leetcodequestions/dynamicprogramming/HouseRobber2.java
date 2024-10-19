package br.com.guifr.top75leetcodequestions.dynamicprogramming;

public class HouseRobber2 {

    public static void main(String[] args) {
        HouseRobber2 rob = new HouseRobber2();
        System.out.println(rob.rob(new int[]{2,3,2}));
//        System.out.println(rob.rob(new int[]{1,2,3,1}));
//        System.out.println(rob.rob(new int[]{1,2,1,1}));
//        System.out.println(rob.rob(new int[]{6,6,4,8,4,3,3,10}));
//        System.out.println(rob.rob(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}));
    }

    public int rob(int[] nums) {

        if(nums.length == 1) return nums[0];

        int firstIndex = 0;
        while(firstIndex < nums.length && nums[firstIndex] == 0){
            firstIndex++;
        }

        int first = findMaximumSteal(nums,firstIndex,new int[ nums.length],true);

        int second = findMaximumSteal(nums,firstIndex+1,new int[ nums.length],false);

        //if(nums.length >= 3){
        int third = findMaximumSteal(nums,firstIndex+2,new int[ nums.length],false);
        first = Math.max(first,third);
        //}

        return Math.max(first,second);
    }

    public int findMaximumSteal(int[] nums, int start, int[] alreadyVisit, boolean firstHouse){

        if(start == nums.length - 1 && firstHouse) return 0;

        if(start >= nums.length) return 0;

        if(alreadyVisit[start] > 0) return alreadyVisit[start];

        int sum = nums[start];

        //more 2
        int plusTwo = findMaximumSteal(nums, start+2, alreadyVisit, firstHouse);

        //more 3
        int plusThree = findMaximumSteal(nums, start+3, alreadyVisit, firstHouse);

        int result = Math.max(plusTwo,plusThree) + sum;

        alreadyVisit[start] = result;

        return result;
    }

}
