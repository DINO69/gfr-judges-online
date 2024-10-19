package br.com.guifr.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ProductArrayExceptSelf {
    public static int[] myProductExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int multiply = 1;
            for(int j = 0; j < nums.length; j++){
                if(i == j) continue;
                multiply *= nums[j];
            }
            result[i] = multiply;
        }

        return result;
    }

    public static int[] productExceptSelfOn(int[] nums) {

        int[] result2 = new int[nums.length];
        int multiplyLeft = 1;
        int multiplyRight = 1;
        int init = 0;
        List<Integer> zeros = new ArrayList<>();
        int middle = nums.length >> 1;

        while(init < middle){
            int last = nums.length - init - 1;

            if(nums[init] == 0){
                zeros.add(init);
            }else{
                multiplyLeft *= nums[init];
            }

            if(nums[last] == 0){
                zeros.add(last);
            }else{
                multiplyRight *= nums[last];
            }

            init++;
        }

        if(isEven(nums)){
            if(nums[middle] == 0) zeros.add(middle);
        }

        if(zeros.size() == 1){
            int zero = zeros.get(0);
            result2[zero] = multiplyLeft * multiplyRight;
            return result2;
        }else if(zeros.size() > 1){
            return new int[nums.length];
        }

        if(isEven(nums)){
            result2[middle] = multiplyRight * multiplyLeft;
            multiplyLeft *= nums[middle];
        }

        init = 0;
        while(init < middle){
            int last = nums.length - init - 1;
            result2[init] = (int) (multiplyRight * multiplyLeft * Math.pow(nums[init], -1));
            result2[last] = (int) (multiplyRight * multiplyLeft * Math.pow(nums[last], -1));
            init++;
        }

        return result2;

    }

    private static boolean isEven(int[] nums) {
        return nums.length % 2 == 1;
    }
}
