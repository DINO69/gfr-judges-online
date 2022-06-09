package br.com.guifr.hackerrank.preparationkit.threemonth.weeksix;

import java.util.List;

public class MisereNim {


    public static String withPileStones(List<Integer> arr) {
        int maxIsOne = arr.stream().mapToInt(Integer::intValue).max().getAsInt();
        if(maxIsOne == 1) return arr.size() % 2 == 0 ? "First" : "Second";

        Integer xor = arr.stream().reduce(0, (x, n) -> x ^ n);
        return xor == 0 ? "Second" : "First";
    }
}
