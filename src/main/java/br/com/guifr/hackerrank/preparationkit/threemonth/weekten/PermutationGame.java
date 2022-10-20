package br.com.guifr.hackerrank.preparationkit.threemonth.weekten;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PermutationGame {

    static Map<String, Boolean> memo = new HashMap<>();

    public static String with(List<Integer> arr) {
        memo.clear();
        return findWinner(arr) ? "Bob" : "Alice";
    }

    public static boolean isIncreasing(List<Integer> arr) {
        List<Integer> toSort = new ArrayList<>(arr);
        Collections.sort(toSort);
        return toSort.equals(arr);
    }

    static boolean findWinner(List<Integer> arr) {
        String key = arr.toString();
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        if (isIncreasing(arr)) {
            memo.put(key, true);
            return true;
        }
        for (int i = 0; i < arr.size(); i++) {
            if (findWinner(Stream.concat(arr.subList(0, i).stream(),
                            arr.subList(i+1, arr.size()).stream())
                    .collect(Collectors.toList()))) {
                memo.put(key, false);
                return false;
            }
        }
        memo.put(key, true);
        return true;
    }

}
