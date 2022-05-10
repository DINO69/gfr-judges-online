package br.com.guifr.hackerrank.sorted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountingSortThree {

    private List<Integer> arr;

    public CountingSortThree(List<Integer> arr) {
        this.arr = arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantity = Integer.valueOf(sc.nextLine());
        List<Integer> arr = new ArrayList<>();
        while (quantity-- > 0){
            String line = sc.nextLine();
            String[] values = line.split(" ");
            arr.add(Integer.valueOf(values[0]));
        }

        System.out.println(formattingToPrint(of(arr).withMaxElement(100)));
    }


    public static CountingSortThree of(List<Integer> arr) {
        return new CountingSortThree(arr);
    }

    public static String formattingToPrint(List<Integer> arr) {
        String result = arr.stream()
                .map(e -> String.valueOf(e))
                .collect(Collectors.joining(" "));
        return result;
    }

    public List<Integer> withMaxElement(int maxElement) {
        int[] elements = new int[maxElement];

        for(Integer e : arr){
            elements[e]++;
        }
        int sum = 0;
        for(int i = 0;i< elements.length;i++){
            sum += elements[i];
            elements[i] = sum;
        }

        return Arrays.stream(elements)
                .boxed()
                .collect(Collectors.toList());

    }
}
