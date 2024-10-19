package br.com.guifr.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReverseWordsString {


    public static String reverseWords(String s) {
        String[] words = s.trim().split(" ");
        List<String> result = new ArrayList<>();
        IntStream.range(1, words.length+1)
                .forEach(i -> {
                    String word = words[words.length - i];
                    if(!word.isEmpty()) result.add(word);
                });
        return String.join(" ", result);
    }
}
