package br.com.guifr.hackerrank.preparationkit.threemonth.weekfive;

import java.io.*;
import java.util.*;

public class MissingNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String[] brrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> brr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrTemp[i]);
            brr.add(brrItem);
        }

        List<Integer> result = between(arr, brr);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }


        bufferedReader.close();
    }


    public static List<Integer> between(List<Integer> arr, List<Integer> brr) {

        Set<Integer> result = new TreeSet<>();

        Collections.sort(arr);
        Collections.sort(brr);
        int n=0,m=0;

        while(n < arr.size() || m < brr.size()){
            if(n >= arr.size() || arr.get(n) > brr.get(m)){
                result.add(brr.get(m));
                m++;
            }else if (arr.get(n) < brr.get(m)) {
                n++;
            }else{
                n++;m++;
            }
        }

        return new ArrayList<>(result);
    }
}
