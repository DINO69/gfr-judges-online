package br.com.guifr.hackerrank.preparationkit.threemonth.weekseven;

import java.util.List;

public class GoodlandElectricity {

    public static int numberNewPowerPlants(List<Integer> cities, int maxDistance) {

        int index = 0 + maxDistance - 1;
        int amountPlant = 0;

        while(!allCitiesHasEnergy(cities, index)) {

            while (notPutPowerPoint(cities, index)) {
                index--;
                if (isOnePositionInvalid(cities, index)) return -1;
            }

            putEnergy(cities, index);

            alreadyArrivedEnergyInLastCity(cities, maxDistance, index);

            index = whatWillBeTheNextCity(cities, maxDistance, index);

            amountPlant++;

        }

        return amountPlant;

    }

    private static void alreadyArrivedEnergyInLastCity(List<Integer> cities, int maxDistance, int index) {
        if (index + maxDistance >= cities.size()) {
            putEnergy(cities, cities.size() - 1);
        }
    }

    private static boolean notPutPowerPoint(List<Integer> cities, int nextPlant) {
        return cities.get(nextPlant) == 0;
    }

    private static int whatWillBeTheNextCity(List<Integer> cities, int maxDistance, int lastPowerPlant) {
        int aroundPlant = (maxDistance - 1) * 2 + 1;
        return Math.min(lastPowerPlant + aroundPlant, cities.size() -1);
    }

    private static Integer putEnergy(List<Integer> cities, int index) {
        return cities.set(index, 2);
    }

    private static boolean allCitiesHasEnergy(List<Integer> cities, int index) {
        return index > cities.size() || cities.get(cities.size() - 1) == 2;
    }

    private static boolean isOnePositionInvalid(List<Integer> cities, int index) {
        return index < 0 || cities.get(index) == 2;
    }

    public static int pylons(int k, List<Integer> arr) {
        int diameter = (k - 1) * 2 + 1;
        int plants = 0;
        int i = k - 1;
        while (true) {
            while (arr.get(i) == 0) {
                i--;
                if (i < 0 || arr.get(i) == 2)
                    return -1;
            }
            arr.set(i, 2);
            plants++;
            if (i + k > arr.size() - 1) return plants;
            i = Math.min(arr.size() - 1, i + diameter);
        }
    }


}
