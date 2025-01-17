package br.com.guifr.top75leetcodequestions.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RangeSumSortedSubarraySums {

    public static int rangeSum(int[] nums, int n, int left, int right) {
        //[1] 2 3 4
        //1
        //[1 2] 3 4
        //3
        //[1 2 3] 4
        //6
        //[1 2 3 4]
        //10
        //1 [2] 3 4
        //2
        //1 [2 3] 4
        //5
        //1 [2 3 4]
        //9
        //1 2 [3] 4
        //3
        //1 2 [3 4]
        //7
        //1 2 3 [4]
        //4

        int modResult = (int) Math.pow(10,9) + 7;

        List<Integer> newList = new ArrayList<>();// think about one order list

        for(int i = 0; i < nums.length; i ++){
            int sum = 0;
            for(int j = i; j < nums.length; j ++) {
                sum += nums[j];
                newList.add(sum);
            }
        }

        Collections.sort(newList);

        left--;
        right--;
        int result = 0;
        while(left <= right){
            result = (result + newList.get(left++)) % modResult ;
        }


        return result;
    }

}
