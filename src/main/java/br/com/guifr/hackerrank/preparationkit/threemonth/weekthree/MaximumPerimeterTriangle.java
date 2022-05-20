package br.com.guifr.hackerrank.preparationkit.threemonth.weekthree;

import java.util.*;

public class MaximumPerimeterTriangle {

    public static double heronAreaFormula(List<Integer> arr) {
        long a = arr.get(0);
        long b = arr.get(1);
        long c = arr.get(2);
        double semiperimeter = (a + b + c) / 2.0;

        double forSqrt = semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c);

        return forSqrt > 0 ? Math.sqrt(forSqrt) : 0.0;
    }

    public static List<Integer> in(List<Integer> sticks) {
        List<Integer> result = new ArrayList<>();

        Queue<Integer> queue = new ArrayDeque<>();
        for(int stick : sticks){
            queue.add(stick);
            if(queue.size() == 3){
                List<Integer> queueList = new ArrayList<>(queue);
                if(heronAreaFormula(queueList) > 0 && perimeter(queueList) >= perimeter(result)){
                    result = choice(result,queueList);
                }
                queue.poll();
            }
        }

        return result.size() > 0 ? result : Arrays.asList(-1);
    }

    public static long perimeter(List<Integer> sticks) {
        return sticks.stream()
                .mapToLong(Integer::longValue)
                .sum();
    }

    public static List<Integer> choice(List<Integer> triangle1, List<Integer> triangle2) {

        if(triangle1.size() < 3){
            return triangle2;
        }else if(triangle2.size() < 3){
            return triangle1;
        }

        List<Integer> usingLastNumber = comparableUsing(triangle1, triangle2,2,0);

        if(usingLastNumber != null) {
            return  usingLastNumber;
        }else{
            return comparableUsing(triangle1, triangle2,0,1);
        }

    }

    private static List<Integer> comparableUsing(List<Integer> triangle1, List<Integer> triangle2, int index,int triangleDefault) {
        if(triangle1.get(index) > triangle2.get(index)){
            return triangle1;
        }else if(triangle1.get(index) < triangle2.get(index)) {
            return triangle2;
        }else{
            if(triangleDefault == 1){
                return triangle1;
            }else if(triangleDefault == 2){
                return  triangle2;
            }
        }
        return null;
    }

    public static boolean hasValidTriangle(List<Integer> sticks) {
        return inValidTriangle(sticks).equals(Arrays.asList(-1)) ? false : true;
    }

    public static List<Integer> inValidTriangle(List<Integer> sticks) {

        Collections.sort(sticks);

        for(int i = sticks.size() - 3; i >= 0;i--){
            int a = sticks.get(i);
            int b = sticks.get(i + 1);
            int c = sticks.get(i + 2);
            if(a + b > c){
                return Arrays.asList(a,b,c);
            }
        }

        return Arrays.asList(-1);
    }
}
