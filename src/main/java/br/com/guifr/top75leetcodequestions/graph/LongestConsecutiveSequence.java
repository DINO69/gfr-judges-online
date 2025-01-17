package br.com.guifr.top75leetcodequestions.graph;

import java.util.Arrays;

public class LongestConsecutiveSequence {


    public int longestConsecutive(int[] nums) {
        if(nums.length <= 1) return nums.length;

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        int result = 1;

        int previous = nums[0];
        int processResult = 1;

        // for(int i = 1; i < nums.length; i++){

        //     if(nums[i] == previous) continue;

        //     if(nums[i] - 1 == previous){
        //         processResult++;
        //     }else{
        //         result = Math.max(result,processResult);
        //         processResult = 1;
        //     }
        //     previous = nums[i];
        // }

        int i = 1;

        do{

            int inProcess = nums[i];

            previous = nums[i-1];

            i++;

            if(inProcess == previous) continue;

            if(inProcess - 1 == previous){
                processResult++;
                result = Math.max(result,processResult);
                continue;
            }

            processResult = 1;

        } while(i < nums.length );

        return result;

    }

}
