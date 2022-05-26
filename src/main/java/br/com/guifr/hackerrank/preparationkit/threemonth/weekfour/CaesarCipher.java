package br.com.guifr.hackerrank.preparationkit.threemonth.weekfour;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CaesarCipher {

    public static List<String> rotateAlphabet(int k) {
        List<String> alphabet = Arrays.stream("abcdefghijklmnopqrstuvwxyz".split("")).collect(Collectors.toList());
        while(k-- > 0){
            alphabet.add(alphabet.remove(0));
        }
        return alphabet;
    }

    public static String cipher(String s, int k) {

        List<String> newAlphanet = rotateAlphabet(k);
        List<String> alphabet = Arrays.stream("abcdefghijklmnopqrstuvwxyz".split("")).collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();
        for(String caracter : s.split("")){
            int position = alphabet.indexOf(caracter.toLowerCase());
            String changed = position >= 0 ? newAlphanet.get(position) : caracter;
            if(caracter.equals(caracter.toUpperCase())){
                changed = changed.toUpperCase();
            }
            sb.append(changed);
        }

        return sb.toString();
    }
}
