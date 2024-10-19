package br.com.guifr.top75leetcodequestions.dynamicprogramming;

public class HouseRobber {

    public static void main(String[] args) {
        HouseRobber rob = new HouseRobber();
//        System.out.println(rob.rob(new int[]{1,2,3,1}));
//        System.out.println(rob.rob(new int[]{1,2,1,1}));
//        System.out.println(rob.rob(new int[]{6,6,4,8,4,3,3,10}));
        System.out.println(rob.rob(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}));
    }

    public int rob(int[] nums) {

        if(nums.length == 1) return nums[0];

        int[] maximumFrom = new int[nums.length];

        int firstSteal = 0;
        int secondSteal = firstSteal + 1;

        while((nums[firstSteal] == 0 && nums[secondSteal] == 0)  && secondSteal < nums.length - 1){
            firstSteal++;
            secondSteal = firstSteal + 1;
        }

        return Math.max(stealMaximumHouses(nums,nums[firstSteal],firstSteal,maximumFrom),stealMaximumHouses(nums,nums[secondSteal],secondSteal,maximumFrom));


    }

    public int stealMaximumHouses(int[] nums, int sum, int start, int[] maximumFrom){

        if(maximumFrom[start] > 0) return maximumFrom[start];

        int plusTwo = 0, plusThree = 0;

        if(start + 2 < nums.length){
            plusTwo = stealMaximumHouses(nums, nums[start + 2], start + 2 ,maximumFrom);
        }

        if(start + 3 < nums.length){
            plusThree = stealMaximumHouses(nums, nums[start + 3], start + 3 ,maximumFrom);
        }

        int result = Math.max(plusTwo,plusThree) + sum ;

        maximumFrom[start] = result;


        return result;
    }

}
