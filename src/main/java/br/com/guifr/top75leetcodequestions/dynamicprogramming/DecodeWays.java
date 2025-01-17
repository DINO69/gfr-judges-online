package br.com.guifr.top75leetcodequestions.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class DecodeWays {

    public int numDecodings(String s) {

        return calcPossibilities(s, 0, new HashMap<>());
    }

    public int calcPossibilities(String s, int pointer, Map<String,Integer> visited){

        if(pointer > s.length()) return 0;

        if(pointer == s.length()) {
            return 1;
        }

        if(visited.get(s.substring(pointer)) != null){
            return visited.get(s.substring(pointer));
        }

        //System.out.println(s.substring(pointer));
        //System.out.println(s.charAt(pointer));
        //System.out.println((int)s.charAt(pointer));

        if(s.charAt(pointer) == '0') return 0;

        int result = 0;

        if(pointer + 1 < s.length()){
            if((s.charAt(pointer) == '1') || (s.charAt(pointer) == '2' && s.charAt(pointer + 1) <= 54 ))
                result = calcPossibilities(s,pointer + 2,visited);
        }

        result += calcPossibilities(s,pointer + 1,visited);

        visited.put(s.substring(pointer),result);

        return result;

    }

}
