package br.com.guifr.top75leetcodequestions.dynamicprogramming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DecodeWaysOld {

    public int numDecodings(String s) {
        List<String> numbersValids = new ArrayList<>();

        int len = s.toCharArray().length;

        for(int i = 0; i < len; i++){

            if(s.charAt(i) == '0') return 0;

            String likeString = String.valueOf(s.charAt(i));
            int value = Integer.valueOf(likeString);

            if(i < len - 1 && s.charAt(i + 1) == '0'){
                if(Integer.valueOf(value) > 2 || Integer.valueOf(value) == 0) return 0;
                i++;
                numbersValids.add(likeString.concat("0"));
            }else{
                numbersValids.add(likeString);
            }
        }

        //count

        return processAllOptions(numbersValids, new HashSet<>());
    }

    public int processAllOptions(List<String> numbersValids, Set<List> results){

        if(results.contains(numbersValids)) return results.size();

        results.add(new ArrayList<>(numbersValids));
        for(int i = 0; i < numbersValids.size() - 1; i++){

            String likeString = String.valueOf(numbersValids.get(i)).concat(numbersValids.get(i+1));

            if(Integer.valueOf(likeString) <= 26) {
                List<String> process = new ArrayList<>(numbersValids);
                process.remove(i);
                process.remove(i);
                process.add(i,likeString);
                System.out.println(process);
                processAllOptions(process, results);
            }

        }

        return results.size();
    }

}
