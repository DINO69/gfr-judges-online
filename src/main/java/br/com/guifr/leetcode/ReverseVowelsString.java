package br.com.guifr.leetcode;

import java.util.List;

public class ReverseVowelsString {


    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length-1;

        while(i < j){
            if(!isVowel(chars[i])) {
                i++;
                continue;
            }
            if(!isVowel(chars[j])) {
                j--;
                continue;
            }
            char aux = chars[i];
            chars[i] = chars[j];
            chars[j] = aux;
            i++;j--;
        }
        return new String(chars);
    }

    private static boolean isVowel(char chars) {
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
        return vowels.contains(String.valueOf(chars).toLowerCase().charAt(0));
    }

}
