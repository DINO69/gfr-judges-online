package br.com.guifr.hackerrank.preparationkit.threemonth.weekten;

import java.util.Collections;
import java.util.List;

public class HackerlandRadioTransmitters {
    public static int howManyTowersHaveIn(List<Integer> houses, int distanceEachTower) {
        Collections.sort(houses);
        int times = 0;

        int i = 0;
        int size = houses.size();
        while(i < size){
            int maxBomb = houses.get(i) + distanceEachTower;
            findPlacePutBomb: while(canTakeTheNextStep(houses, i, maxBomb)) i++;

            maxBomb = houses.get(i) + distanceEachTower;
            findMaxReachTheBomb: while(canTakeTheNextStep(houses, i, maxBomb)) i++;

            times++; i++;
        }

        return times;
    }

    private static boolean canTakeTheNextStep(List<Integer> houses, int i, int maxBomb) {
        return i + 1 < houses.size() && houses.get(i + 1) <= maxBomb;
    }

}
