package br.com.guifr.top75leetcodequestions.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainsDuplicateTwo {


    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, List<Integer>> valueByIndex = new HashMap<>();
        for(int i = 0; i < nums.length ; i++){
            if(valueByIndex.containsKey(nums[i])){
                for(int j : valueByIndex.get(nums[i])){
                    if(Math.abs(i - j) <= k) return true;
                }
                valueByIndex.get(nums[i]).add(i);
            }else{
                valueByIndex.put(nums[i],new ArrayList<>(List.of(i)));
            }
        }


        //for(int i = 0; i < nums.length ; i++){
        //    for(int j = 0; j < nums.length ; j++){
        //        if(i == j) continue;
        //        if(nums[i] == nums[j] && Math.abs(i - j) <= k) return true;
        //    }
        //}

        return false;

    }

}
