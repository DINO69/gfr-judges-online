package br.com.guifr.leetcode;


import java.util.List;

public class MaximumNumberVowelsSubstring {


    public int maxVowels(String s, int k) {
        int result = 0;
        for(int i = 0; i < k; i++){
            char c = s.charAt(i);
            if(isVowel(c)){
                result++;
            }
        }
        int aux = result;
        for(int i = k; i < s.length(); i++){
            char c = s.charAt(i);
            char remove = s.charAt(i - k);
            if(isVowel(c)){
                aux++;
            }
            if(isVowel(remove)){
                aux--;
            }
            if(aux > result){
                result = aux;
            }
        }
        return result;
    }

    protected static boolean isVowel(char chars) {
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
        return vowels.contains(String.valueOf(chars).toLowerCase().charAt(0));
    }


}
