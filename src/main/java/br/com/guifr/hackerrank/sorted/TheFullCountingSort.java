package br.com.guifr.hackerrank.sorted;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TheFullCountingSort {

    private final static int MAX_ELEMENT = 100;

    public static void main(String[] args) throws IOException {

        StringBuilder[] result = new StringBuilder[MAX_ELEMENT];
        Map<String,Integer> mapElements = new HashMap<>();

        for(int i = 0; i < MAX_ELEMENT;i++){
            result[i] = new StringBuilder();
            mapElements.put(String.valueOf(i),i);
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int half = n / 2;

        IntStream.range(0, n).forEach(i -> {
            try {

                List<String> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .collect(Collectors.toList());

                if(i < half){
                    result[mapElements.get(arr.get(0))].append("- ");
                }else{
                    result[mapElements.get(arr.get(0))].append(arr.get(1)).append(" ");
                }

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        StringBuilder sResult = new StringBuilder();
        for(StringBuilder s : result){
            if(s.length() > 0){
                sResult.append(s);
            }
        }

        System.out.println(sResult.toString());

        bufferedReader.close();
    }

    public static String with(List<List<String>> arr) {

        int half = arr.size() / 2;
        StringBuilder[] result = new StringBuilder[MAX_ELEMENT];
        Map<String,Integer> mapElements = new HashMap<>();

        for(int i = 0; i < MAX_ELEMENT;i++){
            result[i] = new StringBuilder();
            mapElements.put(String.valueOf(i),i);
        }

        for(int i = 0; i < half;i++){
            result[mapElements.get(arr.get(i).get(0))].append("- ");
        }

        for(int i = half; i < arr.size();i++){
            result[mapElements.get(arr.get(i).get(0))].append(arr.get(i).get(1)).append(" ");
        }

        StringBuilder sResult = new StringBuilder();
        for(StringBuilder s : result){
            if(s.length() > 0){
                sResult.append(s);
            }
        }
        return sResult.toString();

    }
}
