package br.com.guifr.top75leetcodequestions.array;

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Set<Set<Integer>> already = new HashSet<>();
        Set<List<Integer>> alreadyValues = new HashSet<>();

        Arrays.sort(nums);
        //System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 0) break;

            for (int j = i + 1; j < nums.length; j++) {
                if (i == j) continue;
                for (int k = j + 1; k < nums.length; k++) {
                    if (i == k) continue;
                    if (j == k) continue;

                    Set<Integer> visit = Set.of(i, j, k);
                    List<Integer> values = new ArrayList<>(List.of(nums[i], nums[j], nums[k]));
                    Collections.sort(values);

                    //System.out.println(visit);

                    if (nums[i] + nums[j] + nums[k] == 0 && !already.contains(visit) && !alreadyValues.contains(values)) {
                        result.add(values);
                        already.add(visit);
                        alreadyValues.add(values);
                    }

                }
            }
        }


        return result;
    }

    public static List<List<Integer>> threeSum2(int[] nums) {

        int i = 0, j = i + 1, k = nums.length - 1;

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        Set<List<Integer>> alreadyAdd = new HashSet<>();

        int changeJ = 1;

        while (i < nums.length) {

            //run with j
            j = i + changeJ;
            k = nums.length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> values = List.of(nums[i], nums[j], nums[k]);
                    if (!alreadyAdd.contains(values)) {
                        result.add(values);
                        alreadyAdd.add(values);
                    }
                }

                j++;

            }
            //run with k
//            j = i + changeJ;
//            k = nums.length - 1;
//
//            while(j < k){
//                if(nums[i] + nums[j] + nums[k] == 0){
//                    List<Integer> values = List.of(nums[i], nums[j], nums[k]);
//                    if(!alreadyAdd.contains(values)) {
//                        result.add(values);
//                        alreadyAdd.add(values);
//                    }
//                }
//
//                k--;
//            }

            if (changeJ + i >= nums.length) {
                i++;
                changeJ = 1;
            } else {
                changeJ++;
            }


        }

        return result;
    }

    public List<List<Integer>> threeSum3(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        // Sort the array
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    // Found a triplet with zero sum
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    // Skip duplicate elements for j
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }

                    // Skip duplicate elements for k
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }

                    // Move the pointers
                    j++;
                    k--;
                } else if (sum < 0) {
                    // Sum is less than zero, increment j to increase the sum
                    j++;
                } else {
                    // Sum is greater than zero, decrement k to decrease the sum
                    k--;
                }
            }
        }
        return ans;
    }

}