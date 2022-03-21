package br.com.guifr.beecrowd;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class MusicalLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        while(!line.equalsIgnoreCase("0")){
            int size = Integer.parseInt(line);
            line = sc.nextLine();
            String[] values = line.split(" ");
            List<Integer> notes = Arrays.stream(values)
                    .mapToInt(s -> Integer.parseInt(s))
                    .boxed()
                    .collect(Collectors.toList());

            System.out.println(homManyPeaks(notes));
            line = sc.nextLine();
        }

    }


    public static int homManyPeaks(List<Integer> notes) {

        AtomicInteger peaks = new AtomicInteger(0);

        generateTriples(notes)
                .forEach(triple ->{
                    if(!isAscending(triple[0],triple[1],triple[2])
                    && !isDescending(triple[0],triple[1],triple[2])){
                        peaks.incrementAndGet();
                    }
                });

        return peaks.get();
    }

    public static boolean isAscending(int n1, int n2, int n3) {
        if(n1 >= n2)
            return false;

        if(n1 >= n3)
            return false;

        if(n2 >= n3)
            return false;

        return true;
    }

    public static boolean isDescending(int n1, int n2, int n3) {
        if(n3 >= n1)
            return false;

        if(n3 >= n2)
            return false;

        if(n2 >= n1)
            return false;

        return true;
    }

    public static List<int[]> generateTriples(List<Integer> notes) {

        List<int[]> triples = new LinkedList<>();

        for(int x = 0; x < notes.size(); x++){

            int next = x + 1;
            if(next >= notes.size())
                next = 0;

            int after = x - 1;
            if(after < 0)
                after = notes.size() - 1;

            int[] triple = new int[3];
            triple[0] = notes.get(after);
            triple[1] = notes.get(x);
            triple[2] = notes.get(next);

            triples.add(triple);
        };

        return triples;
    }
}
