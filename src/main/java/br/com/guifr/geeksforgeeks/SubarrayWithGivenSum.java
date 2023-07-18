package br.com.guifr.geeksforgeeks;

import java.util.ArrayList;

//https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
public class SubarrayWithGivenSum {


    public static ArrayList<Integer> findContinuosValusUntil(int[] arr, int n, int s) {
        ArrayList<Integer> result = new ArrayList<>();

        if(s == 0){
            result.add(-1);
            return result;
        }

        int start = 0;
        int end = 0;
        int sum = 0;
        while(end < n){
            sum += arr[end];
            end++;
            while(sum > s){
                sum -= arr[start];
                start++;
            }
            if(sum == s) {
                result.add(start+1);
                result.add(end);
                break;
            }
        }


        if(result.size() == 0) result.add(-1);
        return result;
    }
}
