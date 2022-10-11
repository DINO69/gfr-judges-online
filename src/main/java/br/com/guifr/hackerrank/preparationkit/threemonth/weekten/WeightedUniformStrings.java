package br.com.guifr.hackerrank.preparationkit.threemonth.weekten;

import java.util.*;
import java.util.stream.Collectors;

public class WeightedUniformStrings {

    public static int character(char charAt) {
        return charAt + 1 - 'a';
    }

    public static List<String> with(String s, List<Integer> matches) {

        Set<Integer> weights = new HashSet<>();

        String last = "";

        int multiplying = 0;

        for(String character : s.split("")){

            int weigth = character(character.charAt(0));

            if(!last.equals(character)) multiplying = 0;

            multiplying++;

            last = character;

            weights.add(weigth * multiplying);

        }

        return matches.stream()
               .map( m -> weights.contains(m) ? "Yes" : "No" )
               .collect(Collectors.toList());

    }

    protected static boolean uniformString(StringBuilder string) {
        return convertToSet(string.toString()).size() == 1;
    }

    public static Set convertToSet(String string) {

        Set resultSet = new HashSet();

        for (int i = 0; i < string.length(); i++) {
            resultSet.add(string.charAt(i));
        }

        return resultSet;
    }
}
