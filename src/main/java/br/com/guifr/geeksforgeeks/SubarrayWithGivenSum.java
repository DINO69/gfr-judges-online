package br.com.guifr.geeksforgeeks;

import java.util.*;

//https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
public class SubarrayWithGivenSum {


    public static ArrayList<Integer> findContinuosValusUntil(int[] arr, int n, int s) {

        int start = 0;
        int end = 0;
        int sum = 0;

        if(s == 0) return new ArrayList<>(List.of(-1));

        while(end < n){
            if(sum < s){
                sum += arr[end];
                end++;
            }
            while(sum > s) {
                sum -= arr[start];
                start++;
            }
            if(s == sum) {
                return new ArrayList<>(List.of(start+1,end));
            }
        }

        return new ArrayList<>(List.of(-1));
    }
}
