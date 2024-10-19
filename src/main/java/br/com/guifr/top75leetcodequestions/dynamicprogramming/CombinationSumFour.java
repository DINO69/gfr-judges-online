package br.com.guifr.top75leetcodequestions.dynamicprogramming;

import java.util.Arrays;

public class CombinationSumFour {

    public int combinationSum4(int[] nums, int target) {

        int[] toTarget = new int[target + 1];

        Arrays.fill(toTarget,-1);

        return process(nums,target,toTarget);
    }

    public int process(int[] nums, int target, int[] toTarget){
        if(target == 0) return 1;
        if(toTarget[target] >=0) return toTarget[target];

        int result = 0;

        for(int n : nums){
            int next = target - n;
            if(next >= 0) result += process(nums,next,toTarget);
        }
        toTarget[target] = result;
        return result;
    }

}
