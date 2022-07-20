package br.com.guifr.hackerrank.preparationkit.threemonth.weekeight;

import java.util.Arrays;
import java.util.List;

public class IceCreamParlor {


    public static List<Integer> givenTwoFlavorsSpendAll(int money, List<Integer> flavors) {
        for (int i = 0; i < flavors.size(); i++) {

            int remainder = money - flavors.get(i);

            List<Integer> subList = flavors.subList(i + 1, flavors.size());

            if (subList.contains(remainder)) {
                int indexRemainder = subList.indexOf(remainder);
                return Arrays.asList(++i, ++indexRemainder + i);
            }

        }

        return null;
    }
}
