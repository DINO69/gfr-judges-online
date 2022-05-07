package br.com.guifr.hackerrank.sorted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuicksortTwoSorting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());

        String arr = sc.nextLine();
        String[] line = arr.split(" ");

        List<Integer> numbers = Arrays.stream(line)
                .map(s -> Integer.valueOf(s))
                .collect(Collectors.toList());

        Print p = new Print();
        withKeepSubArrays(numbers,p);
        System.out.println(p.formatPrint());
    }


    public static List<Integer> with(List<Integer> arr) {
        return withKeepSubArrays(arr,null);
    }

    public static List<Integer> withKeepSubArrays(List<Integer> arr, Print p) {

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        if(arr.size() <= 1){
            return arr;
        }

        int pivot = arr.get(0);
        for(int i = 1; i < arr.size();i++){
            if(pivot > arr.get(i)){
                left.add(arr.get(i));
            }else{
                right.add(arr.get(i));
            }
        }

        List<Integer> result = new ArrayList<>();
        result.addAll(withKeepSubArrays(left,p));
        result.add(pivot);
        result.addAll(withKeepSubArrays(right,p));

        if(p != null){
            p.add(result);
        }

        return result;
    }


    protected static class Print {

        private List<List<Integer>> lists = new ArrayList<>();

        public String formatPrint() {
            List<String> result = new ArrayList<>();
            for(List<Integer> l : lists){
                StringBuilder sb = new StringBuilder();
                for(Integer n : l){
                    sb.append(" ").append(n);
                }
                result.add(sb.substring(1));
            }
            return String.join("\n",result);
        }

        public void add(List<Integer> arr) {
            lists.add(arr);
        }
    }
}
