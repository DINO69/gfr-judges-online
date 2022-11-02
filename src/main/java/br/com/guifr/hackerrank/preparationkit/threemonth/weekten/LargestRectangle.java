package br.com.guifr.hackerrank.preparationkit.threemonth.weekten;

import java.util.List;
import java.util.PriorityQueue;

public class LargestRectangle {

    public static long buildingIn(List<Integer> buildings) {

        long maxLargestArea = 0;
        for (int i = 0; i < buildings.size(); i++) {
            PriorityQueue<Integer> minBuildings = new PriorityQueue<>();
            for (int j = i; j < buildings.size(); j++) {
                minBuildings.add(buildings.get(j));
                long k = j - i + 1;
                long largestAreaCalc = k * minBuildings.peek();
                maxLargestArea = Math.max(maxLargestArea,largestAreaCalc);
            }
        }
        return maxLargestArea;
    }

    public static long buildingInBestRange(List<Integer> buildings) {

        long maxLargestArea = 0;
        for (int i = 0; i < buildings.size(); i++) {
            int height = buildings.get(i);
            int left = i;
            while(left > 0 && buildings.get(left - 1) >= height) left--;
            int right = i;
            while(right < buildings.size() - 1 && buildings.get(right + 1) >= height) right++;
            long k = right - left + 1;
            long largestAreaCalc = k * height;
            maxLargestArea = Math.max(maxLargestArea,largestAreaCalc);
        }
        return maxLargestArea;
    }
}
