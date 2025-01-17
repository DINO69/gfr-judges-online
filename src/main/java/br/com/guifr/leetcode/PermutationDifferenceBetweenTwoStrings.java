package br.com.guifr.leetcode;

public class PermutationDifferenceBetweenTwoStrings {

    public static int findPermutationDifference(String s, String t) {

        int[] diffs = new int[27];

        for(int i = 0; i < s.length(); i ++){
            int valueS = s.charAt(i) - 'a';
            int valueT = t.charAt(i) - 'a';
            diffs[valueS] += i;
            diffs[valueT] -= i;
        }

        int result = 0;
        for(int val : diffs){
            result += Math.abs(val);
        }

        return result;
    }

}
