package br.com.guifr.top75leetcodequestions.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {//O(n²)

        int first = 0;
        int second = 0;

        for(int f = 0; f< nums.length;f++){
            for(int s = 0; s< nums.length;s++){
                if(s==f) continue;
                if(target == (nums[f] + nums[s]))
                    return new int[]{f,s};
            }

        }

        return new int[]{first,second};
    }

    public int[] twoSumBetter(int[] nums, int target) {//O(n²)

        Map<Integer,Integer> missingByIndex = new HashMap<>();

        for(int f = 0; f< nums.length;f++){
            int missing = target - nums[f];

            if(missingByIndex.containsKey(nums[f]) && missingByIndex.get(nums[f]) != f)
                return new int[]{missingByIndex.get(nums[f]),f};

            missingByIndex.put(missing,f);
        }

        return new int[]{0,0};
    }

    public int[] twoSumBest(int[] nums, int target) {//O(n²)

        Map<Integer,Integer> missingByIndex = new HashMap<>();

        int size = nums.length >> 1;
        int last = nums.length - 1;

        for(int f = 0; f < size;f++){

            int missing = target - nums[f];

            if(missingByIndex.containsKey(nums[f]) && missingByIndex.get(nums[f]) != f)
                return new int[]{missingByIndex.get(nums[f]),f};

            missingByIndex.put(missing,f);

            int index = last - f;
            missing = target - nums[index];

            if(missingByIndex.containsKey(nums[index]) && missingByIndex.get(nums[index]) != index)
                return new int[]{missingByIndex.get(nums[index]),index};

            missingByIndex.put(missing,index);
        }

        return new int[]{0,0};
    }

}
