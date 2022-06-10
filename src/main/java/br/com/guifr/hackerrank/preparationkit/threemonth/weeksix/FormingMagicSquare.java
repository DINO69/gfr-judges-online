package br.com.guifr.hackerrank.preparationkit.threemonth.weeksix;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FormingMagicSquare {

    private static int getDiff(List<List<Integer>> original, List<List<Integer>> changed) {
        int result;
        result = 0;
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                result += Math.abs(changed.get(r).get(c) - original.get(r).get(c));
            }
        }
        return result;
    }

    protected static List<List<Integer>> convert(List<List<String>> arr) {

        List<List<Integer>> result = new ArrayList<>();

        for (List<String> l : arr) {

            List<Integer> add = l.stream()
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            result.add(add);

        }

        return result;
    }

    private static List<List<String>> convertToString(List<List<Integer>> arr) {

        List<List<String>> result = new ArrayList<>();

        for (List<Integer> l : arr) {

            List<String> add = l.stream()
                    .map(String::valueOf)
                    .collect(Collectors.toList());

            result.add(add);

        }

        return result;
    }

    private static List<List<Integer>> copy(List<List<Integer>> arr) {

        List<List<Integer>> result = new ArrayList<>();

        for (List<Integer> l : arr) {

            List<Integer> add = l.stream()
                    .collect(Collectors.toList());

            result.add(add);

        }

        return result;
    }

    protected static int sumLine(List<List<String>> arr, int line) {
        return arr.get(line)
                .stream()
                .mapToInt(Integer::valueOf)
                .sum();
    }

    protected static int sumColumn(List<List<String>> arr, int column) {
        return arr.stream()
                .map(l -> l.get(column))
                .mapToInt(Integer::valueOf)
                .sum();
    }

    public static boolean sumAll(List<List<String>> arr) {
        return IntStream.range(0, 3)
                .allMatch(n -> sumLine(arr, n) == 15 && sumColumn(arr, n) == 15);
    }

    public static int fixListInteger(List<List<Integer>> arr) {
        List<List<Integer>> try1 = copy(arr);
        try1.get(1).set(1, 5);
        addInRow(try1, 9, 1);
        addInColumn(try1, 7, 3);
        complete(try1);

        List<List<Integer>> try2 = copy(arr);
        try2.get(1).set(1, 5);
        addInRow(try2, 9, 1);
        addInColumn(try2, 3, 7);
        complete(try2);

        List<List<Integer>> try3 = copy(arr);
        try3.get(1).set(1, 5);
        addInRow(try3, 1, 9);
        addInColumn(try3, 7, 3);
        complete(try3);

        List<List<Integer>> try4 = copy(arr);
        try4.get(1).set(1, 5);
        addInRow(try4, 1, 9);
        addInColumn(try4, 3, 7);
        complete(try4);

        List<List<Integer>> try5 = copy(arr);
        try5.get(1).set(1, 5);
        addInRow(try5, 3, 7);
        addInColumn(try5, 9, 1);
        complete(try5);

        List<List<Integer>> try6 = copy(arr);
        try6.get(1).set(1, 5);
        addInRow(try6, 3, 7);
        addInColumn(try6, 1, 9);
        complete(try6);

        List<List<Integer>> try7 = copy(arr);
        try7.get(1).set(1, 5);
        addInRow(try7, 7, 3);
        addInColumn(try7, 9, 1);
        complete(try7);

        List<List<Integer>> try8 = copy(arr);
        try8.get(1).set(1, 5);
        addInRow(try8, 7, 3);
        addInColumn(try8, 1, 9);
        complete(try8);

        List<Integer> results = Arrays.asList(
                getDiff(arr, try1),
                getDiff(arr, try2),
                getDiff(arr, try3),
                getDiff(arr, try4),
                getDiff(arr, try5),
                getDiff(arr, try6),
                getDiff(arr, try7),
                getDiff(arr, try8)
        );

        return results.stream().min(Comparator.naturalOrder()).get();
    }

    public static void addInColumn(List<List<Integer>> arr, int num1, int num2) {
        arr.get(0).set(1, num1);
        arr.get(2).set(1, num2);
    }

    public static void addInRow(List<List<Integer>> arr, int num1, int num2) {
        arr.get(1).set(0, num1);
        arr.get(1).set(2, num2);
    }

    public static void complete(List<List<Integer>> arr) {

        List<List<Integer>> pairs = Arrays.asList(
                Arrays.asList(2, 4),//6
                Arrays.asList(4, 8),//12
                Arrays.asList(6, 8),//14
                Arrays.asList(2, 6)//8
        );

        List<Integer> choiceLine0 = pairs.stream()
                .filter(p -> p.stream().mapToInt(Integer::intValue).sum() + arr.get(0).get(1) == 15)
                .findFirst()
                .get();

        List<Integer> choiceLine2 = pairs.stream()
                .filter(p -> p.stream().mapToInt(Integer::intValue).sum() + arr.get(2).get(1) == 15)
                .findFirst()
                .get();

        int tries = 0;

        while (!sumAllInteger(arr)) {

            arr.get(0).set(0, choiceLine0.get(0));
            arr.get(0).set(2, choiceLine0.get(1));

            arr.get(2).set(0, choiceLine2.get(0));
            arr.get(2).set(2, choiceLine2.get(1));

            Collections.sort(choiceLine0, Comparator.reverseOrder());
            if (tries == 1) {
                Collections.sort(choiceLine0, Comparator.naturalOrder());
                Collections.sort(choiceLine2, Comparator.reverseOrder());
            }
            tries++;
        }

    }

    public static boolean sumAllInteger(List<List<Integer>> arr) {

        return sumAll(convertToString(arr));
    }
}
