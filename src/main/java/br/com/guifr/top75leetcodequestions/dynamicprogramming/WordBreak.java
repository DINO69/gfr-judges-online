package br.com.guifr.top75leetcodequestions.dynamicprogramming;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Stream;

public class WordBreak {

    public static void main(String[] args) {
        WordBreak wb = new WordBreak();
        System.out.println(wb.wordBreak("applepenapple", List.of("apple", "pen")));
        System.out.println(wb.wordBreak("applepenapple", List.of("ap","ple","apple", "pen")));
        System.out.println(wb.wordBreak("leetcode", List.of("leet", "code")));
        System.out.println(wb.wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat")));
        System.out.println("#################################");

        System.out.println(wb.wordBreak2("applepenapple", List.of("apple", "pen")));
        System.out.println(wb.wordBreak2("applepenapple", List.of("ap","ple","apple", "pen")));
        System.out.println(wb.wordBreak2("leetcode", List.of("leet", "code")));
        System.out.println(wb.wordBreak2("catsandog", List.of("cats", "dog", "sand", "and", "cat")));
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        if(s.isEmpty() || wordDict.isEmpty()) return false;

        Map<Integer, List<String>> lenFromString = new HashMap<>();

        for (String ss : wordDict) {
            if (ss.length() > s.length()) continue;
            if (wordBreak(ss, wordDict.stream().filter(w->!w.equals(ss)).toList())) continue;

            if (!lenFromString.containsKey(ss.length())) {
                lenFromString.put(ss.length(), new ArrayList());
            }
            lenFromString.get(ss.length()).add(ss);
        }

        //System.out.println(lenFromString);

        return findSegmented(s, lenFromString);

    }

    public boolean findSegmented(String s, Map<Integer, List<String>> lenFromString) {

        if (s.isEmpty()) return true;

        int lengthS = s.length();

        return lenFromString.entrySet().stream().filter(e -> e.getKey() <= lengthS)
                .anyMatch(e -> {
                    List<String> possibleWords = e.getValue();
                    return possibleWords.stream().anyMatch(w -> {
                        if (s.startsWith(w)) {
                            return findSegmented(s.substring(e.getKey()), lenFromString);
                        }
                        return false;
                    });
                });

    }


    public boolean wordBreak2(String s, List<String> wordDict) {
        if(s.isEmpty() || wordDict.isEmpty()) return false;

        return findSegmented2(s, wordDict, new HashSet<>());

    }

    public boolean findSegmented2(String s, List<String> wordDict,Set<String> processed) {

        if (s.isEmpty()) return true;
        if(processed.contains(s)) return false;

        boolean result = false;

        for(String w : wordDict){
            if(s.startsWith(w) && !result)
                result = findSegmented2(s.substring(w.length()), wordDict, processed);

        }

        if(!result) processed.add(s);

        return result;

    }

}
