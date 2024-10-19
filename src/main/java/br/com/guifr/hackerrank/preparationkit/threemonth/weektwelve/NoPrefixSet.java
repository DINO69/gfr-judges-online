package br.com.guifr.hackerrank.preparationkit.threemonth.weektwelve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'noPrefix' function below.
     *
     * The function accepts STRING_ARRAY words as parameter.
     */

    public static String noPrefix(List<String> words) {

        Set<String> prefix = new HashSet<>();
        Set<String> prevWords = new HashSet<>();

        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if(prefix.contains(word)){
                return "BAD SET"+System.lineSeparator()+ word;
            }
            String validateWord = word;
            while (validateWord.length() > 0){
                if(prevWords.contains(validateWord)){
                    return "BAD SET"+System.lineSeparator()+ word;
                }
                prefix.add(validateWord);
                validateWord = validateWord.substring(0,validateWord.length() - 1);
            }
            prevWords.add(word);
        }
        return "GOOD SET";
    }

}

public class NoPrefixSet {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> words = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        System.out.printf(Result.noPrefix(words));
        bufferedReader.close();
    }
}
