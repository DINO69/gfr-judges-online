package br.com.guifr.hackerrank.preparationkit.threemonth.weeknine;

import java.util.List;

public class ChiefHopper {
    public static int minimumBotEnergy(List<Integer> arr) {
        return minimumBotEnergy(arr, arr.get(0)/2);
    }

    protected static int minimumBotEnergy(List<Integer> heights, int start) {

        long botEnergy = start;

        for (int height : heights) {
            int delta = 0;
            if (botEnergy < height) {
                delta += newEnergyWhenLessHeight(botEnergy, height);
            } else if (botEnergy > height) {
                delta += newEnergyWhenGreaterHeight(botEnergy, height);
            }
            botEnergy += delta;
            if (botEnergy < 0) return minimumBotEnergy(heights, start + 1);

        }

        return start;
    }

    private static long newEnergyWhenGreaterHeight(long botEnergy, int height) {
        return (botEnergy - height);
    }

    protected static long newEnergyWhenLessHeight(long botEnergy, int height) {
        return -(height - botEnergy);
    }

}
