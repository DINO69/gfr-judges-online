package br.com.guifr.hackerrank;

import java.util.*;

public class Bonetrousle {

    public static List<Long> with(int n, int k, int b) {
        List<Long> result = new ArrayList<>();
        long _min, _max, lb = b;
        long quo, mod, i;
        _min = (lb) * (lb + 1) / 2;
        if (n < _min) return Arrays.asList(-1L);
        mod = (n - _min) % lb;
        quo = (n - _min) / lb;
        for (i = b; i >= 1; i--) {
            result.add((i + mod > lb) ? i + quo + 1 : i + quo);
            if (result.get(result.size() - 1) > k) return Arrays.asList(-1L);
        }
        return result;
    }
}
