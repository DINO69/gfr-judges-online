package br.com.guifr.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class HashTables {

    public static String checkMagazine(List<String> magazine, List<String> note) {

        List<String> listMagazine = new ArrayList<>(magazine);
        List<String> listNote = new ArrayList<>(note);

        for(String word : listNote){
            if (!listMagazine.remove(word)){
                return "No";
            }
        }

        return "Yes";
    }
}
