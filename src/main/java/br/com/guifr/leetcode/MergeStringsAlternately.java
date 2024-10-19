package br.com.guifr.leetcode;

public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        char[] word1Chars = word1.toCharArray();
        char[] word2Chars = word2.toCharArray();
        StringBuilder result = new StringBuilder();
        int max = Math.max(word1Chars.length,word2Chars.length);
        for(int i = 0; i < max; i++){
            if(word1Chars.length > i)
                result.append(word1Chars[i]);
            if(word2Chars.length > i)
                result.append(word2Chars[i]);
        }
        return result.toString();
    }
}
