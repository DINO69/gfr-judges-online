package br.com.guifr.hackerrank.preparationkit.threemonth.weekeight;

import java.util.List;
import java.util.stream.Collectors;

public class SuperReducedString {

    public static String with(String s) {
        List<Integer> charsInNumber = s.chars().boxed().collect(Collectors.toList());
        int ind = 0;

        while(ind < charsInNumber.size()){
            if(ind + 1 < charsInNumber.size() && charsInNumber.get(ind) == charsInNumber.get(ind+1)){
                charsInNumber.remove(ind);
                charsInNumber.remove(ind);
                ind = 0;
                continue;
            }
            ind++;
        }

        List<Character> chars = charsInNumber.stream()
                .mapToInt(i -> i.intValue())
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();
        for(Character ch : chars){
            sb.append(ch);
        }

        return sb.toString().length() == 0 ? "Empty String" : sb.toString() ;
    }

}
