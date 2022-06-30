package br.com.guifr.hackerrank.preparationkit.threemonth.weekseven;


import java.util.*;
import java.util.stream.IntStream;

public class SherlockValidString {

    private static Set<String> letters;

    static {
        letters = new HashSet<>();
        IntStream.range(97, 123).forEach(n -> {
            letters.add(String.valueOf(Character.valueOf((char) n)));
        });
    }

    public static String printIsValid(String s) {

        Map<Integer,Integer> occurs = new HashMap<>();

        for (String letter : letters) {
            int amount = amountLetterIn(s, letter);
            if (amount == 0) continue;

            putAmountIn(occurs, amount);

            if(occursIsInvalid(occurs)){
                return "NO";
            }

        }

        return "YES";
    }

    private static void putAmountIn(Map<Integer, Integer> occurs, int amount) {
        int oc = 0;
        if(occurs.containsKey(amount)){
            oc = occurs.get(amount);
        }
        occurs.put(amount,++oc);
    }

    private static int amountLetterIn(String s, String letter) {
        s = sort(s);
        int init = s.indexOf(letter);
        if(init == -1) return 0;
        int end = s.lastIndexOf(letter);
        int amount = end - init + 1;
        return amount;
    }

    private static boolean occursIsInvalid(Map<Integer, Integer> occurs) {
        if (occurs.size() >= 3) return true;

        if (occurs.size() == 2 && (diffBetweenOccurrencesIsInvalid(occurs) || doubledTwoOccurrences(occurs))) return true;

        return false;

    }

    private static boolean diffBetweenOccurrencesIsInvalid(Map<Integer, Integer> occurs) {
        ArrayList<Integer> numberOccurrences = new ArrayList<>(occurs.keySet());
        int min = Math.min(numberOccurrences.get(0), numberOccurrences.get(1));
        int diff = Math.abs(numberOccurrences.get(0) - numberOccurrences.get(1));
        if(diff == 1 || (min == 1 && occurs.get(1) == 1)) return false;
        return true;
    }

    private static boolean doubledTwoOccurrences(Map<Integer, Integer> occurs) {
        ArrayList<Integer> repetitionsOccurrences = new ArrayList<>(occurs.values());
        int amount1 = repetitionsOccurrences.get(0);
        int amount2 = repetitionsOccurrences.get(1);
        int min = Math.min(amount1,amount2);
        return min > 1;
    }

    private static String sort(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
