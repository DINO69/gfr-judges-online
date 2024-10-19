package br.com.guifr.top75leetcodequestions.interval;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        int n = intervals.length, i = 0;

        // Add all intervals that come before the new interval
        while (i < n && intervals[i][1] < newInterval[0]) {
            ans.add(intervals[i]);
            i++;
        }

        // Merge overlapping intervals
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        ans.add(newInterval);

        // Add the remaining intervals
        while (i < n) {
            ans.add(intervals[i]);
            i++;
        }

        // Convert the list of intervals back to a 2D array
        return ans.toArray(new int[ans.size()][]);
    }

    public static int[][] insertMy(int[][] intervals, int[] newInterval) {

        if(intervals.length <= 0) return new int[][]{newInterval};
        if(intervals[intervals.length-1][1] < newInterval[0]){
            int[][] result = new int[intervals.length + 1][2];
            for(int i = 0; i < intervals.length; i++){
                result[i] = intervals[i];
            }
            result[intervals.length] = newInterval;
            return result;
        }

        if(intervals[0][0] > newInterval[1]){
            int[][] result = new int[intervals.length + 1][2];
            result[0] = newInterval;
            for(int i = 0; i < intervals.length; i++){
                result[i+1] = intervals[i];
            }
            return result;
        }

        int indexMin = 0;
        int indexMax = intervals.length - 1;

        int[] min = intervals[indexMin];

        while(min[0] <= newInterval[0] && indexMin < intervals.length){
            if(min[1] >= newInterval[0]) break;
            indexMin++;
            min = intervals[indexMin];
        }

        System.out.println("found" + indexMin);

        int[] max = intervals[indexMax];

        while(max[1] >= newInterval[1]){
            if(max[0] <= newInterval[1] || indexMax < 0 || indexMax == indexMin) break;
            indexMax--;
            max = intervals[indexMax];
        }

        System.out.println("found" + indexMax);

        int fator = indexMax - indexMin;

        int[] insert = new int[2];

        if(fator != 0){
            insert[0] = Math.min(intervals[indexMin][0],newInterval[0]);
            insert[1] = Math.max(intervals[indexMax][1],newInterval[1]);
        }else{
            if(intervals[indexMin][0] > newInterval[1]){
                insert = newInterval;
                fator = -1;
            }else {
                insert[0] = Math.min(intervals[indexMin][0], newInterval[0]);
                insert[1] = Math.max(intervals[indexMax][1], newInterval[1]);
            }
        }

        int[][] result = new int[intervals.length - fator][2];

        int indexResult = 0;

        for(int index = 0; index < intervals.length; index++){

            if(indexResult == indexMin){
                result[indexResult] = insert;
                indexResult++;
            }

            if(index >= indexMin && index <= indexMax && fator >= 0){
                continue;
            }

            result[indexResult] = intervals[index];
            indexResult++;

        }

        return result;

    }

}
