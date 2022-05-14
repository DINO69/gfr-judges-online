package br.com.guifr.hackerrank.preparationkit.threemonth.weekone;

import java.util.Arrays;
import java.util.Scanner;

public class CamelCaseFour {

    enum TypeWord {
        METHOD("M"), CLASS("C"), VARIABLE("V");

        private String indicate;

        TypeWord(String indicate) {
            this.indicate = indicate;
        }

        public static TypeWord of(String indicate){
            return  Arrays.stream(TypeWord.values())
                    .filter(t -> t.indicate.equals(indicate))
                    .findFirst().get();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            System.out.println(analysis(sc.nextLine()));
        }
        sc.close();
    }

    public static String analysis(String word) {
        String result = null;

        String[] inputs = word.split(";");
        String action = inputs[0];
        String typeIndicate = inputs[1];
        String justWord = inputs[2];

        switch (action){
            case "S" : result = split(justWord); break;
            case "C" : result = combine(justWord,TypeWord.of(typeIndicate)); break;
        }

        return result;
    }

    private static String combine(String word, TypeWord type) {
        String[] words = word.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(type == TypeWord.CLASS ? capitalize(words[0]) : words[0]);
        for(int i = 1; i < words.length;i++){
            sb.append(capitalize(words[i]));
        }
        sb.append(type == TypeWord.METHOD ? "()" : "");
        return sb.toString();
    }

    protected static String capitalize(String s){
        String s1 = String.valueOf(s.charAt(0)).toUpperCase();
        return s1 + s.substring(1);
    }

    protected static String split(String word) {
        StringBuilder sb = new StringBuilder();

        if(word.contains("()")){
            word = word.substring(0,word.length()-2);
        }

        int breaking = 0;
        int i = 1;
        while(i < word.length()){
            char c = word.charAt(i);
            char cUp = String.valueOf(c).toUpperCase().charAt(0);
            if(c == cUp){
                sb.append(word, breaking, i).append(" ");
                breaking = i;
            }
            i++;
        }
        sb.append(word, breaking, i);
        return sb.toString().toLowerCase();
    }
}
