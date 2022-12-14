package br.com.guifr.hackerrank.preparationkit.threemonth.weekeleven;

import java.util.*;
import java.util.stream.Collectors;

public class QueriesWithFixedLength {


    public static List<Integer> minMax(List<Integer> arr, List<Integer> queries) {
        List<Integer> result = new ArrayList<>();
        for(int loopQueries = 0; loopQueries < queries.size();loopQueries ++){
            int minMax = Integer.MAX_VALUE;
            for(int loopArr = 0; loopArr <= arr.size() - queries.get(loopQueries);loopArr++){
                List<Integer> subArr = arr.subList(loopArr,loopArr + queries.get(loopQueries));
                int max = subArr.stream().mapToInt(Integer::intValue).max().getAsInt();
                minMax = Math.min(minMax,max);
            }
            result.add(minMax);
        }
        return result;
    }

    public static List<Integer> minMax2(List<Integer> arr, List<Integer> queries) {
        List<Integer> result = new ArrayList<>();
        for (int q : queries) {
            int max = Collections.max(arr.subList(0, q));
            int min = max;
            for (int i = q; i < arr.size(); i++) {
                if (arr.get(i) > max)
                    max = arr.get(i);
                else if (arr.get(i - q) == max)
                    max = Collections.max(arr.subList(i - q + 1, i + 1));
                min = Math.min(min, max);
            }
            result.add(min);
        }
        return result;
    }

    public static List<Integer> minMaxAtferRefactoring(List<Integer> arr, List<Integer> queries) {
        int[] minByQuery = new int[queries.size()];
        int[] maxByQuery = new int[queries.size()];
        List<PriorityQueue<Integer>> subList = new ArrayList<>();
        for(int i = 0;i<queries.size();i++){
            minByQuery[i] = Integer.MAX_VALUE;
            maxByQuery[i] = Integer.MIN_VALUE;
            subList.add(new PriorityQueue<>(Comparator.reverseOrder()));
        }

        for(int index = 0; index < arr.size();index++){
            for(int indexQuery = 0;indexQuery < queries.size();indexQuery++){
                subList.get(indexQuery).add(arr.get(index));
                maxByQuery[indexQuery] = Math.max(maxByQuery[indexQuery],arr.get(index));
                int sizeSubList = queries.get(indexQuery);
                if(subList.get(indexQuery).size() == sizeSubList){
                    subList.get(indexQuery).remove(arr.get(index - sizeSubList + 1));
                    minByQuery[indexQuery] = Math.min(minByQuery[indexQuery],maxByQuery[indexQuery]);
                    maxByQuery[indexQuery] = Integer.MIN_VALUE;
                    if(subList.get(indexQuery).size() > 0)
                        maxByQuery[indexQuery] = subList.get(indexQuery).peek();
                }
            }
        }

        return Arrays.stream(minByQuery).boxed().collect(Collectors.toList());
    }

}
