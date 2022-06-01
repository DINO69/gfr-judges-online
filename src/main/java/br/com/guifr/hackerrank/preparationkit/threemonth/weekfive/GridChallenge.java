package br.com.guifr.hackerrank.preparationkit.threemonth.weekfive;

import java.util.Arrays;
import java.util.List;

public class GridChallenge {

    public static String inOrder(List<String> grid) {

        int[] lastRow = new int[grid.get(0).length()];

        for(String row : grid){
            String[] characters  = row.trim().split("");
            Arrays.sort(characters);
            for(int i = 0;i < characters.length; i++){
                String character = characters[i];
                int c = character.charAt(0);
                if(c >= lastRow[i]){
                    lastRow[i] = c;
                }else{
                    return "NO";
                }
            }
        }

        return "YES";
    }
}
