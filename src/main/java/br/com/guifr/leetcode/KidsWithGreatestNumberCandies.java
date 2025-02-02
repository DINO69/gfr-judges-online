package br.com.guifr.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class KidsWithGreatestNumberCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList();
        int max = Arrays.stream(candies).max().getAsInt();
        for(int i = 0; i < candies.length; i++){
            result.add(candies[i] + extraCandies >= max);
        }
        return result;
    }

}
