package br.com.guifr.hackerrank.preparationkit.threemonth.weeknine;

import java.util.*;
import java.util.stream.Collectors;

public class TheCoinChangeProblem {

    private final boolean recursivity;

    private final List<Long> coins;

    public TheCoinChangeProblem(List<Long> coins, boolean recursivity) {
        this.coins = coins;
        this.recursivity = recursivity;
        Collections.sort(this.coins,Collections.reverseOrder());
    }

    public static TheCoinChangeProblem ofCoins(List<Long> coins, boolean recursivity) {
        return new TheCoinChangeProblem(coins, recursivity);
    }

    public static TheCoinChangeProblem ofCoins(List<Long> coins) {
        boolean recursivity = false;
        return ofCoins(coins,recursivity);
    }

    public static long getWays(int n, List<Long> cs) {
        long[] t = new long[n+1];
        String values = cs.stream().map(Object::toString).collect(Collectors.joining(","));
        t[0] = 1;
        for (long c : cs)
            for (int i = (int)c; i <= n; i++) {
                int fator = i - (int) c;
                t[i] += t[fator];
            }
        return t[n];
    }

    public long change(int coin) {
        if(recursivity) return countChanges(coin, 0);
        return getWays( coin,coins);
    }
    protected int countChanges(long remainder, int start) {

        int result = 0;

        for(int i = start; i < coins.size() ; i++){
            long coin = coins.get(i);

            long coinToChange = remainder - coin;

            if(coinToChange <= -1) continue;

            if(coinToChange == 0) {
                result++;
            }

            if(coinToChange > 0) {
                result += countChanges(coinToChange,i);
            }
        }

        return result;
    }
}
