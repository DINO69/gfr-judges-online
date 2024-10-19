package br.com.guifr.leetcode;

import java.util.Arrays;

public class CanPlaceFlowers {


    public static boolean canPlantFlowers(int[] flowerbed, int n) {

        int[] flowerbedCopy = Arrays.copyOf(flowerbed, flowerbed.length);

        int firstStart = 0;
        int secondoStart = 1;

        while(n-- > 0){
            boolean plant1 = tryPlantFlowers(flowerbed, firstStart);
            boolean plant2 = tryPlantFlowers(flowerbedCopy, secondoStart);
            if(!plant1 && !plant2){
                return false;
            }
        }

        System.out.println(Arrays.toString(flowerbed));
        System.out.println(Arrays.toString(flowerbedCopy));

        return true;
    }

    private static boolean tryPlantFlowers(int[] flowerbed, int place) {

        int result = place;

        if(place >= flowerbed.length) return false;

        int previus = place - 1 >= 0 ? place - 1 : place;
        int next = place + 1 < flowerbed.length ? place + 1 : place;

        if (flowerbed[place] != 0 || Math.max(flowerbed[previus], flowerbed[next]) > 0){
            return tryPlantFlowers(flowerbed, place + 1);
        }

        flowerbed[place] = 1;

        return true;
    }
}
