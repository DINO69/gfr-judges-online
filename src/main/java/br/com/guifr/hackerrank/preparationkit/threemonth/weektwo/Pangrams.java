package br.com.guifr.hackerrank.preparationkit.threemonth.weektwo;

public class Pangrams {


    public static String search(String s) {
        s = s.toUpperCase();
        for(int i = 65;i <=90;i++){
            char letter = (char) i;
            if(!s.contains(String.valueOf(letter)))
                return "not pangram";
        }
        return "pangram";
    }
}
