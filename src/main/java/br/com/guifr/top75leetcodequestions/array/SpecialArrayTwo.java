package br.com.guifr.top75leetcodequestions.array;

import java.util.ArrayList;
import java.util.List;

public class SpecialArrayTwo {

    public static boolean[] isArraySpecial(int[] nums, int[][] queries) {

        boolean[] result = new boolean[queries.length];

        int count = 0;
        for(int[] subArray: queries){

            result[count] = true;
            while(subArray[0] < subArray[1]){

                int left = (nums[subArray[0]] % 2) + (nums[subArray[0] + 1] % 2);
                int right = (nums[subArray[1]] % 2) + (nums[subArray[1] - 1] % 2);

                if(left != 1 || right != 1){
                    result[count] = false;
                    break;
                }
                subArray[0]++;
                subArray[1]--;

            }

            count++;
        }


        return result;
    }

    public static boolean[] isArraySpecialKnowledgeBadPair(int[] nums, int[][] queries) {

        List<List<Integer>> badPairs = new ArrayList<>();

        for(int i = 0; i + 1 < nums.length;i++){
            int left = (nums[i] % 2) + (nums[i+1] % 2);
            if(left != 1){
                badPairs.add(List.of(i,i+1));
            }
        }

        boolean[] result = new boolean[queries.length];
        int count = 0;
        for(int[] subArray: queries){

            result[count] = true;

            int left = 0;
            int right = badPairs.size();
            int target = (right - left) / 2;

            while(left < right){
                if(badPairs.get(target).get(0) < subArray[0]){
                    left = target + 1;
                }else if(badPairs.get(target).get(1) > subArray[1]){
                    right = target;
                }else{
                    result[count] = false;
                    break;
                }
                target = left + (right - left) / 2;
            }



            count++;
        }

        return result;
    }
}
