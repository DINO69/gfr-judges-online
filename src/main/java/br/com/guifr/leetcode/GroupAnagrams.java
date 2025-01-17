package br.com.guifr.leetcode;


import java.util.*;
import java.util.stream.Collectors;

//https://leetcode.com/problems/group-anagrams/description/
public class GroupAnagrams {

    public static void main(String[] args) {
        groupAnagrams("abbbbbbbbbbb","aaaaaaaaaaab");
    }

    public static List<List<String>> groupAnagrams(String... strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs.length == 0) return new ArrayList<>(List.of());

        HashMap<String,List<String>> anagrams = new LinkedHashMap<>();
        for(String s : strs){

            String anagram = calcAnagrams(s);
            if(!anagrams.containsKey(anagram)){
                anagrams.put(anagram,new ArrayList<>());
            }

            anagrams.get(anagram).add(s);
        }

        return anagrams.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .toList();

    }

    private static String calcAnagrams(String s) {
        if(s.isEmpty()) return "0";

        TreeMap<String,Integer> characters = new TreeMap<>();

        for(Character c : s.toCharArray()){
            String key = String.valueOf(c - 'a');
            if(!characters.containsKey(key)){
                characters.put(key,0);
            }
            characters.put(key, characters.get(key) + 1);
        }

        return characters.entrySet().stream()
                .map(e -> e.getKey() + e.getValue())
                .collect(Collectors.joining());
    }


    private String calcAnagramsWithSet(String s) {
        if(s.isEmpty()) return "0";

        "a".hashCode();

        Set<String> characters = new TreeSet<>();

        for(Character c : s.toCharArray()){
            characters.add(String.valueOf(c - 'a'));
        }

        return characters.stream().collect(Collectors.joining());
    }
}
