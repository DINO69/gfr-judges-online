package br.com.guifr.hackerrank.preparationkit.threemonth.weeknine;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoCharacters {
    public static int process(String s) {
        return process(s, separeteLetters(s));
    }

    public static int process(String s, Set<String> letters) {
        int max = 0;

        if (letters.size() == 2 && isValid(s)) return s.length();

        if (letters.size() < 2) return max;

        for (String letter : letters) {
            String copyS = s;
            for (String letterTwo : letters) {
                if(letterTwo.equals(letter)) continue;
                for (String letterToExclude : letters) {
                    if(letterToExclude.equals(letter) || letterToExclude.equals(letterTwo)) continue;
                    s = s.replaceAll(letterToExclude,"");
                }
                if(isValid(s)) max = Math.max(max,s.length());

                s = copyS;
            }

        }

        return max;
    }

    public static Set<String> separeteLetters(String s) {
        return new HashSet<>(List.of(s.split("")));
    }

    public static boolean isValid(String s) {
        if (separeteLetters(s).size() != 2) return false;

        if (s.length() % 2 == 1) {
            if (firstLetter(s).equals(lastLetter(s))) {
                return isValid(s.substring(1));
            } else return false;
        }

        String toReplace = s.substring(0, 2);
        return s.replaceAll(toReplace, "").length() == 0;
    }

    protected static String lastLetter(String s) {
        return s.substring(s.length() - 1);
    }

    protected static String firstLetter(String s) {
        return s.substring(0, 1);
    }

    public static String whichOneIsFirstLetterIn(String letter1, String letter2, String str) {
        int indexOf1 = str.indexOf(letter1);
        int indexOf2 = str.indexOf(letter2);
        return indexOf1 < indexOf2 ? letter1 : letter2;
    }

    public static String whichOneIsFirstLetterInStarting(String letter1, String letter2, String str, int starting) {
        return whichOneIsFirstLetterIn(letter1, letter2, str.substring(starting));
    }

    public static boolean isFirstInStarting(String letter1, String letter2, String str, int starting) {
        return letter1.equals(whichOneIsFirstLetterInStarting(letter1, letter2, str, starting));
    }

    public static int nextIndexOf(String letter1, String letter2, String str, int starting) {
        int indexOf1 = str.indexOf(letter1, starting);
        int indexOf2 = str.indexOf(letter2, starting);
        return Math.max(indexOf1, indexOf2) + 1;
    }


}
