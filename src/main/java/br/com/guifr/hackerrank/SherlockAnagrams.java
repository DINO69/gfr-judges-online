package br.com.guifr.hackerrank;

import java.util.Arrays;

public class SherlockAnagrams {


    public static int search(String s) {

        int amountChar = 1;
        int find = 0;

        for (int x = 0; x < s.length() - 1; x++) {
            amountChar = 1;
            while (x + amountChar != s.length()) {
                String subString = s.substring(x, x + amountChar);
                for (int y = x + 1; y + amountChar <= s.length(); y++) {
                    String subStringComparing = s.substring(y, y + amountChar);
                    if (comparing(subString, subStringComparing)) {
                        find++;
                    }
                }
                amountChar++;
            }

        }
        return find;


    }

    public static boolean comparing(String s1, String s2) {
        char[] chars = s1.toCharArray();
        Arrays.sort(chars);
        s1 = new String(chars);

        chars = s2.toCharArray();
        Arrays.sort(chars);
        s2 = new String(chars);

        return s1.equals(s2);
    }
}
