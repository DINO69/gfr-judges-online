package br.com.guifr.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DetermineIfTwoStringsAreClose {

    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;

        int[] letters1 = new int[27];
        int[] letters2 = new int[27];
        int letterA = 97;

        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();

        for (int i = 0; i < word1.length(); i++) {
            letters1[chars1[i] - letterA]++;
            letters2[chars2[i] - letterA]++;
        }

        Map<Integer, Integer> sameAmountCaracters = new HashMap();

        // has the same caracters
        for (int i = 0; i < letters1.length; i++) {
            if (letters1[i] > 0 && letters2[i] == 0) return false;
            if (letters2[i] > 0 && letters1[i] == 0) return false;
            if (sameAmountCaracters.get(letters1[i]) == null)
                sameAmountCaracters.put(letters1[i], 1);
            else
                sameAmountCaracters.put(letters1[i], sameAmountCaracters.get(letters1[i]) + 1);


            if (sameAmountCaracters.get(letters2[i]) == null)
                sameAmountCaracters.put(letters2[i], -1);
            else
                sameAmountCaracters.put(letters2[i], sameAmountCaracters.get(letters2[i]) - 1);
        }

        //has the same amount of caracters

        for (Integer matches : sameAmountCaracters.values()) {
            if (matches != 0) return false;
        }

        System.out.println(Arrays.toString(letters1));
        System.out.println(Arrays.toString(letters2));
        System.out.println(sameAmountCaracters);

        return true;

    }

}
