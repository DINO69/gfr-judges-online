package br.com.guifr.hackerrank.preparationkit.threemonth.weekthirteen;

import java.util.List;

public class JourneyToTheMoon {


    public static long journeyToMoon(int astronaut, List<List<Integer>> astronautPairSameCountry){
        int[] country = new int[astronaut];
        for (int i = 0; i < astronaut; i++) {
            country[i] = i;
        }
        for (List<Integer> pair : astronautPairSameCountry) {
            int a = pair.get(0);
            int b = pair.get(1);
            int countryA = country[a];
            int countryB = country[b];
            for (int i = 0; i < astronaut; i++) {
                if(country[i] == countryB){
                    country[i] = countryA;
                }
            }
        }
        int[] countryCount = new int[astronaut];
        for (int i = 0; i < astronaut; i++) {
            countryCount[country[i]]++;
        }
        long result = 0;
        for (int i = 0; i < astronaut; i++) {
            for (int j = i+1; j < astronaut; j++) {
                result += countryCount[i] * countryCount[j];
            }
        }
        return result;
    }
}
