package br.com.guifr.hackerrank.preparationkit.threemonth.weekseven;

import java.util.*;

public class TheBombermanGame {

    public static List<String> start(List<String> arr, int seconds) {

        if (seconds == 1) return arr;

        if (seconds % 2 == 0) {
            allBomb(arr);
            return arr;
        }

        completeZerosNearBomb(arr);
        toggle(arr);

        seconds -= 1;
        seconds = seconds / 2;
        seconds = seconds % 2;

        if(seconds == 0){
            completeZerosNearBomb(arr);
            toggle(arr);
        }

        return arr;

    }

    public static List<String> startStepByStep(List<String> arr, int seconds) {

        if (seconds == 1) return arr;

        if (seconds % 2 == 0) {
            allBomb(arr);
            return arr;
        }

        while (seconds-- > 0) {

            Map<Integer, List<Integer>> willExplode = findWhereWillExplode(arr, "2");

            passOneSecond(arr);

            willExplode.entrySet()
                    .stream().filter(e -> e.getValue().size() > 0)
                    .forEachOrdered(e -> change(arr, e.getKey(), e.getValue()));
        }

        finishExecution(arr);

        return arr;
    }

    private static Map<Integer, List<Integer>> findWhereWillExplode(List<String> arr,String bomb) {
        Map<Integer, List<Integer>> willExplode = new HashMap<>();
        for (int r = 0; r < arr.size(); r++) {
            List<Integer> exploded = willExplode(arr.get(r),bomb);
            willExplode.put(r, exploded);
        }
        return willExplode;
    }

    private static void change(List<String> grid, Integer row, List<Integer> bombs) {
        changeInCol(grid, row, bombs);
        changeInRow(grid, row, bombs);
    }



    public static void passOneSecond(List<String> grid) {

        HashMap<String, String> changes = new LinkedHashMap<>();
        changes.put("2", "3");
        changes.put("1", "2");
        changes.put("O", "1");
        changes.put("0", "1");
        changes.put(".", "0");
        changes.put("3", ".");

        replacePer(grid,changes);

    }

    public static String passOneSecond(String s) {

        HashMap<String, String> changes = new LinkedHashMap<>();
        changes.put("2", "3");
        changes.put("1", "2");
        changes.put("O", "1");
        changes.put("0", "1");
        changes.put(".", "0");
        changes.put("3", ".");

        for (Map.Entry<String, String> e : changes.entrySet()) {

            s = s.replace(e.getKey(), e.getValue());

        }

        return s;
    }

    public static List<Integer> willExplode(String s) {
        return willExplode(s,"2");
    }

    public static void changeInRow(List<String> grid, int row, List<Integer> exploded) {
        changeInRow(grid, row, exploded, ".");
    }

    public static void changeInCol(List<String> grid, int row, List<Integer> exploded) {
        changeInCol(grid, row, exploded, ".");
    }

    public static void finishExecution(List<String> grid) {

        HashMap<String, String> changes = new LinkedHashMap<>();
        changes.put("O", ".");
        changes.put("0", ".");
        changes.put("2", "O");
        changes.put("1", "O");
        changes.put("3", "O");

        replacePer(grid,changes);

    }

    public static void allBomb(List<String> grid) {

        HashMap<String, String> changes = new LinkedHashMap<>();
        changes.put("O", "O");
        changes.put("0", "O");
        changes.put(".", "O");

        replacePer(grid,changes);

    }

    public static void completeZerosNearBomb(List<String> grid) {

        String bomb = "O";
        Map<Integer, List<Integer>> hasBomb = findWhereWillExplode(grid, bomb);

        hasBomb.entrySet()
                .stream().filter(e -> e.getValue().size() > 0)
                .forEachOrdered(e -> change(grid, e.getKey(), e.getValue(), bomb));

    }

    private static void change(List<String> grid, Integer row, List<Integer> bombs, String put) {
        changeInCol(grid, row, bombs, put);
        changeInRow(grid, row, bombs, put);
    }

    private static void changeInRow(List<String> grid, int row, List<Integer> hasBomb, String bomb) {
        StringBuilder s = new StringBuilder(grid.get(row));
        for (Integer r : hasBomb) {
            int next = r + 1;
            int prev = r - 1;
            if (next < s.length()) {
                s.replace(next, next + 1, bomb);
            }
            if (prev >= 0) {
                s.replace(prev, prev + 1, bomb);
            }
            s.replace(r, r + 1, bomb);
        }
        grid.set(row, s.toString());
    }

    private static void changeInCol(List<String> grid, int row, List<Integer> hasBomb, String bomb) {
        int next = row + 1;
        int prev = row - 1;
        StringBuilder sNext = null;
        StringBuilder sPrev = null;

        if (next < grid.size())
            sNext = new StringBuilder(grid.get(next));

        if (prev >= 0)
            sPrev = new StringBuilder(grid.get(prev));

        for (Integer b : hasBomb) {
            if (sNext != null) {
                sNext.replace(b, b + 1, bomb);
            }
            if (sPrev != null) {
                sPrev.replace(b, b + 1, bomb);
            }
        }

        if (sNext != null) {
            grid.set(next, sNext.toString());
        }
        if (sPrev != null) {
            grid.set(prev, sPrev.toString());
        }
    }

    private static List<Integer> willExplode(String s, String bomb) {
        List<Integer> result = new ArrayList<>();
        int after = 0;
        while (s.indexOf(bomb, after) != -1) {
            result.add(s.indexOf(bomb, after));
            after = s.indexOf(bomb, after) + 1;
        }
        return result;
    }

    public static void toggle(List<String> grid) {

        HashMap<String, String> changes = new LinkedHashMap<>();
        changes.put("O", "T");
        changes.put(".", "O");
        changes.put("T", ".");

        replacePer(grid,changes);

    }

    public static void replacePer(List<String> grid,HashMap<String, String> changes) {

        for (int r = 0; r < grid.size(); r++) {
            String s = grid.get(r);
            for (Map.Entry<String, String> e : changes.entrySet()) {
                s = s.replace(e.getKey(), e.getValue());
            }
            grid.set(r, s);
        }

    }

}
