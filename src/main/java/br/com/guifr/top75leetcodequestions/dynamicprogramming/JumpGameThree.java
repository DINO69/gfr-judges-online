package br.com.guifr.top75leetcodequestions.dynamicprogramming;

import java.util.HashSet;
import java.util.Set;

public class JumpGameThree {

    public static boolean canReach(int[] arr, int start) {

        Set<Integer> visited = new HashSet<>();
        return canReach(arr, start, visited);
    }

    private static boolean canReach(int[] arr, int start, Set<Integer> visited) {

        if(visited.contains(start)) return false;

        visited.add(start);

        if(start < 0) return false;

        if(start >= arr.length) return false;

        if(arr[start] == 0) return true;

        boolean left = canReach(arr,start - arr[start],visited);
        boolean right = canReach(arr,start + arr[start],visited);

        return left || right;
    }

}
