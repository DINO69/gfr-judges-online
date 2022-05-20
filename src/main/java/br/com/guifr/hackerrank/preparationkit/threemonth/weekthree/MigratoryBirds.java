package br.com.guifr.hackerrank.preparationkit.threemonth.weekthree;

import java.util.List;

public class MigratoryBirds {


    public static int with(List<Integer> arr) {

        int[] birds = new int[6];
        int max = Integer.MIN_VALUE;
        int maxBirdId = Integer.MAX_VALUE;

        for (int birdId : arr) {
            birds[birdId]++;
            if (birds[birdId] >= max) {
                if (birdId < maxBirdId || birds[birdId] > max) {
                    maxBirdId = birdId;
                }
                max = birds[birdId];
            }
        }

        return maxBirdId;
    }
}
