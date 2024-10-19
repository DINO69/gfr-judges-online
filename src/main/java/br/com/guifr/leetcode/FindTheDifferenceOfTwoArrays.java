package br.com.guifr.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheDifferenceOfTwoArrays {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        //if(nums2[0] == 2) return Arrays.asList(Arrays.asList(1,3),Arrays.asList(4,6));

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(int n : nums1){
            boolean find = false;
            for(int n2 : nums2){
                if(n == n2){
                    find = true;
                    break;
                }
            }
            if(!find && !list1.contains(n)) list1.add(n);
        }

        for(int n : nums2){
            boolean find = false;
            for(int n2 : nums1){
                if(n == n2){
                    find = true;
                    break;
                }
            }
            if(!find && !list2.contains(n)) list2.add(n);
        }

        return Arrays.asList(list1,list2);

    }

    public List<List<Integer>> findDifferenceBest(int[] nums1, int[] nums2) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        //loodbalance
        int i = 0;
        int j = 0;
        int last1 = 99999;
        int last2 = 99999;
        while(i < nums1.length || j < nums2.length){

            if(i < nums1.length && nums1[i] == last1){
                i++;
                continue;
            }
            if(j < nums2.length && nums2[j] == last2){
                j++;
                continue;
            }

            if(i < nums1.length && (j == nums2.length || nums1[i] < nums2[j])){
                last1 = nums1[i];
                list1.add(nums1[i]);
                i++;
                continue;
            }

            if(j < nums2.length && (i == nums1.length || nums1[i] > nums2[j])){
                last2 = nums2[j];
                list2.add(nums2[j]);
                j++;
                continue;
            }

            if(nums1[i] == nums2[j]){
                i++;
                j++;
            }
        }

        return Arrays.asList(list1,list2);

    }

}
